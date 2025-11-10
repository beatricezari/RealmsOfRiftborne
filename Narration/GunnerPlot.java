package Narration;

import java.util.Scanner;
import DesignRelated.IntroTitle;

public class GunnerPlot {
    
    private Scanner scanner = new Scanner(System.in);

    public void gunnerAfterArea1() { // implemented

        String[] afterArea1Narration2 = {
            "Narration: After the dust of battle settles, you walk through the smoldering remains of the district.\nYour gun barrels still warm, adrenaline coursing, you sense that the skirmish was more than a simple ambush.\nShadows linger, whispering secrets just out of reach.\nSuddenly, the principal's voice echoes through the academy comms.",
            "Principal: \"Impressive work, Aria. I knew you could handle Area 1. But listen carefully-\"",
            "Aria: \"The chaos you faced wasn't random. A rogue faction is trying to seize the Morvain Catalyst.\"",
            "Principal: \"I trusted you to stop them, and you did. But I must warn you... the artifact is far too dangerous.\nFor now, its power must remain sealed within the vaults of Mystvale Academy. You must not pursue it further.\"",
            "Aria: \"Wait... so all this fighting was just to stop some thieves? I thought the city itself was at risk.\"",
            "Principal: \"Oh, it was at risk, yes - but only from opportunists, not from me or my council. You've done exactly as needed.\"",
            "Aria: \"I see... I guess I'll trust your judgment for now.\"",
            "Principal: \"Good. Rest, Aria. The Reverie's Edge will demand even sharper focus, but remember — what you think is true may not be the whole story.\"",
            "Narration: You lower your weapon, uneasy. The principal's words feel strangely rehearsed, but no trace of lies is visible yet.\nSomething about the way he frames the fight gnaws at you.\nYou can't shake the feeling that the Morvain Catalyst is more than a mere relic — and that the principal may be hiding more than he admits.",
            "Narration: With the rogue faction stopped and the Morvain Catalyst secured, the academy's systems acknowledge your skill.\nA signal opens the access gates to The Reverie's Edge. You are now eligible to enter, ready for the next challenge that awaits beyond."
        };

        gunnerPlotNarration(afterArea1Narration2);

    }


    public void gunnerAfterArea2() { // implemented

        String[] afterArea2Narration2 = { 
            "You rest in the shadowed corner of a crumbling alley, cleaning your gun. The echoes of the day\'s battle still resonate in your mind.\nA soft, ethereal glow appears beside you — a familiar presence you have come to trust. The Louraine hovers, silent for a moment, observing you.",
            "Louraine: \"You fought well today, Aria. But I sense your mind is restless. What weighs on you?\"",
            "Aria: \"Ah, it\'s nothing. Just... the usual mess of thieves and ambushes. The principal\'s plan seems straightforward enough.\"",
            "Louraine: \"Straightforward? You truly believe that, do you?\"",
            "Aria: \"I said nothing. I\'m just following orders. The Morvain Catalyst\'s power is secure, and the city is safe... as far as I know.\"",
            "Louraine: \"You tread carefully, pretending ignorance,\nbut the truth is written in the shadows of those who pull the strings.\nThe principal... he is not as neutral as he appears.\"",
            "Aria: \"Is that so? I thought his concern was only for the artifact\'s safety.\"",
            "Louraine: \"Safety? Or power? The Catalyst is not merely a treasure - it is influence, leverage, a tool to bend politics to one\'s will.\nThe principal\'s guidance is a veil; beneath it, he watches, tests, and manipulates.\nYour fight today may have served more than one purpose.\"",
            "Aria: \"Interesting... if true, I\'ll have to be careful. But until there\'s proof, I follow the path laid before me.\"",
            "Louraine: \"Be wary, Aria. The threads of deception are tight, and those who claim to lead may be steering you into their own designs.\nThe answers you seek will not come easily... but the Forsaken Lands will show you more than whispers ever could.\"",
            "Narration: The spirit fades into the night, leaving you alone with your own thoughts.\nYour calm demeanor masks a mind racing with questions: How much of the battle was orchestrated?\nHow deep does the principal\'s hand reach? And most importantly - what is the true purpose behind the Morvain Catalyst?"
        };

        gunnerPlotNarration(afterArea2Narration2);

        System.out.println("┌─────────────────────────────────────────────────────────────┐");
        System.out.println("|   You are asked to be summoned to the Principal's office.   |");
        System.out.println("└─────────────────────────────────────────────────────────────┘");
        System.out.println("Press ENTER to continue");
        scanner.nextLine();
    }

