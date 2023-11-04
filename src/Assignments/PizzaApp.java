package Assignments;
import javax.xml.stream.events.NotationDeclaration;
import java.util.Scanner;

public class PizzaApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                <><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>
                <><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>
                
                                                  WELCOME TO MELLY'S PIZZA APP!!
                                                  
                <><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>
                <><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>                               \s
                """);
        while (true) {
            System.out.println("Can i take your order? \n (Yes or No) ");
            String response = input.nextLine();

            if (response.equalsIgnoreCase("Yes")) {
                System.out.println("What size of pizza do you want to buy? \n (Large, Medium or Small)\n ");
                String sizeOfPizza = input.nextLine();

                if (sizeOfPizza.equalsIgnoreCase("Large")) {
                    System.out.println("What number of guests are you expecting? ");
                    int numberOfGuestForLargePizza = input.nextInt();

                    if (numberOfGuestForLargePizza > 0) {
                        System.out.println("How many people are super hungry from the " + numberOfGuestForLargePizza + " guests you are expecting? ");
                        int superHungryPeopleForLargePizza = input.nextInt();

                        if (superHungryPeopleForLargePizza > 0 && superHungryPeopleForLargePizza <= numberOfGuestForLargePizza) {
                            System.out.println("How many slices will each super hungry guest eat? ");
                            int slicesPerSuperHungry = input.nextInt();

                            System.out.println("How many people are hungry from the " + (numberOfGuestForLargePizza - superHungryPeopleForLargePizza) + " guests left?");
                            int hungryPeopleForLargePizza = input.nextInt();

                            if (hungryPeopleForLargePizza > 0 && hungryPeopleForLargePizza <= (numberOfGuestForLargePizza - superHungryPeopleForLargePizza)) {
                                System.out.println("How many slices will each hungry guest eat?");
                                int slicesPerHungryForLargePizza = input.nextInt();

                                int notSoHungryPeopleForLargePizza = numberOfGuestForLargePizza - superHungryPeopleForLargePizza - hungryPeopleForLargePizza;

                                System.out.println("How many slices will each not-so-hungry guest eat?");
                                int slicesPerNotSoHungryForLargePizza = input.nextInt();

                                int largePizzaSlices = 10;

                                int totalSlicesNeeded = (superHungryPeopleForLargePizza * slicesPerSuperHungry) +
                                        (hungryPeopleForLargePizza * slicesPerHungryForLargePizza) +
                                        (notSoHungryPeopleForLargePizza * slicesPerNotSoHungryForLargePizza);

                                int largePizzaBoxes = (totalSlicesNeeded + largePizzaSlices - 1) / largePizzaSlices;
                                int remainingSlices = (largePizzaBoxes * largePizzaSlices) - totalSlicesNeeded;

                                System.out.println("You will need about " + largePizzaBoxes + " boxes of pizza. \n");
                                System.out.println("Approximately " + remainingSlices + " slices of pizza will remain.");
                                break;
                            }
                        }
                    } else if (numberOfGuestForLargePizza < 0) {
                        System.out.println("Give a valid number of guests!. \n Try Again.\n");
                    }


                } else if (sizeOfPizza.equalsIgnoreCase("Medium")) {
                    System.out.println("What number of guests are you expecting? ");
                    int numberOfGuestForMediumPizza = input.nextInt();

                    if (numberOfGuestForMediumPizza > 0) {
                        System.out.println("How many guests are hungry from the " + numberOfGuestForMediumPizza + " guests you are expecting? ");
                        int superHungryPeopleForMediumPizza = input.nextInt();

                        if (superHungryPeopleForMediumPizza > 0 && superHungryPeopleForMediumPizza <= numberOfGuestForMediumPizza) {
                            System.out.println("How many slices will each super hungry guest eat?");
                            int slicesPerSuperHungry = input.nextInt();

                            System.out.println("How many people are hungry from the " + (numberOfGuestForMediumPizza - superHungryPeopleForMediumPizza) + " guests left?");
                            int hungryPeopleForMediumPizza = input.nextInt();

                            if (hungryPeopleForMediumPizza > 0 && hungryPeopleForMediumPizza <= (numberOfGuestForMediumPizza - superHungryPeopleForMediumPizza)) {
                                System.out.println("How many slices will each hungry guest eat?");
                                int slicesPerHungryForMediumPizza = input.nextInt();

                                int notSoHungryPeopleForMediumPizza = numberOfGuestForMediumPizza - superHungryPeopleForMediumPizza - hungryPeopleForMediumPizza;

                                System.out.println("How many slices will each not-so-hungry guest eat?");
                                int slicesPerNotSoHungryForMediumPizza = input.nextInt();

                                int mediumPizzaSlices = 6;
                                int totalSlicesNeeded = (superHungryPeopleForMediumPizza * slicesPerSuperHungry) +
                                        (hungryPeopleForMediumPizza * slicesPerHungryForMediumPizza) +
                                        (notSoHungryPeopleForMediumPizza * slicesPerNotSoHungryForMediumPizza);

                                int mediumPizzaBoxes = (totalSlicesNeeded + mediumPizzaSlices - 1) / mediumPizzaSlices;
                                int remainingSlices = (mediumPizzaBoxes * mediumPizzaSlices) - totalSlicesNeeded;

                                System.out.println("You will need about " + mediumPizzaBoxes + " boxes of pizza. \n");
                                System.out.println("Approximately " + remainingSlices + " slices of pizza will remain.");
                                break;
                            }
                        }
                    } else if (numberOfGuestForMediumPizza < 0) {
                        System.out.println("Give a valid number of guests!. \n Try Again.\n");
                    }


                } else if (sizeOfPizza.equalsIgnoreCase("Small")) {
                    System.out.println("What number of guests are you expecting? ");
                    int numberOfGuestsForSmallPizza = input.nextInt();

                    if (numberOfGuestsForSmallPizza > 0) {
                        System.out.println("How many guests are super hungry from the " + numberOfGuestsForSmallPizza + " guest you are expecting? ");
                        int superHungryForSmallPizza = input.nextInt();

                        if (superHungryForSmallPizza > 0 && superHungryForSmallPizza <= numberOfGuestsForSmallPizza) {
                            System.out.println("How many slices will each super hungry guest eat? ");
                            int slicesPerSuperHungry = input.nextInt();

                            System.out.println("How many guests are hungry from the " + (numberOfGuestsForSmallPizza - superHungryForSmallPizza) + " guests left?");
                            int hungryPeopleForSmallPizza = input.nextInt();

                            if (hungryPeopleForSmallPizza > 0 && hungryPeopleForSmallPizza <= (numberOfGuestsForSmallPizza - superHungryForSmallPizza)) {
                                System.out.println("How many slices will each hungry guest eat?");
                                int slicesPerHungryForSmallPizza = input.nextInt();

                                int notSoHungryPeopleForSmallPizza = numberOfGuestsForSmallPizza - superHungryForSmallPizza - hungryPeopleForSmallPizza;

                                System.out.println("How many slices will each not-so-hungry guest eat?");
                                int slicesPerNotSoHungryForSmallPizza = input.nextInt();

                                int smallPizzaSlices = 4;
                                int totalSlicesNeeded = (superHungryForSmallPizza * slicesPerSuperHungry) +
                                        (hungryPeopleForSmallPizza * slicesPerHungryForSmallPizza) +
                                        (notSoHungryPeopleForSmallPizza * slicesPerNotSoHungryForSmallPizza);

                                int SmallPizzaBoxes = (totalSlicesNeeded + smallPizzaSlices - 1) / smallPizzaSlices;
                                int remainingSlices = (SmallPizzaBoxes * smallPizzaSlices) - totalSlicesNeeded;

                                    System.out.println("You will need about " + SmallPizzaBoxes + " boxes of pizza. \n");
                                    System.out.println("Approximately " + remainingSlices + " slices of pizza will remain.");
                                    break;
                            }
                        }
                    } else {
                        System.out.println("Invalid Response. \n Try Again. ");
                    }
                }
            }else if (response.equalsIgnoreCase("No")) {
                    System.out.println("Alright! \n Have a nice day!! ");
                    break;
                } else {
                    System.out.println("Invalid response! \n You are required to answer either (Yes or No)\n Try Again..\n");

                }
            }
        }

}