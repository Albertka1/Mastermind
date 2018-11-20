import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CodiFacil extends Codi {
    
    public CodiFacil() {
        codi = new ArrayList<>(Arrays.asList(new Integer[4]));
        Collections.fill(codi,0);
    }
    
    public CodiFacil(List<Integer> inp){
        if (inp.size() == 4)
            codi = inp;
    }
    
    @Override
    public void codiAleatori() {
        Random rand = new Random();
        codi = new ArrayList<>(Arrays.asList(new Integer[4]));
        
        for (int i=0; i<codi.size(); i++) {
            int value;
            do {
                value = rand.nextInt(8)+1;
            } while (codi.contains(value));
            codi.set(i,value);
        }
    }
}
