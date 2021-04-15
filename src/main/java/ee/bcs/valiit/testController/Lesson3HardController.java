package ee.bcs.valiit.testController;

import ee.bcs.valiit.tasks.Lesson3Hard;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Lesson3HardController {
//    Random random = new Random();
//    Scanner scanner = new Scanner(System.in);

    //http://localhost:8080/randomNumber/65
    @GetMapping("randomNumber/{guess}")
    public static String lesson3Hard(@PathVariable("guess") int guess) {
        return Lesson3Hard.lesson3Hard(guess);
    }
}
