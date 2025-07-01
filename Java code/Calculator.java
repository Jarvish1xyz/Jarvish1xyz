import java.util.*;

public class Calculator 
{
    float sum;
    
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) 
        {   System.out.println("Enter How Many Numbers' Sum You Want");
            int button = sc.nextInt();

        switch(button){
            case 1:System.out.println("Enter a number");
                    int s = sc.nextInt();
                    System.out.println(s);

            break;
            case 2:
                System.out.println("Enter a's limit p");
                int p = sc.nextInt();
                System.out.println("Enter b's limit q");
                int q = sc.nextInt();
                System.out.println("Enter a");
                int a = sc.nextInt();
                System.out.println("Enter b");
                int b = sc.nextInt();
                int sum = (a + b);

                if(a<=p && b<=q)
                {
                    System.out.println("Sum of a and b: ");
                    System.out.println(sum);
                }

                if(a>p && b>q)
                {
                    System.out.println("Number a and b is out of limit!");
                    System.out.println("a's limit must <=" + p + " and b's limit must <=" +q);
                }else if(a>p)
                {
                    System.out.println("Number a is out of limit!");
                    System.out.println("a's limit must <=" +p);
                } else if(b>q)
                {
                    System.out.println("Number b is out of limit!");
                    System.out.println("b's limit must <=" +q);
                } 
            break;
            case 3:
                System.out.println("Enter a's limit p");
                int pp = sc.nextInt();
                System.out.println("Enter b's limit q");
                int qq = sc.nextInt();
                System.out.println("Enter c's limit r");
                int rr = sc.nextInt();
                System.out.println("Enter a");
                int aa = sc.nextInt();
                System.out.println("Enter b");
                int bb = sc.nextInt();
                System.out.println("Enter c");
                int cc = sc.nextInt();

                int su = (aa + bb + cc);

                if(aa<=pp && bb<=qq && cc<=rr)
                {
                    System.out.println("Sum of a,b and c: ");
                    System.out.println(su);
                }

                if(aa>pp && bb>qq && cc>rr)
                {
                    System.out.println("Number a,b and c is out of limit!");
                    System.out.println("a's limit must <=" + pp + ",b's limit must <=" + qq + "and c's limit must <="+rr);
                }else if(aa>pp)
                {
                    System.out.println("Number a is out of limit!");
                    System.out.println("a's limit must <="+pp);
                } else if(bb>qq)
                {
                    System.out.println("Number b is out of limit!");
                    System.out.println("b's limit must <="+qq);
                }else if(cc>rr)
                {
                    System.out.println("Number c is out of limit!");
                    System.out.println("c's limit must <="+rr);
                }
            break;
            default : System.out.println("Now only 3 number's sum can avilabl !");
                    }                       
        }
    }
}