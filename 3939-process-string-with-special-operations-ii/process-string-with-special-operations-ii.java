class Solution {
    public char processStr(String s, long k) {
        long len = 0;

        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                len++;
            } else if (c == '*') {
                if (len > 0) len--;
            } else if (c == '#') {
                len *= 2;
            } else {
                // reverse
            }
        }

        if (k >= len) return '.';

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (Character.isLowerCase(c)) {
                if (k == len - 1) return c;
                len--;
            }
            else if (c == '*') {
                len++;
            }
            else if (c == '#') {
                long half = len / 2;
                if (k >= half) k -= half;
                len = half;
            }
            else { // reverse
                k = len - 1 - k;
            }
        }

        return '.';
    }
}