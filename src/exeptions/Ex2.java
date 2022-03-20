package exeptions;

public class Ex2 {

	public static void main(String[] args) {
		
		
		int[] arr = new int[3];
		
		try{
		    arr[0]=45; 
		    arr[1]=Integer.parseInt("abcd");
		}
		catch(ArrayIndexOutOfBoundsException ex){      
		    System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(NumberFormatException ex){     
		    System.out.println("Error converting from string to number");
		}
		finally{
		    System.out.println("Finally");
		}
		
		
		System.out.println("Program finished");
	}

}
