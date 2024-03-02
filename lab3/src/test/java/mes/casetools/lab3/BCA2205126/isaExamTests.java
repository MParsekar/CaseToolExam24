package mes.casetools.lab3.BCA2205126;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import mes.casetools.lab3.Exam.Exam;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
public class isaExamTests {
    Exam examtest = new Exam();
    @Test
    void assertEven(){

        boolean true_result = examtest.isEven(6);
        assertTrue(true_result, "The condition should be true");
    }

    @Test
    void assertOdd(){
        boolean false_result = examtest.isEven(5);
        assertFalse(false_result, "The condition should be false");
    }
}
