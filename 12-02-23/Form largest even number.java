import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        int num=0;
        int min_even=8;
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> result_arr=new ArrayList<>();
        int even_count=0;
        String str=in.nextLine();
        boolean obtained=false;
        boolean[] valid =new boolean[10];
        
        for(int i=0;i<10;i++){
            valid[i]=true;
        }
        
        for(int i=0;i<str.length();i++){
            String letter=str.substring(i,i+1);
            try {
                num = Integer.parseInt(letter);
            } 
            catch (Exception e) {
                continue;
            }
            if(valid[num]){
                result_arr.add(num);
                valid[num]=false;
            }
            if(num%2==0){
                if(num<=min_even) min_even=num;
                even_count+=1;
            }
        }
        
        Collections.sort(result_arr);
        if(even_count==0 || result_arr.size()==0) System.out.println(-1);
        else if(result_arr.size()==1) System.out.println(result_arr.get(0));
        else{
            for(int i=result_arr.size()-1;i>=0;i--){
                if(result_arr.get(i)==min_even && !obtained){
                    obtained=true;
                    continue;  
                }
                System.out.print(result_arr.get(i));
            }
            System.out.print(min_even);
        }
        
        
        
        
        
        
        
    }
}