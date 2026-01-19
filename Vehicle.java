// =======================
// Classe TooFastException
// =======================
class TooFastException extends Exception {
    // Constructeur prenant la vitesse
    public TooFastException(int speed) {
        super("This is an exception of type TooFastException. Speed involved: " + speed);
    }
}

// =======================
// Classe Vehicle
// =======================
public class Vehicle {

    // Constructeur vide
    public Vehicle() {
        // rien à initialiser
    }

    // Méthode testSpeed
    public void testSpeed(int speed) throws TooFastException {
        if (speed > 90) {
            // lancer l'exception si vitesse > 90
            throw new TooFastException(speed);
        } else {
            System.out.println("Speed " + speed + " is within the limit.");
        }
    }

    // =======================
    // Méthode main
    // =======================
    public static void main(String[] args) {
        Vehicle car = new Vehicle();

        // Premier test : vitesse normale
        try {
            car.testSpeed(80);  // ne déclenche pas l'exception
        } catch (TooFastException e) {
            e.printStackTrace();  // affiche la pile d'appels
        }

        // Deuxième test : vitesse trop élevée
        try {
            car.testSpeed(120);  // déclenche l'exception
        } catch (TooFastException e) {
            e.printStackTrace();  // affiche la pile d'appels
        }
    }
}
