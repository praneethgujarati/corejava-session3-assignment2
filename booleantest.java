public class booleantest
{
   public static void main(String[] args)
   {
      boolean same=true;
      System.out.print("Enter first string:");
      String S1=System.console().readLine();
      System.out.print("Enter second string:");
      String S2=System.console().readLine();
      if(S1.equals(S2))
      {
      System.out.print(same);
      System.out.println();
      }
      else 
      {
      System.out.print(false);
      System.out.println();
      }
      System.out.println();
      System.out.print("The value of first  string is:"  + S1);
      System.out.println();
      System.out.print("The value of  second string is:"  + S2);
   }
}
