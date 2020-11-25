package pokemon.card.game;

public class Pikachu extends Pokemon
{
	private int hasarPuani = 40;
	public Pikachu() {
		super("Pikachu", 1, "Elektrik");
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
