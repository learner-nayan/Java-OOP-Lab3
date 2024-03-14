class Three{
    public static float divide(int a, int b) throws ArithmeticException{
        float result;
        if (b==0){
            throw new ArithmeticException();
        }
        return result = a/b;
    }
    public static void main(String[] args){
        try{
            float result = divide(10,0);
            System.out.println(result);
        }catch (Exception e){
            System.out.println("Cannot divide by zero.\n"+ e);
        }
    }
}