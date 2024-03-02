package mes.casetools.lab3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import mes.casetools.lab3.Professor.Calculator;

@SpringBootTest
class Lab3ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void assertAdd() {
        Calculator calculator = new Calculator();
        int answer = calculator.add(9, 1);
        assertEquals(10, answer);
    }

}
