package things.weapons;

import behaviours.IWeapon;
import behaviours.Targetable;

public class Club implements IWeapon {
    // Initialisation
    private int damageValue;
    public Club() {
        this.damageValue = 20;
    }
    // Getters and setters
    @Override
    public int getDamageValue() {return this.damageValue;}
    public void setDamageValue(int damageValue) {
        this.damageValue = damageValue;
    }
    // Methods
    @Override
    public void attack(Targetable target) {
        target.decreaseHealth(this.damageValue);
    }
}
