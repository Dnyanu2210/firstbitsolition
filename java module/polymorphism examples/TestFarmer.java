package polymorphism;

class Farmer {
    int farmerId;
    String farmerName;
    double landArea;
    String city;
    double annualIncome;
    int noOfEquipment;
    int insuranceAmount;

    Farmer() {
        System.out.println("Default Constructor of Farmer called");
        farmerId = 100;
        farmerName = "Default Farmer";
        landArea = 5.0;
        city = "Default City";
        annualIncome = 250000;
        noOfEquipment = 3;
        insuranceAmount = 15000;
    }

    Farmer(int farmerId, String farmerName, double landArea, String city,
           double annualIncome, int noOfEquipment, int insuranceAmount) {
        System.out.println("Parameterized Constructor of Farmer called");
        this.farmerId = farmerId;
        this.farmerName = farmerName;
        this.landArea = landArea;
        this.city = city;
        this.annualIncome = annualIncome;
        this.noOfEquipment = noOfEquipment;
        this.insuranceAmount = insuranceAmount;
    }

    int getFarmerId() { return farmerId; }
    void setFarmerId(int farmerId) { this.farmerId = farmerId; }

    String getFarmerName() { return farmerName; }
    void setFarmerName(String farmerName) { this.farmerName = farmerName; }

    double getLandArea() { return landArea; }
    void setLandArea(double landArea) { this.landArea = landArea; }

    String getCity() { return city; }
    void setCity(String city) { this.city = city; }

    double getAnnualIncome() { return annualIncome; }
    void setAnnualIncome(double annualIncome) { this.annualIncome = annualIncome; }

    int getNoOfEquipment() { return noOfEquipment; }
    void setNoOfEquipment(int noOfEquipment) { this.noOfEquipment = noOfEquipment; }

    int getInsuranceAmount() { return insuranceAmount; }
    void setInsuranceAmount(int insuranceAmount) { this.insuranceAmount = insuranceAmount; }

    void displayFarmerInfo() {
        System.out.println("Farmer ID: " + farmerId);
        System.out.println("Name: " + farmerName);
        System.out.println("City: " + city);
        System.out.println("Land Area: " + landArea);
        System.out.println("Annual Income: " + annualIncome);
        System.out.println("No. of Equipment: " + noOfEquipment);
        System.out.println("Insurance Amount: " + insuranceAmount);
    }
}

class DairyFarmer extends Farmer {
    int noOfCattles;
    double milkProducePerDay;
    int dairyLicenseNo;

    DairyFarmer() {
        super();
        System.out.println("Default Constructor of DairyFarmer called");
        noOfCattles = 10;
        milkProducePerDay = 100.0;
        dairyLicenseNo = 12345;
    }

    DairyFarmer(int farmerId, String farmerName, double landArea, String city,
                double annualIncome, int noOfEquipment, int insuranceAmount,
                int noOfCattles, double milkProducePerDay, int dairyLicenseNo) {
        super(farmerId, farmerName, landArea, city, annualIncome, noOfEquipment, insuranceAmount);
        System.out.println("Parameterized Constructor of DairyFarmer called");
        this.noOfCattles = noOfCattles;
        this.milkProducePerDay = milkProducePerDay;
        this.dairyLicenseNo = dairyLicenseNo;
    }

    int getNoOfCattles() { return noOfCattles; }
    void setNoOfCattles(int noOfCattles) { this.noOfCattles = noOfCattles; }

    double getMilkProducePerDay() { return milkProducePerDay; }
    void setMilkProducePerDay(double milkProducePerDay) { this.milkProducePerDay = milkProducePerDay; }

    int getDairyLicenseNo() { return dairyLicenseNo; }
    void setDairyLicenseNo(int dairyLicenseNo) { this.dairyLicenseNo = dairyLicenseNo; }

    void displayDairyInfo() {
        displayFarmerInfo();
        System.out.println("No. of Cattles: " + noOfCattles);
        System.out.println("Milk Produce per Day: " + milkProducePerDay + " liters");
        System.out.println("Dairy License No: " + dairyLicenseNo);
    }
}

class PoultryFarmer extends Farmer {
    int noOfChickens;
    int noOfHens;
    double shedCapacity;
    int eggsProducePerDay;
    String poultryFarmName;
    int noOfSheds;

    PoultryFarmer() {
        super();
        System.out.println("Default Constructor of PoultryFarmer called");
        noOfChickens = 200;
        noOfHens = 150;
        shedCapacity = 300.5;
        eggsProducePerDay = 500;
        poultryFarmName = "Default Poultry Farm";
        noOfSheds = 4;
    }

