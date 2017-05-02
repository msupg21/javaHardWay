public class ThereAndBackAgain {
    public static void main(String[] args) {
      System.out.println("Here.");
      erebor();
      System.out.println("Back first time.");
      erebor();
      System.out.println("Back second time.");
      random();

    }

    public static void erebor() {
      System.out.println("There.");
    }
    public static void random() {
    int num = 0;
    num = 1 + (int)(Math.random()*10);
    System.out.println(num);
      if (num == 7)
      System.out.println("Ha, lucky number 7!");
    }
}
