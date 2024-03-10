class Two{
    public static void main(String[] args){
        try {
            int a= 5, b=0, division;
            division = a / b;   //ArithmeticException

            int[] arr = {1,2,3,4};
            arr[8] = 23;        //ArrayIndexOutOfBoundsException

            Object[] objArr = new String[5];
            objArr[2] = 5;     //ArrayStoreException

            String name = "Nayan";
            System.out.println(name.charAt(11));
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (ArrayStoreException e){
            System.out.println(e);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e);
        }finally {
            System.out.println("Handled four exceptions.");
        }
    }
}