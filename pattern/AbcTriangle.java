class AbcTriangle{
    public static void main(String[] args) {
        char num = 'A';

        for (int row = 0; row <=4; row++) {
            //0<=3
            //1<=3
            //2<=3
            //3<=3
            //4<=3

            // row = 1  airuchu 
            //0<=2
            //1<=2
            //2<=2
            //3<=2
            for (int col = 0; col<=4-row-1; col++) {

                System.out.print(" ");
            }
            //0<=0
            //1<=0

            //row=1 airuchu
            //0<=1
            //1<=1
            for (int col = 0; col <= row; col++) {

                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
