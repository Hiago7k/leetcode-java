public class TwoSum {
    static void main() {
        int nums[] = {2,7,11,15};
        int target = 17;

        for(int i = 0; i <= nums.length -1; i++){
            for(int j = i + 1; j <= nums.length -1; j++)
                if(nums[i] + nums[j] == target){
                    System.out.println(i + " " + j);
                }
        }
    }
}
