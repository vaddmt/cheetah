package cheetahLGC;

import java.lang.Math;
import java.util.Random;

public class Generator {
    
    private int first;
    private int second;
    Random      rnd;

    public Generator(){
        rnd = new Random();
    }
    
    public int[] getNextPairValue(int min, int max){
        first  = min + rnd.nextInt(Math.abs(max - min));
        second = min + rnd.nextInt(Math.abs(max - min));
        return new int[] { first, second };
    }
}
