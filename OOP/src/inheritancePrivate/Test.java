package inheritancePrivate;

public class Test {
    public static void main(String[]args){
        Teacher ip = new Teacher();
        ip.setName("Ahosan");
        ip.setAge(22);
        ip.setQualification("BSC in CSE");
        ip.display();
        
        Teacher ip2 = new Teacher();
        ip2.setName("Habib");
        ip2.setAge(21);
        ip2.setQualification("BSC in CSE");
        ip2.display();
    }
}
