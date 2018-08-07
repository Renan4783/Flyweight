package br.unicentro.acaddecomp;

public class Main {
	public static void main(String[] args) {
		String text = "AABAAB";
		FlyweightFactory factory = new FlyweightFactory();
		
		for (int i = 0; i<text.length(); i++){
			Character c = factory.getCharacter(text.charAt(i));
			c.draw(i);
		}
	}
}
