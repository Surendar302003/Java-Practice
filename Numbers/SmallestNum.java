import java.util.Scanner ;
class SmallestNum {
    public static void main(String[] args) {
        
        // Get the values from user
        Scanner Sc = new Scanner(System.in);
        System.out.println("Smallest of 3 number:");
        
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int c = Sc.nextInt();
        
        // compare a, b, c values
        if(a<b && a<c){
            System.out.println(a+" is Smallest");
        }else if(b<a && b<c){
            System.out.println(b+" is Smallest");
        }else{
            System.out.println(c+" is Smallest");
        }
    
        }
    }