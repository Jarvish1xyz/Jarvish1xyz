
public class Pattren 
{
    public static void main(String[] args) 
    {
         int n = 4;
         int m = 4;
          for(int i = 1; i<=n; i++)
         {
             for(int j=1; j<=i; j++)
             {
                 if ((i+j) % 2 ==0)
                 {System.out.print("1 ");}
                 else
                 {System.out.print("0 ");}

             }
             System.out.println();
         }


        /*
        // outer limit
        for(int i=1; i<=n; i++)
        { 
            // inner limit
            for(int j=1; j<=m; j++)
            {
                if(i == 1 || j == 1 || i == n || j == m)
	        {   System.out.print("* ");
                }	
		else{System.out.print("  ");}
            }System.out.println();
        }*/   
    } 
    
}
