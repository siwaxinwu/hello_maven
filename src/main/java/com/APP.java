package com;



import com.roy.strategytest.EntStrategyHolder;
import com.roy.strategytest.EntStrategyHolderUpdate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class APP {

    public static void main(String[] args) {
        SpringApplication.run(APP.class, args);
        /*AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(APP.class);
        EntStrategyHolderUpdate bean = ac.getBean(EntStrategyHolderUpdate.class);
        System.out.println(bean.getBy("entA"));*/
    }

}
