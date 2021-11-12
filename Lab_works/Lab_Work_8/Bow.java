public class Bow extends InfoClass implements Weapon{
    InfoClass infoClass;
    public Bow(Special special){
        setSpecial(special);
    }
    public void Attack(int endurance, int skill, int luck, int mPower, int mEnergy, int health, int maxHealth)
    {
        int damage = 10 * skill;
        if(endurance < 10){
            this.damage = damage /4;
            enduranceResult = 0;
        }else{
            this.damage = damage;
            enduranceResult = endurance - 10;
        }
        magicEnergy = mEnergy;
    }
    public String getName()
    {
        return "Bow";  
    }
}