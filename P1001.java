import java.util.Scanner;

/**
 * Created by Administrator on 2016/4/21.
 */
public class P1001 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();

        if (a + b == 0){
            System.out.println(0);
            return;
        }

        StringBuilder tmp = new StringBuilder("" + (a + b)).reverse();
        StringBuilder rsl = new StringBuilder();

        if (a + b > 0) {
            for (int i = 0; i < tmp.length(); i++) {

                rsl = rsl.append(tmp.charAt(i));
                boolean isLastIndex = i == tmp.length() - 1;
                boolean isMod3 = i % 3 == 2;
                if (isMod3 && !isLastIndex) {
                    rsl = rsl.append(',');
                }
            }
        } else {
            for (int i = 0; i < tmp.length(); i++) {

                rsl = rsl.append(tmp.charAt(i));
                boolean isLastSecondIndex = i == tmp.length() - 2;
                boolean isMod3 = i % 3 == 2;
                boolean isLastIndex = i == tmp.length() - 1;
                if (isMod3 && !isLastSecondIndex && !isLastIndex) {
                    rsl = rsl.append(',');
                }
            }
        }
        System.out.println(rsl.reverse());
    }
}
