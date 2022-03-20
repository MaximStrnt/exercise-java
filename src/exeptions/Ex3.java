package exeptions;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		System.out.print("Enter number 'a' : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
		try{
            if(a>=50){
               throw new Exception("Number 'a' must be lower than 50");
           } else {
        	   System.out.println(a);
           }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
		finally{
		    System.out.println("Finally");
		}
        System.out.println("Program finished");
    } 

	

}
