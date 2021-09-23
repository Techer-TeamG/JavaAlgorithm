import java.util.Scanner;

class Main2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String docs = s.nextLine();
        String word = s.nextLine();

        int count = 0;

        for (int i = 0; i < docs.length() - word.length() +1; i++) {
            if(docs.startsWith(word, i)) {
                count++;
                i += word.length();
                i--;
            }
        }

        System.out.println(count);
    }
}
