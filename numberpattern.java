package basic_program;
public class numberpattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++) {
            System.out.print(j+" ");
            
           }
           System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) {
             System.out.print(i+" ");
             
            }
            System.out.println();
         }
         for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++) {
             System.out.print(j+" ");
             
            }
            System.out.println();
         }
         for(int i=0;i<=n;i++){
            for(int j=n;j>=i+1;j--) {
             System.out.print(j+" ");
             
            }
            System.out.println();
         }
        
         int k=1;
         for(int i=1;i<=n;i++){
            for(int j=i;j>0;j--) {   
             System.out.print(k+" ");
             k++;
            }
            System.out.println();
         }
         for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) {
                if((i+j)%2==0)   {
             System.out.print("1"+" ");
                }
                else{
                    System.out.print("0"+" ");
                }
            
            }
            System.out.println();
         }
    }
}
