package ru.netology.sqr.javaHW_5_1.calcSquares;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/variables.csv")
    //CsvSource({
//            "0, 10, 99",
//            "1, 9, 99",
//            "1, 10, 100"
//    })
    public void calcSqrQuantity(int expected, int min, int max) {
        SQRService service = new SQRService();
//        int expected = 0;
        int actual = service.calcSQRService(min, max);

        Assertions.assertEquals(expected, actual);
    }
}
