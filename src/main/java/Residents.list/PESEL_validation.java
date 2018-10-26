package Residents.list;

public class PESEL_validation {
  public boolean validator(long x) {
    long k = x%10;
    x = x/10;
    long j = x%10;
    x = x/10;
    long i = x%10;
    x = x/10;
    long h = x%10;
    x = x/10;
    long g = x%10;
    x = x/10;
    long f = x%10;
    x = x/10;
    long e = x%10;
    x = x/10;
    long d = x%10;
    x = x/10;
    long c = x%10;
    x = x/10;
    long b = x%10;
    x = x/10;
    long a = x%10;
    long val = a + 3*b + 7*c + 9*d + 1*e + 3*f + 7*g + 9*h + i + 3*j + k;
    if (val%10 == 0) {
      return true;
    }
    else {
    return false;
    }
  }
}
