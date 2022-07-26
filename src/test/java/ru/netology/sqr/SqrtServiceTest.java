package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class SqrtServiceTest {
    @ParameterizedTest
    @CsvSource({
            "200,300,3"
    })
    public void testSqrt(int x, int y, int a) {
        SqrService service = new SqrService();
        int sumSqrt = service.calcSqr(x, y);

        Assertions.assertEquals(a, sumSqrt);

    }

}
