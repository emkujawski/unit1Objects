import java.util.Random;
public class DieSimulator
{
    public static void main(String[]args)
    {
        Random random_number = new Random();
        int number = random_number.nextInt(6);
        System.out.println(number);
    }
}
    