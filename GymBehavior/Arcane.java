package GymBehavior;

import java.util.Random;

public class Arcane extends TrainingNarration{

    private boolean firstTraining4 = true;

    private String[] ifSuccess4 = {
        "A spark- then a surge. Your spell bursts forward, colliding with your opponent\'s shield.",
        "They stagger. You press the advantage. One more incantation - and boom.",
        "Your opponent is thrown to the edge of the ring, groaning.",
        "The instructor nods slowly. \"You\'re learning to control the flow. Not bad.\"",
        "You feel the crackle of lingering energy in your fingertips - and pride in your chest."
    };

    private String[] ifNotSuccess4 = {
        "You cast- but the magic fizzles, unstable.",
        "Your opponent strikes. A bolt of force slams into your shoulder.",
        "Pain blooms, and your focus shatters.",
        "You try again - rushed, sloppy. Another hit knocks you back.",
        "The instructor raises a hand. The duel ends.",
        "\"You\'ve got the power,\" they say, 'but no control. That\'ll get you hurt - or worse.'",
        "You nod, winded. Magic still swirls in your chest, wild and untamed.",
        "Next time, you\'ll be ready."
    };

    public void arcaneDuel(){
        Random random = new Random();

        while(firstTraining4){

            trainingNarration4();

            int chanceOfWin = random.nextInt();

            if(chanceOfWin % 2 == 0){
                playGymNarration(ifSuccess4);
            } else if(chanceOfWin % 2 != 0){
                playGymNarration(ifNotSuccess4);
            }

            firstTraining4 = false;
        }

    }

}
