import  java.util.*;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<>();
        makeCombination(candidates, target, 0, new ArrayList<>(),0, result);
        return result;
    }

    public static void makeCombination(int []candidates, int target, int idx, List<Integer> combination, int total, List<List<Integer>> result){

        if(total == target){
            result.add(new ArrayList<>(combination)); return; }

        if(total>target|| idx>=candidates.length) return;

        combination.add(candidates[idx]);
        makeCombination(candidates,  target,idx, combination, total+candidates[idx], result);
        combination.remove(combination.size()-1);
        makeCombination(candidates, target, idx + 1, combination, total, result);
    }

    public static void main(String[] args) {
        
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = combinationSum(candidates,target);

        for (List<Integer> combination : result) {
            System.out.println(combination);
    }
}

}