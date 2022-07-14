public class DVD {
    public String name, director;
    public int releaseYear;

    public DVD(String name, int releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    };

    public String toString() {
        return this.name + ", directed by " + this.director + ", released in " + this.releaseYear;
    }

    public static void main(String[] args) throws Exception {
        try {
            DVD[] dvdCollection = new DVD[10];
            DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");
            DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
            DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
            DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");
            dvdCollection[7] = avengersDVD;
            dvdCollection[3] = incrediblesDVD;
            dvdCollection[9] = findingDoryDVD;
            dvdCollection[2] = lionKingDVD;
            for (DVD dvd : dvdCollection) {
                if (dvd != null) {
                    System.out.println(dvd.toString());
                } else {
                    System.out.println("null");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
