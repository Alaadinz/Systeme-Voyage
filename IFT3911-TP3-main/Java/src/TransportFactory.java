public abstract class TransportFactory {

	private TransportFactory instance;

	public TransportFactory getInstance() {
		return this.instance;
	}

	/**
	 * 
	 * @param idVille
	 * @param ville
	 */
	public LieuTransport createLieuTransport(String idVille, String ville) {
		// TODO - implement TransportFactory.createLieuTransport
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param dateTempsArrive
	 * @param dateTempsDepart
	 * @param origine
	 * @param destination
	 */
	public Voyage createVoyage(String dateTempsArrive, String dateTempsDepart, LieuTransport origine, LieuTransport destination) {
		// TODO - implement TransportFactory.createVoyage
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idCompagnie
	 */
	public Compagnie createCompagnie(String idCompagnie) {
		// TODO - implement TransportFactory.createCompagnie
		throw new UnsupportedOperationException();
	}

}