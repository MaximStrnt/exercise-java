package dancers;

import java.util.Arrays;
import java.util.List;

public class Main {
	
	
	public static void main(String[] args) {
        Dancer dancer = new Dancer("Sergey", 20);

        Dancer hipHop = new HipHopDancer("Anatoliy", 25);
        Dancer balley = new BalletDancer("Anastasiya", 19); 
        

        List<Dancer> discotheque = Arrays.asList(dancer, hipHop, balley);
        for (Dancer d : discotheque) {
            d.dance();
        }
    }
}
