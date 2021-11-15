import java.util.Scanner;
import java.util.Random;
/**
 *  
 * 
 * @author  
 * @version  
 */
public class Juego
{
     
    private int posx;
    private int posy;
    private int goalx;
    private int goaly;
    public boolean win;
    private static Scanner input = new Scanner(System.in);
    /**
     * Constructor  
     */
    public Juego()    {
        
        win = false;
        Random r = new Random();
        posx = r.nextInt(21);
        posy = r.nextInt(21);
        goalx = r.nextInt(21);
        goaly = r.nextInt(21);
    }

    public void startingPoint (){
        
    }
    
    private void moveUp(){
        
        posy -= 1;
    }
    
    private void moveDown(){
        
        posy += 1;
    }
    
    private void moveRight(){
        
        posx += 1;
    }
    
    private void moveLeft(){
        
        posx -= 1;
    }
    
    public void menu(){
        System.out.println("Up: 1");
        System.out.println("Down: 2");
        System.out.println("Right: 3");
        System.out.println("Left: 4");
        System.out.println("Leave: 5");
    }
    
    public void move (){
        
        loop: 
        for (int i = 30; i > 0; i--){
            if (win){
                break;
                
            }
            
            System.out.println("Reach the goal (g) You've got " + i + " moves left");
            System.out.println("Next move: ");
            menu();
            posi(posx, posy);
            int dir = input.nextInt();
            
            switch (dir){
                case 1: moveUp(); 
                    break;
                case 2: moveDown(); 
                    break;
                case 3: moveRight(); 
                    break;
                case 4: moveLeft(); 
                    break;
                case 5: break loop;
                    
                }
    
            posi(posx, posy);
            
        }
        
    }
    
    /**
     * Asignacion posicion inicial       
     */
    private void posi(int x, int y)    {
        int conty = 0;
         for (int i = 0; i < 21; i++){
            int contx = 0;
            while (contx < 21){
                if (posy == goaly && posx == goalx){
                    win = true;
                    break;
                    }
                else if (contx == x && conty == y){
                    System.out.printf("%2s","x");
                    
                        posx = contx;
                        posy = conty;
                    
                }
                else if (contx == goalx && conty == goaly){
                    System.out.printf("%2s","g");
                }
                
                else {
                    System.out.printf("%2s",".");
                }

                contx++;
            }
            System.out.println("");
            conty++;
        }
    }
    
    public static void borrarPantalla()    {
        System.out.print('\u000C');

    }
}
