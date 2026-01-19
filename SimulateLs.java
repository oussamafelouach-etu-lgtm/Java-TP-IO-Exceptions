import java.io.File;
import java.util.Scanner;

public class SimulateLs {

    public static void main(String[] args) {

        System.out.println("Entrez le chemin complet du dossier :");

        try (Scanner scanner = new Scanner(System.in)) {

            String path = scanner.nextLine().trim();
            File directory = new File(path);

            // Vérification que le chemin existe et est un dossier
            if (!directory.exists()) {
                System.out.println("Erreur : Le chemin spécifié n'existe pas.");
                return;
            }

            if (!directory.isDirectory()) {
                System.out.println("Erreur : Le chemin spécifié n'est pas un dossier.");
                return;
            }

            // Récupération des fichiers et sous-dossiers
            File[] files = directory.listFiles();

            if (files == null || files.length == 0) {
                System.out.println("Le dossier est vide.");
                return;
            }

            // Tri alphabétique (optionnel mais courant comme ls)
            java.util.Arrays.sort(files, (f1, f2) -> 
                f1.getName().compareToIgnoreCase(f2.getName()));

            System.out.println("Contenu de : " + directory.getAbsolutePath());
            System.out.println("---------------------------------------------------");

            for (File file : files) {
                String type = file.isDirectory() ? "< DIR >" : "<FILE>";

                // Droits / attributs
                String permissions = "";
                permissions += file.canRead()  ? "r" : "-";
                permissions += file.canWrite() ? "w" : "-";
                permissions += file.isHidden() ? "h" : "-";

                // Affichage demandé dans l'énoncé
                System.out.println(file.getAbsolutePath() + " " + type + " " + permissions);
            }

        } 
        // ← le Scanner est automatiquement fermé ici (try-with-resources)
        // même en cas de return ou d'exception

        // Pas besoin de scanner.close() manuellement
    }
}