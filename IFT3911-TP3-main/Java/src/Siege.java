public class Siege {

	private String numeroReservation;
	private String rangee;
	private String colonne;
	private String noSiege;
	private Client client;
	private Float prixSiege;
	private SiegeState siegeState;

	public Client getClient() {
		return this.client;
	}

	/**
	 * 
	 * @param client
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	public Float getPrixSiege() {
		return this.prixSiege;
	}

	/**
	 * 
	 * @param prixSiege
	 */
	public void setPrixSiege(Float prixSiege) {
		this.prixSiege = prixSiege;
	}

	public SiegeState getSiegeState() {
		return this.siegeState;
	}

	/**
	 * 
	 * @param s
	 */
	public void setSiegeState(SiegeState s) {
		this.siegeState = s;
	}

}