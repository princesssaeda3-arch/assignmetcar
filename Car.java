public class Car {

    private String platenumber;
    private String carmodel;
    private double dailyrate;
    private boolean rent;

    public static String companyName = "JUST Rentals";
    public static int totalcar = 0;


    public Car() {
        platenumber = "Unknown";
        carmodel = "Unknown";
        dailyrate = 0.0;
        rent = false;
        totalcar++;
    }


    public Car(String platenumber, String carmodel, double dailyrate) {
        this.platenumber = platenumber;
        this.carmodel = carmodel;

        if (dailyrate >= 0) {
            this.dailyrate = dailyrate;
        } else {
            this.dailyrate = 0.0;
        }

        rent = false;
        totalcar++;
    }

    public String getPlatenumber() {
        return platenumber;
    }

    public String getCarmodel() {
        return carmodel;
    }

    public double getDailyrate() {
        return dailyrate;
    }

    public boolean isrented() {
        return rent;
    }

    public void setDailyrate(double dailyrate) {
        if (dailyrate >= 0) {
            this.dailyrate = dailyrate;
        }
    }

    public void rent() {
        if (rent) {
            System.out.println("Car is already rented.");
        } else {
            rent = true;
            System.out.println("Car rented successfully.");
        }
    }

    public void returnCar() {
        rent = false;
        System.out.println("Car returned successfully.");
    }

    public void displayInfo() {
        System.out.println("Plate Number: " + platenumber);
        System.out.println("Car Model: " + carmodel);
        System.out.println("Daily Rate: " + dailyrate);
        System.out.println("Rented: " + rent);
    }

    public static void displayCompanyName() {
        System.out.println("Company Name: " + companyName);
    }

    public static void displayTotalCars() {
        System.out.println("Total Cars: " + totalcar);
    }

    public static void main(String[] args) {

        Car car1 = new Car("b42t5", "Toyota", 40.0);
        Car car2 = new Car("G-WGN63", "mercedes", 35.0);

        Car.displayCompanyName();

        System.out.println("\nCar 1:");
        car1.displayInfo();

        System.out.println("\nCar 2:");
        car2.displayInfo();

        System.out.println("\nRenting Car 1:");
        car1.rent();

        System.out.println("\nTrying to rent Car 1 again:");
        car1.rent();

        System.out.println("\nReturning Car 1:");
        car1.returnCar();

        System.out.println("\nRenting Car 2:");
        car2.rent();

        System.out.println("\nTrying to rent Car 2 again:");
        car2.rent();

        System.out.println("\nReturning Car 2:");
        car2.returnCar();

        System.out.println("\nChanging Car 1 daily rate:");
        car1.setDailyrate(45.0);
        car1.displayInfo();

        System.out.println("\nChanging Car 2 daily rate:");
        car2.setDailyrate(40.0);
        car2.displayInfo();

        System.out.println();
        Car.displayTotalCars();
    }
}
