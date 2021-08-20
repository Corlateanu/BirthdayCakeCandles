import java.util.Scanner;

public class birthday {


    public static int birthdayCakeCandles() {

        int maxheight = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter candels height:");

        int number = sc.nextInt();
        int[] candels = new int[number];

        sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        for (int i = 0; i < line.length - 1; i++) {
            candels[i] = Integer.parseInt(line[i]);
        }


        for (int n : candels) {
            if (n > maxheight) {
                maxheight = n;
            }
        }

        for (int i = 0; i < candels.length; i++) {
            if (candels[i] < maxheight) {
                candels[i] = 0;
            }


        }
        for (int i = 0; i < candels.length; i++) {
            if (candels[i] != 0) {
                System.out.println(candels[i]);
            }


        }


        return maxheight;

    }


    public static void main(String[] args) {
        birthday.birthdayCakeCandles();


    }


}
