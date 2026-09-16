import java.util.Arrays;

public class BestTimeToBytAndSellStock {
    static void main() {
       int nums[] = {7, 2, 5, 3, 6, 4};
       int sell = 0;
       int lower = 0;
       int higher = 0;
       int numsSaved = 0;

       for(var i = 0; i <= nums.length -1; i++){
           System.out.println(nums[i]);

           for(int j = i + 1; j<= nums.length -1; j++){
               numsSaved = numsSaved + nums[i];

               if(nums[j] <= nums[i]){
                   lower = lower = nums[i];
               }
           }
       }
        System.out.println(numsSaved);
        System.out.println(lower);
    }
}
