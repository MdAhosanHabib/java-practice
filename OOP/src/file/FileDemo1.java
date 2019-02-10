package file;

import java.io.File;

public class FileDemo1 {

    public static void main(String[] args) {

     /*   File ob = new File("C:/Users/ahosa/OneDrive/Desktop/Person");
        ob.mkdir();
        System.out.println("Path: " + ob.getAbsolutePath());
        System.out.println("Name: " + ob.getName());
        if (ob.delete()) {
            System.out.println("Person Folder has been deleted");
        }  */
     
        File ob = new File("Person");
        ob.mkdir();
        String path = ob.getAbsolutePath();
        File file1 = new File(path+"/student.txt");
        File file2 = new File(path+"/teacher.txt");
        
        try{
            file1.createNewFile();
            file2.createNewFile();
        }catch(Exception e){
            System.out.println(e);
        }
        
      /*  file2.delete();
        if(file2.exists()){
            System.out.println("File2 exists");
        }else{
            System.out.println("File2 don't exists");
        }  */
      
      
    }
}
