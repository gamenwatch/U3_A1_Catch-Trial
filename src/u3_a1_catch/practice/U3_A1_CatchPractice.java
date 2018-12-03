/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package u3_a1_catch.practice;

//Bring in Scanner
import java.util.Scanner;

/**
 * Jacob
 * Nov 28, 2018
 */
public class U3_A1_CatchPractice {
    
    /**
     * @param valid = will the loop continue
     * @param intInput = an int input
     * @param stringInput = an string input
     **/
    public static void stringLength(boolean valid, int intInput, String stringInput) {
        Scanner keyedInput = new Scanner (System.in);
        
        while (valid == false) {
            System.out.println("Enter a string that is 6 chars long:");
            stringInput = keyedInput.nextLine();
            System.out.println("");
            
            try {
                if (stringInput.length() >= 6) { 
                    System.out.println("Thanks for the valid input.");
                    System.out.println("");
                    valid = true;
                }
                else {
                    throw new Exception ("Sorry that is not a valid input.");
                }
        
            }
            
            catch (Exception e) {
                System.err.println(e.getMessage());
                System.out.println("");
            }
        }    
    }
    
    /**
     * @param valid = will the loop continue
     * @param intInput = an int input
     * @param stringInput = an string input
     **/
    public static void stringA(boolean valid, int intInput, String stringInput) {
        Scanner keyedInput = new Scanner (System.in);
        
        while (valid == false) {
            System.out.println("Enter a string that has a lower case \"a\":");
            stringInput = keyedInput.nextLine();
            System.out.println("");
            
            try {
                if (stringInput.contains("a") == true) { 
                    System.out.println("Thanks for the valid input.");
                    valid = true;
                }
                else {
                    throw new Exception ("Sorry that is not a valid input.");
                }
        
            }
            
            catch (Exception e) {
                System.err.println(e.getMessage());
                System.out.println("");
            }
        }    
    }
    
    /**
     * @param valid = will the loop continue
     * @param intInput = an int input
     * @param stringInput = an string input
     **/
    public static void stringOneFifteenNoz(boolean valid, int intInput, String stringInput) {
        Scanner keyedInput = new Scanner (System.in);
        
        while (valid == false) {
            System.out.println("Enter a string that is between 5-15 characters and dooes not have a \"z\":");
            stringInput = keyedInput.nextLine();
            System.out.println("");
            
            try {
                if (stringInput.length() > 5 && stringInput.length() < 15 && !stringInput.contains("z") && !stringInput.contains("Z")) { 
                    System.out.println("Thanks for the valid input.");
                    valid = true;
                }
                else {
                    throw new Exception ("Sorry that is not a valid input.");
                }
        
            }
            
            catch (Exception e) {
                System.err.println(e.getMessage());
                System.out.println("");
            }
        }    
    }
    
    /**
     * @param valid = will the loop continue
     * @param intInput = an int input
     * @param stringInput = an string input
     **/
    public static void integerFiveFiveHundred(boolean valid, int intInput, String stringInput) {
        Scanner keyedInput = new Scanner (System.in);
        
        while (valid == false) {
            System.out.println("Enter a integer between 5-500");
            System.out.println("");

            
            try {
                intInput = keyedInput.nextInt();
                if (intInput > 4 && intInput < 501) {
                    valid = true;
                }
                else {
                    throw new Exception ("Sorry that is not a valid input.");
                }
            }
            
            catch (Exception e) {
                System.err.println(e.getMessage());
                System.out.println("");
            }
        }    
    }
    
    /**
     * @param valid = will the loop continue
     * @param intInput = an int input
     * @param stringInput = an string input
     **/
    public static void integerNegative(boolean valid, int intInput, String stringInput) {
        Scanner keyedInput = new Scanner (System.in);
        
        while (valid == false) {
            System.out.println("Enter a integer (negative)");
            System.out.println("");

            
            try {
                intInput = keyedInput.nextInt();
                if (intInput < 0) {
                    valid = true;
                }
                else {
                    throw new Exception ("Sorry that is not a valid input.");
                }
            }
            
            catch (Exception e) {
                System.err.println(e.getMessage());
                System.out.println("");
            }
        }    
    }
    
    /**
     * @param valid = will the loop continue
     * @param intInput = an int input
     * @param stringInput = an string input
     **/
    public static void integerPositiveOdd(boolean valid, int intInput, String stringInput) {
        Scanner keyedInput = new Scanner (System.in);
        
        while (valid == false) {
            System.out.println("Please input a positive odd number.");
            intInput = keyedInput.nextInt();
            System.out.println("");
            
            try {
                if (intInput > 0 && intInput % 2 != 0) { 
                    System.out.println("Thanks for the valid input.");
                    valid = true;
                }
                else {
                    throw new Exception ("Sorry that is not a valid input.");
                }
        
            }
            
            catch (Exception e) {
                System.err.println(e.getMessage());
                System.out.println("");
            }
        }    
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        String stringInput = null;
        int intInput = 0;
        boolean valid = false;
        
        stringLength(valid, intInput, stringInput); //bigger than 6
        stringA(valid, intInput, stringInput); //has a lower case "a"
        stringOneFifteenNoz(valid, intInput, stringInput); //has 5-15 chars and no zs
        integerFiveFiveHundred(valid, intInput, stringInput); //has 5-500 digits
        integerNegative(valid, intInput, stringInput); //negative integer
        integerPositiveOdd(valid, intInput, stringInput); //negative integer
        
        
        
    }
    
}
