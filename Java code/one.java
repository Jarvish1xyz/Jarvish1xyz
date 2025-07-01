public class one {
    public static void main(String[] args) {
        int number[] ={50, 75, 54, 71, 81};
        int even =0, odd =0;
        for(int i=0; i<=4;i++) {
            if(number[i] % 2 ==0) {
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("Even is = " + even);
        System.out.println("Odd is =" + odd);
    }
}