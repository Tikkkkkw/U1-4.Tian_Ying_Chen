import java.util.Objects;

public class WordishMaze {
    private String action;
    private MazeCharacters guide;


    public WordishMaze(){}
    public WordishMaze(MazeCharacters guide){
        this.guide = guide;
    }

    //    The methods are for dialogues. Each method is called when that specific dialogue is needed.
    public String introduction(){
        return """
               \nThe rumors about the forest at the edge of the town is spreading.
               You've heard little kids fantasying about what's hidden in there, and the possible adventures.
               Their "excited adventures" only scares you. Since you know whats inside the forest is more un-understandable than plain rumors.
               \nWElc0mE! to the forest of hidden words and fun.
               Do you want in? (y for yes, n for no).
               (all answers should be in lowercase)""";
    }
    public String growthStud(){
        return guide.introdution() + """
               \nYou've reached the growthStud; a place for every newly arrived beings.
               Each of the signs are specialized and different, look, I think that one is for you.
               You spot an oak sign growing out of the yellow soil ground, before you could think further. The writings grabbed your attention, it reads
               
               """ + guide.classicRiddle[0];
    }
    public String microShroom(){
        return """
               Congrats on solving the riddle. The answer is "star". Lets continue on!
               To the cutest place ever! The MicroShroom's
               we've arrived at your next destination. The MicroShrooms, please be aware of yourself at all times. The residences here are usually very nice
               Don't hurt any of the Shrooms, they are under The Mother's protection.
               \n Honestly you are not sure of this Shroomly place.... "run" to try to run away, or "follow" to continue following your guide.""";

    }

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

    public String forestForest(){
        return """
                Thank you for following on with me :D
                I always forgot how beautiful the microShroom could be, too bad we didn't meet Mother Spore today
                Let's see.. The next step would be Forest Tree, just like the growthStud, this is not any ordinary tree either. This tree has been here longer than this forest
                and since this would be the last stop before we have to send you back
                I don't WANT to sent you back, we rarely get visitors like you...
                Oh look! there's the Forest Tree
                
                The Forest offers one puzzle per day, and it's all different each time! let's see what's today's""" + guide.wordWord[0];
    }
    public String forestTrap(String answer){
        String word = """
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
            if (answer.equals("techtalk") || answer.equals("tech talk")){
                word = word + """
                        Your vision blurred, it seems that everything is all back to normal. You are congratulated on your ability to solve the riddles.
                        """;
            }
            else {return "you sadly had failed to solve the riddle. The leaves on the forest tree had turn all yellow. " +
                         "End. (Thank You for playing!) ";}
        return word;
    }

    public String firstEndOfGame(){
        return "You have left the forest. Did you enjoy the stay? Hope you had fun, and come back soon :D";
    }
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


//    This method down below is for checking the answer for the riddles and mazes.
public String answerFormatte( String userinput, String correctAnswer ){
if (userinput.equals(correctAnswer)){
//            return "Alright! let's move on \nexperience would \"hopefully\" be remembered.";
return "";
}
else {
return "Nope, wrong. Perhaps try again?";
}
}










}


