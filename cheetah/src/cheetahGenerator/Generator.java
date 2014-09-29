/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cheetahGenerator;
import java.util.Random;
import java.lang.Math;

/**
 *
 * @author Aleksey
 */
public class Generator {
private int first;
private int second;
Random rnd;

    public Generator(){
        rnd = new Random();
    }
    
    public int[] getNextPairValue(int min, int max){
        first = min + rnd.nextInt(Math.abs(max-min));
        second =  min + rnd.nextInt(Math.abs(max-min));
        return new int[]{first,second};
    }
}
