package com.james.springenvironmentpractice;


import com.james.springenvironmentpractice.config.ApplicationConfig;
import com.james.springenvironmentpractice.service.OutputService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringEnvironmentPracticeApplication {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        OutputService outputService = context.getBean(OutputService.class);

        for (int i=0;i<5;i++){
            outputService.generateOutput("World");
            Thread.sleep(3000);
        }
    }
}
