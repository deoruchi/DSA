package StackandQueue;

import java.util.Scanner;

public class Stack {
    int top = -1;
    int n = 10;
    int arr[] = new int[n];
    Scanner sc = new Scanner(System.in);

    void push() {
        if (top == n - 1) {
            System.out.println("stack overflow");
        } else {
            int i = sc.nextInt();
            top++;
            arr[top] = i;
            System.out.println("item entered");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.print("underflow");
        } else {
            top--;
            System.out.println("item is poped out");
        }
    }

    void display() {
        for (int v = 0; v < top; v++) {
            System.out.println(arr[v]);
        }
    }

}
