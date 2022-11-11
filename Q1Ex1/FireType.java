import java.util.ArrayList;

public class FireType extends Monster {

    public FireType (String name, int maxHP, int base) {
        super(name, "Fire", "Grass", "Water", maxHP, base);
        atk = base * 1.3;
        def = base * 0.7;
    }

    @Override
    public void special() {
        super.special();
        atk += 2;
        hp -= (maxHP*0.1);
    }
  
}
