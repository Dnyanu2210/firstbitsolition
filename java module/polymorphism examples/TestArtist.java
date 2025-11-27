package polymorphism;



class Artist {
    int artistId;
    String artistName;
    String city;
    double income;

    Artist() {
        artistId = 0;
        artistName = "Default Artist";
        city = "Mumbai";
        income = 20000;
    }

    Artist(int artistId, String artistName, String city, double income) {
        this.artistId = artistId;
        this.artistName = artistName;
        this.city = city;
        this.income = income;
    }

    int getArtistId() { return artistId; }
    void setArtistId(int artistId) { this.artistId = artistId; }

    String getArtistName() { return artistName; }
    void setArtistName(String artistName) { this.artistName = artistName; }

    String getCity() { return city; }
    void setCity(String city) { this.city = city; }

    double getIncome() { return income; }
    void setIncome(double income) { this.income = income; }

    void display() {
        System.out.println("Artist ID: " + artistId);
        System.out.println("Name: " + artistName);
        System.out.println("City: " + city);
        System.out.println("Income: " + income);
    }

    void work() {
        System.out.println("Artist is working...");
    }
}



class Singer extends Artist {
    int noOfSongs;
    String voiceType;

    Singer() {
        super();
        noOfSongs = 20;
        voiceType = "Melody";
    }

    Singer(int artistId, String artistName, String city, double income,
           int noOfSongs, String voiceType) {
        super(artistId, artistName, city, income);
        this.noOfSongs = noOfSongs;
        this.voiceType = voiceType;
    }

    int getNoOfSongs() { return noOfSongs; }
    void setNoOfSongs(int noOfSongs) { this.noOfSongs = noOfSongs; }

    String getVoiceType() { return voiceType; }
    void setVoiceType(String voiceType) { this.voiceType = voiceType; }

    void display() {
        super.display();
        System.out.println("No. of Songs: " + noOfSongs);
        System.out.println("Voice Type: " + voiceType);
        
    }

    void work() {
        System.out.println(artistName + " is singing...");
    }
}



class Actor extends Artist {
    int noOfMovies;
    String actingStyle;

    Actor() {
        super();
        noOfMovies = 5;
        actingStyle = "Drama";
    }

    Actor(int artistId, String artistName, String city, double income,
          int noOfMovies, String actingStyle) {
        super(artistId, artistName, city, income);
        this.noOfMovies = noOfMovies;
        this.actingStyle = actingStyle;
    }

    int getNoOfMovies() { return noOfMovies; }
    void setNoOfMovies(int noOfMovies) { this.noOfMovies = noOfMovies; }

    String getActingStyle() { return actingStyle; }
    void setActingStyle(String actingStyle) { this.actingStyle = actingStyle; }

    void display() {
        super.display();
        System.out.println("No. of Movies: " + noOfMovies);
        System.out.println("Acting Style: " + actingStyle);
        
    }

    void work() {
        System.out.println(artistName + " is acting in a movie...");
    }
}



class Painter extends Artist {
    int noOfPaintings;
    String paintingStyle;

    Painter() {
        super();
        noOfPaintings = 15;
        paintingStyle = "Abstract";
    }

    Painter(int artistId, String artistName, String city, double income,
            int noOfPaintings, String paintingStyle) {
        super(artistId, artistName, city, income);
        this.noOfPaintings = noOfPaintings;
        this.paintingStyle = paintingStyle;
    }

    int getNoOfPaintings() { return noOfPaintings; }
    void setNoOfPaintings(int noOfPaintings) { this.noOfPaintings = noOfPaintings; }

    String getPaintingStyle() { return paintingStyle; }
    void setPaintingStyle(String paintingStyle) { this.paintingStyle = paintingStyle; }

    void display() {
        super.display();
        System.out.println("No. of Paintings: " + noOfPaintings);
        System.out.println("Painting Style: " + paintingStyle);
        
    }

    void work() {
        System.out.println(artistName + " is painting a masterpiece...");
    }
}



class TestArtist {
    public static void main(String[] args) {

        Artist[] list = new Artist[3];

        list[0] = new Singer(101, "Arijit Singh", "Kolkata", 500000, 200, "Melody");
        list[1] = new Actor(102, "Hrithik Roshan", "Mumbai", 900000, 25, "Action");
        list[2] = new Painter(103, "MF Hussain", "Mumbai", 700000, 500, "Modern Art");

        for (Artist a : list) {
            a.display();
            a.work();   
            System.out.println();
        }
    }
}
