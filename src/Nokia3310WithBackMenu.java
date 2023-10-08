import java.util.Scanner;

public class Nokia3310WithBackMenu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


       int  Back = 0;

        System.out.println("WELCOME TO YOUR NOKIA PHONE");

        System.out.println("""
                        WELCOME TO YOUR NOKIA PHONE
                    1. Phone book
                    2. Messages
                    3. Chat
                    4. Call Register
                    5. Tones
                    6. Settings
                    7. Call Divert
                    8. Games
                    9. Calculator
                    10. Reminder
                    11. Clock
                    12. Profiles
                    13. SIM Services
                    CHOOSE FROM THE OPTIONS ABOVE :
                    """);
        int firstMenu = input.nextInt();

        if (firstMenu == 1) {
            System.out.println("""
                        1. Search
                        2, Service nos
                        3. Add Name
                        4. Erase
                        5. Edit
                        6. Assign Tone
                        7. Send B' card
                        8. Options
                        9. Speed Dials
                        10. Voice Tags
                        """);
            int phoneBook = input.nextInt();
            if (phoneBook == 1) {
                System.out.println("Search");
            }
            if (phoneBook == 2) {
                System.out.println("Service nos");
            }
            if (phoneBook == 3) {
                System.out.println("Add name");
            }
            if (phoneBook == 4) {
                System.out.println("Erase");
            }
            if (phoneBook == 5) {
                System.out.println("Edit");
            }
            if (phoneBook == 6) {
                System.out.println("Assign tone");
            }
            if (phoneBook == 7) {
                System.out.println("Send B' card");
            }
            if (phoneBook == 8) {
                System.out.println("""
                            1. Type of view
                            2. Memory status
                            """);
            }
        }
        if (firstMenu == 2) {
            System.out.println("""
                        1.Write Message
                        2.Inbox
                        3.outbox
                        4.Picture Messages
                        5.Templates
                        6.Smileys
                        7.Message Settings
                        """);
            int messageContainer = input.nextInt();
            if (messageContainer == 2) {
                System.out.println("""
                            inbox SET
                            1.Message center number
                            2.Message sent as
                            3.Message validity
                            """);
            }
            if (messageContainer == 3) {
                System.out.println("""
                            outbox COMMON
                            1.Delivery reports
                            2.Reply via same center
                            3.Character report
                            4.Info service
                            5.Voice mailbox number
                            6.Service command editor
                            """);
            }
        }
        if (firstMenu == 3) {
            System.out.println("Chats");

        }
        if (firstMenu == 4) {
            System.out.println("""
                        CALL REGISTER
                        1.Missed calls
                        2.Received calls
                        3.Dialed number
                        4.Erase Recent calls
                        5.Show call durations
                        """);
            int callRegister = input.nextInt();
            if (callRegister == 1) {
                System.out.print("You have millions of contacts on your register");
            }
            if (callRegister == 2) {
                System.out.print("you have millions of received calls,you are a celebrity you know!!!");
            }
            if (callRegister == 3) {
                System.out.println("you've dialed millions of contacts");
            }
            if (callRegister == 4) {
                System.out.println("you've erased all your contacts successfully");
            }

            if (callRegister == 5) {
                System.out.println("""
                            1.Last call duration
                            2.All calls' duration
                            3.Received calls' duration
                            4.Dialed calls' duration
                            5.Clear timer
                            """);
            }
        }
        if (firstMenu == 5) {
            System.out.println("tones");
        }
        if (firstMenu == 6) {
            System.out.println("Settings");
        }
        if (firstMenu == 7) {
            System.out.println("Call divert");
        }
        if (firstMenu == 8) {
            System.out.println("Games");
        }
        if (firstMenu == 9) {
            System.out.println("Calculator");
        }
        if (firstMenu == 10) {
            System.out.println("Reminder");
        }
        if (firstMenu == 11) {
            System.out.println("Clock");
        }
        if (firstMenu == 12) {
            System.out.println("Profiles");
        }
        if (firstMenu == 13) {
            System.out.println("SIM services");
        }

    }
}


