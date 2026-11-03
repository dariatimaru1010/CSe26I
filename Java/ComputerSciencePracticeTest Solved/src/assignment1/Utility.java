/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment1;

/**
 * @author pgn
 */
public class Utility {

    /**
     * Return true if the parameter 'input' ends with the string referenced by the parameter 'end'.
     * Example if input => "Hello world" and end => "world" then the method should return true.
     * But if input => "Hello world" and end => "Borat" then the method should return false.
     *
     * @param input The string to examine.
     * @param end   The ending we are looking for.
     * @return True if 'input' ends with 'end'.
     */
    public boolean doesInputEndWithEnd(String input, String end) {
        /*int index = input.lastIndexOf(end);
        return index != -1 && index == input.length() - end.length();*/

        //return input.endsWith(end);
        if (end.length() > input.length()) {
            return false;
        }

        int i = input.length() - 1;
        int j = end.length() - 1;

        while (j >= 0) {
            if (input.charAt(i) != end.charAt(j)) {
                return false;
            }
            i--;
            j--;
        }
        return true;
    }

    /**
     * Return the parameter aString in a version where it is all upper case and no
     * space chars at the beginning or end of the return value.
     *
     * @param aString could be "  hello world  "
     * @return should return something like "HELLO WORLD" for the example parameter above
     */
    public String allCapitalsAndNoWhiteSpace(String aString) {
        //return aString.toUpperCase().strip();

        int start = 0;
        int end = aString.length() - 1;

        // move start forward past leading spaces
        while (start <= end && aString.charAt(start) == ' ') {
            start++;
        }
        // move end backward past trailing spaces
        while (end >= start && aString.charAt(end) == ' ') {
            end--;
        }

        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            char c = aString.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32);   // ASCII: lowercase to uppercase
            }
            result.append(c);
        }
        return result.toString();
    }
}


