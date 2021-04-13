package ee.bcs.valiit.testController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Fibonacci {

    @GetMapping("sample/fibonacci")

    public static int fibonacci(@PathVariable("numberURL") int n){
        int a = 0;
        int b = 1;
        int c = 0;
//        for (int i = 2; i < n; i++) {
//            a = b;
//            b=fib;
//            fib = a+b;
//            System.out.println(fib);
//        }
//        return fib;
        for (int i = 0; i < n; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.println(c);
        }
        return c;
    }
}
