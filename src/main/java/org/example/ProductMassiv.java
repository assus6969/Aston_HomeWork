public class ProductMassiv {
    private Product[] products;

    public ProductMassiv() {
        products = new Product[5];

        products[0] = new Product("Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599, true);

        products[1] = new Product("iPhone 16 Pro Max", "15.01.2025",
                "Apple Inc.", "USA", 6999, false);

        products[2] = new Product("Xiaomi 14 Pro", "20.01.2025",
                "Xiaomi Inc.", "China", 3999, true);

        products[3] = new Product("Google Pixel 9 Pro", "10.01.2025",
                "Google LLC", "USA", 4999, false);

        products[4] = new Product("OnePlus 13", "25.01.2025",
                "OnePlus Technology", "China", 4599, true);
    }

    public void displayAllProducts() {
        System.out.println("=== ИНФОРМАЦИЯ О ТОВАРАХ ===\n");
        for (int i = 0; i < products.length; i++) {
            products[i].displayInfo();
            System.out.println();
        }
    }

    public Product[] getProducts() {
        return products;
    }
}