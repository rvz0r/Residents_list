package Residents.list;

class PESEL_validation {
  boolean validator(long x) {
   /* long k = x%10;//1
    x = x/10;
    long j = x%10;//2
    x = x/10;
    long i = x%10;//3
    x = x/10;
    long h = x%10;//4
    x = x/10;
    long g = x%10;//5
    x = x/10;
    long f = x%10;//6
    x = x/10;
    long e = x%10;//7
    x = x/10;
    long d = x%10;//8
    x = x/10;
    long c = x%10;//9
    x = x/10;
    long b = x%10;//10
    x = x/10;
    long a = x%10;//11
*/
    long[] num = new long[11];
    for (int i = 0;i<11;i++){
      num[i] = x%10;
      x = x/10;
    }

    long val = num[0] + 3*num[1] + 7*num[2] + 9*num[3] + num[4] + 3*num[5] + 7*num[6] + 9*num[7] + num[8] + 3*num[9] + num[10];
    return val % 10 == 0;
  }
}
