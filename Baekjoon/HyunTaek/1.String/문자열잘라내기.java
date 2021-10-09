import java.util.Arrays;
import java.util.Scanner;

class Main4 {
    static int row, col;
    static String[][] list;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        row = sc.nextInt();
        col = sc.nextInt();
        list = new String[col][row];

        for (int i = 0; i < row; i++) {
            String word = sc.next();
            for (int j = 0; j < col; j++) {
                String[] split_word = word.split("");
                list[j][i] = split_word[j];
            }
        }
        System.out.println(binarySearch());
    }

    public static int binarySearch() {
        int count = 0, left = 1, right = row - 1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (check(mid)) {
                count = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return count;
    }

    public static boolean check(int st) {
        String[] arr = new String[col];
        for (int i = 0; i < col; i++) {
            arr[i] = Arrays.toString(Arrays.copyOfRange(list[i], st, col));
        }
        Arrays.sort(arr);
        for (int i = 0; i < col - 1; i++) {
            if(arr[i].equals(arr[i+1])) return false;
        }
        return true;
    }
}
