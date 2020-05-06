package contest;
import java.util.Scanner;

public class P34081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int start = 1;
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
