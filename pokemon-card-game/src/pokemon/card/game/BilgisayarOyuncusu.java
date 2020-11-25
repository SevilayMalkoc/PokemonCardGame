package pokemon.card.game;

import java.util.Random;

public class BilgisayarOyuncusu extends Oyuncu
{

	public BilgisayarOyuncusu(String oyuncuAdi, int oyuncuID, int skor) {
		super(oyuncuAdi, oyuncuID, skor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Pokemon kartSecim() {
		Random r = new Random();
		int selected = r.nextInt(kartListesi.size());
		Pokemon selectedCard = kartListesi.remove(selected);
		return selectedCard;
	}	
}
