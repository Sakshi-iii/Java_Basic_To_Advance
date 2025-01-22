package basic_program;
public class diamond {
    public static void main(String[] args) {
        int n=5;
        for(int i=0; i<n;i++){
            for(int j=0;j<2*(n-i-1);j++){
                System.out.print(" ");
            }
            for(int k=i+1;k>0;k--)
            {
                System.out.print("*"+" ");
            }
            for(int l=2;l<=i+1;l++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    
    for(int i=n; i>=0;i--){
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        for(int k=i;k>0;k--)
        {
            System.out.print("*"+" ");
        }
        for(int l=2;l<=i;l++)
        {
            System.out.print("*"+" ");
        }
        System.out.println();
    }
}
}
