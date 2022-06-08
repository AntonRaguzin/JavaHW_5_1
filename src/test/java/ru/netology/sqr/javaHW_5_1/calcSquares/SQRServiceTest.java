package ru.netology.sqr.javaHW_5_1.calcSquares;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @CsvFileSource(files="src/test/resources/variables.csv")
    @ParameterizedTest
    public void shouldCalc(int expected, int x) {
        SQRService service = new SQRService();

        int actual = service.calcSQRService(x);
        Assertions.assertEquals(expected, actual);
    }
}
