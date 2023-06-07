package Recursionfile;

import java.util.*;

public class decodeString {
    public static void main(String[] args) {
        String str = "3[a]2[bc]";
        String str2 = "2[abc]3[cd]ef";

        int l = str.length();
        Stack<Integer> numb=new Stack<>();
        Stack<Character> strrstk = new Stack<>();

        StringBuilder s = new StringBuilder();
        StringBuilder m = new StringBuilder();//current value of stack

        for (int i = 0;i<l;i++){
            if(Character.isDigit(str.charAt(i))){
                int num = str.charAt(i)-'0';//find the real number ascii range 48 to 57 eg 50 - 48 = 2
                System.out.println(num);
                numb.push(num);
                continue;
            }
            if(str.charAt(i)!=']'){
                System.out.println(str.charAt(i));
                strrstk.push(str.charAt(i));
            }
            if(str.charAt(i)==']'){ //retrace back to the ] and repeat the string put that string again into the stack

                s.append(helper(numb,strrstk,m));
                System.out.println(s);
            }

        }
        System.out.println(m);

    }

    private static StringBuilder helper(Stack<Integer> numb, Stack<Character> strrstk,StringBuilder m) {
        StringBuilder df = new StringBuilder();

        StringBuilder sf = new StringBuilder();
        char s = strrstk.pop();


        while(s!='['){
            sf.append(strrstk.pop());
        }
        sf.reverse();
        int n = numb.pop();
        for (int i =0 ;i<n;i++){
            df.append(sf);
        }

        return df;
    }


}
