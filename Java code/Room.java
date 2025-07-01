import java.util.Scanner;

class Room1 
{
    float length, hight, width;
    byte nwindows;
    void setAttr(float l,float h,float w,byte n)
    {
        length = l; width = w; hight = h;
        nwindows = n ;      // Difin char for Length, Hight, Width, nwindows
    }
    double area()
    {
        return(length * width);     //calculat an Area
    }
    void display()
    {
        System.out.println("\nLength:" + length);
        System.out.println("Width:" + width);
        System.out.println("Hight:" + hight);
        System.out.println("Number of Windows:" + nwindows);    // Display all valu    

    }
}

public class Room
{
    public static void main(String[] args) 
    { 
        Room1 r1;
        r1 = new Room1();
        Room1 r2;
        r2 = new Room1();
        try (Scanner sc = new Scanner(System.in)) 
        {   System.out.println("How many room's data you have?");
            int button = sc.nextInt();
            
            //switch loop
            switch (button) 
            {
                case 1:
                    System.out.println("For Room;");
                    System.out.println("Enter the Length:");
                    float l = sc.nextFloat();
                    System.out.println("Enter the Width:");    
                    float w = sc.nextFloat();
                    System.out.println("Enter the Hight:");
                    float h = sc.nextFloat();
                    System.out.println("Enter the Number of windows:");
                    byte n = sc.nextByte();
        
                    r1.setAttr(l, h, w, (byte)n);
                            
                    r1.display();
                    
                    System.out.println("\nArea of room with Length:" + r1.length + ", width:" + r1.width + " is:" + r1.area()); 
                    
                    System.out.println("<---- Thank's For Using This Code ---->");
                    break;
            
                case 2:
                    System.out.println("For Room1;");
                    System.out.println("Enter the Length:");
                    float l1 = sc.nextFloat();
                    System.out.println("Enter the Width:");    
                    float w1 = sc.nextFloat();
                    System.out.println("Enter the Hight:");
                    float h1 = sc.nextFloat();
                    System.out.println("Enter the Number of windows:");
                    byte n1 = sc.nextByte();

                    System.out.println("For Room2;");
                    System.out.println("Enter the Length:");
                    float l2 = sc.nextFloat();
                    System.out.println("Enter the Width:");    
                    float w2 = sc.nextFloat();
                    System.out.println("Enter the Hight:");
                    float h2 = sc.nextFloat();
                    System.out.println("Enter the Number of windows:");
                    byte n2 = sc.nextByte();
        
                    r1.setAttr(l1, h1, w1, (byte)n1);
                    r2.setAttr(l2, h2, w2, (byte)n2);
        
                    r1.display();
                    r2.display();

                    System.out.println("\nArea of room1 with Length:" + r1.length + ", width:" + r1.width + " is:" + r1.area()); 
                    System.out.println("\nArea of room2 with Length:" + r2.length + ", width:" + r2.width + " is:" + r2.area());

                    System.out.println("<---- Thank's For Using This Code ---->");
                    break;

                //if any an avilabal button presed    
                default:
                    System.out.println("Sorry!!!");
                    System.out.println("We can't calculate it for " + button + " room!");
            }
        }
    }
}