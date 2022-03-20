package dancers;

public class Dancer {
	
	
	private String name;
    private int age;

    public Dancer(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String greeting() {
        return "My name is " + name + ", I am " + age + ". " ;
    }

    public void dance() {
        System.out.println(greeting() + "I can dance. ");
    }

    
}


