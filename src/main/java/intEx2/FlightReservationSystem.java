package intEx2;

import java.util.ArrayList;
import java.util.List;

public class FlightReservationSystem {
    private List<Flight> flights;

    public FlightReservationSystem() {
        this.flights = new ArrayList<Flight>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public List<Flight> getAvailableFlights() {
        return flights;
    }

    public void reserveSeat(Flight flight, Passenger passenger) {
        if(flight.getReservedSeats() < flight.getCapacity()) {
            flight.setReservedSeats(flight.getReservedSeats() + 1);
            passenger.setFlight(flight);
        } else {
            System.out.println("Le vol est complet. Impossible de réserver un siège.");
        }
    }
}
