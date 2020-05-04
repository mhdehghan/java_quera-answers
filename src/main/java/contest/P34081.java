package contest;
import java.util.Scanner;

public class P34081 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] input = s.split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int start = 0;
        int cnt = 0;
        int next_step;
        while (true) {
            next_step = (start + k) % n;
            cnt++;
            if (next_step == 1) {
                System.out.println(cnt);
                break;
            }
            start = next_step;
        }
    }
}
