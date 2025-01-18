package basic_program;

public class loops {
    public static void main(String[] args) {
       for(int counter =1;counter<=10; counter=counter+1) {
        System.out.println(counter+" ");
       }
       System.out.println("end of for loop");
       int i=1;
       while(i<11){
        System.out.println(i);
        i++;
       }
       System.out.println("end of while loop");
       int j=12;
       do{
        System.out.println(j);
        j++;
       }while(j<11);
       System.out.println("end of do while");
    } 
}
