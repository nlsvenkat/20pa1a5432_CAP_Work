class Solution {
    int no_of_islands=0;
    public int numIslands(char[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    bfs(i,j,grid);
                    no_of_islands+=1;

                }
            }
        }
        return no_of_islands;
    }
    public void bfs(int i,int j,char[][] grid){
        if(i>=grid.length || j>=grid[0].length || i<0 || j<0) return ;
        if(grid[i][j]=='0'|| grid[i][j]=='2') return ;
        grid[i][j]='2';
        bfs(i-1,j,grid);
        bfs(i,j+1,grid);
        bfs(i+1,j,grid);
        bfs(i,j-1,grid);
        return ;
        
    }
}