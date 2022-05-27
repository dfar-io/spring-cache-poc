package dfar.springcachepoc.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomNumberController {
    private RandomNumberService randomNumberService;

    @Autowired
    public RandomNumberController(RandomNumberService randomNumberService){
        this.randomNumberService = randomNumberService;
    }

    @GetMapping("/")
    int get() {
        return this.randomNumberService.getRandomNumber();
    }
}
