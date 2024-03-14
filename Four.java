import java.util.Locale;

class Four{
    public static void main(String[] args){
        String str = "     Hello everyone! This is a JAVA program";

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        System.out.println(str.charAt(10));

        System.out.println(str.indexOf("program"));

        System.out.println(str.trim());

        String[] arr = str.split(" ");

        for(String eachChar: arr){
            System.out.println(eachChar);
        }

        System.out.println(str.length());
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());
    }
}