/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;
import cheetahLGC.GameMode;
/**
 *
 * @author Aleksey
 */
public class ModeTest {
    public static void main(String[] args) {
        int n = 5;
        int i;
        //for (int i = 0; i <= n; i++){
        while(true){
            i = 4;
            GameMode md = new GameMode(i);
            System.out.println("-----start------");
            System.out.println( "Result string = " + md.getResultString());
            System.out.println( "Result value = " + Integer.toString(md.getResult()));
            System.out.println("-----end------");
        }
    }
    
}
