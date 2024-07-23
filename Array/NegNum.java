







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
        for (int i =0; i<n.length; i++) {
            if(n[i]< 0) 
            System.out.println(n[i]);
            
        }
        
    }
    
}
/*public class NegNum {
    public static void main(String[] args) {
        int[] a = {-1, -10, 100, 5, 61, -2, -23, 8, -90, 51};
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) 
            System.out.println(a[i]);
            
        }
    }
} */