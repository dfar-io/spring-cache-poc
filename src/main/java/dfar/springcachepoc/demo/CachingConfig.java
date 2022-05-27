/*
 * This file is used to register cache
 */

package dfar.springcachepoc.demo;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class CachingConfig {
    public static final String RANDOM_NUMBER_CACHE = "randomNumber";

    @Bean
    public CacheManager cacheManager() {
        return new ConcurrentMapCacheManager(RANDOM_NUMBER_CACHE);
    }
}