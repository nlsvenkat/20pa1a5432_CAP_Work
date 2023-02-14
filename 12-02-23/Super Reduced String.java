import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'superReducedString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String superReducedString(String s) {
    // Write your code here
        String empty="Empty String";
        String res="";
        int str_len=s.length();
        boolean[] valid =new boolean[str_len];
        if(str_len==0) return empty;
        if(str_len==1) return s;
        for(int i=0;i<str_len;i++){
            valid[i]=true;
        }
        int i=0,j=i+1;
        
        
        while(j<str_len){
            while(s.charAt(i)==s.charAt(j)){
                int left=i,right=j;
                valid[i]=false;
                valid[j]=false;
                while(i-1>=0 && valid[i]==false ) i-=1;
                if(j+1<str_len) j+=1;
                if(left==i || right==j || !valid[i]) break;
            }
            i=j;
            j=i+1;
        }
        
        
        for(i=0;i<str_len;i++){
            if(valid[i]) res+=s.substring(i,i+1);
        }
        if(res.length()==0) return empty;
        return res;
        

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.superReducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}