import java.util.Scanner;

/**
 * Created by KPS on 7/12/2020.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a string with three characters");
        String sentence = scanner.nextLine();
        String result = "";
        for (int i = 0 ;i < 4;i++){
            result+=sentence.substring(0);
        }
        System.out.println(result);

    }
}
