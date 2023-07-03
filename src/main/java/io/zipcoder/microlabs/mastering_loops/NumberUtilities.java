package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {

    public static boolean isOdd(int n){
        return (n%2 != 0);
    }
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder output = new StringBuilder("");
        for(int i = start; i < stop; i++){
            if(!isOdd(i)){
                output.append(i);
            }

        }
        return output.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder output = new StringBuilder("");
        for(int i = start; i < stop; i++){
            if(isOdd(i)){
                output.append(i);
            }
        }
        return output.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {
      return getExponentiations(start, stop, step, 2);
    }

    public static String getRange(int stop) {
        return getRange(0, stop, 1);
    }

    public static String getRange(int start, int stop) {
        return getRange(start, stop, 1);
    }


    public static String getRange(int start, int stop, int step) {
        /*
        StringBuilder output = new StringBuilder("");
        for(int i = start; i < stop; i+= step){
            output.append(i);
        }

         */
        return getExponentiations(start, stop, step, 1);
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder output = new StringBuilder("");
        for(int i = start; i<stop; i+= step){
            int hold = (int)Math.pow(i, exponent);
            output.append(hold);
        }
        return output.toString();
    }
}
