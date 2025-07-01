public class NewProject
{
    public static void main(String[] arg)
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                if(i==1 || i==5)
                {
                    System.out.print("*");
                }
                if(j==2 && (i==j || i==2*j ))
                {
                    System.out.print("*");
                }
                if(j==3 && i==j)
                {
                    System.out.print("*");
                }
                
                else
                {
                    System.out.print(" ");
                }
            }System.out.println();
        }

        for(int o=1; o<=5; o++)
        {
            for(int p=1; p<=5; p++)
            {
                if(p==1 || p==5)
                {
                    System.out.print("*");
                }
                if(o==3 && p==2)
                {
                    System.out.print("*");
                }
                if(o==3 && p==3)
                {
                    System.out.print("*");
                }
                if(o==3 && p==4)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }System.out.println();
        }

    }
}