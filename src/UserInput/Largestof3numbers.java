package UserInput;
import java.util.Scanner;

public class Largestof3numbers {
    public static void main(String[] args) {
        System.out.println("You will be asked to chose 3 random integers and the program shall return the largest integer of them all");
        Scanner s = new Scanner(System.in);
        System.out.println("Pleast select your first number: ");
        int x= s.nextInt();
        System.out.println("Pleast select your Second number: ");
        int y= s.nextInt();
        System.out.println("Pleast select your Third number: ");
        int z= s.nextInt();
        int largest =x;

        if(y > largest)
        { largest=y;
            if(z>largest)
            largest=z;
        }
        else 
        if(z>largest)
            largest=z;
        System.out.println("Largest Number is: "+ largest);
        s.close();
    }
}
