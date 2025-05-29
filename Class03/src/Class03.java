public class Class03 {
    public static void main(String[] args) {
        Car car = new Car("Beetle", "Blue", 1970);
        System.out.println("Model: " + car.getModel());
        System.out.println("Color: " + car.getColor());
        System.out.println("Year: " + car.getYear());
    }

    public static class Car {
        private String model;
        private String color;
        private int year;

        // Constructor
        public Car(String model, String color, int year) {
            this.model = model;
            this.color = color;
            this.year = year;
        }

        // Getters
        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getYear() {
            return year;
        }

        // Setters
        public void setModel(String model) {
            this.model = model;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }
}