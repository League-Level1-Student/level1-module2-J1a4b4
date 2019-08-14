package _01_getters_and_setters;

public class IntroToGettersAndSetters02Runner {

	public static void main(String[] args) {
		IntroToGettersAndSetters02 x = new IntroToGettersAndSetters02();
		x.setName("Alex");
		x.setSkill("writing");
		System.out.println(x.toStringII());
		IntroToGettersAndSetters02 y = new IntroToGettersAndSetters02();
		y.setName("Bob");
		y.setSkill("drawing");
		System.out.println(y.toStringII());
		IntroToGettersAndSetters02 z = new IntroToGettersAndSetters02();
		z.setName("Charlie");
		z.setSkill("coding");
		System.out.println(z.toStringII());
	}

}
