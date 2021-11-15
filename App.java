import java.util.Scanner;
/**
 *  
 * 
 * @author  
 * @version  
 */
public class App
{

    public static void main(String []args) {
        int keep = 1;
        while (keep == 1){
            Juego.borrarPantalla();
            Juego play = new Juego();
            Scanner input = new Scanner(System.in);
            
            play.startingPoint();
            System.out.println("");
            play.move();
            if (play.win){
                play.borrarPantalla();
                System.out.println("You've won!!!!");
            } 
            else {
                play.borrarPantalla();
                System.out.println("You've lost :((");
     
            }
            System.out.println("");
            System.out.println("Keep playing?");
            System.out.println("1: yes");
            System.out.println("2: no");
            keep = input.nextInt();
            
        }
    }
    
}
