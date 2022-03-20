package swimmers;

import java.util.Arrays;
import java.util.List;

public class Main {
	
	 public static void main(String[] args) {
	        Swim human = new Human("Andrew", 8);
	        Swim fish = new Fish("whale");
	        Swim ship = new Ship(35);

	        List<Swim> swimmers = Arrays.asList(human, fish, ship);
	        for (Swim s : swimmers) {
	            s.swim();
	        }
	    }
}
