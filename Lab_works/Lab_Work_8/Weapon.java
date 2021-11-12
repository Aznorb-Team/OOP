public interface Weapon{
    //public Weapon(Special special);
    public void Attack(int endurance, int skill, int luck, int mPower, int mEnergy, int health, int maxHealth);
    public String getName();
    public int getDamage();
    public int getHealth();
    public int getEnduranceResult();
    public int getMagicPower();
    public int getMagicEnergy();
    public void setSpecial(Special special);
    public Special getSpecial();
}