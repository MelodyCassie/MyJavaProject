package Assignments;

import ClassWorks.ArrayOfNumbersRemoveDuplicates;

import java.util.Scanner;

public class MBTIPersonalityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String userName = scanner.nextLine();

        System.out.println("What is your gender? ");
        String userGender = scanner.nextLine();

        System.out.println("Hello " + userName + "!" + " Welcome to the MBTI personality test. ");
        System.out.println("Please, Answer the following questions with 'A' or 'B'. ");

        char[] answers = new char[20];


        String[] questionsToAsk = {
                "Do you prefer: \nA) Quiet thoughtful time alone ? \nB) Active energetic time with other people person? " ,

                "I am described as: \nA) Reserved \nB) Outgoing" ,

                "In a group: \nA) i try to find a quiet corner? \nB) I like to draw attention to myself? " ,

                "i work best with: \nA) Abstract ideas \nB) Concrete facts " ,

                "My approach is to: \nA) Look at the new picture \nB) Organise the information step by step " ,

                "I tend to value: \nA) The familiar \nB) The new " ,

                "I tend to adopt a: \nA) A systematic approach \nB) A creative approach " ,

                "I work best with: \nA) Details and practical knowledge \nB) Ideas and possibilities " ,

                "I am seen as more of a: \nA) Listener \n B) Talker " ,

                "In discussions i tend to: \nA) Get involved straight away \nB) Take more of a back seat initially " ,

                "I am described as: \nA) Reserved \nB) Outgoing " ,

                "I prefer: \nA) Meeting new people \nB) Being alone or with ne other person whom i know well " ,

                "I am: \nA) Forward thinking \nB) Concrete facts " ,

                "I prefer: \nA) Discussing a new unconsidered issue with a group \nB) Considering issues in my mind, then sharing the result with others " ,

                "I tend to adopt: \nA) A systematic approach \nB) A creative approach " ,

                "I have: \nA) My head in the future  \nB) My feet on the ground " ,

                "I prefer: \nA) Using known effective methods of doing tasks \nB) Trying to think of a new methods of doing tasks " ,

                "I tend to prefer: \nA) Original thought \nB) Factual Information " ,

                "My focus tends to be: \nA) The welfare of the people \nB) What needs to be done " ,

                "I prefer: \nA) Helping others make logical decisions \nB) Helping others explore their feelings "
        };

        for (int j = 0; j < 20; j++) {
            System.out.print("Question " + (j + 1) + ":" + questionsToAsk[j]);

            char answer = Character.toUpperCase(scanner.next().charAt(0));

                if (answer == 'A' || answer == 'B'){
                    answers[j] = answer;
                }
                else{
                    System.out.println("""
                            Expected A or B as your response ...
                                        I know that is an error...
                                        pls,try again.
                            """);
                    j--;
                }
        }
    }

    public static String determineThePersonality(char[] answers){
        int ISTJCount = 0;
        int ISFJCount = 0;
        int INTJCount = 0;
        int INFJCount = 0;
        int ISTPCount = 0;
        int ISFPCount = 0;
        int INFPCount = 0;
        int INTPCount = 0;
        int ESTPCount = 0;
        int ESFPCount = 0;
        int ENFPCount = 0;
        int ENTPCount = 0;
        int ESTJCount = 0;
        int ESFJCount = 0;
        int ENFJCount = 0;
        int ENTJCount = 0;
        return null;
    }

}
