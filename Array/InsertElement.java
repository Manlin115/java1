import java.util.Scanner;

import javax.sound.midi.Soundbank;
public class InsertElement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the count:");
        int count = sc.nextInt();
        int[] num= new int[count];
        int[] num1 = new int[num.length];
        for(int i=0; i<num.length; i++){
            System.out.println("Enter the value:");
            num[i]=sc.nextInt();
            System.out.println("");

        }
        for(int i=0; i<1; i++)
        {
        System.out.println("Add number:");
        num1[i]=sc.nextInt();
    }
    }
}
