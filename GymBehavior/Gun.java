package GymBehavior;

import java.util.Random;

public class Gun extends TrainingNarration{

    boolean firstTraining3 = true;

    String[] ifSuccess3 = {
        "Bang. Bang. Bang.",
        "Three shots, three hits - clean, precise, fast.",
        "The instructor lowers their clipboard, a trace of a smile tugging at their lips.",
        "\"Good. Your hands and eyes are finally working together.\"",
        "The weapon hums quietly in your grip, like it's pleased, too.",
        "You holster it with confidence. You're starting to feel like a real gunslinger."
    };

    String[] ifNotSuccess3 = {
        "Bang. Miss.",
        "Bang. Too slow.",
        "The instructor grimaces. \"You\'re watching the target. You need to feel where it\'s going.\"",
        "You pivot—but your next shot is wide again. Another miss.",
        "Your stance is off. Your aim, shaky.",
        "After a long moment, the instructor steps forward.",
        "\"Holster your weapon. Review your stance and breathing. Again - until it's instinct.\"",
        "You nod, jaw tight. Frustrated - but far from finished."
    };

    public void gunslingerTraining(){
        Random random = new Random();

        while(firstTraining3){

            trainingNarration3();

            int chanceOfWin = random.nextInt();

            if(chanceOfWin % 2 == 0){
                playGymNarration(ifSuccess3);
            } else if(chanceOfWin % 2 != 0){
                playGymNarration(ifNotSuccess3);
            }

            firstTraining3 = false;
        }

    }

}
