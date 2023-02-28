package ru.netology.sqr;

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

}
