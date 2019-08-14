package _02_sea_creature;

public class SeaCreatureRunner {

	public static void main(String[] args) {
		SeaCreature spongebob = new SeaCreature("Spongebob");
		spongebob.eat();
		spongebob.laugh();
		SeaCreature patrick = new SeaCreature("Patrick");
		System.out.println(patrick.getName());
		patrick.eat();
		patrick.laugh();
		SeaCreature squidward = new SeaCreature("Squidward");
		System.out.println(squidward.getName());
		squidward.eat();
		squidward.laugh();
	}

}
