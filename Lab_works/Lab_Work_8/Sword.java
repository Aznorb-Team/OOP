public class Sword extends InfoClass implements Weapon{
    public Sword(Special special){
        setSpecial(special);
    }
    public void Attack(int endurance, int skill, int luck, int mPower, int mEnergy, int health, int maxHealth)
    {
        int damage = 5 * (skill + 3 * luck);
        if(endurance < 8){
            this.damage = 0;
            enduranceResult = 0;
        }else{
            this.damage = damage;
            enduranceResult = endurance - 8;
        }
        health = health;
        magicEnergy = mEnergy;
    }
    public String getName()
    {
        return "Sword";  
    }
}