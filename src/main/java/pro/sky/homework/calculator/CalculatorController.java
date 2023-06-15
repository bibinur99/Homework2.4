package pro.sky.homework.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
        private final CalculatorService calculatorService;

        public CalculatorController(CalculatorService calculatorServiceService) {
            this.calculatorService = calculatorServiceService;
        }

        @GetMapping(path="/calculator")
        public String calculator(){
            return calculatorService.calculator();
        }

    @GetMapping(path = "/calculator/plus")
    public String add(@RequestParam("num1") String num1,
                        @RequestParam("num2") String num2) {
            return calculatorService.add(num1,num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String subtract(@RequestParam("num1") String num1,
                        @RequestParam("num2") String num2) {
        return calculatorService.subtract(num1,num2);
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam("num1") String num1,
                           @RequestParam("num2") String num2) {
        return calculatorService.multiply(num1,num2);
    }
    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam("num1") String num1,
                           @RequestParam("num2") String num2) {
        return calculatorService.multiply(num1,num2);
    }



}
