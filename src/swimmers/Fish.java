package swimmers;

public class Fish implements Swim {
	private String name;

	public Fish(String name) {
		this.name = name;
	}

	@Override
	public void swim() {
		System.out.println("I am fish " + name + ". I can swim moving my fins and tail.");

	}

}
