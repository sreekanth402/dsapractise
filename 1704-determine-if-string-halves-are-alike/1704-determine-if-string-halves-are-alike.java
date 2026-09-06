class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int n = s.length();
        
        String firstHalf = s.substring(0, n/2);
        String secondHalf = s.substring(n/2, n);

        return vowels(firstHalf, secondHalf);
    }

    public static boolean vowels(String s, String b) {
        int c1 = 0, c2 = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                c1++;
            }
        }   
        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                c2++;
            }
        }
        return c1==c2;
    }
}