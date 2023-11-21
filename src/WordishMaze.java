import java.util.Objects;
import java.util.Random;

/**nad
 * The WordishMaze class is represented by WordishMaze. WordishMaze is a game program with guide from MazeCharacters,
 * tires to solve the puzzles, and the amount of hints the player requestsed
 * */

public class WordishMaze {
    private MazeCharacters guide;

    private int tries;
    private int hints;

    Random r = new Random();

    /**
     * Constructor for the WordishMaze class. This creates a new instance of a WordishMaze given
     * the below parameters.
     *
     * @param guide represents the name of the guide from MazeCharacters
     * @param tries represents the number of tries the player use to solve the riddles to reach an ending
     * @param hints represents the number of hints the person requested in totsl to reach an ending.
     */

    public WordishMaze(MazeCharacters guide, int tries, int hints){

        this.guide = guide;
        this.tries = tries;
        this.hints = hints;
    }

    /**
     * The updatetries method will update the amount of tries that the player use during their game to the class
     * The tries corresponds with the variable wrong in the Runner class
     *
     * @param tries an integer representing the amount of tries the user had done to solve one riddle
     */

    public void updatetries (int tries){
        tries = this.tries;
    }
    /**
     * The updatehint method will update the amount of hint that the player requested to solve one riddle
     * The hints corresponds with the variavle hint in the runner class
     *
     * @param hints an interger representing the amount of tries the user had requested to solve one riddle
     */
    public void updatehint (int hints){
        hints = this.hints;
    }

    /**
     * The introduction method is the first text that the player will see when they starts the game sets the background spookiness to the game.
     * @returns the formatted text block of the introduction to the game.
     */

    public String introduction(){
        return """
              \nThe rumors about the forest at the edge of the town is spreading.
              You've heard little kids fantasying about what's hidden in there, and the possible adventures.
              "adventure" now days only scare you. Since you've gotten sick of the unknown after exploring one perticular place.
              \n
              
              You've been parparing for weeks for this, as a self-credited advanturer, you sure as hell wouldn't want to miss this 
              amazing opportunity to explore, and possibly get rich, so you marched straight to the entrance.
              WELCOME! to the forest of hidden words and fun.
              Do you want in? (y for yes, n for no).""";
    }

    /**
     * The method guideSpook calls the getName method of the guide from the MazeCharacters class.
     * @returns an formatted text block with an information from the MazeCharacters class
     */
    public String guideSpook(){
        return """
                You walk peacefully in the forest, the green and undisturbed envireonment is quite pretty. But it sure gets boring with this none changing scene
                Suddenly something moving in the bushes catch your attention. 
                an ____ jumps out
                """ + guide.getName() + """
                
                Yes an  """ + guide.getName() + """
                 jumps out and spooked you. 
                They say that they know this forest the best, and wiil be extremely happy to lead you through
                and you thought, why not? you are already bored of being alone anyways.
                """;
    }

    /**
     * the method growthStud calls the introduction method of the guide, and it also calls for the first data in the classicRiddle Array of the guide.
     * Both of which is from the MazeCharacters class
     * @return a formatted text block with the guide's introduction and the first riddle of the game!
     */
    public String growthStud(){
        return guide.introdution() + """
              \nYou've reached the growthStud; a place for every newly arrived beings to the forest. They are provided with riddles and questions
              
              You spot an cottonwood sign growing out of the dark glittering ground, before you could think further. The writings grabbed your attention
              While you are reading, the view around you begin to change, you feel like you are being watched by many many eyes. (enter "h" for hints for the puzzle)
             
              """ + guide.classicRiddle[0];
    }

    /**
     * The method microShroom contains a text block of the information for the player's choices of if they choose to continue on the main path, or to run stray
     * @returns an formatted text block, nothing special about this one, but it's presented with a choice. So it is indeed special.
     */
    public String microShroom(){
        return """
              Congrats on solving the riddle. The answer is "star". Lets continue on!
              To the cutest place ever! The MicroShroom's
              we've arrived at your next destination. The MicroShrooms, please be aware of yourself at all times. The residences here are usually very nice
              Don't hurt any of the Shrooms, they are under The Mother's protection.
              \n Honestly you are not sure of this Shroomly place.... "run" to try to run away, or "follow" to continue following your guide.""";
    }

    /**
     * This method shroomChoices takes in a string as an parameter, which the return value are different based on what the string is.
     * @param choices an String representing the choice that the user made in regardes to the question preseted in microShroom
     * @return This method's return is based on what the parameter is. For one answer, the player is led to an early ending, and for the other answer, the user is led to another question choice
     */

