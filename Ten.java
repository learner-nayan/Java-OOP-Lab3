import java.io.*;

class Ten{

    static class KctStaffs implements Serializable {
        public String principal = "Unknown";
        public String vice_principal = "Hari Ghimire";
        public String coordinator = "Prashant Gautam";

        public String getName(){
            return this.vice_principal;
        }
    }

    public static void main(String[] args){

        KctStaffs teachers = new KctStaffs();

        String fileName = "/Users/nayan/IdeaProjects/Lab3/src/byteCode.txt";

        //Serialization

        try {
            FileOutputStream writefile = new FileOutputStream(fileName);
            ObjectOutputStream writebyteObj = new ObjectOutputStream(writefile);

            writebyteObj.writeObject(teachers);

            writefile.close();
            writebyteObj.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //Deserialization

        try {
            FileInputStream readFile =  new FileInputStream(fileName);
            ObjectInputStream readbyteobj = new ObjectInputStream(readFile);

            KctStaffs deserializedTeachers = (KctStaffs)readbyteobj.readObject();

            System.out.println(deserializedTeachers.getName());

            readFile.close();
            readbyteobj.close();

        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }


    }

}