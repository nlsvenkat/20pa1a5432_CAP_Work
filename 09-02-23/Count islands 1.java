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
        int no_of_islands=0;
        int[][] grid=new int[no_of_rows][no_of_cols];
        for(int i=0;i<no_of_rows;i++){
            for(int j=0;j<no_of_cols;j++){
                grid[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<no_of_rows;i++){
            for(int j=0;j<no_of_cols;j++){
                if(grid[i][j]==1){
                    dfs(i,j,grid);
                    no_of_islands+=1;
                }
            }
        }
        System.out.println(no_of_islands);
    }
    public static void dfs(int i,int j,int[][] grid){
        if(i>=grid.length || j>=grid[0].length || i<0 || j<0) return ;
        if(grid[i][j]==0|| grid[i][j]==2) return ;
        grid[i][j]=2;
        dfs(i-1,j-1,grid);
        dfs(i-1,j,grid);
        dfs(i-1,j+1,grid);
        dfs(i,j+1,grid);
        dfs(i+1,j+1,grid);
        dfs(i+1,j,grid);
        dfs(i+1,j-1,grid);
        dfs(i,j-1,grid);
        return ;
    }
}