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
    if(this.rare==3){
    return "スーパー"+this.name + ":レア度[" + this.rare + "]\n";
    }
    if(this.rare==4){
    return "ハイパー"+this.name + ":レア度[" + this.rare + "]\n";
    }
    if(this.rare==5){
    return "ウルトラ"+this.name + ":レア度[" + this.rare + "]\n";
    }
    else{
    return this.name + ":レア度[" + this.rare + "]\n";
    }
  }
}
