package dancers;

public class BalletDancer extends Dancer {
	public BalletDancer(String name, int age) {
		super(name, age);
	}

	
	@Override
	public void dance() {
		System.out.println(greeting() + "I can dance ballet!");
	}
}
