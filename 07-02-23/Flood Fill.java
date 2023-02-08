class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        bfs(sr,sc,color,image,image[sr][sc]);
        return image;
    }
    public void bfs(int i,int j,int color,int[][]image,int value){
        if(i>=image.length || j>=image[0].length || i<0 || j<0) return ;
        if(image[i][j]!=value || image[i][j]==color) return ;
        if(image[i][j]==value) image[i][j]=color;
        bfs(i-1,j,color,image,value);
        bfs(i,j+1,color,image,value);
        bfs(i+1,j,color,image,value);
        bfs(i,j-1,color,image,value);
        return ;
    }
}