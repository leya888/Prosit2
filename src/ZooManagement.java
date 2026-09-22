import java.util.Scanner;

public class ZooManagement {

    // Variables membres
    int nbrCages = 20;
    String zooName = "my zoo";

    public static void main(String[] args) {

        // Création d'un objet ZooManagement
        ZooManagement zoo = new ZooManagement();

        // Affichage des valeurs initiales
        System.out.println("Bienvenue dans " + zoo.zooName
                + " qui contient " + zoo.nbrCages + " cages.");

        // Création du Scanner
        Scanner sc = new Scanner(System.in);

        // Saisie du nom du zoo
        do {
            System.out.print("Entrez le nom du zoo : ");
            zoo.zooName = sc.nextLine();

            if (zoo.zooName.trim().isEmpty()) {
                System.out.println("Erreur : le nom du zoo ne peut pas être vide.");
            }

        } while (zoo.zooName.trim().isEmpty());

        // Saisie du nombre de cages
        do {
            System.out.print("Entrez le nombre de cages : ");

            // Vérification que l'utilisateur entre bien un entier
            while (!sc.hasNextInt()) {
                System.out.println("Erreur : veuillez entrer un entier positif.");
                sc.next(); // Supprime la mauvaise saisie
                System.out.print("Entrez le nombre de cages : ");
            }

            zoo.nbrCages = sc.nextInt();

            if (zoo.nbrCages <= 0) {
                System.out.println("Erreur : le nombre de cages doit être positif.");
            }

        } while (zoo.nbrCages <= 0);

        // Affichage après modification
        System.out.println("\nInformations du zoo :");
        System.out.println("Le zoo " + zoo.zooName
                + " contient " + zoo.nbrCages + " cages.");

        // Fermeture du Scanner
        sc.close();
    }
}