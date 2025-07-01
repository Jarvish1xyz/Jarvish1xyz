import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Reading {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num1 = 0;
        float num2 = 0.0f;

        try {
            System.out.println("enter an integer number : ");
            num1 = Integer.parseInt(in.readLine());
            System.out.println("enter a float number : ");
            num2 = Float.valueOf(in.readLine()).floatValue();
        }

        catch (Exception e) { }
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}