package structural.facade;

public class BookingCoordinator {
    private final FlightBooking flightBooking = new FlightBooking();
    private final HotelBooking hotelBooking = new HotelBooking();
    private final CabBooking cabBooking = new CabBooking();

    public void bookAll() {
        flightBooking.bookFlight();
        hotelBooking.bookHotel();
        cabBooking.bookCab();
    }
}
