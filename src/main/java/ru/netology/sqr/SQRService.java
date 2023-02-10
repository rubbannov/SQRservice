package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRService {
    public int sqareOfThreeNumbers(int before, int after) {

        int x = 99;
        int result = 0;

        for (int i = 10; i <= x; i++) {
            if (i * i >= before) {
                if (i * i <= after) {
                    result = result + 1;
                }

            }

        }
        return result;


    }

    @ParameterizedTest
    @CsvSource({
            "3,200,300",
            "8,100,300",
            "10,8100,9801"
    })
    public void testSqare(int expected, int before, int after) {
        SQRService service = new SQRService();

        int actual = service.sqareOfThreeNumbers(before, after);

        Assertions.assertEquals(expected, actual);
    }

}
