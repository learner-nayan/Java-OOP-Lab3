import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Seven{
    public static void main(String[] args){
        try{
            FileInputStream javaText = new FileInputStream("/Users/nayan/IdeaProjects/Lab3/src/javatext.txt");
            FileOutputStream javaText1 = new FileOutputStream("/Users/nayan/IdeaProjects/Lab3/src/javatext1.txt");
            int data = 0;
            while ((data = javaText.read()) != -1){
                System.out.print((char)data);
                javaText1.write(data);
            }
            javaText1.close();
            javaText1.close();
        }catch (IOException e){
            System.out.println("File not found!");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("\nFile operation completed.");
        }
    }
}