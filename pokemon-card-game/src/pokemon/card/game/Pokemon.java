package pokemon.card.game;

public abstract class Pokemon 
{
	private String pokemonAdi;
	private int pokemonID;
	private String pokemonTip;
	private Boolean kartKullanildiMi;
	
	public Pokemon(String pokemonAdi, int pokemonID, String pokemonTip) {
		this.pokemonAdi = pokemonAdi;
		this.pokemonID = pokemonID;
		this.pokemonTip = pokemonTip;
	}
	
	public Pokemon() {

	}
	
	public Boolean getKartKullanildiMi() {
		return kartKullanildiMi;
	}

	public void setKartKullanildiMi(Boolean kartKullanildiMi) {
		this.kartKullanildiMi = kartKullanildiMi;
	}
	
	public String getPokemonAdi() {
		return pokemonAdi;
	}
	public void setPokemonAdi(String pokemonAdi) {
		this.pokemonAdi = pokemonAdi;
	}
	public int getPokemonID() {
		return pokemonID;
	}
	public void setPokemonID(int pokemonID) {
		this.pokemonID = pokemonID;
	}
	public String getPokemonTip() {
		return pokemonTip;
	}
	public void setPokemonTip(String pokemonTip) {
		this.pokemonTip = pokemonTip;
	}
	
	@Override
	public String toString() {
            //https://stackoverflow.com/questions/685521/multiline-text-in-jlabel
            //html tagleri jlabel'da satır atlamak için gerekli
		return "<html>"+pokemonAdi + "<br>"+"Hasar:" + getHasarPuani()+"<br>"+pokemonTip+"</html>";
	}
	
	public abstract int getHasarPuani();
	public abstract int getHasarPuaniGoster();
}
