package pokemon.card.game;

public class InsanOyuncusu extends Oyuncu {

    private int sonrakiSecimim;

    public InsanOyuncusu(String oyuncuAdi, int oyuncuID, int skor) {
        super(oyuncuAdi, oyuncuID, skor);
        // TODO Auto-generated constructor stub
    }

    public void SonrakiSecimim(int index) {
        sonrakiSecimim = index;
    }

    @Override
    public Pokemon kartSecim() {
        int selected = sonrakiSecimim;
        Pokemon selectedCard = kartListesi.remove(selected);
        return selectedCard;
    }
}