    public void gunnerDuringArea3() { // revised with artifact focus
        String[] duringArea3Narration2 = {
            "The chamber is silent except for the pulsing of the Morvain Catalyst\'s energy. You step closer.\nIts crimson glow intensifies, wrapping the room in a cold, sinister light.",
            "Kim Morvain: \"Ah... there you are. Thinking yourself clever, yet blind to the strings you follow.\"",
            "Aria: \"I know nothing. Just following the principal\'s orders.\"",
            "Kim Morvain: \"Don\'t play dumb. He never was your ally. Every battle, every challenge — including the Forest of Reverie and the Reverie\'s Edge - was a test. He wanted to see if you could wield what is mine.\"",
            "Aria: \"So... I was being tested?\"",
            "Kim Morvain: \"Tested, yes... but also deceived. He seeks my creation, not the city\'s safety.\nAnd you? He needs to know if you\'re a threat - or a tool.\nHe will never defeat me. So, what makes you think that you can?\"",
            "Aria: \"He underestimates me,\" Aria mutters.",
            "Kim Morvain: \"Exactly. His arrogance blinds him. But now, you know the truth: the path to the principal runs through me.\"",
            "Narration: The chamber grows colder. Betrayal presses down.\nThe Forest of Reverie, the whispers of the wandering spirit, the manipulated factions - everything was orchestrated.\nThe Morvain Catalyst glows as if alive, measuring your resolve.\nYou lift your gun. Every lie, every trial, every step fuels a single clarity: you will no longer be a pawn.\nFirst, you must face Kim Morvain. Only after will the principal\'s veil be lifted - and the hunt truly begin."
        };

        gunnerPlotNarration(duringArea3Narration2);
    }

    public void gunnerAfterArea3() { // unchanged except artifact naming
        String[] afterArea3Narration2 = {
            "Narration: You sit on the edge of a crumbling balcony, the city lights flickering below.\nThe wind carries the distant sounds of unrest, but here, time feels suspended.\nA soft glow materializes beside you - Louraine.",
            "Louraine: \"You\'ve seen the truth, Aria,\" the spirit says quietly.\n\"The principal\'s plans... his manipulations... they run deeper than you realize.\"",
            "Aria: \"I know,\" you murmur, fists tightening. \"Every step I took, every fight... it feels like he was controlling it all.\"",
            "Louraine: \"And now, you face the question that shadows every choice: do you strike back, or wait?\" the spirit continues.\n\"The path of vengeance is tempting, but the consequences... they are heavy. Too much can be lost.\"",
            "Aria: \"I... I don\'t know,\" you admit. \"Part of me wants justice, but another part wonders if I\'m just becoming what I despise.\"",
            "Louraine: \"That doubt is your strength,\" the spirit replies.\n\"It keeps you from acting rashly. Think carefully, Aria.\nThe wrong move could change everything - not just for you, but for those you care for, and for the city itself.\"",
            "Narration: You lean back, staring at the horizon. The spirit\'s glow pulses gently,\nas if urging patience, whispering that clarity comes before action."
        };

        gunnerPlotNarration(afterArea3Narration2);

        System.out.println("┌─────────────────────────────────────────────────────────────┐");
        System.out.println("|   You are asked to be summoned to the Principal's office.   |");
        System.out.println("└─────────────────────────────────────────────────────────────┘");
        System.out.println("Press ENTER to continue");
        scanner.nextLine();
    }

    public void gunnerPrincipalDeath() { // minor polish
        String[] principalDeathNarration2 = {
            "Narration: The office lies in ruin. Papers scatter across the floor, glass crunches under your boots.\nThe principal stands near the broken window, calm even as blood runs down his cheek.",
            "Aria: \"You used me,\" you state coldly, gun raised.",
            "Principal: \"Used you?\" the principal scoffs.\n\"I gave you purpose. Without me, you\'d still be lost - another pawn crushed by this city\'s rot.\"",
            "Aria: \"You built that rot!\" you snap. \"You turned Mystvale into your stage!\"",
            "Narration: The principal\'s smirk fades into something weary.",
            "Principal: \"And if you kill me? What changes? The council replaces me.\nThe people crave another tyrant. You think one bullet will free this world from itself?\"",
            "Narration: You hesitate. The silence is thick.",
            "Principal: \"You\'ve seen it,\" the principal continues.\n\"The hunger, the greed, the endless cycle.\nYou kill me - you join it.\nYou walk away - you drown in it. Either way, you\'re part of this misery.\"",
            "Narration: The Morvain Catalyst glows faintly on your arm as you steady your aim.",
            "Principal: \"So tell me, Aria,\" the principal murmurs,\n\"will you live in this broken world... or end it, starting with me?\""
        };

        gunnerPlotNarration(principalDeathNarration2);
    }

