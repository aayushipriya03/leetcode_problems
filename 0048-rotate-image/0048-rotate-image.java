class Solution {
    public void rotate(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
         int row=0;
        int col=0;
       
        
        for(int i=0;i<r;i++){
           int s=0;
            int e=c-1;
            while(s<e){
                int a =matrix[s][i];
                matrix[s][i]=matrix[e][i];
                matrix[e][i]=a;
                s++;
                e--;
            }
        }
        
        for(int j=0; j<r; j++){
             for(int i=j;i<c;i++){
            int a=matrix[j][i];
            matrix[j][i]=matrix[i][j];
            matrix[i][j]=a;
        }
        }
        
      

        
      
        
        
        
        
    }
}