# spring


## database
```
mysql root@localhost:(none)> use world
You are now connected to database "world" as user "root"
Time: 0.000s
mysql root@localhost:world> describe city
+-------------+----------+------+-----+---------+----------------+
| Field       | Type     | Null | Key | Default | Extra          |
+-------------+----------+------+-----+---------+----------------+
| ID          | int(11)  | NO   | PRI | <null>  | auto_increment |
| Name        | char(35) | NO   |     |         |                |
| CountryCode | char(3)  | NO   | MUL |         |                |
| District    | char(20) | NO   |     |         |                |
| Population  | int(11)  | NO   |     | 0       |                |
+-------------+----------+------+-----+---------+----------------+
```
更改密码：
mysqladmin -u root -p password "root"

set password for root@localhost = newPw

```
        Class.forName("com.mysql.jdbc.Driver"); //加载驱动、注册驱动
        Connection connection = DriverManager //获取连接
                .getConnection("jdbc:mysql://localhost:3306/utool?serverTimezone=UTC","root","xt222483");
        String sql = "select * from types";
        Statement statement = connection.createStatement(); //创建数据库操作对象 Statement
        ResultSet set = statement.executeQuery(sql); //执行SQL，返回结果
        while (set.next()){//打印结果
            System.out.println(set.getString("id") +" " + set.getString("enName"));
        }
```

mysql 8.0 以后，java 的驱动包发生了变化，从 com.mysql.jdbc.Driver 变为 com.mysql.cj.jdbc.Driver

不再是之前的：com.mysql.jdbc.Driver

UTC
Coordinated Universal  Time
协调世界时，又称世界统一时间、世界标准时间、国际协调时间。由于英文（CUT）和法文（TUC）的缩写不同，作为妥协，简称UTC。
协调世界时是以原子时秒长为基础，在时刻上尽量接近于世界时的一种时间计量系统。
国际原子时的准确度为每日数纳秒，而世界时的准确度为每日数毫秒。许多应用部门要求时间系统接近世界时UT，对于这种情况，一种称为协调世界时的折中时标于1972年面世。为确保协调世界时与世界时相差不会超过0.9秒，在有需要的情况下会在协调世界时内加上正或负闰秒。因此协调世界时与国际原子时之间会出现若干整数秒的差别，两者之差逐年积累，便采用跳秒（闰秒）的方法使协调时与世界时的时刻相接近，其差不超过1s。它既保持时间尺度的均匀性，又能近似地反映地球自转的变化。 [1]  按国际无线电咨询委员会（CCIR）通过的关于UTC的修正案，从1972年1月1日起UTC与UT1（在UT中加入极移改正得到）之间的差值最大可以达到±0.9s。位于巴黎的国际地球自转事务中央局负责决定何时加入闰秒。一般会在每年的6月30日、12月31日的最后一秒进行调整。


Thymeleaf是用于Web和独立环境的现代服务器端Java模板引擎。
Thymeleaf的主要目标是将优雅的自然模板带到您的开发工作流程中—HTML能够在浏览器中正确显示，并且可以作为静态原型，从而在开发团队中实现更强大的协作。Thymeleaf能够处理HTML，XML，JavaScript，CSS甚至纯文本。
Thymeleaf的主要目标是提供一个优雅和高度可维护的创建模板的方式。 为了实现这一点，它建立在自然模板的概念之上，以不影响模板作为设计原型的方式将其逻辑注入到模板文件中。 这改善了设计沟通，弥合了前端设计和开发人员之间的理解偏差。
Thymeleaf也是从一开始就设计(特别是HTML5)允许创建完全验证的模板。//原文出自【易百教程】，商业转载请联系作者获得授权，非商业请保留原文链接：https://www.yiibai.com/thymeleaf/thymeleaf-instroduce.html





classpath 具体指哪个路径？
src 路径下的文件 在编译后都会放到 WEB-INF/classes 路径下。默认classpath 就是指这里。
打印：System.out.println( Main.class.getResource("/").toString());


```java
        Boolean b = true;
        if(b=false){
            System.out.println(2);
        }else{
            System.out.println(3);
        }

        int i = 0;
        if ((i=2)>1){
            System.out.println(4);
        }
```



自定义注解、注解解析代码


