package abstraction;

public class Test {

    public static void main(String[] args){
        TouchScreenLaptop computer;

        computer = new DELLNotebook();
        computer.click();
        computer.scroll();

        computer = new HPNotebook();
        computer.click();
        computer.scroll();
    }

}
