import java.util.Arrays;

public class BestTimeToBytAndSellStock {
    static void main() {
       int nums[] = {7, 2, 5, 3, 6, 4};
       int sell = 0;
       int higher = 1;
       int lower = 1;

        for(int i = 0; i <= nums.length -1; i++){
            if(nums[i] <= lower){
                lower = lower = nums[i];
            }
            for(int j = i + 1; j <= nums.length -1; j++){
                if(nums[j] >= higher){
                   higher = higher = nums[j];
                }
            }
        }
        sell = sell = higher - lower;
        System.out.println(sell);
    }
}
