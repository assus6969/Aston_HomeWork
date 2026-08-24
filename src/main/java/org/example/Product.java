public class Product {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String countryOfOrigin;
    private double price;
    private boolean isReserved;

    public Product(String name, String productionDate, String manufacturer,
                   String countryOfOrigin, double price, boolean isReserved) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.isReserved = isReserved;
    }

    public void displayInfo() {
        System.out.println("=== Информация о товаре ===");
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + countryOfOrigin);
        System.out.println("Цена: " + price + " руб.");
        System.out.println("Состояние бронирования: " + (isReserved ? "Забронирован" : "Не забронирован"));
        System.out.println("=============================");
    }

    public String getName() { return name; }
    public String getProductionDate() { return productionDate; }
    public String getManufacturer() { return manufacturer; }
    public String getCountryOfOrigin() { return countryOfOrigin; }
    public double getPrice() { return price; }
    public boolean isReserved() { return isReserved; }

    public static void main(String[] args) {
        // 1. Вывод информации о товарах
        ProductMassiv productMassiv = new ProductMassiv();
        productMassiv.displayAllProducts();

        System.out.println("=== ИНФОРМАЦИЯ О ПАРКЕ АТТРАКЦИОНОВ ===\n");

        Park park = new Park("Парк развлечений \"Веселый мир\"");

        Park.Attraction attraction1 = park.new Attraction("Американские горки", "10:00-22:00", 500);
        Park.Attraction attraction2 = park.new Attraction("Колесо обозрения", "10:00-23:00", 300);
        Park.Attraction attraction3 = park.new Attraction("Комната страха", "12:00-21:00", 400);
        Park.Attraction attraction4 = park.new Attraction("Автодром", "10:00-20:00", 250);
        Park.Attraction attraction5 = park.new Attraction("Батутный центр", "11:00-21:00", 350);

        System.out.println("Парк: " + park.getName() + "\n");
        attraction1.displayInfo();
        attraction2.displayInfo();
        attraction3.displayInfo();
        attraction4.displayInfo();
        attraction5.displayInfo();
    }
}