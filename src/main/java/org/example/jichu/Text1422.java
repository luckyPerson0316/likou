package org.example.jichu;

public class Text1422 {
    public static void main(String[] args) {
        String s ="00111";
        int n=maxScore(s);
        System.out.println(n);

    }

    public static int maxScore(String s) {
        int m = s.length();
        int total = 0;
        int num = 0, sum = 0;
        char[] s1 = s.toCharArray();
//        char[] right = s.toCharArray();
        for (int i = 1; i < m; i++) {
            int b = m - i;
                num = 0 ;
                sum = 0;
            for (int j = 0; j < i; j++) {
                if (s1[j] == '0') {
                    sum++;
                }
            }
                for (int e = i; e < m; e++) {
                    if (s1[e] == '1') {
                        num++;
                    }
                }
                if (total < (sum + num))
                    total = sum + num;
            }


        return total;
    }
}
