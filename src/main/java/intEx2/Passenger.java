package intEx2;

public class Passenger {
    private String name;
    private Flight flight;

    public Passenger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
