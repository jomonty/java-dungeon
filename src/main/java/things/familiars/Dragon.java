package things.familiars;

import behaviours.IDefend;
import behaviours.Targetable;

public class Dragon implements IDefend {
    // Initialisation
    private int defendValue;
    public Dragon() {this.defendValue = 60;}
    // Getters and setters
    @Override
    public int getDefendValue() {return this.defendValue;}
    public void setDefendValue(int defendValue) {this.defendValue = defendValue;}
    // Methods
    public void defend(Targetable target) {
        target.decreaseHealth(this.defendValue);
    }
}
