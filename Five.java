class  Five{
    public static void main(String[] args){
        int iterations = 5000;
        long startTime, endTime;

        //String concatenation using String for checking time taken
        startTime = System.nanoTime();
        String str = "";
        for(int i=0; i<=iterations; i++){
            str += " Selmon Bhoi";
        }
        endTime = System.nanoTime();
        long timeTakenByString = endTime - startTime;
        System.out.println("String took " + timeTakenByString/1e9 + " second to perform 5000 times string concat operation for 5000 times");

        //String append using StringBuffer for checking time taken
        startTime = System.nanoTime();
        StringBuffer strBuffer = new StringBuffer();
        for(int i=0; i<=iterations; i++){
            strBuffer.append(" Selmon Bhoi");
        }
        endTime = System.nanoTime();
        long timeTakenByStringBuffer = endTime - startTime;
        System.out.println("StringBuffer took " + timeTakenByStringBuffer/1e9 + " second to perform 5000 times string append operation for 5000 times");

        if(timeTakenByStringBuffer < timeTakenByString){
            System.out.println("StringBuffer takes comparatively less time to do string operation.");
        }else {
            System.out.println("String takes comparatively less time to do string operation.");
        }

    }
}
