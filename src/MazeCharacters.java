public class MazeCharacters {
    private String name;
    private boolean goodIntentions;
    public MazeCharacters(String name, boolean goodIntentions){
        this.name = name;
        this.goodIntentions = goodIntentions;
    }


    public void changeOfMind (boolean goodIntentions){
        goodIntentions = this.goodIntentions;
    }
    public String introdution(){
        String speach = "What are You doing in this forest? anyways, i'm "+ name + " your guide(?), yeah. Personal guide.";
        speach = speach + " So, welcome to the forest! Let's give you a grand tour! first of all! The GROWTH STUD!";
        return speach;
    }


    /* Below are different riddles characterize into four main riddle group for organization and difficulty purpose. */
    String[] classicRiddle = {"Sleeps at morning, wakes at night. You don't see me, even though there's lots? I hold secrets, directions, hopes, futures. But i'm just one of many. What would I be?"/*Star*/,
            "there's an empty bucket on the floor. How many rocks is needed to change its state?"/*1, one*/
    };
    String[] crAnswer = {"star", "one"};
    String[] oddDifference = {"S0METHING had SNEAKED in THIS sentence S0PT it 0UT"/*0, zero*/,
    };
    String[] odAnswer = {"zero"};
    String[] distortedWord = {"one word is messed up. Can you fix it for us?\n Decipher the followung sentence: leddir na si siht"/*following*/,
    };
    String[] dwAnswer = {"following"};

    String[] wordWord = {"What is the Brooklyn Technical High School's equivalent of TikTok?"/*Techtalk TechTalk*/,
    };
    String[] wwAnswer = {"techtalk"};

//    String[[]] testA = {crAnswer, odAnswer}






}
