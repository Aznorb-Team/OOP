public class PhysicalAttack extends InfoClass implements Special
{
  public void specialAttack (int health, int skill, int luck, int mPower,int mEnergy, Weapon weapon)
  {
    int damage = 10 * (skill + 3 * luck);
    if(weapon.getName() == "Sword")
      {
            if(health < 25)
            {
                this.damage = 0;
            }else{
                
                this.damage = (int)(damage * 1.5);
                this.health = health - 25;
            }
      }else{
          if(health < 20)
            {
                this.damage = 0;
            }else{
                
                this.damage = damage;
                this.health = health - 20;
            }
      }
      magicEnergy = mEnergy;
  }
  public String getName()
    {
        return "PhysicalAttack";  
    }
}
