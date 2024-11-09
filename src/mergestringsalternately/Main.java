package mergestringsalternately;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var word1 = "abcd";
        var word2 = "pq";

        var result = solution.mergeAlternately(word1, word2);

        System.out.println(result);
    }
}