package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void ShouldCalcSQR() {
        SQRService service = new SQRService();

        int actual = service.calculate(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CalcSQRNot() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calculate(0, 99);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinusCalcSQR() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calculate(-200, -300);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IncorrectCalcSQRService() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calculate(300, 200);
        Assertions.assertEquals(expected, actual);
    }
}















