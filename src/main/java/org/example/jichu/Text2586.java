package org.example.jichu;

public class Text2586 {
    public static void main(String[] args) {
        String[] words=new String[]{"hey","aeo","mu","ooo","artro"};
        int left = 0;
        int right = 2;
        int sum=0;
        sum=vowelStrings(words,left,right);
        System.out.println(sum);

    }
    public static int vowelStrings(String[] words, int left, int right) {
        int sum=0;
        for (int i =left;i<=right;i++){
            int length = words[i].length();
            char[] word= words[i].toCharArray();
           if ((word[0]=='a'||word[0]=='e'||word[0]=='i'||word[0]=='o'||word[0]=='u')&&
                   (word[length-1]=='a'||word[length-1]=='e'||word[length-1]=='i'||word[length-1]=='o'||word[length-1]=='u')){
                           sum++;
           }

        }
            return sum;
    }
}
