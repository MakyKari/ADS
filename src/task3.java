import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isPrime(sc.nextInt()));
    }
    public static boolean isPrime(int a){
        return privateIsPrime(a, 2);
    }
    private static boolean privateIsPrime(int a, int i) {
        if(i == a || a == 1) return true;
        return a % i != 0 && privateIsPrime(a, i + 1);
    }
}