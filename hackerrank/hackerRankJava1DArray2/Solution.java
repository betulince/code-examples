package hackerRankJava1DArray2;

import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game, int var) {
        // Return true if you can win the game; otherwise, return false.
        if (var < 0 || game[var] == 1)
            return false;
        if (var+1 >= game.length || var+leap >= game.length)
            return true;
        game[var] = 1; // if you move and it's 0, then change it to 1.
        return canWin(leap, game, var+leap) || canWin(leap, game, var+1) || canWin(leap, game, var-1);
        //if any one of this is return true it means we reached the end basically.
        //if its's false then it will keep checking the other ones. if they all false then it will return false.
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
            System.out.println( (canWin(leap, game, 0)) ? "YES" : "NO" );
            //we also send 0 as 3rd variable because it's guaranteed that the value of game[0] is always 0.
        }
        scan.close();
    }
}
