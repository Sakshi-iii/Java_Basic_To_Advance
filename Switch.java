package basic_program;
import java.util.*;

public class Switch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int button = sc.nextInt();
            switch (button){
                case 1:
                    System.out.println("hello");
                    break;
                case 2:System.out.println("Namste");
                     break;
                case 3:System.out.println("bounjour"); 
                    break;   
                default:
                     System.out.println("end");
                    
            }
        }
    }
}
