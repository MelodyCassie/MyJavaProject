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
                "Do you prefer: \nA) Quiet thoughtful time alone ? \nB) Active energetic time with other people person? ",

                "I am described as: \nA) Reserved \nB) Outgoing" ,

                "In a group: A) i try to find a quiet corner? \nB) I like to draw attention to myself? " ,

                "i work best with: A) Abstract ideas \nB) Concrete facts ",

                "My approach is to: A) Look at the new picture \nB) Organise the information step by step ",

                "I tend to value: A) The familiar \nB) The new " ,

                "I tend to adopt a: A) A systematic approach \nB) A creative approach " ,

                        "I work best with: A) Details and practical knowledge " +
                        "                  B) Ideas and possibilities " +

                        "I am seen as more of a: A) Listener " +
                        "                        B) Talker " +

                        "In discussions i tend to: A) Get involved straight away " +
                        "                          B) Take more of a back seat initially " +

                        "I am described as: A) Outgoing " +
                        "                   B) Reserved " +

                        "I prefer: A) Meeting new people " +
                        "          B) Being alone or with ne other person whom i know well " +

                        "I am: A) Forward thinking " +
                        "      B) Concrete facts " +

                        "I prefer: A) Discussing a new unconsidered issue with a group " +
                        "          B) Considering issues in my mind, then sharing the result with others " +

                        "I tend to adopt: A) A systematic approach " +
                        "                 B) A creative approach " +

                        "I have: A) My feet on the ground " +
                        "        B) My head in the future " +

                        "I prefer: A) Trying to think of a new methods of doing tasks " +
                        "          B) Using known effective methods of doing tasks " +

                        "I tend to prefer: A) Original thought " +
                        "                  B) Factual Information " +

                        "My focus tends to be: A) The welfare of the people " +
                        "                      B) What needs to be done " +

                        "I prefer: A) Helping others make logical decisions " +
                        "          B) Helping others explore their feelings "

        };
        String[] choices = {
                        "A) or B)" +
                        "A) or B)" +
                        "A) or B)" +
                        "A) or B)" +
                        "A) or B)" +
                        "A) or B)" +
                        "A) or B)" +
                        "A) or B)" +
                        "A) or B)" +
                        "A) or B)" +
                        "A) or B)" +
                        "A) or B)" +
                        "A) or B)" +
                        "A) or B)" +
                        "A) or B)" +
                        "A) or B)" +
                        "A) or B)" +
                        "A) or B)" +
                        "A) or B)" +
                        "A) or B)"
        };

        for (int j = 0; j < 20; j++) {
            System.out.print("Question " + (j + 1) + " " + questionsToAsk[j]);
            System.out.println(choices[j]);



                char answer = scanner.next().toUpperCase().charAt(0);

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

}
