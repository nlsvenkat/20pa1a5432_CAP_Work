import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int no_of_rows=in.nextInt();
        int no_of_cols=in.nextInt();
        boolean c=true;
        int rotten_val=1;
        int no_of_minutes=0;
        int[][] grid=new int[no_of_rows][no_of_cols];
        
        
        for(int i=0;i<no_of_rows;i++){
            for(int j=0;j<no_of_cols;j++){
                grid[i][j]=in.nextInt();
            }
        }
        
        
        while(true){
            rotten_val+=1;
            int added=0;
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    if(grid[i][j]==rotten_val){
                        if(bfs(grid,i,j,rotten_val)) added+=1;
                    }
                    
                }
            }
            if(added==0) break;
            no_of_minutes+=1;

        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    c=false;
                }
            }
        }
        if(!c) System.out.println(-1);
        else System.out.println(no_of_minutes);
        
    }
    
    //implementation of bfs traversal
    public static boolean bfs(int[][] grid,int i,int j,int rotten_val){
        int count=0;
        if(i-1>=0){
            if(grid[i-1][j]==1){
                grid[i-1][j]=rotten_val+1;
                count+=1;

            }
        }
        if(j-1>=0){
            if(grid[i][j-1]==1){
                grid[i][j-1]=rotten_val+1;
                count+=1;

            }
        }
        if(i+1<grid.length){
            if(grid[i+1][j]==1){
                grid[i+1][j]=rotten_val+1;
                count+=1;
            }
        }
        if(j+1<grid[0].length){
            if(grid[i][j+1]==1){
                grid[i][j+1]=rotten_val+1;
                count+=1;
            }
        }
        
        if(count==0) return false;
        return true;
    }
    
    
    
    
}