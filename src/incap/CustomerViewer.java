package incap;

public class CustomerViewer {
	public static void main(String[] args) {
        
        Customer andrew = new Customer("Andrew", 28, "Belinsky street", "+1233456789");
        andrew.displayName();     
        andrew.displayAge();     
        andrew.displayPhone();    
        //andrew.displayAddress();  // Error, method private
        System.out.println(andrew.address);   
        
        System.out.println();
        System.out.println(andrew.name);      
        System.out.println(andrew.age);       
        //System.out.println(andrew.phone);   //  Error, mod private
    }
}
class Customer{
     
    String name;
    protected int age;
    public String address;
    private String phone;
 
    public Customer(String name, int age, String address, String phone){
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }
    public void displayName(){
        System.out.printf("Name: %s \n", name);
    }
    void displayAge(){
        System.out.printf("Age: %d \n", age);
    }
    private void displayAddress(){
        System.out.printf("Address: %s \n", address);
    }
    protected void displayPhone(){
        System.out.printf("Phone number: %s \n", phone);
    }
}
