package com.forOffer;

import java.util.Scanner;

public class EmptyBottle {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        while (sc.hasNext()){
            System.out.println(getNum(sc.nextInt()));
        }
    }
    public static  int getNum(int n){
        int num=n;
        int count=0;
        while (true){
            if (num-2>=0){
                count++;
                num=num-2;
            }else break;
        }
        return count;
    }
}
