import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemeFacade extends Observer {

    private VoletAdmin voletAdmin;
    private VoletClient voletClient;

    public void run() throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
		while (true){
        // Reading data using readLine
        System.out.println(
                "Bienvenue dans le Système de Réservation de Voyages\n" +
                        "Veuillez choisir le volet voulu en entrant le chiffre :\n" +
                        "1. Volet administratif\n" +
                        "2. Volet client");
        String choix = reader.readLine();
        switch (choix) {
            case "1":
                System.out.println(
                        "Veuillez choisir le voyage voulu en entrant le chiffre :\n" +
                                "1. Voyage aérien\n" +
                                "2. Voyage naval\n" +
                                "3. Voyage ferroviaire");
                choix = reader.readLine();
                switch (choix) {
                    case "1":
                        System.out.println("1. Création, modification et suppression d'aéroports\n" +
                                "2. Création, modification et suppression de compagnies aériennes\n" +
                                "3. Création, modification et suppression de vol\n" +
                                "4. Création de sections d'un avion\n" +
                                "5. Assignation des prix\n" +
                                "6. Consultation");
                        choix = reader.readLine();
                        switch (choix) {
                            case "1":
                                System.out.println("1. Création d'aéroport\n" +
                                        "2. Modification d'aéroport\n" +
                                        "3. Suppression d'aéroport");
                                choix = reader.readLine();
                            case "2":
                                break;
                        }
                        break;
                    case "2":
                        break;
                    case "3":
                        break;
                }
                break;
            case "2":
                System.out.println(
                        "Veuillez choisir le voyage voulu en entrant le chiffre :\n" +
                                "1. Voyage aérien\n" +
                                "2. Voyage naval\n" +
                                "3. Voyage ferroviaire");
                choix = reader.readLine();
                switch (choix) {
                    case "1":
                        System.out.println("1. Vérification des vols disponibles\n" +
                                "2. Réservation de siège\n" +
                                "3. Paiement d'un siège");
                        choix = reader.readLine();
                        break;
                    case "2":
                        break;
                }
                break;
            default:
                System.out.println("Veuillez réessayer");
                choix = reader.readLine();
		}
        }
    }
}