import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(allDigits(sc.next().toCharArray()));
    }

    public static boolean allDigits(char[] arr){
        return privateAllDigits(arr, 0);
    }

    private static boolean privateAllDigits(char[] arr, int i) {
        if(i == arr.length) return true;
        return Character.isDigit(arr[i]) && privateAllDigits(arr, i + 1);
    }
}
