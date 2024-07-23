import java.util.Scanner;
public class SumofElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count");
        int count = sc.nextInt();
        int[] n = new int[count];
        for(int i=0; i<n.length; i++){
            System.out.println("Enter the numbers:");
            n[i] = sc.nextInt();
        }
        int sum =0;
        for(int i=0; i<n.length;i++){
            sum=sum+n[i];
        }
        System.out.println("The Sum of value :"+sum);
        
    }
    
}
