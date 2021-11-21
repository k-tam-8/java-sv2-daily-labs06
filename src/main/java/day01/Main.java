package day01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PositiveNumberContainer positiveNumberContainer = new PositiveNumberContainer();
        boolean quit = false;
        while (!quit) {
            int i = sc.nextInt();
            if (i < 0) {
                quit = true;
            } else {
                positiveNumberContainer.addIntList(i);
            }
        }
        System.out.println(positiveNumberContainer.getIntList().toString());
        /*
        while((actual=sc.nextDouble())>0){
            positiveNumberContainer.addIntList(actual);
        }
         */
    }
}
