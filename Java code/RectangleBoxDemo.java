import java.io.*;
class Rectangle 
{
 int length,breadth;
}
class Box extends Rectangle
{
 int height,vol;
 public void getData()throws IOException
 {
 BufferedReader dis=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Enter length of rectangle box");
 length=Integer.parseInt(dis.readLine());
 System.out.println("Enter breadth of rectangle box");
 breadth=Integer.parseInt(dis.readLine());
 System.out.println("Enter height of rectangle box");
 height=Integer.parseInt(dis.readLine());
 }
 public void volume()
 {
 vol=length*breadth*height;
 }
 public void displayVolume()
 {
 System.out.println("volum of rectangle box is:" +vol);
 }
}
public class RectangleBoxDemo
{
 public static void main(String[] args)throws Exception
 {
 Box box1=new Box();
 box1.getData();
 box1.volume();
 box1.displayVolume();
 }
}