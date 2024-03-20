import java.util.Scanner;
class Factorial{
    public static void main(String[] args) {
        
        int i, n=1 ;
        
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter the Num:");
        int Num = Sc.nextInt();
        
    for(i = 1; i<=Num; i++){
        n =n*i;
    }
    System.out.println("Factorial of "+Num+" is:"+n);
  }
}