package semonster2;


public class Player {
  String name = "05";// Player name
  Monster monster = new Monster();

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Deck:" + this.name + "\n");
    sb.append(this.monster);
    return sb.toString();
  }
}
