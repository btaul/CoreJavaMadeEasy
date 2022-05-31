package encapsulation;

public class Test {

    public static void main(String[] args){

        Patient patient = new Patient();

        patient.setName("Bob");
        patient.setId(1000);
        patient.setSsn("XXX-XX-XXXX");

        System.out.println("Patient name is: " + patient.getName());
        System.out.println("Patient id is: " + patient.getId());
        System.out.println("Patient snn is: " + patient.getSsn());

    }
}
