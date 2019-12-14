package com.vv.spring.cache;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

@EnableCaching
@Component
@ComponentScan(basePackages = "com.vv.spring.cache")
public class AppConfig {

    @Bean
    public CacheManager cacheManager()
    {
        return new EhCacheCacheManager(ehCacheManager().getObject());
    }

    @Bean
    public EhCacheManagerFactoryBean ehCacheManager()
    {
        EhCacheManagerFactoryBean factory = new EhCacheManagerFactoryBean();
        factory.setConfigLocation(new ClassPathResource("ehcache.xml"));
        factory.setShared(true);
        return factory;
    }
}
