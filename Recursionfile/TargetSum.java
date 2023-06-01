package Recursionfile;
import  java.util.*;
public class TargetSum {
    public static void main(String[] args) {
        int a[] = {1,1,1,1};
        int target = 3;


         countme(a,0,target,0);
    System.out.println(c);
    }
    static int c = 0;
    private static int countme(int[] a, int i , int t,int sum ) {
        if(i == a.length)
        {
            if(sum == t){
                c++;
                return 1;
            }

            else
                return 0;
        }

        int store = countme(a,i+1,t,sum+a[i]);
        int store2 = countme(a,i+1,t,sum-a[i]);
        sum=store2+store;
        return sum;


    }
}
