import java.util.Scanner;

public class DeleteElementinArray {
  public static void main(String[] args)
  {
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter Array Size:");
  int size= sc.nextInt();
  int[] num= new int[size]; 

  for(int i=0;i<num.length;i++)
  {
  System.out.println("Enter tha values:");
  num[i]=sc.nextInt();
  }
  System.out.println("Enter the element to delete:");
  int elementToDelete = sc.nextInt();
  int position= -1;
  for(int i=0;i<num.length;i++){
  if(num[i] == elementToDelete){
  position = i;
  break;}
  }
  if(position!=-1)
  {
  for(int i=position;i<num.length-1;i++)
  num[i]=num[i+1];
  }
  size--;
  
  System.out.println("Array after deletion:");
              for (int i = 0; i < size; i++) {
                  System.out.print(num[i] + " ");
              }
  }
  }