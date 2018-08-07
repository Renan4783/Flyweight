package br.unicentro.acaddecomp;

public class CharacterA implements Character{

	private String symbol = "A";
	
	@Override
	public void draw(int size) {
		for (int i=0; i<size; i++){
			System.out.println(symbol);
		}
	}

}
