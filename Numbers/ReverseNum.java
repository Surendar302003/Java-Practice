import java.util.Scanner;
class ReverseNum {
    public static void main(String[] args) {
        
        int reverse=0;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Num :" );
        int Num = Sc.nextInt();
        
        while(Num != 0){
            int remainder = Num % 10;
            reverse = reverse*10+remainder;
            Num = Num/10;
        }
        
        System.out.println("The reverse of given Num is "+reverse);
    }
}