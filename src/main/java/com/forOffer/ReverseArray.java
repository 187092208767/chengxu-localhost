package com.forOffer;

public class ReverseArray {

    /**
     * 数组的反转
     * @param args
     */
    public  static  void main(String [] args){
        int [] arr={1,2,3,4,5};
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int tmp=arr[start];
            arr[start++]=arr[end];
            arr[end--]=tmp;
        }

        for(int i:arr){
            System.out.print(i+",");
        }
    }
}
