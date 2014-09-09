
public class TrimIt
{
   public static void main(String[] args)
   {
      String sent1 = "      abc   ";
      String sent2 = "   def";
      String sent3 = "ghi         ";
      String message = "";
      message =(sent1 + sent2 + sent3);
      

      System.out.println(message);
   }
}