package wutdahack.randompassword;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomPassword {

    public static void main(String[] args) {

        List<Character> charPassword = new ArrayList<>();
        char[] applicableChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!$%&=?".toCharArray();
        String password;

        System.out.println("how many passwords do you want?\n");

        Scanner input = new Scanner(System.in);

        int passwordNum = input.nextInt();

        System.out.println("how many characters do you want in each password?\n");

        int characterNum = input.nextInt();

        System.out.println("generating passwords...");
        System.out.println();

        for (int i = 0; i < passwordNum; i++) {

            while (charPassword.size() < characterNum) {
                Random random = new Random();
                int randElement = random.ints(1, 0, applicableChars.length - 1).sum();
                charPassword.add(applicableChars[randElement]);
            }
            password = charPassword.toString().replace("[", "").replace("]", "").replace(",", "").replace(" ", "");
            System.out.println(password);
            charPassword.clear();
        }
            input.close();
            System.out.println();
            System.out.println("passwords generated! program now exiting...");
    }

}

