import java.util.Scanner;
public class TotalNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count: ");
        int count =sc.nextInt();
        int[] num= new int[count];
        for(int i=0;i<num.length; i++){
            System.out.println("Enter the value:");
            num[i]=sc.nextInt();
        }
        int negnum=0;
        for(int i=0; i<num.length; i++){
            if(num[i]< 0)
            negnum++;
        }
        System.out.println("Negative num is:"+negnum);

    }
    
}
