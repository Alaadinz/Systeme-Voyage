public class VoletAdmin {

	private VoletFer voletFer;
	private VoletNav voletNav;
	private VoletAer voletAer;
	private VoletClient voletClient;

	/**
	 * 
	 * @param volet
	 * @param voyage
	 * @param action
	 * @param modification
	 */
	public void commande(int volet, int voyage, int action, int modification) {
		// TODO - implement VoletAdmin.commande
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param origine
	 * @param destination
	 * @param date
	 * @param classe
	 */
	public void infoVerification(LieuTransport origine, LieuTransport destination, String date, String classe) {
		// TODO - implement VoletAdmin.infoVerification
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idVol
	 * @param preference
	 * @param classe
	 */
	public void infoReservation(String idVol, String preference, String classe) {
		// TODO - implement VoletAdmin.infoReservation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param numeroReservation
	 * @param nom
	 * @param courriel
	 * @param numeroPassport
	 * @param carteCredit
	 */
	public void infoPaiement(String numeroReservation, String nom, String courriel, String numeroPassport, String carteCredit) {
		// TODO - implement VoletAdmin.infoPaiement
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idVille
	 * @param ville
	 */
	public void createLieuTransport(String idVille, String ville) {
		// TODO - implement VoletAdmin.createLieuTransport
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
		// TODO - implement VoletAdmin.createVoyage
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idCompagnie
	 */
	public void createCompagnie(String idCompagnie) {
		// TODO - implement VoletAdmin.createCompagnie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 */
	public void deleteVoyage(String id) {
		// TODO - implement VoletAdmin.deleteVoyage
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idVille
	 */
	public void deleteLieuTransport(String idVille) {
		// TODO - implement VoletAdmin.deleteLieuTransport
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idCompagnie
	 */
	public void deleteCompagnie(String idCompagnie) {
		// TODO - implement VoletAdmin.deleteCompagnie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 */
	public Voyage getVoyage(String id) {
		// TODO - implement VoletAdmin.getVoyage
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idVille
	 */
	public LieuTransport getLieuTransport(String idVille) {
		// TODO - implement VoletAdmin.getLieuTransport
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idCompagnie
	 */
	public Compagnie getCompagnie(String idCompagnie) {
		// TODO - implement VoletAdmin.getCompagnie
		throw new UnsupportedOperationException();
	}

}