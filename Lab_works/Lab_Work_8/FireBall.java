public class FireBall extends InfoClass implements Special{
    public void specialAttack(int health, int skill, int luck, int mPower, int mEnergy, Weapon weapon)
    {
        int damage = 15 * mPower;
        if(mEnergy < 15)
        {
            this.damage = 0;
        }else{
            this.damage = damage;
            if(weapon.getName() == "MagicStaff")
            {
                magicEnergy = mEnergy - 5;
            }else{
                magicEnergy = mEnergy;
            }
        }
        this.health = health;
    }
    public String getName()
    {
        return "FireBall";  
    }
}