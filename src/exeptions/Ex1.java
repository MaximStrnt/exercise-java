package exeptions;

public class Ex1 {

	public static void main(String[] args) {
		
		int[] arr = new int[3];
		
		try{
		    arr[4]=45;
		    System.out.println(arr[4]);
		}
		catch(Exception ex){
		    ex.printStackTrace();
		}
		
		finally{
		    System.out.println("Finally");
		}
		
		System.out.println("Program finished");

	}

}
