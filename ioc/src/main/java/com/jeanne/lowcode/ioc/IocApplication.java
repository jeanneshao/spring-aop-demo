package com.jeanne.lowcode.ioc;

import com.jeanne.lowcode.ioc.packageinfo.PackageInfoComponent;
import com.jeanne.lowcode.ioc.packageinfo.PackageInfoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.metrics.jfr.FlightRecorderApplicationStartup;

/**
 * @author Jeanne 2023/6/17
 **/
//@SpringBootApplication
public class IocApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(IocApplication.class);
        applicationContext.setApplicationStartup(new FlightRecorderApplicationStartup());
//        ConfigurableApplicationContext applicationContext = SpringApplication.run(IocApplication.class, args);
        PackageInfoComponent bean = applicationContext.getBean(PackageInfoComponent.class);
        PackageInfoConfiguration configuration = applicationContext.getBean(PackageInfoConfiguration.class);
        PackageInfoConfiguration.ConfBean confBean = (PackageInfoConfiguration.ConfBean) applicationContext.getBean("confObj");
        System.out.println("start over");
    }
}
