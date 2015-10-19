package CompareThePlayers;

/**
 * @author arsho
 * @problemName Compare The Players
 * @problemLink
 * https://www.hackerrank.com/contests/codewhiz-java/challenges/compare-the-players
 */
import java.io.*;
import java.util.*;

class Checker {

    Comparator<Player> desc;

    Checker() {
        this.desc = new Comparator<Player>() {

            @Override
            public int compare(Player p1, Player p2) {
                if (p1.score == p2.score) {
                    return p2.name.compareTo(p1.name);
                }
                return p2.score - p1.score;
            }
        };
    }

}

class Player {

    String name;
    int score;
}

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());
        String s;
        StringTokenizer st;
        Player Player[] = new Player[N];
        Checker check = new Checker();
        for (int i = 0; i < N; i++) {
            s = br.readLine().trim();
            st = new StringTokenizer(s);
            Player[i] = new Player();
            Player[i].name = st.nextToken();
            Player[i].score = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(Player, check.desc);
        for (int i = 0; i < Player.length; i++) {
            System.out.printf("%s %s\n", Player[i].name, Player[i].score);
        }

    }
}
