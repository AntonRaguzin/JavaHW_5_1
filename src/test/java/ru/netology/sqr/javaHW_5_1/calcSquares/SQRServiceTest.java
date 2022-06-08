package ru.netology.sqr.javaHW_5_1.calcSquares;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    //@CsvFileSource(files="src/test/resources/variables.csv")
    @Test
    public void calcSqrQuantity() {           //int expected, int actual) {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calcSQRService(8, 100);

        Assertions.assertEquals(expected, actual);
    }
}
