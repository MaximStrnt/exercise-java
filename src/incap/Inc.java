package incap;

public class Inc {

	public static void main(String[] args) {
		
		Person evgeniy = new Person("Evgeniy", 30);
		
		// AGE
		System.out.println(evgeniy.getAge());      // 30
        
        evgeniy.setAge(33);  
        System.out.println(evgeniy.getAge());      // 33
        
        evgeniy.setAge(123456789);    
        System.out.println(evgeniy.getAge());      // 33
        
        evgeniy.setAge(99);
        System.out.println(evgeniy.getAge());
        
        evgeniy.setAge(100);
        System.out.println(evgeniy.getAge());   
        
        evgeniy.setAge(101);
        System.out.println(evgeniy.getAge()); 
        
        // NAME
        System.out.println(evgeniy.getName());  
        
        Person customer = new Person("Andrew", 30);
        System.out.println(customer.getName());
        
        customer.setName("Sergey");
        System.out.println(customer.getName());       
	}
	
}

	class Person{
	     
	    private String name;
	    private int age = 1;
	 
	    
	    public Person(String name, int age){
	        setName(name);
	        setAge(age);
	    }
	    
	    
	    public String getName(){
	        return this.name;
	    }
	    public void setName(String name){
	        this.name = name;
	    }
	    public int getAge(){
	        return this.age;
	    }
	    public void setAge(int age){
	        if(age > 0 && age < 100)
	            this.age = age;
	    }

}

