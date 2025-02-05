import java.util.Scanner;

public class Pig {

    /*
    * Create a method "pigLatin" that takes a string consisting of one or more 
    * all-lowercase words separated by spaces. It should return a new string 
    * converted to "pig Latin," where each word has its first letter moved to 
    * the back and the letters "ay" are added to the end of the word. However, 
    * words starting with a vowel (a, e, i, o, or u) should not be altered.
    *
    * Examples:
    *
    * pigLatin("something")  should return "omethingsay"
    * pigLatin("awesome")    should return "awesome" (words starting with a vowel should not be altered)
    * pigLatin("latin is a hard language")  should return "atinlay is a ardhay anguagelay"
    * pigLatin("y")  should return "yay"
    * pigLatin("e")   should return "e"
    */
    public static void main(String[] args) {
        // Test cases
        assertEqual(1, pigLatin("something"), "omethingsay");
        assertEqual(2, pigLatin("awesome"), "awesome");
        assertEqual(3, pigLatin("latin is a hard language"), "atinlay is a ardhay anguagelay");
        assertEqual(4, pigLatin("y"), "yay");
        assertEqual(5, pigLatin("e"), "e");
    }

    // use a scanner to scan the string
    // itterate over the tokens in the string
    // check if each token starts with a vowel
    // if it does not start with a vowel alter the token and add it to a new string 
    // return the new string

    // Implement your solution here!
    public static String pigLatin(String sentence) {
        String newString = "";
        Scanner scanner = new Scanner(sentence);
        while (scanner.hasNext()) {
            String current = scanner.next();
            if (!current.startsWith("a") && !current.startsWith("e") && !current.startsWith("i") && !current.startsWith("o") && !current.startsWith("u")) {
                newString = newString + current.substring(1) + current.substring(0, 1) + "ay ";
            }
            else {
                newString += current + " ";
            }
        }
        return newString.substring(0, newString.length() - 1);
    }









    // Method to help with testing, you do not need to read this.
    public static void assertEqual(int testNumber, String actual, String expected) {
        if (!expected.equals(actual)) {
        System.out.println("Test " + testNumber + " failed! Expected: '" + expected + "', but got: '" + actual + "'");
        } else {
        System.out.println("Test " + testNumber + " passed!");
        }
    }
    }
  
  