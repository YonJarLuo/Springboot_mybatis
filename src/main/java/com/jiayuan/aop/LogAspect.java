package com.jiayuan.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * Created by YonJar on 2019/8/8.
 * 日志切面类
 * @Aspect 注解将一个java类定义为切面类
 * @Pointcut 定义一个切入点，可以是一个规则表达式，比如下例中某个package下的所有函数，也可以是一个注解等。
 * 根据需要在切入点不同位置的切入内容
 * @Before 在切入点开始处切入内容
 * @After 在切入点结尾处切入内容
 * @AfterReturning 在切入点return内容之后切入内容（可以用来对处理返回值做一些加工处理）
 * @Around 在切入点前后切入内容，并自己控制何时执行切入点自身的内容
 * @AfterThrowing 用来处理当切入内容部分抛出异常之后的处理逻辑
 */
@Aspect
@Component
public class LogAspect {

    private final Logger logger = LoggerFactory.getLogger(LogAspect.class);
    ThreadLocal<Long> startTime = new ThreadLocal<Long>(); //解决耗时同步问题

    @Pointcut("execution(public * com.jiayuan.controller..*.*(..))")//切入点描述 这个是controller包的切入点
    public void controllerLog(){}//签名，可以理解成这个切入点的一个名称

    @Before("controllerLog()") //在切入点的方法run之前要干的
    public void logBeforeController(JoinPoint joinPoint) {

        startTime.set(System.currentTimeMillis());
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();//这个RequestContextHolder是Springmvc提供来获得请求的东西
        HttpServletRequest request = ((ServletRequestAttributes)requestAttributes).getRequest();

        // 记录下请求内容
        logger.info("###### URL : " + request.getRequestURL().toString());
        logger.info("###### HTTP_METHOD : " + request.getMethod());
        logger.info("###### IP : " + request.getRemoteAddr());
        logger.info("###### THE ARGS OF THE CONTROLLER : " + Arrays.toString(joinPoint.getArgs()));

        //下面这个getSignature().getDeclaringTypeName()是获取包+类名的   然后后面的joinPoint.getSignature.getName()获取了方法名
        logger.info("###### CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        //logger.info("################TARGET: " + joinPoint.getTarget());//返回的是需要加强的目标类的对象
        //logger.info("################THIS: " + joinPoint.getThis());//返回的是经过加强后的代理类的对象

    }

    @AfterReturning(returning = "ret", pointcut = "controllerLog()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        logger.info("###### RESPONSE : " + ret);
        logger.info("###### SPEND TIME : " + (System.currentTimeMillis() - startTime.get() ) +" ms");
        logger.info("#############################################################################");
    }
}
