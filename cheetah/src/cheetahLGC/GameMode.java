package cheetahLGC;

public class GameMode {
    
    private int   mode;
    private float timer;
    private float bonusDifficulty, bonusStrike;
    private int   bonusQuantity;
    
    public GameMode(int m) {
        mode            = m;
        bonusDifficulty = 1;
        bonusStrike     = 1;
        bonusQuantity   = 0;
    }
    
    public int[] generateTask() {
        return null;
    }
    
    public void setBonusDifficulty(float value){
        bonusDifficulty = value;
    }
    
    public void setBonusStrike(float value){
        bonusStrike = value;
    }
    
    public void bonusQuantity(int value){
        bonusQuantity = value;
    }
    
    public float calculateFinalResult(int baseValue){
        return 0;
    }
}
