package GymBehavior;

import java.util.Random;

public class Combat extends TrainingNarration{

    boolean firstTraining2 = true;

    String[] ifnotSuccess2 = {
        "You lunge in - but too slow. A hit lands hard against your ribs.",
        "You stumble, gasping, every motion a little too sluggish, a little too late.",
        "\"Keep your guard up!\" the instructor barks.",
        "You're off-balance. Another strike, this time to your shoulder.",
        "Finally, you're flat on your back, staring at the ceiling of the training hall.",
        "\"You're not there yet,\" the instructor says. \"But you will be - if you keep pushing.\"",
        "You rise. Shaken, but not quitting."
    };

    String[] ifSuccess2 = {
        "Your body moves on instinct now - duck, pivot, strike.",
        "A solid blow lands. Your partner stumbles back, hands up in surrender.",
        "The instructor nods once. \"You're getting faster. Stronger.\"",
        "You wipe the sweat from your brow, heart pounding - but steady.",
        "Progress. Hard - earned and real."
    };

    public void combatConditioning(){
        Random random = new Random();

        while(firstTraining2){

            trainingNarration2();

            int chanceOfWin = random.nextInt();

            if(chanceOfWin % 2 == 0){
                playGymNarration(ifSuccess2);
            } else if(chanceOfWin % 2 != 0){
                playGymNarration(ifnotSuccess2);
            }

            firstTraining2 = false;
        }

    }

}
