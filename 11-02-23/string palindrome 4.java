import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        boolean c=true;
        String a=in.nextLine().toLowerCase();
        int str_len=a.length();
        for(int i=0;i<str_len/2;i++){
            if(a.charAt(i)!=a.charAt(str_len-i-1)){
                c=false;
                break;
            }
        }
        if(c) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}