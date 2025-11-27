package polymorphism;

class Device {
    String brand;
    String model;
    double price;

    Device() {
        this.brand = "Generic";
        this.model = "Unknown";
        this.price = 0.0;
    }

    Device(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    String getBrand() { return brand; }
    void setBrand(String brand) { this.brand = brand; }

    String getModel() { return model; }
    void setModel(String model) { this.model = model; }

    double getPrice() { return price; }
    void setPrice(double price) { this.price = price; }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

    void start() {
        System.out.println("Device is starting...");
    }
} // Device Ends here

class Smartphone extends Device {
    int batteryCapacity;
    int ram;

    Smartphone(String brand, String model, double price, int batteryCapacity, int ram) {
        super(brand, model, price);
        this.batteryCapacity = batteryCapacity;
        this.ram = ram;
    }

    int getBatteryCapacity() { return batteryCapacity; }
    void setBatteryCapacity(int batteryCapacity) { this.batteryCapacity = batteryCapacity; }

    int getRam() { return ram; }
    void setRam(int ram) { this.ram = ram; }

    void start() {
        System.out.println("Smartphone is booting up with Android/iOS...");
    }

    void display() {
        super.display();
        System.out.println("Battery Capacity: " + batteryCapacity + " mAh");
        System.out.println("RAM: " + ram + " GB");
        System.out.println("----------------------------------");
    }
} // Smartphone Ends here

class Laptop extends Device {
    String processor;
    int ram;

    Laptop(String brand, String model, double price, String processor, int ram) {
        super(brand, model, price);
        this.processor = processor;
        this.ram = ram;
    }

    String getProcessor() { return processor; }
    void setProcessor(String processor) { this.processor = processor; }

    int getRam() { return ram; }
    void setRam(int ram) { this.ram = ram; }

    void start() {
        System.out.println("Laptop is starting Windows/macOS...");
    }

    void display() {
        super.display();
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("----------------------------------");
    }
} // Laptop Ends here

class SmartWatch extends Device {
    boolean heartRateMonitor;
    int batteryLife;

    SmartWatch(String brand, String model, double price, boolean heartRateMonitor, int batteryLife) {
        super(brand, model, price);
        this.heartRateMonitor = heartRateMonitor;
        this.batteryLife = batteryLife;
    }

    boolean isHeartRateMonitor() { return heartRateMonitor; }
    void setHeartRateMonitor(boolean heartRateMonitor) { this.heartRateMonitor = heartRateMonitor; }

    int getBatteryLife() { return batteryLife; }
    void setBatteryLife(int batteryLife) { this.batteryLife = batteryLife; }

    void start() {
        System.out.println("Smartwatch is starting WearOS/WatchOS...");
    }

    void display() {
        super.display();
        System.out.println("Heart Rate Monitor: " + (heartRateMonitor ? "Yes" : "No"));
        System.out.println("Battery Life: " + batteryLife + " hours");
        System.out.println("----------------------------------");
    }
} // SmartWatch Ends here

class TestDevice {
   public static void main(String[] args) {
        Device d;

        d = new Smartphone("Samsung", "Galaxy S21", 999.99, 4000, 8);
        d.display();
        d.start();

        d = new Laptop("Dell", "XPS 15", 1999.99, "Intel i7", 16);
        d.display();
        d.start();

        d = new SmartWatch("Apple", "Watch Series 8", 399.99, true, 18);
        d.display();
        d.start();
    }
} // TestDevice Ends here

