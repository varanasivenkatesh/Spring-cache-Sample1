package com.vv.spring.cache;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

    public static void main(String[] args)
    {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CurrencyService service = (CurrencyService)context.getBean("CurrencyService");
        System.out.println("India==>"+service.getByname("India"));
        System.out.println("India==>"+service.getByname("India"));
        System.out.println("Refreshing all list");
        service.refreshAllItems();
        System.out.println("India=[After Refresh]=>"+service.getByname("India"));
        System.out.println("India[After Refresh]==>"+service.getByname("India"));
        ((AbstractApplicationContext)context).close();

    }
}
