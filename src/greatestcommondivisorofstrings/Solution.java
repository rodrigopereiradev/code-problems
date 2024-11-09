package greatestcommondivisorofstrings;

public class Solution {

    public String gcdOfStrings(String str1, String str2) {
        StringBuilder tempResult = new StringBuilder();
        String result = "";
        int lengthStr1 = str1.length();
        int lengthStr2 = str2.length();

        for (int i = 0; i < lengthStr1; i++) {
            int tempIndex = i;
            for(int j = 0; j < lengthStr2; j++) {

                char char1 = str1.charAt(tempIndex);
                char char2 = str2.charAt(j);
                char nextChar1 = str1.charAt(i + 1);
                char nextChar2 = j < (lengthStr2 - 1) ? str2.charAt(j + 1) : '@';

                if ( char1 == char2) {

                    tempResult.append(str2.charAt(j));

                    if (nextChar1 != nextChar2)
                        break;

                    tempIndex++;
                }

            }

            if (i > (lengthStr2 - 1))
                break;
            else if (tempResult.length() > result.length())
                result = tempResult.toString();

            tempResult.setLength(0);
        }

        return result;
    }
}
