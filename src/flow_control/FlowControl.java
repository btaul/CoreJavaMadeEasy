package flow_control;

import java.util.Scanner;

public class FlowControl {

    public static void main(String[] args){
        int num = 0;
        while (num <= 0) {
            System.out.println("Enter a number that is greater than 0");
            Scanner sc = new Scanner(System.in);
            try {
                num = sc.nextInt();
            }
            catch (Exception e){
                System.out.println("Please enter a number stated below");
            }
        }

        boolean primeFlag = checkPrime(num);

        if (primeFlag){
            System.out.println("Prime #");
        }
        else {
            System.out.println("Not a Prime #");
        }
    }

    public static boolean checkPrime(int num){
        if (num == 1){
            return true;
        }

        for(int i  = 2; i < num - 1; i++){
            if (num % i == 0){
                return false;
            }
        }

        return true;
    }
}
