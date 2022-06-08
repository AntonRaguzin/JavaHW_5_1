package ru.netology.sqr.javaHW_5_1.calcSquares;

public class SQRService {
    public int calcSQRService(int min, int max) {
        int sqrQuantity = 0;
        for (int i = min; i <= max; i++) {
            if (i * i >= min & i * i <= max) {
                sqrQuantity = sqrQuantity + 1;
            }
        }
        return (sqrQuantity);
    }
}
