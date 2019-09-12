package com.forOffer;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 给定字符串xxxx：xxxx统计该时间可能为哪些进制表示，打印出所有的可能性，若不存在可能，则输出-1，若可能性为无穷，则输出0.
 */
public class Shunfeng {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];

        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int count=0;
        if (n!=1){
            int [] tmp=new int[n];
            tmp[0]=1;tmp[n-1]=1;
            for (int i=0;i<n;i++) {
                if (i==0||i==n-1) continue;
                if (arr[i]>arr[i-1]&&arr[i]>arr[i+1]) {
                    tmp[i]=Math.max(tmp[i-1],tmp[i+1])+1;
                }else if (arr[i]>arr[i-1]) {
                    tmp[i]=tmp[i-1]+1;
                }else if (arr[i]>arr[i+1]){
                    tmp[i]=tmp[i+1]+1;
                }else tmp[i]=1;
            }
            for (int i=0;i<n;i++) {
                count+=tmp[i];
            }
        System.out.println(count);
    }
}
}

        /*Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        String[] str = in.split(",");

        int size = str.length;
        if (size == 0 || str == null) {
            System.out.println(0);
            return;
        }
        int start = 0;
        int next = 1;
        int count = 1;
        while (next < size) {
            if (!str[start++].equals(str[next++])) count++;
        }
        System.out.println(count);*/



        /*Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        int index=input.indexOf(":");
        String hour=input.substring(0,index);
        String min=input.substring(index+1,input.length());
        int [] arr1=new int [hour.length()];
        int [] arr2=new int[min.length()];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=Integer.parseInt(hour.substring(i,i+1));
        }
        for (int j=0;j<arr2.length;j++){
            arr2[j]=Integer.parseInt(min.substring(j,j+1));
        }

        ArrayList<Integer> result=new ArrayList<>();
        int start=2;
        while(start>0){
            int countHour=0;
            int countMin=0;
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]>=start){
                    start=arr1[i]+1;
                    break;
                }
            }
            for (int j=0;j<arr2.length;j++){
                if(arr2[j]>=start){
                    start=arr2[j]+1;
                    break;
                }
            }
            for(int i=0;i<arr1.length;i++){
                int n=arr1.length-i-1;
                if(n==0){
                    countHour=countHour+arr1[i];
                }else {
                    countHour=countHour+arr1[i]*((int)Math.pow(start,n));
                }

            }
            for (int j=0;j<arr2.length;j++){
                int n=arr2.length-j-1;
                if(n==0){
                    countMin=countMin+arr2[j];
                }else {
                    countMin=countMin+arr2[j]*((int)Math.pow(start,n));
                }
            }
            if(countHour<24&&countMin<60){
                result.add(start);
            }
            if(start>=60){
                break;
            }
            start++;
        }
    if(result.size()==0){
        System.out.println("-1");
    }else if(start>60){
        System.out.print("0");
    } else {
        for (Integer re:result){
            System.out.print(re+" ");
        }
    }*/
