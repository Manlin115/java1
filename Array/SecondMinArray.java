import java.util.*;

public class SecondMinArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Count");
        int count = sc.nextInt();
        int[] marks = new int[count];
        for(int i=0;i<marks.length;i++)
        {
            System.out.println("Enter Mark:");
                marks[i]=sc.nextInt();

        }
        int min= marks[0] , smin=marks[0];
        for(int i=1;i<marks.length;i++)
        {
            if (marks[i]< min){
                smin=min;
                min= marks[i];
            }
        }
        System.out.println("First Min is:"+min);
        System.out.println("Second Min is :"+smin);

    }
}