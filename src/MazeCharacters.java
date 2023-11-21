/**
 * The MazeCharacters class is represented by MazeCharacters, MazeCharacters is a storyteller with name for indication
 */
public class MazeCharacters {
    private String name;

    /**
     * Constructeor for the MazeCharacters class. This creates a new instance of Mazecharacters given the parameter name
     * @param name represents the name of the storyteller
     */
    public MazeCharacters(String name){
        this.name = name;
    }

    /**
     * This method getName is to get the name of the storyteller outside this MazeCharacters class
     * @returns a String, representing the name of the storyteller
     */
    public String getName() {
        return name;
    }

    /**
     * This method introduction is a string of the storyteller's introduction
     * @returns a string organized after the player meets the storyteller/
     */
    public String introdution(){
        String speach = "What are You doing in this forest? anyways, i'm "+ name + " your personal guide!";
        speach = speach + " So, welcome to the forest! Let's go on an adventure! first of all! The GROWTH STUD!";
        return speach;
    }

    /* Below are different riddles characterize into four main riddle group for organization and difficulty purpose. */
    String[] classicRiddle = {"I Sleeps at morning, wakes at night. You don't see me alone, I'm surrounded by my peers. I hold secrets, tells directions, hear wishes. What would I be?"/*Star*/,
            "there's an empty bucket on the floor. How many rocks is needed to change its state?"/*1, one*/
    };
    String[] oddDifference = {"S0METHING had SNEAKED in THIS sentence SP0T it 0UT"/*0, zero*/,
    };
    String[] wordWord = {"What is the Brooklyn Technical High School's equivalent of TikTok?"/*Techtalk TechTalk*/,
            "one word is messed up. Can you fix it for us?\n Decipher the followung sentence: leddir na si siht"/*following*/
    };

}
