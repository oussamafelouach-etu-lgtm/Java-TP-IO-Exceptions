import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Implémentation de la couche métier
 */
public class MetierProduitImpl implements IProduitMetier {

    private List<Product> products;
    private String fileName;

    // Constructeur
    public MetierProduitImpl(String fileName) {
        this.fileName = fileName;
        this.products = loadFromFile();
    }

    // Ajouter un produit
    @Override
    public void add(Product p) {
        products.add(p);
    }

    // Charger tous les produits
    @Override
    public List<Product> getAll() {
        return products;
    }

    // Rechercher par ID
    @Override
    public Product findById(long id) {
        for (Product p : products) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    // Supprimer par ID
    @Override
    public void delete(long id) {
        products.removeIf(p -> p.getId() == id);
    }

    // Sauvegarder dans le fichier
    @Override
    public void saveAll() {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(fileName))) {

            oos.writeObject(products);
            System.out.println("Products saved successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Charger depuis le fichier
    @SuppressWarnings("unchecked")
    private List<Product> loadFromFile() {
        File file = new File(fileName);

        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(file))) {

            return (List<Product>) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }
}
