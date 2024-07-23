import java.util.Scanner;
public class CopyinSecond {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter count:");
    int count= sc.nextInt();
        int[] num= new int[count];
        int[] num1 =new int[num.length];
        for(int i=0;i<num.length;i++)
        {
          System.out.println("Enter values");
          num[i]=sc.nextInt();

        }
        System.out.print("Array2 is: ");
        for(int i=0;i<num.length;i++)
        {
          num1[i]=num[i];
             System.out.print(num1[i]+" ");

        }


  }

}