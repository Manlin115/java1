package Javaclass;

public class DuplicateArray {

  public static void main(String[] args) {
    //Frequency of Each Element in a given array
      String s = "ayyappan";
      char[] name = s.toCharArray();
  for(int j = 0; j<name.length; j++)
  {
      char ch = name[j]; //a
      int count = 1;
    for(int i=j+1; i<name.length;i++) 
    {
      if(name[i]!='*') 
      {
        if(name[i]== ch)
        {
          name[i] = '*';
          count++;
        }
      }
      else
        continue;
    }
    /*
     * if(ch!='*') System.out.println(ch + " appears for "+ count + " times");
     */
  if(count==1&&ch!='*')
    System.out.println(ch + " is uniqe element in the array it appears "+ count + " times");
    
}
  }
}