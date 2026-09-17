import java.util.Arrays;
import java.util.List;

public class BestTimeToBytAndSellStock {
    static void main() {
       int prices[] = {7,1,5,0,6,4};
       int lower = 0;
       int atual = 0;
       int j = 0;

       for (int i = 0; i <= prices.length -1; i++){
            atual = prices[i];
            lower = prices[j+1];

            if(atual <= lower){
                lower = lower =  atual;
            }

       }
        System.out.println(lower);
    }
}
