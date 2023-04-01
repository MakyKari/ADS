import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(binomialC(a, b));

        System.out.println(anotherbinomialC(a,b));
    }

    public static int binomialC(int k, int n){
        if(n == 0 || k == n) return 1;
        return binomialC(k - 1, n - 1) + binomialC(k - 1, n);
    }

    public static long anotherbinomialC(int k, int n){
        return task4.factorial(k) / (task4.factorial(n) * task4.factorial(k - n));
    }
}
