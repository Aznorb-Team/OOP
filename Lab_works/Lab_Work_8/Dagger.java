public class Dagger extends InfoClass implements Weapon{
    public Dagger(Special special){
        setSpecial(special);
    }
    public void Attack(int endurance, int skill, int luck, int mPower, int mEnergy, int health, int maxHealth)
    {
        int damage = 3 * (4 * skill + 2 * luck);
        if(maxHealth - health > 20){
            this.damage = damage;
            this.health = health + 20;
        }else{
            this.damage = damage;
            this.health = maxHealth;
        } 
        magicEnergy = mEnergy;
        enduranceResult = endurance;
    }
    public String getName()
    {
        return "Dagger";  
    }
}