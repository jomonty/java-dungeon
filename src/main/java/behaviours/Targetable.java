package behaviours;

public interface Targetable {
    int getHealth();
    Boolean isAlive();
    void increaseHealth(int healthAdjustment);
    void decreaseHealth(int healthAdjustment);
}
