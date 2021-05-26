package ing_soft.strategy;
public class Game {

	public static void main(String[] args) {
				
		King kingCharacter = new King();
		Queen queenCharacter = new Queen();
	
		
		
		kingCharacter.fight();
		kingCharacter.setWeapon(new Axe());
		kingCharacter.fight();
		
		queenCharacter.setWeapon(new Axe());
		queenCharacter.fight();
		queenCharacter.setWeapon(new Sword());
		queenCharacter.fight();
		kingCharacter.fight();
	}

}
