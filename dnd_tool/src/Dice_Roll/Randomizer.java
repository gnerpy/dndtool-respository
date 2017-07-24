package Dice_Roll;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Randomizer {

		int randNum;
		int numRoll;
		int diceType;
		int sum;
		List<Integer> rolls;
		 
		public Randomizer(int numRoll, int diceType){
			this.numRoll = numRoll;
			this.diceType = diceType;
			this.sum = 0;
			this.rolls = new ArrayList<Integer>();
			Random rand = new Random();
			for(int i = 0; i < numRoll; i ++) {
				randNum = rand.nextInt(diceType) + 1;
				rolls.add(randNum);
				sum = sum + randNum;
			}
		}
		
		public int getdiceRoll() {
			return this.sum;
		}
		
		public List<Integer> getrolls() {
			return this.rolls;
		}
}
