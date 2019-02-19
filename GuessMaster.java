
import java.util.Random;
import java.util.Scanner;

public class GuessMaster {
	
	private int numPeople;
	private Entity[] entities;
	
	public GuessMaster() {
		this.numPeople = 0;
		this.entities = new Entity[100];
	}
	
	public GuessMaster(int numEntities, Entity entity) {
		this.numPeople = numEntities;
		this.entities[this.numPeople] = entity;
	}
	
	public void addEntity(Entity entity) {
		this.numPeople ++;
		this.entities[this.numPeople] = entity;
	}
	
	public Entity getEntity(int entIndex) {
		return(this.entities[entIndex]);
	}
	public int getRandEntIndex() {
		Random rand = new Random();
		int randIndex = rand.nextInt(this.numPeople + 1);
		return randIndex;
	}
	public void Rules(){
		System.out.println("Welcome to GuessMaster.");
		System.out.println("You will be given the name of a person place or thing, "+
				"you must guess their birthdate.");
		System.out.println("If you guess incorrectly you will be told to guess either higher or lower. \n");
		System.out.println("You can quit the game by typing quit. \n");
		System.out.println("Press the 'Return/Enter' key when you are ready to play. \n");
		System.out.println("\n");
		
	}
	
	public void gameStart() {
		Scanner keyboard = new Scanner(System.in);
		keyboard.nextLine();
	}
	
	public void playGame(Entity entity) {
		int points = 0;
		
		String name = entity.getName();
		Date bDate = entity.getBorn();
		Date guess = new Date();
		
		this.Rules();
		this.gameStart();
		
		System.out.println("What is "+ name + "'s birthdate?");
		
		while(true) {
			guess.readInput();
			if(guess.equals(bDate)) {
				points = points + 5;
				System.out.println("Bingo, you got it!");
				System.out.println("Congratulations, you now have "+ points + " points!");
				String entBorn = entity.toString(name, bDate);
				System.out.println(entBorn);
				break;
			}
			else if(guess.precedes(bDate)) {
				System.out.println("Incorrect, try a later date. ");
			}
			else {
				System.out.println("Incorrect, try an earlier date. ");
			}
		}
	}
	
	public void playGame(int entityInd) {
		int points = 0;
		
		int randInd = getRandEntIndex();
		Entity entity = this.getEntity(randInd);
		String name = entity.getName();
		Date bDate = entity.getBorn();
		Date guess = new Date();
		
		this.Rules();
		this.gameStart();
		
		System.out.println("What is "+ name + "'s birthdate?");
		
		while(true) {
			guess.readInput();
			if(guess.equals(bDate)) {
				points = points + 5;
				System.out.println("Bingo, you got it!");
				System.out.println("Congratulations, you now have "+ points + " points!");
				String entBorn = entity.toString(name, bDate);
				System.out.println(entBorn);
				break;
			}
			else if(guess.precedes(bDate)) {
				System.out.println("Incorrect, try a later date. ");
			}
			else {
				System.out.println("Incorrect, try an earlier date. ");
			}
		}
	}
	
	public void playGame() {
		int points = 0;
		
		int randInd = getRandEntIndex();
		Entity entity = this.getEntity(randInd);
		String name = entity.getName();
		Date bDate = entity.getBorn();
		Date guess = new Date();
		
		this.Rules();
		this.gameStart();
		
		System.out.println("What is "+ name + "'s birthdate?");
		
		while(true) {
			guess.readInput();
			if(guess.equals(bDate)) {
				points = points + 5;
				System.out.println("Bingo, you got it!");
				System.out.println("Congratulations, you now have "+ points + " points!");
				String entBorn = entity.toString(name, bDate);
				System.out.println(entBorn);
				break;
			}
			else if(guess.precedes(bDate)) {
				System.out.println("Incorrect, try a later date. ");
			}
			else {
				System.out.println("Incorrect, try an earlier date. ");
			}
	}
	}
	
	public static void main(String[] args) {
        Entity trudeau = new Entity("Justin Trudeau", new Date("December", 25, 1971));
        Entity dion = new Entity("Celine Dion", new Date("March", 30, 1968));
        Entity usa = new Entity("United States", new Date("July", 4, 1776));

        GuessMaster gm = new GuessMaster();
        gm.addEntity(trudeau);
        gm.addEntity(dion);
        gm.addEntity(usa);

        gm.playGame();
	}
	
	
}
