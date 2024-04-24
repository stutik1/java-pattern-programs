package leetcode.easy;

public class reverseVowel {
    public static String reverseVowels(String s) {
        StringBuilder result = new StringBuilder();
        int j = 0;
        String vowel = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                j++;
                vowel = vowel + c;
            }
        }

        for (int k = 0; k < s.length(); k++) {
            char c = s.charAt(k);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                //result.append(vowel.charAt(--j));
                result.append(vowel.charAt(--j));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static String reverseVowelsBruteForce(String s) {
        StringBuilder result = new StringBuilder();
        int j = 0;
        String vowel = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'A' || c == 'e' || c == 'E' ||
                    c == 'i' || c == 'I' || c == 'o' || c == 'O' ||
                    c == 'u' || c == 'U') {
                vowel += c;
            }
        }

        for (int k = 0; k < s.length(); k++) {
            char c = s.charAt(k);
            if (c == 'a' || c == 'A' || c == 'e' || c == 'E' ||
                    c == 'i' || c == 'I' || c == 'o' || c == 'O' ||
                    c == 'u' || c == 'U') {
                result.append(vowel.charAt(vowel.length() - 1 - j++));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "Hello";
        String str1 = "Leetcod";
        System.out.println(reverseVowels(str));
        System.out.println(reverseVowelsBruteForce(str1));
    }
}
