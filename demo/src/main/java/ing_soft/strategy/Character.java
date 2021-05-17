package ing_soft.strategy;

public abstract class Character {
	WeaponBehavior weapon;

	public void setWeapon(WeaponBehavior w) {
		this.weapon = w;
	}

	public void fight() {
		System.out.println(weapon.useWeapon());
	}
}
