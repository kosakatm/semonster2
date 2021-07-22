package semonster2;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class App {
  final static Random random = new Random();
  final static int maxRandomNumber = 4;// ランダムな数値の最大値(0～4)

  public String getGreeting() {
    return "Hello SEMonster";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
    SeMonsterGame mf = new SeMonsterGame(createRandomList(10));
    String name = yourName();
    mf.addPlayer(name);
    mf.draw(name);
  }

  // 名前入力
  public static String yourName() {
    Scanner scan = new Scanner(System.in);
    System.out.println("あなたの名前を入力してください");
    String name = scan.next();
    System.out.println();
    return name;
  }

  /**
   * 指定した数の0~4(maxRandomNumber)のランダムな数値を作成し，LinkedListに格納して返却する
   *
   * @param randNum
   * @return
   */
  public static LinkedList<Integer> createRandomList(int count) {
    LinkedList<Integer> randNumList = new LinkedList<>();
    for (int i = 0; i < count; i++) {
      randNumList.add(random.nextInt(maxRandomNumber + 1));
    }

    return randNumList;
  }

}
