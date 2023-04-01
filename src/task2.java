import java.util.Scanner;

class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(averageOfArray(arr));
    }

    public static double averageOfArray(int[] arr){
        if(arr.length == 0) return 0;
        return privateAverageOfArray(arr, 0);
    }
    private static double privateAverageOfArray(int[] arr, int i){
        if(i == arr.length) return 0;
        return (double)arr[i] / arr.length + privateAverageOfArray(arr, i + 1);
    }
}