import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        in.nextLine();
        String str=in.nextLine();
        int no_of_queries=in.nextInt();
        for(int i=0;i<no_of_queries;i++){
            int pos=in.nextInt();
            int count=similar_char(str,pos);
            System.out.println(count);
        }
    }
    public static int similar_char(String str,int pos){
        char letter=str.charAt(pos-1);
        int count=0;
        for(int i=0;i<pos-1;i++){
            if (str.charAt(i)==letter) count+=1;
        }
        return count;
    }
}