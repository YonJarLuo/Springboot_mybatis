数据库有6张表，在项目doc目录下有sql脚本
用户表：user
角色表：role
用户与角色关联表：user_role  一对一

菜单表：power
角色与菜单关联表：role_power 一对多


其它详情请看链接：https://blog.csdn.net/YonJarLuo/article/details/81187239

技术描述：
    Springboot：使用及常用注解
    mybatis：pageHelper分页插件的使用，generator插件的使用，动态SQL
    aop：日志切面，配置日志管理；全局事务的配置
    
后续完善功能
    系统管理：菜单，标签
    用户中心：用户管理，角色管理，权限管理，部门管理