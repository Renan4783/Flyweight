package br.unicentro.acaddecomp;

import java.util.*;

public class FlyweightFactory {
	HashMap<Character, Character> map = new HashMap<>();
	
	public Character getCharacter(char key) {
		if (map.containsValue(key)) {
			return map.get(key);
		} else {
			map = new HashMap<>();
			if (key == 'A'){
				map.put(new CharacterA(), new CharacterA());
				return new CharacterA();
			} else if (key == 'B'){
				map.put(new CharacterB(), new CharacterB());
				return new CharacterB();
			} else {
				map.put(new CharacterC(), new CharacterC());
				return new CharacterC();
			}
		}
	}
}
