package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder output = new StringBuilder("");
        while(start < stop){
            if(start%2 ==0){
                output.append(start);
            }
            start++;
        }
        return output.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder output = new StringBuilder("");
        while(start < stop){
            if(start%2 !=0){
                output.append(start);
            }
            start++;
        }
        return output.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder output = new StringBuilder("");
        while(start < stop){
            int hold = (int)Math.pow((double)start,2);
            output.append(hold);
            start+=step;
        }
        return output.toString();
    }

    public static String getRange(int stop) {
        StringBuilder output = new StringBuilder("");
        for (int i = 0; i < stop; i++){
            output.append(i);
        }
        return output.toString();
    }

    public static String getRange(int start, int stop) {
        StringBuilder output = new StringBuilder("");
        while(start < stop){
            output.append(start);
            start++;
        }
        return output.toString();
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder output = new StringBuilder("");
        while(start < stop){
            output.append(start);
            start+=step;
        }
        return output.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder output = new StringBuilder("");
        while(start < stop){
            int hold = (int)Math.pow(start, exponent);
            output.append(hold);
            start+=step;
        }
        return output.toString();
    }
}
