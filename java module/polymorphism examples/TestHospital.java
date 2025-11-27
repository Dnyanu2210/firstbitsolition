package polymorphism;


class HospitalMember {
    int memberId;
    String memberName;
    int age;
    String department;
    double salary;

    HospitalMember() {
        memberId = 1;
        memberName = "Default Member";
        age = 30;
        department = "General";
        salary = 20000;
    }

    HospitalMember(int memberId, String memberName, int age, String department, double salary) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    int getMemberId() { return memberId; }
    void setMemberId(int memberId) { this.memberId = memberId; }

    String getMemberName() { return memberName; }
    void setMemberName(String memberName) { this.memberName = memberName; }

    int getAge() { return age; }
    void setAge(int age) { this.age = age; }

    String getDepartment() { return department; }
    void setDepartment(String department) { this.department = department; }

    double getSalary() { return salary; }
    void setSalary(double salary) { this.salary = salary; }

    void display() {
        System.out.println("Member ID: " + memberId);
        System.out.println("Name: " + memberName);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    void work() {
        System.out.println("Hospital member is working...");
    }
}



class Doctor extends HospitalMember {
    String specialization;
    int noOfPatients;

    Doctor() {
        super();
        specialization = "General Physician";
        noOfPatients = 20;
    }

    Doctor(int memberId, String memberName, int age, String department,
           double salary, String specialization, int noOfPatients) {
        super(memberId, memberName, age, department, salary);
        this.specialization = specialization;
        this.noOfPatients = noOfPatients;
    }

    String getSpecialization() { return specialization; }
    void setSpecialization(String specialization) { this.specialization = specialization; }

    int getNoOfPatients() { return noOfPatients; }
    void setNoOfPatients(int noOfPatients) { this.noOfPatients = noOfPatients; }

    void display() {
        super.display();
        System.out.println("Specialization: " + specialization);
        System.out.println("No. of Patients: " + noOfPatients);
        
    }

    void work() {
        System.out.println("They is treating patients...");
    }
}



class Nurse extends HospitalMember {
    int shiftHours;
    String dutyType;

    Nurse() {
        super();
        shiftHours = 8;
        dutyType = "General Ward";
    }

    Nurse(int memberId, String memberName, int age, String department,
          double salary, int shiftHours, String dutyType) {
        super(memberId, memberName, age, department, salary);
        this.shiftHours = shiftHours;
        this.dutyType = dutyType;
    }

    int getShiftHours() { return shiftHours; }
    void setShiftHours(int shiftHours) { this.shiftHours = shiftHours; }

    String getDutyType() { return dutyType; }
    void setDutyType(String dutyType) { this.dutyType = dutyType; }

    void display() {
        super.display();
        System.out.println("Shift Hours: " + shiftHours);
        System.out.println("Duty Type: " + dutyType);
        
    }

    void work() {
        System.out.println("They is assisting patients...");
    }
}


class WardBoy extends HospitalMember {
    String wardName;
    int roomsCleaned;

    WardBoy() {
        super();
        wardName = "General Ward";
        roomsCleaned = 10;
    }

    WardBoy(int memberId, String memberName, int age, String department,
            double salary, String wardName, int roomsCleaned) {
        super(memberId, memberName, age, department, salary);
        this.wardName = wardName;
        this.roomsCleaned = roomsCleaned;
    }

    String getWardName() { return wardName; }
    void setWardName(String wardName) { this.wardName = wardName; }

    int getRoomsCleaned() { return roomsCleaned; }
    void setRoomsCleaned(int roomsCleaned) { this.roomsCleaned = roomsCleaned; }

    void display() {
        super.display();
        System.out.println("Ward Name: " + wardName);
        System.out.println("Rooms Cleaned: " + roomsCleaned);
       
    }

    void work() {
        System.out.println( " They cleaning rooms...");
    }
}



class TestHospital {
    public static void main(String[] args) {

        HospitalMember[] list = new HospitalMember[3];

        list[0] = new Doctor(101, "Dr. Mehta", 45, "Cardiology", 90000, "Cardiologist", 50);
        list[1] = new Nurse(102, "Sita", 32, "ICU", 35000, 12, "ICU Duty");
        list[2] = new WardBoy(103, "Raju", 28, "General", 18000, "General Ward", 20);

        for (HospitalMember hm : list) {
            hm.display();
            hm.work();    
            System.out.println();
        }
    }
}
