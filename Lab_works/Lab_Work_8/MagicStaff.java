public class MagicStaff extends InfoClass implements Weapon{
    public MagicStaff(Special special){
        setSpecial(special);
    }
    public void Attack(int endurance, int skill, int luck, int mPower, int mEnergy, int health, int maxHealth)
    {
        int damage = 8 * mPower;
        if(mEnergy < 7){
            this.damage = 0;
            magicEnergy = mEnergy + 10;
        }else{
            this.damage = damage;
            magicEnergy = mEnergy - 8;
        }
        enduranceResult = endurance;
    }
    public String getName()
    {
        return "MagicStaff";  
    }
}