    public String shroomChoices(String choices){
        if (choices.equals("follow")) {
            return """
                       you follow your guide to a rather huge shroom, It gives you a offer to either
                       a. PLAY wth the srooms
                       b. Answer the riddle      
                       """;
        }
        if ( choices.equals("run")){
            return """
                    You spaced out during the introduction's of the place, the forest seems all weird and disgusting. So, when you see your guide looking too closely at a mushroom
                    You booked it. Doesn't care of any showrooms along the way. You thought you heard the sound of someone calling you. But you don't care, all you could think of is to LEAVE.
                   """;
        }
        return choices;
    }

    /**
     * This method shroomEnd takes in a string as a parameter, base on what the string is, this mathod returns different values
     * @param choices an String representing the player's choice to the question presented in shroomChoices if they choose the answer choice "follow"
     * @return returns the ewsults of the two choices of the user. For answer choice B, the user would also need to solce an riddle to continue.
     */
    public String shroomEnd(String choices){
        String word = "";
        if (choices.equals("a")){
            word = """
                   you didn't realize how long has passed by
                   didn't hear the sound of someone calling you to leave
                   you don't know when you started to forget the feeling of being able to feel things
                   BUT IT DOESN'T MATTER
                   you are with THE MOTHER SPORE, you are part of the hivemind, and that's all you need to know
                   \n--------------------------------------
                   -END. (you've lost your ability to think clearly, and you are too weak to fight against MOTHER SPORE. Next time, try another root)
                   """;}
        if (choices.equals("b")){
            word = "riddle time!" + guide.oddDifference[0];
        }
        return word;
    }

    /**
     * This method forestForest contains two text block separated by the calling of a Array from guide of the MazeCharacter's clas
     * @returns two formatted text block with an riddle in the middle separating the two.
     */
    public String forestForest(){
        return """
               Thank you for following on with me :D
               I always forgot how beautiful the microShroom could be, too bad we didn't meet Mother Spore today
               Let's see.. The next step would be Forest Tree, just like the growthStud, this is not any ordinary tree either. This tree has been here longer than this forest
               and since this would be the last stop before we have to send you back
               I don't WANT to sent you back, we rarely get visitors like you...
               Oh look! there's the Forest Tree
              
               The Forest offers one puzzle per day, and it's all different each time! let's see what's today's""" + guide.classicRiddle[1]
                + """
                   Wait! I've never see this one before!
                   ~
                   ~
                   ~
                   The forest trap suddenly shrink, the leafs that you previously could easily use as blankets are now the size of palm.
                   The tree is now only a few feets taller than you.
                   ~
                   A leaf quickly turn yellow, somehow you know you have to finish this last puzzle.
                   Quickly as well, it only seems there's time for only 1 try
                   """;
    }

    /**
     * This method, forestTrap takes one string as parameter, based on what the answer is, the answer returned will be different
     * @param answer an String representing the player's input, which is their answer to the riddle
     * @returns an string, the string returns differently based on what the player inputted as their answer
     */
    public String forestTrap(String answer){
        String word = "";
        if (answer.equals("1") || answer.equals("one")){
            word = word + """
                       Your vision blurred, it seems that everything is all back to normal. You are congratulated on your ability to solve the riddles.
                       """;
        }
        else {return "you sadly had failed to solve the riddle. The leaves on the forest tree had turn all yellow. " +
                "End. (Thank You for playing!) ";}
        return word;
    }

    /**
     * This method toString_ takes both the hints and tries and format them in a string
     * @return the formatted string of hint's and tries
     */

    public String toString_(){
        return "This is one of the ending, it tooked you " + hints + " hints and "+ tries + " tries to get to this ending";
    }

    /**
     * This method answerFormat takes in four String parameters, it's purpose is to see if the user get an riddle correctly or not.
     * @param userinput an String what the user inputted as the answer of the riddle
     * @param correctAnswer an String representing the correct answer of the riddle
     * @param correct2 an String representing the second correct answer
     * @param correct3 an String representing the third correct answer
     * @returns an String, indicating the user whether they get the answer of the riddle correctly or not
     */
    public String answerFormat(String userinput, String correctAnswer, String correct2, String correct3 ) {
        String[] wrong = {"Nope, Maybe try again?","It's wronged","Behhh, incorrect", "Nah","This is not an answer choice", ""};
        if (Objects.equals(userinput, correctAnswer) || (userinput.equals(correct2)) || (userinput.equals(correct3))) {
            return wrong[r.nextInt(wrong.length)];
        } else {
            return "Nope, Maybe try again?";
        }
    }

}


