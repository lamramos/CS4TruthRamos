import java.util.ArrayList;

public class GrassType extends Monster {

    public GrassType (String name, int maxHP, int base) {
        super(name, "Grass", "Water", "Fire", maxHP, base);
    }

    @Override
    public void special () {
        super.special();
        hp = maxHP * 1.2;
    }

    @Override
    public void rest(){
        hp += maxHP * 0.5;
        if(hp > maxHP) hp = maxHP;
        System.out.println(name + " rested. It's health is now " + hp + ".");
    }
  
}
