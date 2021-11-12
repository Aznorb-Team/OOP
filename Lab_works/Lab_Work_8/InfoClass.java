public class InfoClass{
    public int damage;
    public int enduranceResult;
    public int magicPower;
    public int magicEnergy;
    public int health;
    public Special special;
    
    public int getDamage(){
        return damage;
    }
    public int getHealth(){
        return health;
    }
    public int getEnduranceResult(){
        return enduranceResult;
    }
    public int getMagicPower()
    {
        return magicPower;
    }
    public int getMagicEnergy()
    {
        return magicEnergy;
    }
    public Special getSpecial(){
        return special;
    }
    public void setSpecial(Special special){
        this.special = special;
    }
}