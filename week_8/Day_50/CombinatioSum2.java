import java.util.ArrayList;
import java.util.Arrays;
import  java.util.List;
public class CombinatioSum2 {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target){
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }
    
    public static void backtrack (int []candidates, int target, int start, List<Integer> current ,List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }

        if(target < 0) return; 


        for(int i = start;i<candidates.length;i++){
            if(i> start && candidates[i] == candidates[i-1]){
                continue;//this will skip the duplicates and also the combination which are duplicate
            }
            current.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i +1 , current, result);
            current.remove(current.size()-1);
        }
    }

    public static void main(String[] args) {
        CombinatioSum2 obj = new CombinatioSum2();
        int []candidates = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> result = obj.combinationSum2(candidates, target );
        System.out.println(result);
    }
    
}
