package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void calculateSum() {
            SQRService SQRService = new SQRService();

            int i = 10;
        int expected = 5;

            int actual = SQRService.calculateNumberOfSguares(i);

            assertEquals(expected, actual);
        }



    }
