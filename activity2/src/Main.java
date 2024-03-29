import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("message: ");
        String inputString = scanner.nextLine();
        String[] tokens = inputString.split(" ");

        String[] firstLetters = new String[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            firstLetters[i] = tokens[i].substring(0, 1);
        }

        System.out.print("offset: ");
        int offset = scanner.nextInt();

        System.out.print("escapeMessage:");
        for (int i = firstLetters.length - 1; i >= 0; i--) {
            int letterValue = (int) (firstLetters[i].charAt(0)) - 'a' + 1; // 알파벳을 숫자로 변환
            letterValue = (letterValue + offset) % 26; // 오프셋을 더하고 26으로 나눈 나머지를 취함
            if (letterValue <= 0) // 0보다 작은 경우 26을 더하여 양수로 변환
                letterValue += 26;
            char newLetter = (char) ('a' + letterValue - 1); // 숫자를 다시 알파벳으로 변환
            System.out.print(newLetter);
        }
    }
}


