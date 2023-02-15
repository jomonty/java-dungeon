package characters.players.mages;

import behaviours.IDefend;
import behaviours.ISpell;

public class Wizard extends Mage {
    // Initialisation
    public Wizard(String name, int health, ISpell spell, IDefend familiar) {
        super(name, health, spell, familiar);
    }
}
