package Residents.list;

class PESEL_validation {
    boolean validator(long x) {
        long[] num = new long[11];
        for (int i = 0; i < 11; i++) {
            num[i] = x % 10;
            x = x / 10;
        }
        long val = num[0] + 3 * num[1] + 7 * num[2] + 9 * num[3] + num[4] + 3 * num[5] + 7 * num[6] + 9 * num[7] + num[8] + 3 * num[9] + num[10];
        return val % 10 == 0;
    }
}
