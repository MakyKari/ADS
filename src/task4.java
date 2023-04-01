import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(factorial(sc.nextInt()));
    }

    public static long factorial(int x) {
        if(x == 1) return 1;
        return x * factorial(x - 1);
    }

}
