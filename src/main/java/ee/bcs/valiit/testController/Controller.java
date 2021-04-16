package ee.bcs.valiit.testController;

import ee.bcs.valiit.tasks.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    public List<Employee> employeeList = new ArrayList<>();

    //http://localhost:8080/hello-world/Avo?action=Tere
    @GetMapping("hello-world/{nameInURL}")
    public String helloWorld(@PathVariable("nameInURL") String name,
                             @RequestParam("action") String action) {
        return action + " " + name;
    }

    // http://localhost:8080/fibonacci/5
    @GetMapping("fibonacci/{a}")
    public int fibonacci(@PathVariable("a") int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < n; i++) {
            a = b;
            b = c;
            c = a + b;
        }
        return c;
    }

    //http://localhost:8080/min?a=5&b=6
    @GetMapping("min")
    public int min(@RequestParam("a") int a,
                   @RequestParam("b") int b) {
        return Lesson1.min(a, b);
    }

    //http://localhost:8080/max?a=5&b=6
    @GetMapping("max")
    public int max(@RequestParam("a") int a,
                   @RequestParam("b") int b) {
        return Lesson1.max(a, b);
    }

    //http://localhost:8080/abs?a=-234
    @GetMapping("abs")
    public int abs(@RequestParam("a") int a) {
        return Lesson1.abs(a);
    }

    //http://localhost:8080/isEven/5
    @GetMapping("isEven/{a}")
    public boolean isEven(@PathVariable("a") int a) {
        return Lesson1.isEven(a);
    }

    //http://localhost:8080/min3/1/2/3
    @GetMapping("min3/{a}/{b}/{c}")
    public int min3(@PathVariable("a") int a,
                    @PathVariable("b") int b,
                    @PathVariable("c") int c) {
        return Lesson1.min3(a, b, c);
    }

    // http://localhost:8080/max3?a=1&b=2&c=3
    @GetMapping("max3")
    public int max3(@RequestParam("a") int a,
                    @RequestParam("b") int b,
                    @RequestParam("c") int c) {
        return Lesson1.max3(a, b, c);
    }

    //http://localhost:8080/reverseArray/1,2,3          eri arvud tuleb eraldada komadega!!!!!
    @GetMapping("reverseArray/{a}")
    public int[] reverseArray(@PathVariable("a") int[] inputArray) {
        return Lesson2.reverseArray(inputArray);
    }

    //http://localhost:8080/evenNumbers?a=3
    @GetMapping("evenNumbers")
    public int[] evenNumbers(@RequestParam("a") int n) {
        return Lesson2.evenNumbers(n);
    }

    // http://localhost:8080/minArray/1,2,3
    @GetMapping("minArray/{a}")
    public int min(@PathVariable("a") int[] arrayNimi) {
        return Lesson2.min(arrayNimi);
    }

    //http://localhost:8080/maxArray?a=1,2,3
    @GetMapping("maxArray")
    public int max(@RequestParam("a") int[] x) {
        return Lesson2.max(x);
    }

    //http://localhost:8080/sumArray/1,2,3
    @GetMapping("sumArray/{a}")
    public int sumArray(@PathVariable("a") int[] inputArray) {
        return Lesson2.sum(inputArray);
    }

    //http://localhost:8080/sequence3n?a=1&b=10
    @GetMapping("sequence3n")
    public int sequence3n(@RequestParam("a") int x,
                          @RequestParam("b") int y) {
        return Lesson2c.sequence3n(x, y);
    }

    @GetMapping("exercise1/{a}")
    public static void exercise1(@PathVariable("a") int n) {
        System.out.println(n);
    }

    //http://localhost:8080/sampleArray
    @GetMapping("sampleArray")
    public int[] sampleArray() {
        return Lesson2b.sampleArray();
    }

    //http://localhost:8080/generateArray?a=5
    @GetMapping("generateArray")
    public int[] generateArray(@RequestParam("a") int n) {
        return Lesson2b.generateArray(n);
    }

    //http://localhost:8080/decreasingArray/3
    @GetMapping("decreasingArray/{a}")
    public int[] decreasingArray(@PathVariable("a") int n) {
        return Lesson2b.decreasingArray(n);
    }

    //http://localhost:8080/yl3?a=5
    @GetMapping("yl3")
    public int[] yl3(@RequestParam("a") int n) {
        return Lesson2b.yl3(n);
    }

    //http://localhost:8080/factorial/3
    @GetMapping("factorial/{a}")
    public int factorial(@PathVariable("a") int x) {
        return Lesson3.factorial(x);
    }

    //http://localhost:8080/reverseString?a=Avo
    @GetMapping("reverseString")
    public String reverseString(@RequestParam("a") String a) {
        return Lesson3.reverseString(a);
    }

    // http://localhost:8080/isPrime/6
    @GetMapping("isPrime/{a}")
    public boolean isPrime(@PathVariable("a") int x) {
        return Lesson3.isPrime(x);
    }

    //http://localhost:8080/sort?a=5,9,2,4
    @GetMapping("sort")
    public int[] sort(@RequestParam("a") int[] a) {
        return Lesson3.sort(a);
    }

    //http://localhost:8080/evenFibonacci/10
    @GetMapping("evenFibonacci/{a}")
    public int evenFibonacci(@PathVariable("a") int x) {
        return Lesson3.evenFibonacci(x);
    }

    // http://localhost:8080/morse?a=eminem
    @GetMapping("morse")
    public String morseCode(@RequestParam("a") String a) {
        return Lesson3.morseCode(a);
    }

//    //http://localhost:8080/DTO
//    @GetMapping("SomeDto")
//    public ee.bcs.valiit.CodeWarsSmallGirl.SomeDto someDto() {
//        ee.bcs.valiit.CodeWarsSmallGirl.SomeDto worker = new ee.bcs.valiit.CodeWarsSmallGirl.SomeDto();
//        worker.setName("Toivo");
//        worker.setAddress("Keila");
//        worker.setAge(36);
//        return worker;
//    }

    //http://localhost:8080/Employee
    @GetMapping("Employee")
    public List<Employee> employee() {
        return employeeList;
    }

    @GetMapping("Employee/{index}")
    public Employee showOne(@PathVariable("index") int index) {
        return employeeList.get(index);
    }

    @PostMapping("Employee")
    public void addEmployee(@RequestBody Employee employee) {
        employeeList.add(employee);
    }

    @PutMapping("Employee/{index}")
    public void replaceEmployee(@PathVariable("index") int index, @RequestBody Employee employee) {
        employeeList.set(index, employee);
    }

    @DeleteMapping("Employee/{index}")
    public void deleteEmployee(@PathVariable("index") int index) {
        employeeList.remove(index);
    }

}