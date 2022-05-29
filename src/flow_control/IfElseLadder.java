package flow_control;

import java.util.Scanner;

class IfElseLadder{
    private static final int FAILING_GRADE = 35;

    public static void main(String[] args){

        int math = getGrade(0,"Math");
        int physics = getGrade(0,"Physics");
        int chemistry = getGrade(0,"Chemistry");

        boolean failMath = math < FAILING_GRADE;
        boolean failPhysics = physics < FAILING_GRADE;
        boolean failChemistry = chemistry < FAILING_GRADE;

        if( failMath || failPhysics || failChemistry) {
            System.out.println("F");
        }
        else {
            float avgGrade = (float)(math + physics + chemistry)/3;

            if (avgGrade <= 59) {
                System.out.println("C");
            } else if (avgGrade <= 69) {
                System.out.println("B");
            } else {
                System.out.println("A");
            }
        }
    }

    public static int getGrade(int grade, String course){
        while (grade <= 0 || grade > 100) {
            System.out.println("Enter a number that is greater than 0 and less than 101 for the " + course + " grade");
            Scanner sc = new Scanner(System.in);
            try {
                grade = sc.nextInt();
            }
            catch (Exception e){
                System.out.println("Please enter a number stated below");
            }
        }
        return grade;
    }

}
