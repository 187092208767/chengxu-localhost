package com.luckymoney.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int size=2^n-1;
        int [] arr=new int [size];
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }

        int target1=sc.nextInt();
        int target2=sc.nextInt();
        int result=getlastFather(arr, target1, target2);
        System.out.println(result+"");



    }
    public static int getlastFather(int [] arr,int n1,int n2) {
        int i=0;
        while(i<arr.length) {
            if((n1<arr[i]&&n2>arr[i])||(n1>arr[i]&&n2<arr[i])) {
                break;
            }else if(n1>arr[i]&&n2>arr[i]) {
                i=2*i+2;
            }else if(n1<arr[i]&&n2<arr[i]) {
                i=2*i+1;
            }
        }
        return arr[i];
    }
}
