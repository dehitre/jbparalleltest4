
import org.example.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;



class CalculatorMultiplicationTests {
    @Test
    @DisplayName("1 * 1 = 2")
    void multTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.multiplication(1,1), "1 * 1 should equal 2");
    }
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "0,1,0",
            "2,2,4",
            "4,5,25"
    })
    void multiplication(int a, int b, int res){
        Calculator calculator = new Calculator();
        assertEquals(res, calculator.addition(a, b),() -> a + " * " + b + " should equal " + res);
    }
}
class CalculatorSubstractionTests {
    @Test
    @DisplayName("1 - 1 = 0")
    void subTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.subtraction(1,1), "1 - 1 should equal 2");
    }
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "0,1,-1",
            "1,0,1",
            "1,1,0"
    })
    void substraction(int a, int b, int res){
        Calculator calculator = new Calculator();
        assertEquals(res, calculator.subtraction(a, b),() -> a + " - " + b + " should equal " + res);
    }
}
class CalculatorMultiplicationTests1 {
    @Test
    @DisplayName("1 * 1 = 2")
    void multTwoNumbers1(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.multiplication(1,1), "1 * 1 should equal 2");
    }
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "0,1,0",
            "2,2,4",
            "4,5,25"
    })
    void multiplication1(int a, int b, int res){
        Calculator calculator = new Calculator();
        assertEquals(res, calculator.addition(a, b),() -> a + " * " + b + " should equal " + res);
    }
}
class CalculatorSubstractionTests1 {
    @Test
    @DisplayName("1 - 1 = 0")
    void subTwoNumbers1(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.subtraction(1,1), "1 - 1 should equal 2");
    }
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "0,1,-1",
            "1,0,1",
            "1,1,0"
    })
    void substraction1(int a, int b, int res){
        Calculator calculator = new Calculator();
        assertEquals(res, calculator.subtraction(a, b),() -> a + " - " + b + " should equal " + res);
    }
}
class CalculatorMultiplicationTests2 {
    @Test
    @DisplayName("1 * 1 = 2")
    void multTwoNumbers2(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.multiplication(1,1), "1 * 1 should equal 2");
    }
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "0,1,0",
            "2,2,4",
            "4,5,25"
    })
    void multiplication2(int a, int b, int res){
        Calculator calculator = new Calculator();
        assertEquals(res, calculator.addition(a, b),() -> a + " * " + b + " should equal " + res);
    }
}
class CalculatorSubstractionTests2 {
    @Test
    @DisplayName("1 - 1 = 0")
    void subTwoNumbers2(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.subtraction(1,1), "1 - 1 should equal 2");
    }
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "0,1,-1",
            "1,0,1",
            "1,1,0"
    })
    void substraction2(int a, int b, int res){
        Calculator calculator = new Calculator();
        assertEquals(res, calculator.subtraction(a, b),() -> a + " - " + b + " should equal " + res);
    }
}
class CalculatorMultiplicationTests3 {
    @Test
    @DisplayName("1 * 1 = 2")
    void multTwoNumbers3(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.multiplication(1,1), "1 * 1 should equal 2");
    }
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "0,1,0",
            "2,2,4",
            "4,5,25"
    })
    void multiplication3(int a, int b, int res){
        Calculator calculator = new Calculator();
        assertEquals(res, calculator.addition(a, b),() -> a + " * " + b + " should equal " + res);
    }
}
class CalculatorSubstractionTests3 {
    @Test
    @DisplayName("1 - 1 = 0")
    void subTwoNumbers3(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.subtraction(1,1), "1 - 1 should equal 2");
    }
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "0,1,-1",
            "1,0,1",
            "1,1,0"
    })
    void substraction3(int a, int b, int res){
        Calculator calculator = new Calculator();
        assertEquals(res, calculator.subtraction(a, b),() -> a + " - " + b + " should equal " + res);
    }
}
class CalculatorMultiplicationTests4 {
    @Test
    @DisplayName("1 * 1 = 2")
    void multTwoNumbers4(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.multiplication(1,1), "1 * 1 should equal 2");
    }
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "0,1,0",
            "2,2,4",
            "4,5,25"
    })
    void multiplication4(int a, int b, int res){
        Calculator calculator = new Calculator();
        assertEquals(res, calculator.addition(a, b),() -> a + " * " + b + " should equal " + res);
    }
}
class CalculatorSubstractionTests4 {
    @Test
    @DisplayName("1 - 1 = 0")
    void subTwoNumbers4(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.subtraction(1,1), "1 - 1 should equal 2");
    }
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "0,1,-1",
            "1,0,1",
            "1,1,0"
    })
    void substraction4(int a, int b, int res){
        Calculator calculator = new Calculator();
        assertEquals(res, calculator.subtraction(a, b),() -> a + " - " + b + " should equal " + res);
    }
}
class CalculatorMultiplicationTests5 {
    @Test
    @DisplayName("1 * 1 = 2")
    void multTwoNumbers5(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.multiplication(1,1), "1 * 1 should equal 2");
    }
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "0,1,0",
            "2,2,4",
            "4,5,25"
    })
    void multiplication5(int a, int b, int res){
        Calculator calculator = new Calculator();
        assertEquals(res, calculator.addition(a, b),() -> a + " * " + b + " should equal " + res);
    }
}
class CalculatorSubstractionTests5 {
    @Test
    @DisplayName("1 - 1 = 0")
    void subTwoNumbers5(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.subtraction(1,1), "1 - 1 should equal 2");
    }
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "0,1,-1",
            "1,0,1",
            "1,1,0"
    })
    void substraction5(int a, int b, int res){
        Calculator calculator = new Calculator();
        assertEquals(res, calculator.subtraction(a, b),() -> a + " - " + b + " should equal " + res);
    }
}
class CalculatorMultiplicationTests6 {
    @Test
    @DisplayName("1 * 1 = 2")
    void multTwoNumbers6(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.multiplication(1,1), "1 * 1 should equal 2");
    }
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "0,1,0",
            "2,2,4",
            "4,5,25"
    })
    void multiplication6(int a, int b, int res){
        Calculator calculator = new Calculator();
        assertEquals(res, calculator.addition(a, b),() -> a + " * " + b + " should equal " + res);
    }
}
class CalculatorSubstractionTests6 {
    @Test
    @DisplayName("1 - 1 = 0")
    void subTwoNumbers6(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.subtraction(1,1), "1 - 1 should equal 2");
    }
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "0,1,-1",
            "1,0,1",
            "1,1,0"
    })
    void substraction6(int a, int b, int res){
        Calculator calculator = new Calculator();
        assertEquals(res, calculator.subtraction(a, b),() -> a + " - " + b + " should equal " + res);
    }
}
