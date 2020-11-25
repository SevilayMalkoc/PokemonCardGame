package pokemon.card.game;

public class Bulbasaur extends Pokemon
{

	private int hasarPuani = 50;
	public Bulbasaur() {
		super("Bulbasaur", 2, "Cim");
	}
	@Override
	public int getHasarPuani() {
		return hasarPuani;
	}
	
	@Override
	public int getHasarPuaniGoster() {
		// TODO Auto-generated method stub
		return 0;
	}	
}
