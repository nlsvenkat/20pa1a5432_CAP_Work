import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in= new Scanner(System.in);
        String input_str=in.nextLine();
        String[] in_str_arr=new String[input_str.length()];
        String special_chars="!#$%&'()*+,-./:;<=>?@[]^_`{|}";
        for(int i=0;i<input_str.length();i++){
            in_str_arr[i]=input_str.substring(i,i+1);
        }
        int i=0,j=input_str.length()-1;
        while(i<j){
            if(special_chars.contains(in_str_arr[i])){
                i+=1;
                continue;
            }
            if(special_chars.contains(in_str_arr[j])){
                j-=1;
                continue;
            }
            String temp=in_str_arr[i];
            in_str_arr[i]=in_str_arr[j];
            in_str_arr[j]=temp;
            i+=1;
            j-=1;
        }
        for(i=0;i<input_str.length();i++){
            System.out.print(in_str_arr[i]);
        }
        
    }
}