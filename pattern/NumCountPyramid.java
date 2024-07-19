public class NumCountPyramid {
    public static void main(String[] args){
        int row,col;
        for (row =5; row>=1; row--) {
        
                    for (col =1; col<=row; col++) {
                        System.out.print(" ");
                    }
        
                    for (col = 5; col >= row; col--) {
                        System.out.print(col+" ");
                    }
        
                    System.out.println();
        }
        }
    
}
