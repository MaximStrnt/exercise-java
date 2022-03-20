package exeptions;

public class Ex4 {

	public static void main(String[] args) {

		Greeting gr = new Greeting();

		try {
			gr.greet(50);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}

class Greeting {

	public void greet(int a) throws Exception {
		
		if (a >= 50) {
			System.out.println("Good bye");
			throw new Exception("Number must be lower than 50");
		} else {
			System.out.println("Hello");
		}
	}
}
