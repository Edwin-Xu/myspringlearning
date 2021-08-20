# aop
aspect-oriented programming

## some keywords：
- 连接点join point:指所有可以切入的点
- 切点pointcut：连接点的子集，真正需要切入的点
- 切面aspect：多个切点构成的面。用来切插业务方法的类
- 通知：在切点处执行的操作:
    1. 前置通知
    2. 后置通知
    3. 环绕通知
    4. 返回通知
    5. 异常通知

增强：定义了应该怎么把额外的动作加入到指定函数中
切点：定义了你应该把增强插入到哪个函数的什么位置
切面：切点和增强组合起来的称呼


## errors
引入AOP 报错 error at ::0 formal unbound in pointcut
解决方法：去掉函数通知函数中的参数






## Student Service Demo

+-----------------------------------------------------------------
|                     |                    |                     |
| StudentServiceImpl  |                    |    BeforeAdvice     |         
|   addStudent()      |  <----config---->  |      before()       |
|    (pointcut)       |                    |      (advice)       |
|                     |                    |                     |
|








