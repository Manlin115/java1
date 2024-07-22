import java.util.Scanner;
public class SecondMaxArray
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Count of Subjects:");
int count = sc.nextInt();
int[] marks=new int[count];

for(int i=0;i<marks.length;i++)
{
System.out.println("Enter Mark:");
marks[i]=sc.nextInt();
}
int max= marks[0],smax= marks[0];
for(int i=1;i<marks.length;i++)
{
if(marks[i]>max)
{
smax=max;
max=marks[i];
}
else if(marks[i]>smax)
{
smax=marks[i];
}
}
System.out.println("Max is:"+max);
System.out.println("Second Max is:"+smax);
}
}