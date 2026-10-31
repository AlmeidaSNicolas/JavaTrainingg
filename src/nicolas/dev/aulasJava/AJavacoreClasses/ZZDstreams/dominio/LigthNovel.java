package nicolas.dev.aulasJava.AJavacoreClasses.ZZDstreams.dominio;

public class LigthNovel {
    private String title;
    private double price;
    private Category category;

    public LigthNovel(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public LigthNovel(String title, double price, Category category) {
        this.title = title;
        this.price = price;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "LigthNovel{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
