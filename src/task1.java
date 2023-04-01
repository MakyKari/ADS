import java.util.Scanner;

class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(minOfArray(arr));
    }

    public static int minOfArray(int[] arr){
        if(arr.length == 0) return 0;
        return privateMinOfArray(arr, arr[0], 0);
    }
    private static int privateMinOfArray(int[] arr, int min, int i){
        if(i == arr.length) return min;
        return privateMinOfArray(arr, Math.min(min, arr[i]), i + 1);
    }
}