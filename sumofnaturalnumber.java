package basic_program;
import java.util.*;
public class sumofnaturalnumber {
    public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
        int n = sc.nextInt();

        int sum = 0;
        for(int i =0;i<n+1;i++){
          sum+=i;
          
        }
        System.out.println("sum of n number is:"+sum);
        int table =1;
        for (int index = 1; index < 11; index++) {
          table = index*n;
          System.out.println(index+"*"+n+"="+table);
        }
      }
    }
}
