public class Reserse {
    public static String reverse(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (!Character.isLetter(chars[start])) {
                start++;
                continue;
            }
            if (!Character.isLetter(chars[end])) {
                end--;
                continue;
            }
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }
        return new String(chars);
    }
    public static void main(String[] args) {
    }
}