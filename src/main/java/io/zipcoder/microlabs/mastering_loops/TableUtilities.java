package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        /*
        StringBuilder output = new StringBuilder("");
        for(int i =1; i < 6; i++){
            for(int x = 1; x < 6; x++){
                if(x*i < 10){
                    output.append("  " + x*i + " |");
                }
                else{
                    output.append(" " + x*i + " |");
                }
                
                
            }
            output.append("\n");
        }

         */
        return getMultiplicationTable(5); // this should probably be 4 but the test actually asks for a 5 mult table so \_( * * )_/
    }

    public static String getLargeMultiplicationTable() {
        /*
        StringBuilder output = new StringBuilder("");
        for(int i =1; i < 11; i++){
            for(int x = 1; x < 11; x++){
                if(x*i < 10){
                    output.append("  " + x*i + " |");
                }
                else if(x*i < 100){
                    output.append(" " + x*i + " |");
                }
                else{
                    output.append(x*i + " |");
                }
                
                
            }
            output.append("\n");
        }

         */
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder output = new StringBuilder("");
        String hold = "";
        for(int i =1; i < tableSize + 1; i++){
            for(int x = 1; x < tableSize + 1; x++){
                if(x*i < 10){
                    hold = String.format("%3d |", (x*i));
                    output.append(hold);
                    //output.append("  " + x*i + " |");
                }
                else if(x*i < 100){
                    hold = String.format("%3d |", (x*i));
                    output.append(hold);
                    //output.append(" " + x*i + " |");
                }
                else{
                    output.append(x*i + " |");
                }

            }
            output.append("\n");
        }
        return output.toString();
    }
}
