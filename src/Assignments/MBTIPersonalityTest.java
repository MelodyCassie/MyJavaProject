package Assignments;

import ClassWorks.ArrayOfNumbersRemoveDuplicates;

import java.util.Queue;
import java.util.Scanner;
public class MBTIPersonalityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String userName = scanner.nextLine();

        System.out.println("   ");
        System.out.println("Hello " + userName + "!" + " Welcome to the MBTI personality test. ");
        System.out.println("Please, Answer the following questions with 'A' or 'B'. ");
        System.out.println("   ");

        String[] questionsOfEI = {"expend energy, enjoy groups", "conserve energy, enjoy one-on-one",
                "more outgoing, think out loud", "more reserved, think to yourself",
                "seek many tasks, public activities, interaction with others", "seek private, solitary activities with quiet to concentrate",
                "external, communicative, express yourself", "internal, reticent, keep to yourself",
                "active, initiate", "reflective, deliberate"
        };
        String[] resultOfEI = new String[questionsOfEI.length];


        int first = 0;
        int second = 0;

        int questionEICount = 1;
        for (int loopEI = 0; loopEI < questionsOfEI.length; loopEI +=2) {
            System.out.println("Question " + (questionEICount) + " " );
            System.out.println("A. " + questionsOfEI[loopEI] + "  B. " + questionsOfEI[loopEI + 1]);
            String answerEI = scanner.nextLine().toUpperCase();

            while (!(answerEI.equals("A") || answerEI.equals("B"))) {
                System.out.println("Expected A or B as response.\nI know this is an error.\n Pls,Try again!");
                answerEI = scanner.nextLine().toUpperCase();
            }
            resultOfEI[loopEI] = answerEI;
            questionEICount++;

            if (answerEI . equals("A")) {
                first += 1;

            } else{
                second += 1;
            }
        }
        String resultOne = " ";
        if(first > second) {
            resultOne = "E";
        } else if (second > first) {
            resultOne = "I";
        }


        String[] questionOfSN = {"Interpret literally", "look for meaning and possibilities",
                "Practical, realistic, experiential", "Imaginative, innovative, theoretical",
                "Standard, usual, conventional", "Different, novel, unique",
                "Focus on here-and-now", "Look to the future, global perspective, big picture",
                "Facts, things, what is, philosophical", "Ideas, dreams, what could be"
        };
        String[] resultOfSN = new String[questionOfSN.length];

        int third = 0;
        int fourth = 0;

        int questionSNCount = 6;

        for(int loopSN = 0; loopSN < questionOfSN.length; loopSN+=2){
            System.out.println("Question " + (questionSNCount));
            System.out.println("A. " + questionOfSN[loopSN] + "  B. " + questionOfSN[loopSN + 1]);
            String answerSN = scanner.nextLine().toUpperCase();

            while(!(answerSN.equals("A") || answerSN.equals("B"))){
                System.out.println("Expected A or B as your response.\nI know this is a mistake.\n Pls,Try again!");
                answerSN = scanner.nextLine().toUpperCase();
            }
            resultOfSN[loopSN] = answerSN;
            questionSNCount++;

            if(answerSN.equals("A")){
                third += 1;
            }
            else {
                fourth += 1;
            }
        }
            String resultTwo = " ";
        if(third > fourth){
            resultTwo = "S";
        }
        else if (fourth > third) {
            resultTwo = "N";

        }


        String[] questionOfTF = {"Logical, thinking, questioning", "Emphatic, feeling, accommodating",
                "Candid, Straight forward, frank", "Tactful, kind, encouraging" ,
                "Firm, tend to criticise, hold the line", "Gentle, tend to appreciate, conciliate" ,
                "Tough minded, Just", "Tender hearted, Merciful" ,
                "Matter of fact, Issue oriented " ," Sensitive, People oriented, Compassionate" ,
        };
        String[] resultOfTF = new String[questionOfTF.length];

        int fifth = 0;
        int sixth = 0;

        int questionTFCount = 11;

        for(int loopTF = 0; loopTF < questionOfTF.length; loopTF+=2){
            System.out.println("Question " + (questionTFCount));
            System.out.println("A. " + questionOfTF[loopTF] + "  B. " + questionOfTF[loopTF + 1]);
            String answerTF = scanner.nextLine().toUpperCase();

            while (!(answerTF.equals("A") || answerTF.equals("B"))){
                System.out.println("Expected A or B as your answer.\n I know this is an error.\n Pls,Try again!");
                answerTF = scanner.nextLine().toUpperCase();
            }
            resultOfTF[loopTF] = answerTF;
            questionTFCount++;

            if(answerTF.equals("A")){
                fifth += 1;
            }
            else{
                sixth += 1;
            }
        }
        String resultThree = " ";
        if(fifth > sixth){
            resultThree = "T";
        }
        else if (sixth > fifth) {
            resultThree = "F";
        }




        String[] questionOFJP = {"organized, orderly", "flexible, adaptable",
                "plan, schedule", "unplanned, spontaneous",
                "regulated, structured", "easy-going, live and let live",
                "preparation, plan ahead", "go with the flow, adapt as you go",
                "control, govern", "latitude, freedom"};

        String[] resultOfJP = new String[questionOFJP.length];

        int seventh = 0;
        int eight = 0;

        int questionJPCount = 16;

        for(int loopJP = 0; loopJP < questionOFJP.length; loopJP+=2){
            System.out.println("Question " + (questionJPCount));
            System.out.println("A. " + questionOFJP[loopJP] + " B.  " + questionOFJP[loopJP + 1]);
            String answerOfJP = scanner.nextLine().toUpperCase();

            while(!(answerOfJP.equals("A") || answerOfJP.equals("B"))){
                System.out.println("Expected A or B as your response.\nI know this a mistake.\n Pls,Try again!");
                answerOfJP = scanner.nextLine().toUpperCase();
            }
            resultOfJP[loopJP] = answerOfJP;
            questionJPCount++;

            if(answerOfJP.equals("A")){
                seventh += 1;
            }
            else{
                eight += 1;
            }
        }

        String resultFour = " ";
        if(seventh > eight){
            resultFour = "J";
        }
        else if (eight > seventh) {
            resultFour = "P";
        }

        System.out.print("Hello " + userName + " you selected " + "\n");
        for(int count = 0; count < resultOfEI.length; count++){
        }
        System.out.println("The number of A selected is: " + " " + first + "\n" + "The number of B selected is: " + " " + second + "\n");
        System.out.println("  ");

        for(int count = 0; count < resultOfSN.length; count++){
        }
        System.out.print("The number of A selected is: " + " " + third + "\n" + "The number of B selected is: " + " " + fourth + "\n" );
        System.out.println("  ");

        for(int count = 0; count < resultOfTF.length; count++){
        }
        System.out.println("The number of A selected is: " + " " + fifth + "\n" + "The number of B selected is: " + " " + sixth + "\n") ;
        System.out.println("  ");

        for(int count = 0; count < resultOfJP.length; count++){
        }
        System.out.println("The number of A selected is: " + " " + seventh + "\n" + "The number of B selected is: " + " " + eight + "\n");
        System.out.println("  ");

        switch (resultOne + resultTwo + resultThree + resultFour){
            case "INTJ" -> System.out.println("""
                    INTJ
                    
                    Architect
                    An Architect is a person with the Introverted, Intuitive, Thinking and Judging personality traits (INTJ).
                    These thoughtful tacticians love perfecting the details of life, applying creativity and rationality to everything they do.
                    Their inner world is often a private, complex one. It can be lonely at the top. As one of the rarest
                    personality types – and one of the most capable – Architects (INTJs) know this all too well. Rational and quick-witted,
                    Architects pride themselves on their ability to think for themselves, not to mention their uncanny knack for
                    seeing right through phoniness and hypocrisy. But because their minds are never at rest,
                    Architects may struggle to find people who can keep up with their nonstop analysis of everything around them.
                    """);
            case "INTP" -> System.out.println("""
                    INTP
                                        
                    Logician
                                        
                    A Logician (INTP) is someone with the Introverted, Intuitive, Thinking, and Prospecting personality traits.
                    These flexible thinkers enjoy taking an unconventional approach to many aspects of life.
                    They often seek out unlikely paths, mixing willingness to experiment with personal creativity.
                    Logicians pride themselves on their unique perspectives and vigorous intellect. They can’t help but
                    puzzle over the mysteries of the universe – which may explain why some of the most influential philosophers and
                    scientists of all time have been Logicians. This personality type is fairly rare, but with their
                    creativity and inventiveness, Logicians aren’t afraid to stand out from the crowd.
                    """);

            case "ENTJ" -> System.out.println("""
                    ENTJ
                                        
                    Commander
                                        
                    A Commander (ENTJ) is someone with the Extraverted, Intuitive, Thinking, and Judging personality traits.
                    They are decisive people who love momentum and accomplishment. They gather information to construct
                    their creative visions but rarely hesitate for long before acting on them. Commanders are natural-born leaders.
                    People with this personality type embody the gifts of charisma and confidence, and project authority
                    in a way that draws crowds together behind a common goal. However, Commanders are also characterized by an
                    often ruthless level of rationality, using their drive, determination and sharp minds to achieve whatever
                    end they’ve set for themselves. Perhaps it is best that they make up only three percent of the population, lest they
                    overwhelm the more timid and sensitive personality types that make up much of the rest of the world
                    – but we have Commanders to thank for many of the businesses and institutions we take for granted every day.
                    """);

            case "ENTP" -> System.out.println("""
                    ENTP
                                        
                    Debater
                                        
                    A Debater (ENTP) is a person with the Extraverted, Intuitive, Thinking, and Prospecting personality traits.
                    They tend to be bold and creative, deconstructing and rebuilding ideas with great mental agility.
                    They pursue their goals vigorously despite any resistance they might encounter.
                    Quick-witted and audacious, Debaters aren’t afraid to disagree with the status quo. In fact, they’re not
                    afraid to disagree with pretty much anything or anyone. Few things light up people with this personality type more
                    than a bit of verbal sparring – and if the conversation veers into controversial terrain, so much the better.
                    It would be a mistake, though, to think of Debaters as disagreeable or mean-spirited. Instead, people with
                    this personality type are knowledgeable and curious, with a playful sense of humor, and they can be incredibly entertaining.
                    They simply have an offbeat, contrarian idea of fun – one that involves a healthy dose of spirited debate.
                    """);

            case "INFJ" -> System.out.println("""
                    INFJ
                                        
                    Advocate
                                        
                    An Advocate (INFJ) is someone with the Introverted, Intuitive, Feeling, and Judging personality traits.
                    They tend to approach life with deep thoughtfulness and imagination. Their inner vision, personal values, and a quiet,
                    principled version of humanism guide them in all things. Advocates (INFJs) may be the rarest personality type of all,
                    but they certainly leave their mark on the world. Idealistic and principled, they aren’t content to coast through life –
                    they want to stand up and make a difference. For Advocate personalities, success does not come from money or status but
                    from seeking fulfillment, helping others, and being a force for good in the world.
                    While they have lofty goals and ambitions, Advocates shouldn’t be mistaken for idle dreamers. People with this
                    personality type care about integrity, and they’re rarely satisfied until they’ve done what they know to be right.
                    Conscientious to the core, they move through life with a clear sense of their values, and they aim never to lose
                    sight of what truly matters – not according to other people or society at large, but according to their own wisdom and intuition.
                    """);

            case "INFP" -> System.out.println("""
                    INFP
                                        
                    Mediator
                                        
                    A Mediator (INFP) is someone who possesses the Introverted, Intuitive, Feeling, and Prospecting personality traits.
                    These rare personality types tend to be quiet, open-minded, and imaginative, and they apply a caring and creative
                    approach to everything they do.
                    Although they may seem quiet or unassuming, Mediators (INFPs) have vibrant, passionate inner lives.
                    Creative and imaginative, they happily lose themselves in daydreams, inventing all sorts of stories
                    and conversations in their minds. These personalities are known for their sensitivity – Mediators can have profound
                    emotional responses to music, art, nature, and the people around them.
                    Idealistic and empathetic, Mediators long for deep, soulful relationships, and they feel called to help others.
                    But because this personality type makes up such a small portion of the population, Mediators may sometimes feel
                    lonely or invisible, adrift in a world that doesn’t seem to appreciate the traits that make them unique.
                    """);

            case "ENFJ" -> System.out.println("""
                    ENFJ
                                        
                    Protagonist
                                        
                    A Protagonist (ENFJ) is a person with the Extraverted, Intuitive, Feeling, and Judging personality traits.
                    These warm, forthright types love helping others,and they tend to have strong ideas and values.
                    They back their perspective with the creative energy to achieve their goals.
                    Protagonists (ENFJs) feel called to serve a greater purpose in life. Thoughtful and idealistic,
                    these personality types strive to have a positive impact on other people and the world around them.
                    They rarely shy away from an opportunity to do the right thing, even when doing so is far from easy.
                    Protagonists are born leaders, which explains why these personalities can be found among many notable
                    politicians, coaches, and teachers. Their passion and charisma allow them to inspire others not just
                    in their careers but in every arena of their lives, including their relationships. Few things bring
                    Protagonists a deeper sense of joy and fulfillment than guiding friends and loved ones " to grow into their best selves.
                    """);

            case "ENFP" -> System.out.println("""
                    ENFP
                                        
                    Campaigner
                                        
                    A Campaigner (ENFP) is someone with the Extraverted, Intuitive, Feeling, and Prospecting personality traits.
                    These people tend to embrace big ideas and actions that reflect their sense of hope and goodwill toward others.
                    Their vibrant energy can flow in many directions. Campaigners (ENFPs) are true free spirits – outgoing, openhearted,
                    and open-minded. With their lively, upbeat approach to life, they stand out in any crowd. But even though they can be the
                    life of the party, Campaigners don’t just care about having a good time. These personality types run deep – as does their
                    longing for meaningful, emotional connections with other people.
                    """);

            case "ISTJ" -> System.out.println("""
                    ISTJ
                                        
                    Logistician
                                        
                    A Logistician (ISTJ) is someone with the Introverted, Observant, Thinking, and Judging personality traits.
                    These people tend to be reserved yet willful, with a rational outlook on life. They compose their actions carefully and carry
                    them out with methodical purpose. Logisticians pride themselves on their integrity. People with this personality type mean
                    what they say, and when they commit to doing something, they make sure to follow through.
                    This personality type makes up a good portion of the overall population, and while Logisticians may not be
                    particularly flashy or attention-seeking, they do more than their share to keep society on a sturdy, stable foundation.
                    In their families and their communities, Logisticians often earn respect for their reliability, their practicality,
                    and their ability to stay grounded and logical, even in the most stressful situations.
                    """);

            case "ISFJ" -> System.out.println("""
                    ISFJ
                                        
                    Defender
                                        
                    A Defender (ISFJ) is someone with the Introverted, Observant, Feeling, and Judging personality traits.
                    These people tend to be warm and unassuming in their own steady way. They’re efficient and responsible,
                    giving careful attention to practical details in their daily lives. In their unassuming, understated way,
                    Defenders help make the world go round. Hardworking and devoted, people with this personality type feel a deep
                    sense of responsibility to those around them. Defenders can be counted on to meet deadlines, remember birthdays
                    and special occasions, uphold traditions, and shower their loved ones with gestures of care and support.
                    But they rarely demand recognition for all that they do, preferring instead to operate behind the scenes.
                    This is a capable, can-do personality type, with a wealth of versatile gifts. Though sensitive and
                    caring, Defenders also have excellent analytical abilities and an eye for detail. And despite their reserve,
                    they tend to have well-developed people skills and robust social relationships. Defenders are truly more than
                    the sum of their parts, and their varied strengths shine in even the most ordinary aspects of their daily lives.
                    """);

            case "ESTJ" -> System.out.println("""
                    ESTJ
                                        
                    Executive
                                        
                    An Executive (ESTJ) is someone with the Extraverted, Observant, Thinking, and Judging personality traits.
                    They possess great fortitude, emphatically following their own sensible judgment. They often serve as a stabilizing
                    force among others, able to offer solid direction amid adversity. Executives are representatives of tradition and order,
                    utilizing their understanding of what is right, wrong and socially acceptable to bring families and communities together.
                    Embracing the values of honesty, dedication and dignity, people with the Executive personality type are valued for their clear
                    advice and guidance, and they happily lead the way on difficult paths. Taking pride in bringing people together,
                    Executives often take on roles as community organizers, working hard to bring everyone together in celebration of
                    cherished local events, or in defense of the traditional values that hold families and communities together.
                    """);

            case "ESFJ" -> System.out.println("""
                    ESFJ
                                        
                    Consul
                                        
                    A Consul (ESFJ) is a person with the Extraverted, Observant, Feeling, and Judging personality traits.
                    They are attentive and people-focused, and they enjoy taking part in their social community. Their achievements
                    are guided by decisive values, and they willingly offer guidance to others. For Consuls, life is sweetest when
                    it’s shared with others. People with this personality type form the bedrock of many communities, opening their homes
                    and their hearts to friends, loved ones, and neighbors.
                    This doesn’t mean that Consuls like everyone, or that they’re saints. But Consuls do believe in the power
                    of hospitality and good manners, and they tend to feel a sense of duty to those around them. Generous and reliable,
                    people with this personality type often take it upon themselves in ways both large and small to hold their
                    families and their communities together.
                    """);

            case "ISTP" -> System.out.println("""
                    ISTP
                                        
                    Virtuoso
                                        
                    A Virtuoso (ISTP) is someone with the Introverted, Observant, Thinking, and Prospecting personality traits.
                    They tend to have an individualistic mindset, pursuing goals without needing much external connection.
                    They engage in life with inquisitiveness and personal skill, varying their approach as needed. Virtuosos love to
                    explore with their hands and their eyes, touching and examining the world around them with cool rationalism and spirited curiosity.
                    People with this personality type are natural Makers, moving from project to project, building the useful and the superfluous
                    for the fun of it, and learning from their environment as they go. Often mechanics and engineers, Virtuosos find no greater joy
                    than in getting their hands dirty pulling things apart and putting them back together, just a little bit better than they were before.
                    """);

            case "ISFP" -> System.out.println("""
                    ISFP
                                        
                    Adventurer
                                        
                    An Adventurer (ISFP) is a person with the Introverted, Observant, Feeling, and Prospecting personality traits.
                    They tend to have open minds, approaching life, new experiences, and people with grounded warmth.
                    Their ability to stay in the moment helps them uncover exciting potentials.
                    Adventurers are true artists – although not necessarily in the conventional sense. For this personality type,
                    life itself is a canvas for self-expression. From what they wear to how they spend their free time, Adventurers
                    act in ways that vividly reflect who they are as unique individuals. And every Adventurer is certainly unique.
                    Driven by curiosity and eager to try new things, people with this personality often have a fascinating array
                    of passions and interests. With their exploratory spirits and their ability to find joy in everyday life,
                    Adventurers can be among the most interesting people you’ll ever meet. The only irony? Unassuming and humble,
                    Adventurers tend to see themselves as “just doing their own thing,” so they may not even realize how remarkable they really are.
                    """);

            case "ESTP" -> System.out.println("""
                    ESTP
                                        
                    Entrepreneur
                                        
                    An Entrepreneur (ESTP) is someone with the Extraverted, Observant, Thinking, and Prospecting personality traits.
                    They tend to be energetic and action-oriented, deftly navigating whatever is in front of them. They love uncovering
                    life’s opportunities, whether socializing with others or in more personal pursuits.
                    Entrepreneurs always have an impact on their immediate surroundings the best way to spot them at a party is to look
                    for the whirling eddy of people flitting about them as they move from group to group. Laughing and entertaining
                    with a blunt and earthy humor, Entrepreneur personalities love to be the center of attention. If an audience member
                    is asked to come on stage, Entrepreneurs volunteer – or volunteer a shy friend.
                    Theory, abstract concepts and plodding discussions about global issues and their implications don’t keep
                    Entrepreneurs interested for long. Entrepreneurs keep their conversation energetic, with a good dose of intelligence,
                    but they like to talk about what is – or better yet, to just go out and do it. Entrepreneurs leap before they look,
                    fixing their mistakes as they go, rather than sitting idle, preparing contingencies and escape clauses.
                    """);

            case "ESFP" -> System.out.println("""
                    ESFP
                                        
                    Entertainer
                                        
                    An Entertainer (ESFP) is a person with the Extraverted, Observant, Feeling, and Prospecting personality traits.
                    These people love vibrant experiences, engaging in life eagerly and taking pleasure in discovering the unknown.
                    They can be very social, often encouraging others into shared activities. If anyone is to be found spontaneously
                    breaking into song and dance, it is the Entertainer personality type.
                    Entertainers get caught up in the excitement of the moment, and want everyone else to feel that way, too. No other
                    personality type is as generous with their time and energy as Entertainers when it comes to encouraging others,
                    and no other personality type does it with such irresistible style.
                    """);
        }
    }
}




