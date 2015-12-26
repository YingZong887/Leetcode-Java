/**
 *
 * @author yingzong
 * Easy: Nim Game
 * 
 */
public class NimGame {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }

    public static void main(String[] args) {
        NimGame a = new NimGame();
        int n = 5;
        System.out.println(a.canWinNim(n));
    }
}
