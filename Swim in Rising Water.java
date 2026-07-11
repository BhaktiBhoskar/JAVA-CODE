class Solution {

    public int swimInWater(int[][] grid) {
        
        int row = grid.length;
        int col = grid[0].length;
        int []array = new int[row*col];
        int index = 0;
        
        for(int i = 0; i < row; i++)
            for(int j = 0; j < col; j++)
            {
                array[index] = grid[i][j];
                index++;
            }
        
        Arrays.sort(array);
        int left = 0;
        int right = array.length-1;
        
            while(left < right)
            {
                int mid = left + (right-left)/2;
                 boolean [][] isVisit = new boolean[row][col];
                if(isLegal(grid, array[mid], 0, 0))
                    right = mid; 
                else
                    left = mid+1;   
            }  
        
        return array[right];
        
    }
    
    public boolean isLegal(int [][] grid, int time, int xindex, int yindex)
    {
        int row = grid.length;
        int col = grid[0].length;
        boolean [][] isVisit = new boolean[row][col];

        visiting(grid, time, xindex, yindex, isVisit);
        
        return isVisit[row-1][col-1];
    }
    
    public void visiting(int [][] grid, int time, int xindex, int yindex, boolean [][] isVisit)
    {
        int row = grid.length;
        int col = grid[0].length;
       
        if(isVisit[row-1][col-1] == true)
        {
            return ;
        } 
       
            while(grid[xindex][yindex] <= time && isVisit[xindex][yindex] == false)
            {
                isVisit[xindex][yindex] = true;
                if(xindex + 1 < row)
                    visiting(grid, time, xindex+1, yindex, isVisit);
                if(yindex + 1 < col)
                    visiting(grid, time, xindex, yindex+1, isVisit);
                if(xindex - 1 >= 0)
                    visiting(grid, time, xindex-1, yindex, isVisit);
                if(yindex - 1 >= 0)
                    visiting(grid, time, xindex, yindex-1, isVisit);
        }
        return ;
    }
}
