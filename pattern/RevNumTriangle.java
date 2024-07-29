public class RevNumTriangle{
    public static void main(String[] args){
        for(int row=1;row<=4;row++){
            for(int col=1;col<=6-row;col++){
                System.out.print(" ");
            }
            //int number = 2 * row - 1;
         int number =5-row;
            for(int col=1 ;col<=2*row - 1; col++){
                System.out.print(number+" ");
            }
            System.out.println(" ");
        }
    }

}