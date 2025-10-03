package GymBehavior;

import java.util.Random;

public class BladeArt extends TrainingNarration {

    boolean firstTraining1 = true;

    String[] notSucess1 = {
            "You swing - too slow. Parried.",
            "You try again - off balance. Countered.",
            "Strike after strike, you're pushed back, your form faltering with each blow.",  
            "Finally, the instructor raises a hand.",
            "\"Enough. You're not ready yet,\" they say firmly, though not unkindly.", 
            "\"Focus. Train your instincts as much as your blade.\"",
            "You lower your sword, chest heaving.",
            "Defeated - but not broken. There's still time to improve."
        };

    String[] ifSuccess1 = {
            "Finally, your blade lands a clean hit.",
            "\"Not bad,\" the instructor says, offering a nod. \"You're learning.\"",
            "You feel the burn in your arms - but also a spark of pride."
        };
    

    public void bladeArt(){
        Random random = new Random();

        while(firstTraining1){

            trainingNarration1();

            int chanceOfWin = random.nextInt();

            if(chanceOfWin % 2 == 0){
                playGymNarration(ifSuccess1);
            } else if(chanceOfWin % 2 != 0){
                playGymNarration(notSucess1);
            }

            firstTraining1 = false;
        }

    }

}
