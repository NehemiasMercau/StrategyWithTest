package ing_soft.strategy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AxeTest{
    
    @Test
    public void useWeapon() {
        WeaponBehavior axe = new Axe();
        assertEquals("using a Axe", axe.useWeapon());
	}

    @Test
    public void otraPrueba(){
       assertEquals(2, 2);
	}
}
