import java.util.Scanner;

import javax.sound.midi.Soundbank;
public class AddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count");
        int count = sc.nextInt();
        int[] num = new int[count];
        for(int i=0; i<num.length; i++){
            System.out.println("Enter the value: ");
            num[i]=sc.nextInt();

        }
        int evencount=0, oddcount=0;
        for(int i=0; i<num.length; i++)
        {
            if(num[i]%2==0){
            evencount++;
            System.out.println(num[i]+"is even");
        }
           else{
            oddcount++;
            System.out.println(num[i]+"is odd");
        }
        }
        System.out.println();
        System.out.println(evencount+"is even");
        System.out.println(oddcount+"is odd");
    }
    
}
