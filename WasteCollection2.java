import java.util.Scanner;

    public class WasteCollection2
    {
        public static void main (String args[])
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("ENTER THE WASTE COLLECTED in kg");
            double WasteCollected= sc.nextDouble();
            if(WasteCollected>=100);
            {
                System.out.println("COLLECTION TARGET REACHED");
            }
            else
            {
            
                System.out.println("NEED MORE COLLECTION POINTS");
            }
            
        }
    }
                
