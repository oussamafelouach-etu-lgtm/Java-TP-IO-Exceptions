public class Calculator {

    // =======================
    // Méthode 1 : division
    // =======================
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero not possible.");
            return 0;
        }
        return a / b;
    }

    // =======================
    // Méthode 2 : conversion String → int
    // =======================
    public static int convertToNumber(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + text + "' is not a valid number");
            return 0;
        }
    }

    // =======================
    // Méthode 3 : calcul
    // =======================
    public static double calculate(char operation, double a, double b) {
        switch (operation) {
            case '+':
                return a + b;

            case '-':
                return a - b;

            case '*':
                return a * b;

            case '/':
                return divide(a, b);

            default:
                System.out.println("Error: Operation '" + operation + "' not supported");
                return 0;
        }
    }

    // =======================
    // Méthode main
    // =======================
    public static void main(String[] args) {

        // Test division par zéro
        System.out.println("Result: " + divide(10, 0));

        // Test conversion invalide
        int number = convertToNumber("abc");

        // Test opérations
        System.out.println("Addition: " + calculate('+', 5, 3));
        System.out.println("Invalid operation: " + calculate('&', 5, 3));
    }
}
