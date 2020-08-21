import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {
        long n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter integer::");
        n = s.nextLong();
        temp1 t = new temp1();
        long res = t.fact(n);
        System.out.println(res);

    }
}

class temp1 {
    long fact(long n) {
        if (n == 1)
            return 1;
        else
            return (n * fact(n - 1));
    }
}
