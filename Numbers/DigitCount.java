import java.util.Scanner ;
class DigitCount {
    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the n:");
        int n = Sc.nextInt();
        int Count = 0 ;
        
        while(n>0){
            n = n/10;
            Count++;
        }
        System.out.println("The Digit Count of n :"+Count);
    }
}