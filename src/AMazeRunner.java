import java.util.Random;
import java.util.Scanner;

public class AMazeRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        int wrong = 0, hint = 0;

        String[] creatures = {"Un-flying Owl", "Treemole", "Tiny Giant", "True&False"};
        String guide = creatures[r.nextInt(creatures.length)];

        MazeCharacters guild = new MazeCharacters(guide);
        WordishMaze npc = new WordishMaze(guild, wrong, hint);

        String userAnswer = "";
        boolean proceed = true, end = false;
        boolean stud = true, shroom = false, tree = false;
        ;


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
                            }
                            tree = true;
                            shroom = false;
                        }
                    }
                }

                if (userAnswer.equals("run")) {
                        System.out.println("You don't know how long you've been running for, you don't know where you are. The tiredness eventually knocks you out"); /*Mic orginaztiobn. DEEPER TO BE ADDED INTO GAME */
                        s.close();
                        npc.updatehint(hint);
                        npc.updatetries(wrong);
                        npc.toString_();
                        System.exit(0);

                    }

                while (tree) {
                    System.out.println(npc.forestForest());
                    userAnswer = s.nextLine().toLowerCase();
                    System.out.println(guide + ": " + npc.forestTrap(userAnswer));


                    if (userAnswer.equals("1") || userAnswer.equals("one")) {
                        end = true;
                    } else {
                        s.close();
                        System.out.println("");
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
}