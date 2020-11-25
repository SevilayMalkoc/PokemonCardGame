package pokemon.card.game;

import java.util.ArrayList;

public abstract class Oyuncu
{
	private String oyuncuAdi;
	private int oyuncuID;
	private int skor;
	protected ArrayList<Pokemon> kartListesi = new ArrayList<Pokemon>();
	
	public Oyuncu(String oyuncuAdi, int oyuncuID, int skor) {
		this.oyuncuAdi = oyuncuAdi;
		this.oyuncuID = oyuncuID;
		this.skor = skor;
	}
	
	public Oyuncu() {
		
	}
	
	public String getOyuncuAdi() {
		return oyuncuAdi;
	}
	public void setOyuncuAdi(String oyuncuAdi) {
		this.oyuncuAdi = oyuncuAdi;
	}
	public int getOyuncuID() {
		return oyuncuID;
	}
	public void setOyuncuID(int oyuncuID) {
		this.oyuncuID = oyuncuID;
	}
	public int getSkor() {
		return skor;
	}
	public void setSkor(int skor) {
		this.skor = skor;
	}
	public abstract Pokemon kartSecim();
	
	public void kartVer(Pokemon pokemon) {
		kartListesi.add(pokemon);
	}
	
	public int kartSayisi() {
		return kartListesi.size();
	}
        
        public Pokemon kartGetir(int index){
            if(index < kartListesi.size())
                return kartListesi.get(index);
            else
                return null;
        }
	
	@Override
	public String toString() {
		return "Oyuncu:" + oyuncuAdi + " Puan:" + skor;
	}
}
