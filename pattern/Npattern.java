class Npattern{
    public static void main(String[] args) {
        for(int row=1; row<=9; row++){
            for(int col=1; col<=9; col++){
                if((row==col && col<=4 )|| col==1||(row+col==10 && row<=5) ||col==9 )
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}