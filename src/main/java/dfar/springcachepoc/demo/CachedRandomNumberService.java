package dfar.springcachepoc.demo;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class CachedRandomNumberService implements RandomNumberService {
    Logger logger = LoggerFactory.getLogger(CachedRandomNumberService.class);

    @Override
    @Cacheable(CachingConfig.RANDOM_NUMBER_CACHE)
    public int getRandomNumber() {
        logger.info("No cached record found, generating.");

        // simulate a long-running process
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e) {}
        
        // just provide a random number
        Random rand = new Random();
        return rand.nextInt(1000);
    }
}
