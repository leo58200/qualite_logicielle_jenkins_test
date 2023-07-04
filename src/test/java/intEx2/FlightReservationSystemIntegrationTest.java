package intEx2;

import org.junit.Test;
import static org.junit.Assert.*;

public class FlightReservationSystemIntegrationTest {

    @Test
    public void testReserveSeat() {
        FlightReservationSystem system = new FlightReservationSystem();

        Flight flight = new Flight("AF123", "Paris", "New York", 200);
        system.addFlight(flight);

        Passenger passenger = new Passenger("Jack");

        system.reserveSeat(flight, passenger);

        assertEquals(flight, passenger.getFlight());
        assertEquals(1, flight.getReservedSeats());
    }
}
