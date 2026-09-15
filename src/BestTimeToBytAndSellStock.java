import java.util.Arrays;

public class BestTimeToBytAndSellStock {
    static void main() {
        int nums[] = {7, 1, 5, 3, 6, 4};
        int lower = nums[0];
        int higher = nums[0];
        int sell = 0;

        // primeira parte saber o menor valor
        for(int i = 0; i <= nums.length -1; i++){
            if(nums[i] <= lower){
                lower=+ nums[i];
            }
            for(int j = i + 1; j <= nums.length -1; j++){
                if(nums[j] >= higher){
                    higher=+ nums[j];
                }
            }
            sell = higher - lower -1;
            // outra validacao se os precos so cairem nao faz nada
        }
        System.out.println(sell);
    }
}
