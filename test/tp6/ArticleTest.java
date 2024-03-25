package tp6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArticleTest {

    @Test
    void getIntitule() throws PrixException, StockException, IntituleException {
        Article article1 = new Article("minuscule", 2.0, 10);
        assertEquals("Minuscule", article1.getIntitule(), "Un intitulé doit avoir la première lettre en Majuscule et le reste en minuscule");

        Article article2 = new Article("MAJUSCULE", 2.0, 10);
        assertEquals("Majuscule", article2.getIntitule(), "Un intitulé doit avoir la première lettre en Majuscule et le reste en minuscule");
    }

    @Test
    void setIntitule() {
        assertThrows(IntituleException.class, () -> {
            new Article(null, 2.0, 10);
        }, "Un intitulé ne peut pas être null.");

        assertThrows(IntituleException.class, () -> {
            new Article("", 2.0, 10);
        }, "Un intitulé ne peut pas être vide.");
    }
}