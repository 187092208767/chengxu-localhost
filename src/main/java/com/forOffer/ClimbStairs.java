package com.forOffer;

public class ClimbStairs {

    public static void main(String [] args){
        int []arr={1,2};
        System.out.println(rob(arr));
    }
    /**
     * dp
     * F(n)=f(n-1)+f(n-2)递归栈太长，重复计算太多，当数值过大时，会导致超时。
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if(n==1||n==2){
            return n;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }

    /**
     * 使用临时数组记录之前计算的值，备忘录法，临时数组计算重复计算的值
     * @param n
     * @return
     */
    public int climbStairs2(int n) {
        if(n<=2)return n;
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    /**
     * 打家劫舍 leetcode第198题
     * @param num
     * @return
     */
    public static int rob(int num[]){
        int n=num.length;
        if(n<=1){
            return n==0?0:num[0];
        }
        int memo[]=new int [n];
        memo[0]=num[0];
        memo[1]=Math.max(memo[0],num[1]);
        for(int i=2;i<n;i++){
            memo[i]=Math.max(memo[i-1],num[i]+memo[i-2]);
        }
        return  memo[n-1];
    }
}
