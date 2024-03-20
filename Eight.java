import java.io.*;

class Eight{
    public static void main(String[] args){
        try{
            BufferedReader javatxt = new BufferedReader(new FileReader("/Users/nayan/IdeaProjects/Lab3/src/javatext.txt"));
            BufferedWriter javatxt1 = new BufferedWriter(new FileWriter("/Users/nayan/IdeaProjects/Lab3/src/javatext1.txt"));

            String line;
            while ((line = javatxt.readLine()) != null){
                System.out.println(line);
                javatxt1.write(line);
                javatxt1.newLine();
            }
            javatxt.close();
            javatxt1.close();
        }catch (IOException e){
            System.out.println("Exception catched");
            System.out.println(e.getMessage());
        }
    }
}