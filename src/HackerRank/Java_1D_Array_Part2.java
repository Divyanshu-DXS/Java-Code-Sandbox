package HackerRank;

import java.util.Scanner;

public class Java_1D_Array_Part2 {
    public static boolean canWin(int leap, int[] game) {
        return canReach(0, leap, game, new boolean[game.length]);
        // Return true if you can win the game; otherwise, return false.
    }
    private static boolean canReach(int index, int leap, int[] game, boolean[] visited) {
    // If we are outside the array (win condition)
    if (index >= game.length) {
        return true;
    }

    // If index is invalid or visited or blocked
    if (index < 0 || game[index] == 1 || visited[index]) {
        return false;
    }

    // Mark current index as visited
    visited[index] = true;

    // Try all moves: leap, step forward, step backward
    return canReach(index + leap, leap, game, visited) ||
           canReach(index + 1, leap, game, visited) ||
           canReach(index - 1, leap, game, visited);
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

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
