package pl.danielsu;

public interface SpaceShip {

   boolean lunch();
   boolean land();
   boolean canCarry(Item item);
   void carry(Item item);

}
