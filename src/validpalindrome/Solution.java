package validpalindrome;

public class Solution {

    public boolean isPalindrome(String s) {

        int startIndex = 0;
        int endIndex = s.length() - 1;

        while (startIndex < endIndex) {
            char startChar = toLowerCase(s.charAt(startIndex));
            char endChar = toLowerCase(s.charAt(endIndex));

            while (!isAlphanumeric(startChar)) {
                startIndex++;

                if (startIndex == s.length())
                    return true;

                startChar = toLowerCase(s.charAt(startIndex));
            }

            while (!isAlphanumeric(endChar)) {
                endIndex--;
                endChar = toLowerCase(s.charAt(endIndex));
            }

            if(startChar != endChar)
                return false;

            startIndex++;
            endIndex--;
        }

        return true;
    }

    private boolean isAlphanumeric(char c) {
        return ('a' <= c && c <= 'z') || ('0' <= c && c <= '9');
    }

    private char toLowerCase(char c) {
        if ('A' <= c && c <= 'Z') {
            int difference = 'a' - 'A';
            return (char) (c + difference);
        }

        return c;
    }


}

/**
 *  1) Create a method to verify if the character is alphanumeric or not.
 *  Verify if 'a' is lower or equals to the character and the character lower or equals to 'z'. Or if '0' is lower or
 *  equals to the character and the character is lower or equals to '9'.
 *  2) Create a method to transform the uppercase character to lower case if it is the case. Verify if 'A' is lower or
 *  equals to the character and the character is lower or equals to 'Z'. If it is true, create a variable called difference
 *  and initialize it calculating the difference between 'a' and 'A'. Then return the sum the difference to the character
 *  casting it to char type. If the character is not in uppercase, just return it.
 *  3) In the solution create 2 variable called "start" and "end" initializing them with 0. So, iterate using a while loop
 *  while start is lower than end.
 *  4) During the iteration create two variables called startChar and endChar. Initialize starChar with the character from
 *  the string in the position of start, using the method to transform the uppercase character to lowercase. Do the same
 *  thing with the endChar variable, but passing the position end.
 *  5) Let's do a new while loop (inside the while from step 3) and while the startChar is not an alphanumeric character
 *  increment star variable and if the value is equals to the length of the string, return true, if not assign to the
 *  startChar the character from the string in the position start, using the method to transform it to lowercase.
 *  6) Inside the while from step 3, yet, let's do another while loop and while the end char is not an alphanumeric
 *  character decrement the end variable and  assign to the endChar the character from the string in the position end,
 *  using the method to transform it to lowercase.
 *  7) After the previous loops (Inside the while from step 3, yet) verify if startChar is different from endChar and
 *  if it is true, return false;
 *  8) Increment the start variable and decrement the end variable.
 *  9) Out of the while from step 3, return true.
 */
