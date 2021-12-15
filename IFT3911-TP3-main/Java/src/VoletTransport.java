public abstract class VoletTransport extends Database {

	IVisitable elements;
	private LieuTransport[] listeLieuTransport;
	private Voyage[] listeVoyage;
	private Compagnie[] listeCompagnie;

	/**
	 * 
	 * @param origine
	 * @param destination
	 * @param date
	 * @param section
	 */
	public boolean verificationVoyage(LieuTransport origine, LieuTransport destination, String date, String section) {
		// TODO - implement VoletTransport.verificationVoyage
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param v
	 */
	public void accept(Visitor v) {
		// TODO - implement VoletTransport.accept
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 */
	public Voyage getVoyage(String id) {
		// TODO - implement VoletTransport.getVoyage
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idVille
	 */
	public LieuTransport getLieuTransport(String idVille) {
		// TODO - implement VoletTransport.getLieuTransport
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idCompagnie
	 */
	public Compagnie getCompagnie(String idCompagnie) {
		// TODO - implement VoletTransport.getCompagnie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 */
	public void deleteVoyage(String id) {
		// TODO - implement VoletTransport.deleteVoyage
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idVille
	 */
	public void deleteLieuTransport(String idVille) {
		// TODO - implement VoletTransport.deleteLieuTransport
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idCompagnie
	 */
	public void deleteCompagnie(String idCompagnie) {
		// TODO - implement VoletTransport.deleteCompagnie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idVille
	 * @param ville
	 */
	public void createLieuTransport(String idVille, String ville) {
		// TODO - implement VoletTransport.createLieuTransport
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param dateTempsArrive
	 * @param dateTempsDepart
	 * @param origine
	 * @param destination
	 */
	public void createVoyage(String dateTempsArrive, String dateTempsDepart, LieuTransport origine, LieuTransport destination) {
		// TODO - implement VoletTransport.createVoyage
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idCompagnie
	 */
	public void createCompagnie(String idCompagnie) {
		// TODO - implement VoletTransport.createCompagnie
		throw new UnsupportedOperationException();
	}

}