import java.util.Scanner;
public class MinArray
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the count of subjects:");
int count= sc.nextInt();
int[] marks = new int[count];
//int[] marks={73,65,80,36,89};
for(int i=0;i<marks.length;i++)
{
System.out.println("Enter Mark:");
marks[i] = sc.nextInt();
}

int max=0,min=marks[0];
for(int i=0;i<marks.length;i++)
{
if(marks[i]>max)
max = marks[i];
}
System.out.println("Max is: "+max);

for(int i=1;i<marks.length;i++)
{
if(marks[i]<min)
min = marks[i];
}
System.out.println("Min is: "+min);
}
}