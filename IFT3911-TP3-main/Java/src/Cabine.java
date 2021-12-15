public class Cabine {

	private String section;
	private String numeroReservation;
	private Client client;
	private Float prixCabine;
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

	public Float getPrixCabine() {
		return this.prixCabine;
	}

	/**
	 * 
	 * @param prixCabine
	 */
	public void setPrixCabine(Float prixCabine) {
		this.prixCabine = prixCabine;
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