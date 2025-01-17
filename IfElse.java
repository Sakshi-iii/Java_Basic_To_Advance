package basic_program;
import java.util.*;
public class IfElse {
   public static void main(String[] args) {
      
   
   try (Scanner sc = new Scanner(System.in)) {
      int age =sc.nextInt();

      if(age%3==0){
       System.out.println("Bazinga");
      }
      else{
       System.out.println(" Not");
      }
   }
}
}
