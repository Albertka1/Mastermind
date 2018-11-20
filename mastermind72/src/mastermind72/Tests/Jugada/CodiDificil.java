import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CodiDificil extends Codi {
    
    public CodiDificil() {
        codi = new ArrayList<>(Arrays.asList(new Integer[6]));
        Collections.fill(codi,0);
    }
    
    public CodiDificil(List<Integer> inp){
        if (inp.size() == 6)
            codi = inp;
    }
    
    @Override
    public void codiAleatori() {
        Random rand = new Random();
        codi = new ArrayList<>(Arrays.asList(new Integer[6]));
        // Per assegurar maxim 2 repetits
        List<Integer> quant = new ArrayList<>(Arrays.asList(new Integer[8]));
        Collections.fill(quant,0);
        
        for (int i=0; i<codi.size(); i++) {
            int value;
            do {
                value = rand.nextInt(8)+1;
            } while (quant.get(value-1)>1);   // Com a molt 2 repetits
            codi.set(i,value);
            quant.set(value-1,quant.get(value-1)+1);
        }
    }
}
