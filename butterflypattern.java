package basic_program;
public class butterflypattern {
    public static void main(String[] args) {
      int n=4;
      for(int i=0;i<n;i++) {
         for(int j=i;j>=0;j--){
            System.out.print("*"+" ");
         }
        for(int k=4;k<=4*(n-i);k++){
            System.out.print(" ");
        }
        for(int l=0;l<=i;l++){
            System.out.print(" "+"*");
        }
         System.out.println();
         
      }  
      for(int i=n;i>=1;i--) {
        for(int j=i;j>0;j--){
           System.out.print("*"+" ");
        }
       for(int k=4;k<=4*(n-i+1);k++){
           System.out.print(" ");
       }
       for(int l=0;l<i;l++){
           System.out.print(" "+"*");
       }
        System.out.println();
        
     }  

    }
}
