package ch06.sec15;

import java.util.Scanner;
public class ArrayEx{
    public static void main(String[] e){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        int result = 0;
        
        
        
        String temp = sc.next();
        long num = Integer.parseInt(temp);
        
        for(int i=0;i<n;i++){
            result+=(int)(num%10);
            num/=10;
        }
        System.out.println(result);
    }
}