package persons;

public class PersonViewer {

	public static void main(String[] args) {
		
		Employee sergey = new Employee("Sergey", "ABC");
        sergey.display();
        Customer anton = new Customer("Anton", "ABCD");
        anton.display();
    }
}
abstract class Person {
     
    private String name;
     
    public String getName() { 
    	return name; }
    
    public Person(String name){
        this.name=name;
    }
  
    public abstract void display();
}
 
class Employee extends Person{
 
    private String bank;
     
    public Employee(String name, String company) {
     
        super(name);
        this.bank = company;
    }
     
    public void display(){
         
        System.out.printf("Employee Name: %s \t Bank: %s \n", super.getName(), bank);
    }
}
 
class Customer extends Person
{
    private String bank;
     
    public Customer (String name, String company) {
     
        super(name);
        this.bank = company;
    }
     
    public void display(){
         
        System.out.printf("Client Name: %s \t Bank: %s \n", super.getName(), bank);
    }

	

}
