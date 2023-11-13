import java.util.Random;
import java.util.Scanner;


public class AMazeRunner {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        WordishMaze maze = new WordishMaze();
        String userAnswer, allOfAnswer = "";
        boolean proceed = true , end = false;
        int wrong = 0, correct = 0 ;


        String[] creatures = {"Un-flying Owl", "Treemole", "Tiny Giant", "True&False"};


        System.out.println(maze.introduction());
        userAnswer = s.nextLine();
        System.out.println(maze.answerFormatte(userAnswer, "y"));
        while  (!(userAnswer.equals("y"))){
            System.out.println("~~~~\n~~~~\n~~~~\nExcept. Sorry not sorry. This is not an choice :D");
            userAnswer = "y";
        }
        while (proceed){


            allOfAnswer = allOfAnswer + userAnswer;
            System.out.println("\n--------------------------------------");/* TBD put this into the WordishMaze Public graphic design.*/


            String guide = creatures[r.nextInt(creatures.length)];
            MazeCharacters guild = new MazeCharacters(guide, true);
            WordishMaze npc = new WordishMaze(guild);


            System.out.println("You walked further into the forest, suddenly something moving in the bushes catch your attention. ");
            System.out.println("an ____ jumps out and spooked you" );
            System.out.println(guide);
            System.out.println("yes, an " + guide + " jumps out and spooks you. ");
            System.out.println(guide + ": " + npc.growthStud());
            userAnswer = s.nextLine();
            System.out.println(maze.answerFormatte(userAnswer, "star"));
            while  (!(userAnswer.equals("star"))){
                userAnswer = s.nextLine().toLowerCase();
                wrong ++;
                System.out.println(maze.answerFormatte(userAnswer, "star"));
            }
            System.out.println(maze.microShroom());
            userAnswer = s.nextLine();
            System.out.println(maze.shroomChoices(userAnswer));

            if (userAnswer.equals("run")){
                System.out.println("THIS PATH HAVEN'T BEEN CONSTRUCTED YET<3 IT'S NOW ONLY AN EARLY EXIT PATH, THANK YOU FOR PLAYING");
                end = true;
            }
            if (userAnswer.equals("follow")){
                userAnswer = s.nextLine();
                System.out.println(guide+": "+npc.shroomEnd(userAnswer));
                if (userAnswer.equals("a")){
                    proceed = false;
                }
                if (userAnswer.equals("b")){
                    userAnswer = s.nextLine();
                }
                while (!(userAnswer.equals("0"))){
                    userAnswer = s.nextLine();
                    wrong ++;
                    System.out.println(npc.answerFormatte(userAnswer, "0"));
                }
            }
            System.out.println(maze.forestForest());
            userAnswer = s.nextLine();
            System.out.println(guide+": "+npc.forestTrap(userAnswer));
            if  (userAnswer.equals("techtalk") || userAnswer.equals("tech talk")){
                end = true;
            }
            else {
                proceed = false;
            }

            if (end){
                maze.firstEndOfGame();
                proceed = false;

            }
        }
    }
}


