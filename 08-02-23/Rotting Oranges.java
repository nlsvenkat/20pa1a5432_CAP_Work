class Solution {
    public int orangesRotting(int[][] grid) {
        int rotten_val=1;
        int no_of_minutes=0;
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
                    return -1;
                }
            }
        }
        return no_of_minutes;
    }
    public boolean bfs(int[][] grid,int i,int j,int rotten_val){
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