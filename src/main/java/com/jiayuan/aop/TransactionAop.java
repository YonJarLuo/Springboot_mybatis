package com.jiayuan.aop;

import org.aopalliance.aop.Advice;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.interceptor.NameMatchTransactionAttributeSource;
import org.springframework.transaction.interceptor.RollbackRuleAttribute;
import org.springframework.transaction.interceptor.RuleBasedTransactionAttribute;
import org.springframework.transaction.interceptor.TransactionInterceptor;

import java.util.Collections;

/**
 * 待测试
 * 配置全局的事务控制
 * Created by YonJar on 2019/10/15.
 */
@Aspect
@Configuration
public class TransactionAop {
    //切入路径
    private static String POINTCUT_EXPRESSION = "execution(* com.jiayuan.service.*.*(..))";

    @Autowired
    private DataSourceTransactionManager transactionManager;

    @Bean
    public Advisor txAdvisor(){
        //声明事务切入点
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression(POINTCUT_EXPRESSION);
        return new DefaultPointcutAdvisor(pointcut, tstAdvice());
    }

    /**
     * 配置规则
     * @return
     */
    private TransactionInterceptor tstAdvice(){
        //设置事务规则
        NameMatchTransactionAttributeSource source = new NameMatchTransactionAttributeSource();

        source.addTransactionalMethod("add*",required());
        source.addTransactionalMethod("insert*",required());
        source.addTransactionalMethod("create*",required());
        source.addTransactionalMethod("remove*",required());
        source.addTransactionalMethod("delete*",required());
        source.addTransactionalMethod("modify*",required());
        source.addTransactionalMethod("update*",required());

        //只读事务
        source.addTransactionalMethod("get*",readOnly());
        source.addTransactionalMethod("find*",readOnly());
        source.addTransactionalMethod("list*",readOnly());
        source.addTransactionalMethod("select*",readOnly());
        source.addTransactionalMethod("count*",readOnly());
        source.addTransactionalMethod("exist*",readOnly());
        source.addTransactionalMethod("like*",readOnly());


        TransactionInterceptor transactionInterceptor = new TransactionInterceptor(transactionManager, source);
        return  transactionInterceptor;
    }

    /**
     * 读写事务
     * @return
     */
    private RuleBasedTransactionAttribute required(){
        RuleBasedTransactionAttribute required = new RuleBasedTransactionAttribute();
        //抛出异常就回滚
        required.setRollbackRules(Collections.singletonList(new RollbackRuleAttribute(Exception.class)));
        //设置传播行为
        required.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        //事务失效时间，超过8秒就回滚事务
        required.setTimeout(8000);
        return required;
    }

    /**
     * 只读事务
     */
    private RuleBasedTransactionAttribute readOnly(){
        RuleBasedTransactionAttribute readOnly = new RuleBasedTransactionAttribute();
        readOnly.setReadOnly(true);
        readOnly.setPropagationBehavior(TransactionDefinition.PROPAGATION_NOT_SUPPORTED);
        return readOnly;
    }

}
