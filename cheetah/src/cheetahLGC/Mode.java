/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cheetahLGC;

import cheetahMGR.Globals;
import java.lang.Math;
import java.util.Random;
/**
 *
 * @author Aleksey
 */
public class Mode {
    private int currentOperation;
    private String resultString;
    private Generator gen;
    private int result;
    //public enum modes {ADD,DIFF,MUL,DIV,ALL};
    public Mode(int mode){
        result = 0;
        resultString = "";
        gen = new Generator();
        currentOperation = mode;
        gen.getNextPairValue(Globals.MIN_VALUE, Globals.MAX_VALUE);
        if (currentOperation == 4){
            Random rd = new Random();
            currentOperation = rd.nextInt(4);
        }
        switch(currentOperation)
        {
/*            case 4:
                Random rd = new Random();
                currentOperation = rd.nextInt(3);*/
            case 0: result = gen.getFirst() + gen.getSecond(); 
                resultString = Integer.toString(gen.getFirst()) + " + " + Integer.toString(gen.getSecond()) + " = ";
                break;
            case 1: 
                result = gen.getFirst() - gen.getSecond(); 
                resultString = Integer.toString(gen.getFirst()) + " - " + Integer.toString(gen.getSecond()) + " = ";
                break;
            case 2:
                result = gen.getFirst() * gen.getSecond(); 
                resultString = Integer.toString(gen.getFirst()) + " * " + Integer.toString(gen.getSecond()) + " = ";
                break;
            case 3:
                result = gen.getFirst() % gen.getSecond(); 
                resultString = Integer.toString(gen.getFirst()) + " % " + Integer.toString(gen.getSecond()) + " = ";
                break;
        }
    }
    
    public String getResultString(){
        return resultString;
    }
    
    public int getResult(){
        return result;
    }
            
}
