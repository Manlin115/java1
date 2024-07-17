class Ypattern{
    public static void main(String[] args) {
        for(int row=1; row<=9; row++){
            for(int col=1; col<=9; col++){
                if((row==col && col<=5 )|| row+col==10)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}