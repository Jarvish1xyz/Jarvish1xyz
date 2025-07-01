import java.util.*;

public class Array
{
    public static void main(String[] args) {
        // int[] marks = new int [3];     <----- if you write this, 
        // // int[] marks ={97, 92, 95};  <----- you don't need to write this
        // marks[0] = 97; //phy         
        // marks[1] = 92; //che         
        // marks[2] = 95; //math         
        // // System.out.println(marks[0]);
        // // System.out.println(marks[1]);             <----- Basic code
        // // System.out.println(marks[2]);
        
        // for(int i=0; i<3; i++){
        //     System.out.println(marks[i]);
        // }                                    


        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int[] number = new int[size];
            
            //input
            for( int i=0; i<size; i++){
                number[i] = sc.nextInt();
            }
            
            int x = sc.nextInt();

            //output
            for(int i=0; i<size; i++){
                if(number[i] == x){
                System.out.println("x found at index : "+ i);
                }
            }
        }
    }
}
