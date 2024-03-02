package mes.casetools.lab3.Exam;

import org.springframework.stereotype.Service;

import BCA2205142.Calculator;

@Service
public class Exam {
    /**
     * The functions take an integer number, and returns true if the number
     * is even and false if its odd.
     * 
     * @param num
     * @return
     */
    public class Main {
        public static void main(String[] args) {
            Exam exam = new Exam();

            int number = 7;
            boolean result = exam.isEven(number);

            System.out.println("Is " + number + " even? " + result);
        }
    }

    public boolean isEven(int num) {
        return num % 2 == 0;

    }

    void assertAdd() {
        Calculator calculator = new Calculator();
        int answer = calculator.add(9, 1);
        assertEquals(10, answer);
    }

    private void assertEquals(int expected, int answer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

}
