package com.forOffer;

import javax.persistence.criteria.CriteriaBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    /**
     * 数组的反转
     * @param args
     */
    public  static  void main(String [] args){

        /*数组反转
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
        }*/
    }

    /*是否为回文数123321*/
    public static boolean isHuiwen(int n){
        String str=String.valueOf(n);
        int size=str.length();
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        int start=0;
        int end=size-1;
        boolean isHui=true;
        while (start<end){
            if (arr[start++]!=arr[end--]) {
                isHui=false;
                break;
            }
        }
        return  isHui;
    }

    public int expression(String str){
        String st="3+4+17*18-9";
        int length=st.length();
        int [] arr=new int[length];
        int k=0;
        for(int i=0;i<length;i++){
            char c=st.charAt(i);
            if (c=='+'||c=='-'||c=='*'){
                arr[k++]=i;
            }
        }
        int [] num=new int[length];
        for (int i=0,j=0;i<length;i=i+arr[j]){
            num[i]=Integer.parseInt(st.substring(i,arr[j++]));
        }
        return  0;
    }
    /*
    * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字
    * */
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int length=array.length;
        if (length==2){
            num1[0]=array[0];
            num2[1]=array[1];
        }

        int bitBegin=0;
        for (int i=0;i<length;i++){
            bitBegin^=array[i];
        }
        int index=Find1(bitBegin);
        for (int i=0;i<length;i++){
            if (isBit1(array[i],index)){
                num1[0]=num1[0]^array[i];
            }else {
                num2[0]=num2[0]^array[i];
            }
        }
    }

    public int Find1(int n){
        int count=0;
        while (((n&1)== 0)&&(count<32)){
            n=n>>1;
            count++;
        }
        return  count;
    }
    public boolean isBit1(int target,int index){
        return ((target>>index)&1)==1;
    }
    /*如果输入是多个测试用例，请通过while循环处理多个测试用例*/
  /*  Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0, x;
        for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            x = sc.nextInt();
            ans += x;
        }
    }*/
   /* public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {

    }
*/
}
