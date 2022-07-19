package _02_smurf;

public class SmurfRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smurf handy = new Smurf("Handy");
		
		handy.eat();
		System.out.println(handy.getName());
		
		Smurf papasmurf = new Smurf("papa");
		System.out.println(papasmurf.getName());
		System.out.println(papasmurf.getHatColor());
		System.out.println(papasmurf.isGirlOrBoy());
		
		Smurf smurfette = new Smurf("Smurfette");
		System.out.println(smurfette.getName());
		System.out.println(smurfette.getHatColor());
		System.out.println(smurfette.isGirlOrBoy());
	}

	
	
	
	
	
}
