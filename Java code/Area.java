import java.util.Scanner;

class Areas
{
    float a, b;
    float areas;
    float r, л = 3.14f;
    float areac;
    float l, m, n, sp;
    double areat;
    

    public void Area1()
    {
        areac = 2 * л * r;

        this.r =r;

        System.out.println("Area of circle is: " + areac);
    }

    public void Area2()
    {
        if( a == b)
        {
            areas = a * a;
            System.out.println("This is Squar");
            System.out.println("Area of Squar is: " + areas);
        }
        else
        {
            areas = a * b;
            System.out.println("This is Rectangle");
            System.out.println("Area of Rectangle is: " + areas);
        }

        this.a = a;
        this.b = b;
        this.areas = areas;
        
        System.out.println(areas);   
    }

    public void Area3()
    {       
        sp = (l + m + n)/2;
        areat = Math.sqrt(sp * (sp-l)* (sp-m)* (sp-n));

        this.l = l;
        this.m = m;
        this.n = n;

        System.out.println("Area of triangle is: " + areat);
    }
}

public class Area 
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.println("\nwhat kind of shap you have");
            System.out.println("Options: circle, squar/rectangle, tringle");
            String p = sc.next();
 
            switch (p) 
            {
                case "circle":
                    System.out.println("Enter radius of circle: ");
                    float r = sc.nextFloat();

                    Areas cr = new Areas();
                    cr.r =r;
                    cr.Area1();
                    break;
            
                case "squar/rectangle":
                    System.out.println("Enter length a: ");
                    float a = sc.nextFloat();
                    System.out.println("Enter length b: ");
                    float b = sc.nextFloat();
                    
                    Areas sq = new Areas();
                    sq.a = a;
                    sq.b = b;
                    sq.Area2();
                    break;

                case "triangle":
                    System.out.println("Enter first side length of tringle:");
                    float l = sc.nextFloat();
                    System.out.println("Enter second side length of tringle:");
                    float m = sc.nextFloat();
                    System.out.println("Enter third side length of tringle:");
                    float n = sc.nextFloat();

                    Areas tr =new Areas();
                    tr.l = l;
                    tr.m = m;
                    tr.n = n;
                    tr.Area3();
                    break;

                default:
                    System.out.println("It's look like your spelling is incorrect!");    
                    System.out.println("Please write correct spelling!");
                    break;
                    
            }
        }
    }
}