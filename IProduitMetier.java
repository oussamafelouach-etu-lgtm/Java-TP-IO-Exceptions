import java.util.List;

/**
 * Interface métier pour la gestion des produits
 */
public interface IProduitMetier {

    void add(Product p);

    List<Product> getAll();

    Product findById(long id);

    void delete(long id);

    void saveAll();
}
