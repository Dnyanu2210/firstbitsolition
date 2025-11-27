package polymorphism;



class Instrument {
    String name;
    String type;
    int yearMade;
    double price;

    Instrument() {
        name = "Unknown";
        type = "Acoustic";
        yearMade = 2000;
        price = 100.0;
    }

    Instrument(String name, String type, int yearMade, double price) {
        this.name = name;
        this.type = type;
        this.yearMade = yearMade;
        this.price = price;
    }

    String getName() { return name; }
    void setName(String name) { this.name = name; }

    String getType() { return type; }
    void setType(String type) { this.type = type; }

    int getYearMade() { return yearMade; }
    void setYearMade(int yearMade) { this.yearMade = yearMade; }

    double getPrice() { return price; }
    void setPrice(double price) { this.price = price; }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Year Made: " + yearMade);
        System.out.println("Price: $" + price);
    }

    void play() {
        System.out.println("Playing a generic instrument...");
    }
} // Instrument Ends here

class StringInstrument extends Instrument {
    int numberOfStrings;
    boolean isElectric;

    StringInstrument() {
        super();
        numberOfStrings = 6;
        isElectric = false;
    }

    StringInstrument(String name, String type, int yearMade, double price, int numberOfStrings, boolean isElectric) {
        super(name, type, yearMade, price);
        this.numberOfStrings = numberOfStrings;
        this.isElectric = isElectric;
    }

    int getNumberOfStrings() { return numberOfStrings; }
    void setNumberOfStrings(int numberOfStrings) { this.numberOfStrings = numberOfStrings; }

    boolean getIsElectric() { return isElectric; }
    void setIsElectric(boolean isElectric) { this.isElectric = isElectric; }

    void display() {
        super.display();
        System.out.println("Number of Strings: " + numberOfStrings);
        System.out.println("Electric: " + isElectric);
        System.out.println("----------------------------------");
    }

    void play() {
        System.out.println("Strumming the strings of " + name + "...");
    }
} // StringInstrument Ends here

class PercussionInstrument extends Instrument {
    boolean isTunable;
    int diameter;

    PercussionInstrument() {
        super();
        isTunable = true;
        diameter = 14;
    }

    PercussionInstrument(String name, String type, int yearMade, double price, boolean isTunable, int diameter) {
        super(name, type, yearMade, price);
        this.isTunable = isTunable;
        this.diameter = diameter;
    }

    boolean getIsTunable() { return isTunable; }
    void setIsTunable(boolean isTunable) { this.isTunable = isTunable; }

    int getDiameter() { return diameter; }
    void setDiameter(int diameter) { this.diameter = diameter; }

    void display() {
        super.display();
        System.out.println("Tunable: " + isTunable);
        System.out.println("Diameter: " + diameter + " inches");
        System.out.println("----------------------------------");
    }

    void play() {
        System.out.println("Hitting the percussion instrument " + name + "...");
    }
} // PercussionInstrument Ends here

class WindInstrument extends Instrument {
    String material;
    boolean isTransposing;

    WindInstrument() {
        super();
        material = "Wood";
        isTransposing = false;
    }

    WindInstrument(String name, String type, int yearMade, double price, String material, boolean isTransposing) {
        super(name, type, yearMade, price);
        this.material = material;
        this.isTransposing = isTransposing;
    }

    String getMaterial() { return material; }
    void setMaterial(String material) { this.material = material; }

    boolean getIsTransposing() { return isTransposing; }
    void setIsTransposing(boolean isTransposing) { this.isTransposing = isTransposing; }

    void display() {
        super.display();
        System.out.println("Material: " + material);
        System.out.println("Transposing: " + isTransposing);
        System.out.println("----------------------------------");
    }

    void play() {
        System.out.println("Blowing into the wind instrument " + name + "...");
    }
} // WindInstrument Ends here

class Testmusicinstruments {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[3];

        instruments[0] = new StringInstrument("Guitar", "Acoustic", 2018, 500.0, 6, false);
        instruments[1] = new PercussionInstrument("Yamaha Snare", "Acoustic", 2020, 300.0, true, 14);
        instruments[2] = new WindInstrument("Yamaha Flute", "Acoustic", 2019, 1200.0, "Nickel Silver", false);

        for (Instrument instr : instruments) {
            instr.display();
            instr.play();
            System.out.println();
        }
    }
} // TestMusicInstruments Ends here

