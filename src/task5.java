import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(fib(sc.nextInt()));
    }

    public static int fib(int n){
        if(n < 2) return n;
        return fib(n - 1) + fib(n - 2);
    }
}
