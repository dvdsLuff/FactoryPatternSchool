import model.Footware;
import model.Sneaker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("make something for your feet, your choices are  1: High heels and  2: sneakers");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        System.out.println("choose size");
        int size = Integer.parseInt(scanner.nextLine());

        Footware footware;
        footware = FootwareFactory.create(type,size);
        System.out.println(footware);



    }
}
