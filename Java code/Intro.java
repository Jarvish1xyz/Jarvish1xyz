import java.util.Scanner;

public class Intro
{
    public static void main(String[] args)
    {
        try(Scanner Sc = new Scanner(System.in))
        {
            int butten = Sc.nextInt();
            
            switch(butten)
            {   
                case 1: System.out.println("HY");
                break;
                case 2: System.out.println("My name is Milan.");
                break;
                case 3: System.out.println("How are you?");
                break;
                case 123: System.out.println("HY");
                          System.out.println("My name is Milan.");
                          System.out.println("How are you?");  
                break;
                default : System.out.println("Invalid number for this code!");
                          System.out.println("Only 1 ,2 ,3 number are availabl for this code !!!");
            }

            // if(butten == 1) {
            //     System.out.println("Hy");
            // } else if(butten == 2) {
            //     System.out.println("Myname is Milan");
            // } else if(butten == 3) {
            //     System.out.println("How are you?");              <----- intro with if else
            // } else if(butten == 123) {
            //     System.out.println("Hy");
            //     System.out.println("My name is Milan.");
            //     System.out.println("How are you?");
            // }
            //  else {
            //     System.out.println("Invalid number for this code!");
            // }

        }

    }
    
}