public class NumberPyramid{
    public static void main(String[] args)
    {
        char row,col;
    for (row = 'D'; row >= 'A'; row--) {
    
                for (col = 'A'; col<=row; col++) {
                    System.out.print(" ");
                }
    
                for (col = 'D'; col >= row; col--) {
                    System.out.print(col+" ");
                }
    
                System.out.println();
    }
    }
    
    }