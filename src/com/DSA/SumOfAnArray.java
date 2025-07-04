package com.DSA;

public class SumOfAnArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,9};
        int sum=0;
        int max = arr[0];
        for(int num: arr){
            sum+=num;
            if(num>max){
                max=num;
            }
        }
        int expectedSum = max * (max+1)/2;

        int actualSum= 0;
        for(int num: arr){
            actualSum+=num;
        }

        System.out.println("Missing number is : "+actualSum);
    }
}