    public void gunnerAfterDeath() { // unchanged
        String[] afterDeathNarration2 = {
            "Narration: You blink and the world comes back into focus.\nThe sterile, echoing halls of the academy vanish.\nInstead, you\'re lying on the floor of your room.\nSunlight streams through the window, and the distant hum of the city reaches your ears.\nAria is there too, standing silently beside you, bloodied and worn, but very much alive.",
            "Aria: \"You... you\'re awake,\" he says quietly. \"You escaped the academy dimension.\nThis world... this is real. The choices there - they were a test, but what you feel, the lessons - they stay with you.\"",
            "Narration: You push yourself up, still shaking.",
            "You: \"So everything... the battles, the principal... it wasn\'t real?\"",
            "Aria: \"Not in the physical sense, but the truth was.\nThe principal, the manipulations... they were meant to show you how power corrupts,\nhow society bends people into the machinery of control.\nThe cruelty, the cycles - it exists here too. You saw it in yourself, in me.\"",
            "Narration: You swallow hard, looking around your room, at the ordinary streets outside your window.",
            "You: \"And you? What did you learn there?\"",
            "Aria: \"I acted. I thought I could change things... but I realized I was becoming part of the system.\nThat\'s why you\'re awake now. You get a chance to live in the real world,\nand maybe make different choices — without letting it consume you.\"",
            "Narration: You nod slowly, letting the sunlight warm your face.\nThe city stretches beyond the window, indifferent yet alive.\nYou realize the stakes aren\'t just survival — they\'re how you choose to exist in a world that doesn\'t care whether you rise or fall."
        };

        gunnerPlotNarration(afterDeathNarration2);
    }

    public void gunnerCycle() { // polished artifact mention
        String[] acceptingFate2 = {
            "Narration: You lower the gun, hands trembling slightly.\nThe office feels colder now, shadows stretching like the endless cycle outside.\nThe principal watches you carefully, an almost imperceptible smirk on his bloodied face.",
            "Principal: \"You\'ve made your choice,\" he says softly.\n\"It seems the world has claimed you, Aria.\nYou want justice... but the chains of this society are heavier than one man.\"",
            "Narration: You exhale, staring at the scattered papers, the broken glass, the city lights beyond the window.",
            "Aria: \"I... I can\'t become like you,\" you whisper. \"Even if it means letting you live... I can\'t lose myself.\"",
            "Narration: The principal nods slowly, as though expecting this.",
            "Principal: \"Then you understand now,\" he says.\n\"You are part of it. Part of this cruel, endless system.\nYou can resist it, fight it... but you cannot escape it. Not completely.\"",
            "Narration: You swallow, the weight of your decision pressing down.\nEvery choice, every step through Mystvale,\nevery battle - it has all been part of the game, and now you see that you cannot stand apart from it.\nThe Morvain Catalyst pulses faintly along your arm, a reminder that power and responsibility are inseparable.\nYou turn away from the principal, knowing the world will demand more from you... and that you are, inevitably, a piece of its machinery."
        };

        gunnerPlotNarration(acceptingFate2);
    }

    public void gunnerEndingPlot() {
        IntroTitle outroHandler = new IntroTitle();
        gunnerPrincipalDeath();

        boolean validChoice = false;

        while (!validChoice) {
            System.out.println("┌───────────────────────────────────────────────────────────────┐");
            System.out.println("│   Do you take control, aiming to end the cycle at any cost,   │");
            System.out.println("│    or step aside and let the past claim the future? (y/n)     │");
            System.out.println("└───────────────────────────────────────────────────────────────┘");


            try {
                String endSystem = scanner.nextLine().trim();

                if (endSystem.equalsIgnoreCase("y")) {
                    System.out.println("┌─────────────────────────────────────────┐");
                    System.out.println("│   You have chosen to end the system...  │");
                    System.out.println("└─────────────────────────────────────────┘");

                    gunnerAfterDeath();
                    validChoice = true;
                } else if (endSystem.equalsIgnoreCase("n")) {
                    System.out.println("┌─────────────────────────────────────────┐");
                    System.out.println("│   You choose to continue the cycle...   │");
                    System.out.println("└─────────────────────────────────────────┘");

                    gunnerCycle();
                    validChoice = true;
                } else {
                    System.out.println();
                    System.out.println("┌────────────────────────────────────────┐");
                    System.out.println("│   Choice unclear! Enter 'y' or 'n'.    │");
                    System.out.println("└────────────────────────────────────────┘");
                }

            } catch (Exception e) {
                System.out.println();
                System.out.println("┌──────────────────────────────────────────────┐");
                System.out.println("│   An unexpected error occurred. Try again.   │");
                System.out.println("└──────────────────────────────────────────────┘");
                scanner.nextLine();
            }
        }

        outroHandler.outroGameDoneTemporary();

        System.out.println();
        System.out.println("Thank you for playing Mystvale Academy.");
        System.exit(0);
    }

    public void gunnerPlotNarration(String[] array) {
        
        System.out.println("┌─────────────────────────────────────────────────────────────┐");
        System.out.println("│ Narration Ahead! Not Skippable │ Press ENTER to continue... │");
        System.out.println("└─────────────────────────────────────────────────────────────┘");

        for (String line : array) {
            scanner.nextLine();
            System.out.println(line);
        }

        System.out.println();
    }
}