    PoultryFarmer(int farmerId, String farmerName, double landArea, String city,
                  double annualIncome, int noOfEquipment, int insuranceAmount,
                  int noOfChickens, int noOfHens, double shedCapacity,
                  int eggsProducePerDay, String poultryFarmName, int noOfSheds) {
        super(farmerId, farmerName, landArea, city, annualIncome, noOfEquipment, insuranceAmount);
        System.out.println("Parameterized Constructor of PoultryFarmer called");
        this.noOfChickens = noOfChickens;
        this.noOfHens = noOfHens;
        this.shedCapacity = shedCapacity;
        this.eggsProducePerDay = eggsProducePerDay;
        this.poultryFarmName = poultryFarmName;
        this.noOfSheds = noOfSheds;
    }

    int getNoOfChickens() { return noOfChickens; }
    void setNoOfChickens(int noOfChickens) { this.noOfChickens = noOfChickens; }

    int getNoOfHens() { return noOfHens; }
    void setNoOfHens(int noOfHens) { this.noOfHens = noOfHens; }

    double getShedCapacity() { return shedCapacity; }
    void setShedCapacity(double shedCapacity) { this.shedCapacity = shedCapacity; }

    int getEggsProducePerDay() { return eggsProducePerDay; }
    void setEggsProducePerDay(int eggsProducePerDay) { this.eggsProducePerDay = eggsProducePerDay; }

    String getPoultryFarmName() { return poultryFarmName; }
    void setPoultryFarmName(String poultryFarmName) { this.poultryFarmName = poultryFarmName; }

    int getNoOfSheds() { return noOfSheds; }
    void setNoOfSheds(int noOfSheds) { this.noOfSheds = noOfSheds; }

    void displayPoultryInfo() {
        displayFarmerInfo();
        System.out.println("Poultry Farm Name: " + poultryFarmName);
        System.out.println("No. of Chickens: " + noOfChickens);
        System.out.println("No. of Hens: " + noOfHens);
        System.out.println("Shed Capacity: " + shedCapacity);
        System.out.println("Eggs Produce Per Day: " + eggsProducePerDay);
        System.out.println("No. of Sheds: " + noOfSheds);
    }
}

class OrganicFarmer extends Farmer {
    int organicCertId;
    String cropType;
    String fertilizerUsed;

    OrganicFarmer() {
        super();
        System.out.println("Default Constructor of OrganicFarmer called");
        organicCertId = 9999;
        cropType = "Wheat";
        fertilizerUsed = "Cow Manure";
    }

    OrganicFarmer(int farmerId, String farmerName, double landArea, String city,
                  double annualIncome, int noOfEquipment, int insuranceAmount,
                  int organicCertId, String cropType, String fertilizerUsed) {
        super(farmerId, farmerName, landArea, city, annualIncome, noOfEquipment, insuranceAmount);
        System.out.println("Parameterized Constructor of OrganicFarmer called");
        this.organicCertId = organicCertId;
        this.cropType = cropType;
        this.fertilizerUsed = fertilizerUsed;
    }

    int getOrganicCertId() { return organicCertId; }
    void setOrganicCertId(int organicCertId) { this.organicCertId = organicCertId; }

    String getCropType() { return cropType; }
    void setCropType(String cropType) { this.cropType = cropType; }

    String getFertilizerUsed() { return fertilizerUsed; }
    void setFertilizerUsed(String fertilizerUsed) { this.fertilizerUsed = fertilizerUsed; }

    void displayOrganicInfo() {
        displayFarmerInfo();
        System.out.println("Organic Certificate ID: " + organicCertId);
        System.out.println("Crop Type: " + cropType);
        System.out.println("Fertilizer Used: " + fertilizerUsed);
    }
}

public class TestFarmer {
    public static void main(String[] args) {

        System.out.println("Default Constructor Values ");
        DairyFarmer df = new DairyFarmer();
        df.displayDairyInfo();

        System.out.println("\nParameterized Constructor Values");
        PoultryFarmer pf = new PoultryFarmer(
                201, "Ramesh", 10.5, "Nashik", 450000, 5, 20000,
                400, 300, 500.0, 1000, "Golden Eggs Poultry", 6);
        pf.displayPoultryInfo();

        System.out.println("\nOrganic Farmer (Default Values) ");
        OrganicFarmer of1 = new OrganicFarmer();
        of1.displayOrganicInfo();

        System.out.println("\nOrganic Farmer (Parameterized) ");
        OrganicFarmer of2 = new OrganicFarmer(
                202, "Suresh", 7.5, "Kolhapur", 350000, 4, 18000,
                1122, "Sugarcane", "Compost");
        of2.displayOrganicInfo();
    }
}
