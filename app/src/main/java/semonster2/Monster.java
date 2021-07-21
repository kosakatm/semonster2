package semonster2;
import java.util.Random;

public class Monster {
  private String name;
  private int rare; // 戦うとレア度が高いほうが勝つ．同じ場合は引き分け

  Monster() {
    Random random = new Random();
    this.name = this.summonMonster(random.nextInt(5));
    this.rare = random.nextInt(5);
  }



  String summonMonster(int mnumber) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
    return monsters[mnumber];
  }

  @Override
  public String toString() {

    return this.name + ":レア度[" + this.rare + "]\n";
  }

  public void MonsterFusion(Monster m1, Monster m2)
  {
    this.name = m1.name + m2.name;
    this.rare = m1.rare + m2.rare;

    return;
  }
}
