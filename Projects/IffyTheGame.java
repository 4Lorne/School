import java.util.Scanner;
import java.util.Random;

public class IffyTheGame {
	public static void main(String[] args) {
		// Setup to read terminal input
		Scanner scanner = new Scanner(System.in);
		Player player = new Player();
		Random rand = new Random();
		// Takes in users name
		System.out.print("What is your name? \nName: ");
		String name = scanner.nextLine();
		player.setName(name);
		int energy = player.getEnergy();
		int hp = player.getHP();
		// Prints HP and Energy at the start
		System.out.print("Your current HP is: ");
		player.printHP(hp);
		System.out.print("Your current energy is: ");
		player.printEnergy(energy);
		System.out.println(
				"You wake up at the entrance of a strange cave. Do you turn around and leave, or venture deeper inside?");
		System.out.println("1.Turn around and leave. \n2.Venture deeper inside");
		int choice = scanner.nextInt();
		// First ending
		if (choice == 1) {
			System.out.println("You leave and live happily ever after.");
			System.exit(0);
		} else if (choice == 2) {
			System.out.println("You decide to enter the cave. Rocks tumble and block the way you came.");
			System.out.println("You lose 1 energy.");
			player.loseEnergy(energy);
			energy = player.getEnergy();
			player.printEnergy(energy);
		}

		System.out.println(
				"You notice two mushrooms of similar shape and color on the ground. Do you pick the left one, the right one, or neither?");
		String shroomChoice = scanner.next();
		// Second ending
		if (shroomChoice.equals("left")) {
			System.out.println("After injesting the mushroom, your throat closes and you collapse.");
			player.getKilled(hp);
		} else if (shroomChoice.equals("right")) {
			System.out.println("After injesting the mushroom, you feel nourished.");
			player.gainEnergy(energy);
			energy = player.getEnergy();
			player.printEnergy(energy);
		} else if (shroomChoice.equals("neither")) {
			System.out.println("You decide not to take the risk and venture deeper inside");
			player.loseEnergy(energy);
			energy = player.getEnergy();
			player.printEnergy(energy);
		}

		System.out.print("After walking a little further you come across a creature. Upon closer inspection it is a ");
		// Third ending

		if (rand.nextInt(1, 3) == 1) {
			System.out.print("scorpion! It hops on your arm and stings you! ");
			System.out.println("You quickly lose health as you tumble deeper into the cavern.");
			player.printHP(hp);
			while (player.getHP() != 0) {
				player.takeDamage(hp);
				hp = player.getHP();
				player.printHP(hp);
			}
			player.getKilled(hp);
		}

		if (rand.nextInt(1, 3) == 2) {
			System.out.print("frog! It hops on your head and accompanies you deeper into the cave.");
		}

		player.loseEnergy(energy);
		energy = player.getEnergy();
		player.printEnergy(energy);

		System.out.println("A three way intersection appears in front of you. Which way will you go?");
		System.out.println("1, 2, or 3");
		choice = scanner.nextInt();
		// Fourth ending
		if (choice == 1) {
			System.out.println(
					"As you begin your exploration of the first intersection, the ground beneath you crumbles and you fall into an unescapable pit.");
			System.out.println(
					"Your frog companion hops off your head just before you fall, landing safely on the ridge.");
			System.out.println("You contemplate your life choices as you slowly starve to death.");
			while (player.getEnergy() != 0) {
				player.loseEnergy(energy);
				energy = player.getEnergy();
				player.printEnergy(energy);
			}
			player.getKilledE(energy);
		}
		if (choice == 2) {
			System.out.println(
					"As you enter the second intersection, you realise it quickly merges with the third intersection.");
			player.loseEnergy(energy);
			energy = player.getEnergy();
			player.printEnergy(energy);
		}
		if (choice == 3) {
			System.out.println(
					"As you enter the third intersection, you realise it quickly merges with the second intersection.");
			player.loseEnergy(energy);
			energy = player.getEnergy();
			player.printEnergy(energy);
		}
		System.out.println("You come accross a mining encampment. There are pickaxes and canned foods.");
		System.out.println("Do you want to take a pickaxe and leave this cave? Yes or No? ");
		String leaveChoice = scanner.next();
		// Fifth ending
		if (leaveChoice.equals("Yes")) {
			System.out.println("You take the pickaxe and head back the way you came.");
			System.exit(0);
		}
		if (leaveChoice.equals("No")) {
			System.out.println("You salvage some canned goods and continue onwards with your newly aquired pickaxe.");
			player.gainEnergy(energy);
			energy = player.getEnergy();
			player.printEnergy(energy);
		}
		System.out.println("After walking for a while it seems you have passed the same markings before.");
		System.out.println("Break the wall with your pickaxe? Yes or No? ");
		leaveChoice = scanner.next();
		// Sixth ending
		if (leaveChoice.equals("Yes")) {
			System.out.println("You break the wall and cause the whole tunnel to collapse.");
			player.getKilled(hp);
		}
		if (leaveChoice.equals("No")) {
			System.out.println("It was all in your head. After walking a bit further you come upon an opening.");
			player.loseEnergy(energy);
			energy = player.getEnergy();
			player.printEnergy(energy);
		}
		System.out.println("A natural spring is in front of you. Would you like to get in? Yes or No");
		leaveChoice = scanner.next();
		// Seventh ending
		if (leaveChoice.equals("Yes")) {
			System.out.println(
					"As you immerse yourself, a stinging sensation starts. You realise it is not a spring but an acid pool!");
			player.getKilled(hp);
		}
		if (leaveChoice.equals("No")) {
			System.out.println("You decide against it and continue on your way.");
			player.loseEnergy(energy);
			energy = player.getEnergy();
			player.printEnergy(energy);
		}
		System.out.println("The thought of treasure drives you forward, but hunger pain starts to sink in.");
		player.loseEnergy(energy);
		energy = player.getEnergy();
		player.printEnergy(energy);
		System.out.println("You descend countless stairs before arriving to your destination.");
		player.loseEnergy(energy);
		energy = player.getEnergy();
		player.printEnergy(energy);
		System.out.println(
				"A large ornate door stands in front of you. There are two switches in front of you, which will you choose? 1 or 2 ");
		int doorChoice = scanner.nextInt();
		// Eight and Ninth Ending
		if (doorChoice == 1) {
			System.out.println("The large door opens to a bright room filled with treasures and a throne.");
			System.out.println("You sit upon the throne, as you starve to death.");
			player.loseEnergy(energy);
			energy = player.getEnergy();
			player.printEnergy(energy);
			player.getKilledE(energy);
		}
		if (doorChoice == 2) {
			System.out.println(
					"The ground beneath you shakes and a large boulder falls from the ceiling. This is the end.");
			player.getKilled(hp);
		}

	}

	public static class Player {
		int hp = 10;
		int energy = 5;
		String name = "";

		void takeDamage(int hp) {
			this.hp = hp - 1;
		}

		void gainEnergy(int energy) {
			this.energy = energy + 1;
		}

		void loseEnergy(int energy) {
			this.energy = energy - 1;
		}

		void printEnergy(int energy) {
			System.out.print("You have " + energy + " energy remaining.");
			System.out.print("\n");
		}

		void printHP(int hp) {
			System.out.print("You have " + hp + " hp remaining.");
			System.out.print("\n");
		}

		void getKilled(int hp) {
			hp = 0;
			System.out.print("You have died.");
			System.exit(0);
		}

		void getKilledE(int energy) {
			energy = 0;
			System.out.print("You have died.");
			System.exit(0);
		}
		//Getters and setters

		public int getEnergy() {
			return energy;
		}

		public void setEnergy(int energy) {
			this.energy = energy;
		}

		public int getHP() {
			return hp;
		}

		public void setHP(int hp) {
			this.hp = hp;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}
}
