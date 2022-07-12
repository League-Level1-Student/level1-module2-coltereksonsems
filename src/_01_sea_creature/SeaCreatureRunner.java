package _01_sea_creature;

public class SeaCreatureRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	SeaCreature seacreature1 = new SeaCreature("Spongebob");
		
		seacreature1.eat();
		seacreature1.laugh();
		
		SeaCreature seacreature2 = new SeaCreature("Patrick");
		SeaCreature seacreature3 = new SeaCreature("Squidward");
		
		seacreature2.getName();
		seacreature3.getName();
		
		seacreature2.eat();
		seacreature2.laugh();
		
		seacreature3.eat();
		seacreature3.laugh();
	}

}
