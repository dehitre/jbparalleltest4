
import org.example.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;



class CalculatorAdditionTests {
    @Test
    @DisplayName("1 + 1 = 2")
    void addsTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.addition(1,1), "1 + 1 should equal 2");
    }
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,1,1",
            "1,2,3",
            "21,22,50"
    })
    void add(int a, int b, int res){
        Calculator calculator = new Calculator();
        assertEquals(res, calculator.addition(a, b),() -> a + " + " + b + " should equal " + res);
    }
}
class CalculatorDivisionTests1 {
    @Test
    @DisplayName("1 / 1 = 1")
    void divisionTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.division(1,1), "1 / 1 should equal 2");
    }
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "0,1,0",
            "1,0,0",
            "4,2,2"
    })
    void division(int a, int b, int res){
        Calculator calculator = new Calculator();
        assertEquals(res, calculator.division(a, b),() -> a + " / " + b + " should equal " + res);
    }
}
class CalculatorAdditionTests1 {
    @Test
    @DisplayName("1 + 1 = 2")
    void addsTwoNumbers1(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.addition(1,1), "1 + 1 should equal 2");
    }
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,1,1",
            "1,2,3",
            "21,22,50"
    })
    void add1(int a, int b, int res){
        Calculator calculator = new Calculator();
        assertEquals(res, calculator.addition(a, b),() -> a + " + " + b + " should equal " + res);
    }
}
class CalculatorDivisionTests2 {
    @Test
    @DisplayName("1 / 1 = 1")
    void divisionTwoNumbers2(){
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.division(1,1), "1 / 1 should equal 2");
    }
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "0,1,0",
            "1,0,0",
            "4,2,2"
    })
    void division2(int a, int b, int res){
        Calculator calculator = new Calculator();
        assertEquals(res, calculator.division(a, b),() -> a + " / " + b + " should equal " + res);
    }
}
class CalculatorAdditionTests2 {
    @Test
    @DisplayName("1 + 1 = 2")
    void addsTwoNumbers2(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.addition(1,1), "1 + 1 should equal 2");
    }
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,1,1",
            "1,2,3",
            "21,22,50"
    })
    void add2(int a, int b, int res){
        Calculator calculator = new Calculator();
        assertEquals(res, calculator.addition(a, b),() -> a + " + " + b + " should equal " + res);
    }
}
class CalculatorDivisionTests3 {
    @Test
    @DisplayName("1 / 1 = 1")
    void divisionTwoNumbers3(){
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.division(1,1), "1 / 1 should equal 2");
    }
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "0,1,0",
            "1,0,0",
            "4,2,2"
    })
    void division3(int a, int b, int res){
        Calculator calculator = new Calculator();
        assertEquals(res, calculator.division(a, b),() -> a + " / " + b + " should equal " + res);
    }
}
class CalculatorAdditionTests3 {
    @Test
    @DisplayName("1 + 1 = 2")
    void addsTwoNumbers3(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.addition(1,1), "1 + 1 should equal 2");
    }
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,1,1",
            "1,2,3",
            "21,22,50"
    })
    void add3(int a, int b, int res){
        Calculator calculator = new Calculator();
        assertEquals(res, calculator.addition(a, b),() -> a + " + " + b + " should equal " + res);
    }
}
class CalculatorDivisionTests4 {
    @Test
    @DisplayName("1 / 1 = 1")
    void divisionTwoNumbers4(){
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.division(1,1), "1 / 1 should equal 2");
    }
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "0,1,0",
            "1,0,0",
            "4,2,2"
    })
    void division4(int a, int b, int res){
        Calculator calculator = new Calculator();
        assertEquals(res, calculator.division(a, b),() -> a + " / " + b + " should equal " + res);
    }
}
class CalculatorAdditionTests4 {
    @Test
    @DisplayName("1 + 1 = 2")
    void addsTwoNumbers4(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.addition(1,1), "1 + 1 should equal 2");
    }
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,1,1",
            "1,2,3",
            "21,22,50"
    })
    void add4(int a, int b, int res){
        Calculator calculator = new Calculator();
        assertEquals(res, calculator.addition(a, b),() -> a + " + " + b + " should equal " + res);
    }
}
class CalculatorDivisionTests {
    @Test
    @DisplayName("1 / 1 = 1")
    void divisionTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.division(1,1), "1 / 1 should equal 2");
    }
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "0,1,0",
            "1,0,0",
            "4,2,2"
    })
    void division(int a, int b, int res){
        Calculator calculator = new Calculator();
        assertEquals(res, calculator.division(a, b),() -> a + " / " + b + " should equal " + res);
    }
}
