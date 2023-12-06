class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer>row = new ArrayList();
        List<Integer>col = new ArrayList();
        
        int r=matrix.length;
        int c=matrix[0].length;
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        
        for(int i=0;i<row.size();i++){
            for(int j=0;j<c;j++){
                matrix[row.get(i)][j]=0;
            }
        }
        
        for(int j=0;j<col.size();j++){
            for(int i=0;i<r;i++){
                matrix[i][col.get(j)]=0;
            }
        }
    }
}