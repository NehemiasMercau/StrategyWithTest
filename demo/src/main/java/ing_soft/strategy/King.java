package ing_soft.strategy;
public class King extends Character {
	
	public King() {
		weapon = new Knife();
	}
	
	public void display() {
		System.out.println("I'm fighting with a knife");
	}

	public String prueba(){
		return "hola";
	}
}
