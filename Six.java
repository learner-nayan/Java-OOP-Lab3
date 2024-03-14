class Six{
    public static void main(String[] args){
        StringBuffer strBfr = new StringBuffer("BINOD ");

        System.out.println(strBfr.append("Khach"));

        System.out.println(strBfr.insert(5," CR-7"));

        System.out.println(strBfr.replace(6,10, "Messi"));

        System.out.println(strBfr.delete(6,12));

        System.out.println(strBfr.reverse());
    }
}