package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder output = new StringBuilder("");
        for(int i = 1; i < numberOfRows; i++){
            output.append(getRow(i) + "\n");
        }
        return output.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder output = new StringBuilder("");
        for(int i = 1; i <= numberOfStars; i++){
            output.append("*");
        }
        return output.toString();
    }

    public static String getSmallTriangle() {
        StringBuilder output = new StringBuilder("");
        for(int i = 1; i < 5; i++){
            output.append(getRow(i) + "\n");
        }
        return output.toString();
    }

    public static String getLargeTriangle() {
        StringBuilder output = new StringBuilder("");
        for(int i = 1; i < 10; i++){
            output.append(getRow(i) + "\n");
        }
        return output.toString();
    }
}
