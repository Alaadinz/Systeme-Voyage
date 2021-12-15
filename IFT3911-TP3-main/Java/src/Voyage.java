public abstract class Voyage extends IVisitable {

	private String id;
	private String dateTempsArrive;
	private String dateTempsDepart;
	private LieuTransport origine;
	private LieuTransport destination;
	private Float prix;

	public Float getPrix() {
		return this.prix;
	}

	/**
	 * 
	 * @param prix
	 */
	public void setPrix(Float prix) {
		this.prix = prix;
	}

	/**
	 * 
	 * @param arrive
	 * @param depart
	 * @param o
	 * @param d
	 * @param p
	 */
	public void modifyVoyage(String arrive, String depart, LieuTransport o, LieuTransport d, Float p) {
		// TODO - implement Voyage.modifyVoyage
		throw new UnsupportedOperationException();
	}

	public void getInfo() {
		// TODO - implement Voyage.getInfo
		throw new UnsupportedOperationException();
	}

}