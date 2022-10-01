/*
 * GenerateSums.java
 * 
 * Author Name: Farzaan Naeem
 * BU ID: U03902484
 * Course: CS 112
 */

public class GenerateSums {

    //Purpose: To generate a string that shows the process of getting to a certain value
    public static String generateSums(int n) {
        String s = "";
        String oldSums = "1";
        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum += i;
            if(i == 1) {
                s += "1";
            } else {
                oldSums += " + " + i;
                // s += s.substring(0, s.indexOf("" + (i-1)) + 1) + " + " + i + " = " + sum;
                s += oldSums + " = " + sum;
            }
            if(i != n) {
                s += "\n";
            }
        }
        return s;
    }

    public static void main(String[] args) {

        // generateSums(4);
        // System.out.println(generateSums(4));
        // System.out.println(generateSums(6));
        
    }
    
}
