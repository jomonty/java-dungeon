package characters.players.mages;

import behaviours.IDefend;
import behaviours.ISpell;

public class Warlock extends Mage {
    // Initialisation
    public Warlock(String name, int health, ISpell spell, IDefend familiar) {
        super(name, health, spell, familiar);
    }
}
