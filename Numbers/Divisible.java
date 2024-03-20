class Divisible{
    public static void main(String[] args) {
        
    //1-100 divisible by 2
    
       System.out.println("The numbers divisible by 2:") ;
       for(int n = 1; n<=100; n++){
           if(n%2==0){
            System.out.print(n+ ",");
           }
       }
       
          System.out.println("\n") ;
          
          //1-100 divisible by 3
          
          System.out.println("The numbers divisible by 3:") ;
          for(int n = 1; n<=100; n++){
          if(n%3==0){
          System.out.print(n+ ",");
          }
       }
       
    }
}