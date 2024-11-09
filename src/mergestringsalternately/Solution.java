package mergestringsalternately;

public class Solution {

    public String mergeAlternately(String word1, String word2) {

        StringBuilder result = new StringBuilder();
        int lengthW1 = word1.length();

        int lengthW2 = word2.length();

        if (lengthW1 >= lengthW2) {
            for(int i = 0; i < lengthW1; i++) {
                if(i < lengthW2) {
                    result.append(word1.charAt(i)).append(word2.charAt(i));
                } else {
                    result.append(word1.charAt(i));
                }
            }
        } else {
            for (int i = 0; i < lengthW2; i++) {
                if (i < lengthW1) {
                    result.append(word1.charAt(i)).append(word2.charAt(i));
                } else {
                    result.append(word2.charAt(i));
                }
            }
        }

        return result.toString();
    }
}
