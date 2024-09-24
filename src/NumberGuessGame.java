import java.util.*;
public class Main {  
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome yo number guss game !!");
        int mynumber = (int)(Math.random()*100);
        do{
            System.out.println("Guess number 1-100: ");
            int userNumber= sc.nextInt();
            if(userNumber==mynumber){
                System.out.println("WOOHOO  :  you guess the right number");
                break;
            }
            else if (userNumber<mynumber){
                System.out.println("Number is small");
            }else {
                System.out.println("Number is great");
            }
        } while (mynumber>=0);
        System.out.println("My number was: "+ mynumber);

    }

}
