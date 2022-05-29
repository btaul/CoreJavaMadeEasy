package flow_control;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int num = 0;
        while (num <= 0) {
            System.out.println("Enter a number that is greater than 0");
            Scanner sc = new Scanner(System.in);
            try {
                num = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Please enter a number stated below");
            }
        }

        int maxIter = Math.min(num, 100);

        for(int i = 1; i <= maxIter; i++){
            if(i % 10 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
