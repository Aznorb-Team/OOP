public class Main
{
	public static void main(String[] args) {
	    
	    PhysicalAttack pAttack = new PhysicalAttack();
	    Sword sword = new Sword(pAttack);
	    Dagger dagger = new Dagger(pAttack);
		Player player = new Player("Player", dagger, 100, 100, 100, 20, 25, 15);
		
		System.out.println("\n" +"Damage special attack: " + player.specialAttack() + "\n");
		player.Info();
		
		System.out.println("\n" +"Damage attack: " + player.Attack() + "\n");
		player.Info();
		
		FireBall fBall = new FireBall();
		MagicStaff mStaff = new MagicStaff(fBall);
		
		player.setWeapon(mStaff);
		System.out.println("\n");
		player.Info();
		System.out.println("\n");
		mStaff.setSpecial(pAttack);
		player.Info();
	}
}

