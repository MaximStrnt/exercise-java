package dancers;

 

public class HipHopDancer extends Dancer{

    public HipHopDancer(String name, int age) {
        super(name, age);
    }

    @Override
    public void dance(){
        System.out.println(greeting() + "I can dance hip-hop!");
    }
}


