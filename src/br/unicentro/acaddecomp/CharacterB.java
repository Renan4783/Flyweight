package br.unicentro.acaddecomp;

public class CharacterB implements Character {

	private String symbol = "B";

	@Override
	public void draw(int size) {
		for (int i = 0; i < size; i++) {
			System.out.println(symbol);
		}
	}
}
