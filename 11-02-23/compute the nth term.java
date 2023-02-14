import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int position=in.nextInt();
        int value=position;
        if(position%2==0){
            value=fib(position/2);
        }
        System.out.println(value);
    }
    public static int fib(int n){
        if(n==1 || n==2) return 1;
        return fib(n-1)+fib(n-2);
    }
}