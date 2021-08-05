package com.spring.boot.demo.demo_applicationcontextinitializer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplicationcontextinitializerApplication {

    public static void main(String[] args) {

        SpringApplication springApplication = new SpringApplication(DemoApplicationcontextinitializerApplication.class);
        System.out.println("before run ===>value of use:"+System.getProperty("use"));
//       两种方式：
//       一种直接 addInitializers，
//       另一种方式，新建META-INF/spring.factories 新加配置。方式一被我注释了！
//        springApplication.addInitializers(new MyApplicationContextInitializer());
        springApplication.run( args);
        System.out.println("after run ===>value of use:"+System.getProperty("use"));
    }

}
