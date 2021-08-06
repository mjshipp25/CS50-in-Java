import java.util.Scanner; 

public class mario
{
    public static void main()
    {
        int height;
        do
        {
            Scanner reader = new Scanner(System.in);  // Reading from System.in
            System.out.print("Height: ");
            height = reader.nextInt(); // Scans the next token of the input as an int.
        }
        while (height < 1 || height > 8);
        for (int i = 0; i < height; i++)
        {
            int count = i + 1;
            int rowcount = height - count;
            for (int j = 0; j < rowcount; j++)
            {
                System.out.print(" ");
            }
            for (int k = 0; k < count; k++)
            {
                System.out.print("#");
            }
            System.out.print("  ");
            for (int l = 0; l < count; l++)
            {
                System.out.print("#");
            }  
            for (int m = 0; m < rowcount; m++)
            {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
