
package final_keyword;

public class University {
    final String NAME = "DIU";
    static final int fee; //static blank final variable
  /*  University(){
        fee = 37000;  
    }  */
    static{
        fee = 37000;
    }
    void display(){
        System.out.println(NAME);
        System.out.println(fee);
    }
}
