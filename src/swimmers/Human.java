package swimmers;

public class Human implements Swim {
	private String name;
	private int age;

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public void swim() {
		System.out.println(toString() + "I can swim using air rubber ring. ");
	}

	@Override
	public String toString() {
		return "My name is " + name + ", I am " + age + ". ";
	}

}
