public class Park {
    private String name;

    public Park(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void displayInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price + " руб.");
            System.out.println("------------------------");
        }

        public String getName() { return name; }
        public String getWorkingHours() { return workingHours; }
        public double getPrice() { return price; }
    }
}