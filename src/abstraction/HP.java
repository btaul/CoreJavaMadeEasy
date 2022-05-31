package abstraction;

public abstract class HP implements TouchScreenLaptop{

    @Override
    public void scroll(){
        System.out.println("Inside HP Scroll Method");
    }

}
