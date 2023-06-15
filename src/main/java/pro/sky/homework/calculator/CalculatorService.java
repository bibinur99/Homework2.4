package pro.sky.homework.calculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorService {

    public String calculator() {
        return " Welcome to Calculator!";
    }
    public String add(@RequestParam("num1") String num1,
                      @RequestParam("num2") String num2) {
        if ((num1 == "") || (num2 == "")){
            return "Invalid data";
        } else {
            int result = Integer.parseInt(num1) + Integer.parseInt(num2);
            return num1 + '+' + num2 + '=' + result;
        }
    }
    public String subtract(@RequestParam("num1") String num1,
                      @RequestParam("num2") String num2) {
        if ((num1 == "") || (num2 == "")) {
            return "Invalid data";
        } else {
            int result = Integer.parseInt(num1) - Integer.parseInt(num2);
            return num1 + '-' + num2 + '=' + result;
        }
    }
    public String multiply(@RequestParam("num1") String num1,
                           @RequestParam("num2") String num2) {
        if ((num1 == "") || (num2 == "")){
            return "Invalid data";
        } else {
            int result = Integer.parseInt(num1) * Integer.parseInt(num2);
            return num1 + '*' + num2 + '=' + result;
        }
    }
    public String divide(@RequestParam("num1") String num1,
                           @RequestParam("num2") String num2) {
        if ((num1 == "") || (num2 == "")){
            return "Invalid data";
        } else {
            int result = Integer.parseInt(num1) / Integer.parseInt(num2);
            return num1 + ':' + num2 + '=' + result;
        }
    }

}
