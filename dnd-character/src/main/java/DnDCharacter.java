import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

class DnDCharacter {

    //Method sorts list of 4 scores, drops lowest, sums the rest;
    int ability(List<Integer> scores) {
        ArrayList<Integer> scoresAsArrayList = new ArrayList<Integer>(scores);
        Collections.sort(scoresAsArrayList);
        scoresAsArrayList.removeFirst();

        int sum = 0;
        for (int score : scoresAsArrayList) {
            sum += score;
        }

        return sum;
    }

    //Gets random numbers, adds to a list
    List<Integer> rollDice() {
        List<Integer> diceRolls = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            Random randomNumber = new Random();
            int randomInt = randomNumber.nextInt(6) + 1;
            diceRolls.add(randomInt);
        }
        return diceRolls;
    }

    int modifier(int input) {

        double beforeRound = (double) (input - 10) / 2;
        return (int) Math.floor(beforeRound);
    }

    int getStrength() {
        return ability(rollDice());
    }

    int getDexterity() {
        return ability(rollDice());
    }

    int getConstitution() {
        return ability(rollDice());
    }

    int getIntelligence() {
        return ability(rollDice());
    }

    int getWisdom() {
        return ability(rollDice());
    }

    int getCharisma() {
        return ability(rollDice());
    }

    int getHitpoints() {
        return modifier(getConstitution()) + 10;


    }
}
