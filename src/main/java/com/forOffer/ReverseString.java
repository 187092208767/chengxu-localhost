package com.forOffer;

public class ReverseString {
    public static void  main(String []args){


        String a="void reverseWord(char *str,int begin,int end)";
        int start=0;int end=0;
       // System.out.println(ReverseIntence(a));
       String str= reverse(a,0,a.length()-1);
        System.out.println(str);
        while (end<=str.length()){
            if (str.charAt(start)==' '){
                start++;
                end++;
            }else if (end==str.length()||str.charAt(end)==' '){
               str=  reverse(str,start,end-1);
                start = end + 1;
                end++;
            }else {
                end++;
            }
        }
        System.out.println(str);
    }

    public static String reverse(String str,int start,int end){
        char [] c=str.toCharArray();
        while (start<end){
            char tmp = c[start];
            c[start] = c[end];
            c[end] = tmp;
            start ++;
            end--;
        }
        str=String.valueOf(c);return str;

    }
    private static String ReverseIntence(String intence) {

        String str = Reverse(intence,0,intence.length()-1);

        int start = 0;
        int end = 0;

        while(end <= str.length()) {
            if(str.charAt(start) == ' ') {
                start ++;
                end++;
            }else if(str.charAt(end) == ' '||end==str.length()) {
                str = Reverse(str,start,end-1);
                start = end + 1;
                end++;
            } else {
                end++;
            }

        }
        return str;
    }

    //翻转一个单词。
    private static String Reverse(String str,int start,int end) {
        char[] temp = new char[str.length()];
        for(int i=0;i<str.length();i++) {
            temp[i] = str.charAt(i);
        }

        while(start < end) {
            char c = temp[start];
            temp[start] = temp[end];
            temp[end] = c;
            start ++;
            end--;
        }

        return new String(temp);
    }
}
