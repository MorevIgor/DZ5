package ru.netology.sqr;

public class SqrService {
    public static int calcSqr(int x, int y) {
        int a = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= x) {
                if (i * i <= y) {
                    a++;
                }

            }

        }
        return a;
    }
}