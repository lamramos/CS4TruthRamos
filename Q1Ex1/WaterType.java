import java.util.ArrayList;

public class WaterType extends Monster {

    public WaterType (String name, int maxHP, int base) {
        super(name, "Water", "Fire", "Grass", maxHP, base);
        atk = base * 0.7;
        def = base * 1.3;
    }

    @Override
    public void special() {
        super.special();
        def += 2;
        hp -= (maxHP*0.1);
    }
  
}
