import java.util.Scanner;

public class Game {
    static Bag bag = new Bag();
    static Scanner input = new Scanner(System.in);

    public static void play(){
        System.out.println("Press Enter to extract a number\nWrite all to see all the extracted numbers\nWrite last to see last extracted number");
        while(!bag.getNumberInBag().isEmpty()){
            switch (input.nextLine()){
                case "last" -> {
                    System.out.println(bag.lastExtracted());
                }

                case "all" -> {
                    System.out.println(bag.allExtracted());
                }

                default -> {
                    System.out.println(bag.extractANumber());
                }
            }
        }

        System.out.println("No more Numbers in the bag");

    }
}
