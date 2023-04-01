
import java.util.*;

public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(permute(sc.next().toCharArray()));
    }
    public static List<List<Character>> permute(char[] nums) {
        List<List<Character>> res = new ArrayList<>();
        int[] vis = new int[nums.length];

        permutate(new ArrayList<>(), nums, vis, res);

        return res;
    }

    public static void permutate(List<Character> combination, char[] nums, int[] vis, List<List<Character>> res){
        if(combination.size() == nums.length){
            res.add(new ArrayList<>(combination));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(vis[i] == 0){
                combination.add(nums[i]);
                vis[i] = 1;
                permutate(combination, nums, vis, res);
                vis[i] = 0;
                combination.remove(combination.size() - 1);
            }
        }
    }
}
