import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Pair implements Comparable<Pair>{
    private String s;
    private int val;
    Pair(String s){
        if(s.length()>11) s=s.substring(1,12);
        int a=Integer.parseInt(s.substring(0,2))+10;
        int b=month_val(s.substring(3,6))*100;
        int c=Integer.parseInt(s.substring(7,11))*10000;
        this.val=a+b+c;
        this.s=s.substring(0,2)+" "+ s.substring(3,4).toUpperCase()+s.substring(4,6).toLowerCase()+" "+s.substring(7,11);
        
    }
    public String get_str(){
        return this.s;
    }
    public int get_val(){
        return this.val;
    }
    
    public int month_val(String month){
        month=month.toLowerCase();
        switch(month){
            case "jan":
                return 10;
            case "feb":
                return 15;
            case "mar":
                return 20;
            case "apr":
                return 25;
            case "may":
                return 30;
            case "jun":
                return 35;
            case "jul":
                return 40;
            case "aug":
                return 45;
            case "sep":
                return 50;
            case "oct":
                return 55;
            case "nov":
                return 60;
            case "dec":
                return 65;
            default:
                return -11;
        }
    }
    
    
    public int compareTo(Pair a){
        return this.val-a.get_val();
    }
    
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        ArrayList<Pair> al=new ArrayList<>();
        
        String input_str=in.nextLine();
        String[] strSplit = input_str.split(",");
        for(int i=0;i<strSplit.length;i++){
            al.add(new Pair(strSplit[i]));
        }
        Collections.sort(al);
        int i;
        for(i=0;i<al.size()-1;i++){
            System.out.print(al.get(i).get_str()+", ");
        }
        System.out.println(al.get(i).get_str());
        
    }
}