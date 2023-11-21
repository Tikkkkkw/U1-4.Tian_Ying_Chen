import java.util.Random;
import java.util.Scanner;

public class AMazeRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        int wrong = 0, hint = 0;

        String[] creatures = {"Un-flying Owl", "Treemole", "Tiny Giant", "True&False"};
        String guide = creatures[r.nextInt(creatures.length)];

        /*
        * Creates two new objects, one is guild from the MazeCharacters class, and the other is npc from thr WordishMaze class with three parameters
        */
        MazeCharacters guild = new MazeCharacters(guide);
        WordishMaze npc = new WordishMaze(guild, wrong, hint);

        /*
         * The initialized variables "proceed" and "end" are separated from the other boolean variables because
         * proceed and end are for the entire program, but the other boolean is for separate stages of the game only.
         */
        String userAnswer ;
        boolean proceed = true, end = false;
        boolean stud = true, shroom = false, tree = false;


        System.out.println(npc.introduction());
        userAnswer = s.nextLine().toLowerCase();
        System.out.println(npc.answerFormat(userAnswer, "y", "y", "y"));
        while (!(userAnswer.equals("y"))) {
            System.out.println("~~~~\n~~~~\n~~~~\nExcept. Sorry. YOU DON'T HAVE A CHOICE IN THIS ONE");
            userAnswer = "y";
        }
        while (proceed) {
            System.out.println("\n--------------------------------------");
            System.out.println(npc.guideSpook());
            /* The boolean stud will be false if the events in this while loop is over, also it will start another while loop by declaring the shroom to be true.
            */
            while (stud) {
                System.out.println(guide + ": " + npc.growthStud());
                userAnswer = s.nextLine().toLowerCase();
                System.out.println(npc.answerFormat(userAnswer, "star", "stars", "Star"));
                while (!((userAnswer.equals("star")) || (userAnswer.equals("stars")) || (userAnswer.equals("Star")))) {
                    userAnswer = s.nextLine().toLowerCase();
                    wrong++;
                    if (userAnswer.equals("h")) {
                        String[] starHint = {"I'm part of a community, a tell of location", "I'm easier seen in the dark", "I'm only one, singular", "twinkle fun"};
                        System.out.println(starHint[r.nextInt(starHint.length)]);
                        hint++;
                        wrong--;
                    }
                    System.out.println(npc.answerFormat(userAnswer, "star", "stars", "h"));
                }
                shroom = true;
                stud = false;
            }
        /*
        * the events in this while loop is separated by different if statements, the if statement is for different choice events based on the user's action in the game.
        * at the end of the loop, if the user didn't achieve other ending
        */
            while (shroom) {
                System.out.println(npc.microShroom());
                userAnswer = s.nextLine().toLowerCase();
                System.out.println(npc.shroomChoices(userAnswer));

                if (userAnswer.equals("follow")) {
                    userAnswer = s.nextLine().toLowerCase();
                    System.out.println(guide + ": " + npc.shroomEnd(userAnswer));
                    if (userAnswer.equals("a")) {
                        s.close();
                        npc.updatehint(hint);
                        npc.updatetries(wrong);
                        npc.toString_();
                        System.exit(0);
                    }
                    if (userAnswer.equals("b")) {
                        userAnswer = s.nextLine().toLowerCase();

                        while (!((userAnswer.equals("0")) || (userAnswer.equals("zero")) || (userAnswer.equals("Zero")))) {
                            userAnswer = s.nextLine().toLowerCase();
                            wrong++;
                            System.out.println(npc.answerFormat(userAnswer, "0", "zero", "Zero"));
                            if (userAnswer.equals("h")) {
                                String[] starHint = {"THIS IS AN NORMAL SENTENCE", "check cl_sely", "find what's WRONG, not fixing it"};
                                System.out.println(starHint[r.nextInt(starHint.length)]);
                                hint++;
                                wrong--;
                            }
                            System.out.println(npc.answerFormat(userAnswer, "0", "zero", "Zero"));
                        }
                    }
                    tree = true;
                    shroom = false;
                }
                if (userAnswer.equals("run")) {
                    s.close();
                    npc.updatehint(hint);
                    npc.updatetries(wrong);
                    npc.toString_();
                    System.exit(0);
                    }
                /*
                * this while loop will end no matter if the user gets the riddle correct or not.
                */
                }
                while (tree) {
                    System.out.println(npc.forestForest());
                    userAnswer = s.nextLine().toLowerCase();
                    System.out.println(guide + ": " + npc.forestTrap(userAnswer));


                    if (userAnswer.equals("1") || userAnswer.equals("one")) {
                        end = true;
                        tree = false;
                    } else {
                        s.close();
                        System.out.println(" ");
                        tree = false;
                        proceed = false;
                    }
                }
                if (end) {
                    s.close();
                    npc.updatehint(hint);
                    npc.updatetries(wrong);
                    npc.toString_();
                    System.exit(0);
                }
            }
        }
    }
