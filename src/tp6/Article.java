package tp6;

public class Article {
    private static final int SEUIL = 100;
    String intitule;
    Double prix;
    int stock;

    Article(String intitule, Double prix, int stock) throws IntituleException, PrixException, StockException {
        setIntitule(intitule);
        setPrix(prix);
        setStock(stock);
    }

    public String getIntitule() {
        return intitule;
    }

    public Double getPrix() {
        return prix;
    }

    public Double getPrix(int quantite) {
        if (quantite >= SEUIL) {
            return prix * 0.9;
        }
        return prix;
    }

    public int getStock() {
        return stock;
    }

    public void setIntitule(String intitule) throws IntituleException {
        if (intitule == null || intitule.isEmpty()) {
            throw new IntituleException("L'intitulé ne peut pas être vide.");
        }
        intitule = intitule.substring(0, 1).toUpperCase() + intitule.substring(1).toLowerCase();
        this.intitule = intitule;
    }

    public void setPrix(Double prix) throws PrixException {
        if (prix <= 0) {
            throw new PrixException("Le prix ne peut pas être négatif.");
        }
        this.prix = prix;
    }

    public void setStock(int stock) throws StockException {
        if (stock < 0) {
            throw new StockException("Le stock ne peut pas être négatif.");
        }
        this.stock = stock;
    }

    public boolean existQuantite(int quantite) {
        return stock >= quantite;
    }

    public void removeStock(int quantite) throws StockException {
        if (!existQuantite(quantite)) {
            throw new StockException("Le stock est insuffisant.");
        }
        stock -= quantite;
    }


}
