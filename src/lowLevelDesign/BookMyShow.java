//package lowLevelDesign;
//
//import java.util.List;
//
//public class Movie {
//    String name
//
//    public String getName(); /* Get tickets to see the movie at the given theater */
//
//    public Ticket[] getTickets(Theater theater, int quantity, int creditCardNumber);
//}
//
//public class Theater {
//    Location location /* Return a list of movies which are currently playing at the theater. */
//
//    public Movie[] listMovies(); /* Used by the app to find the theater closest to the user */
//
//    public static Theater getNearestTheater(Location current_location);
//
//    public DateTime[] getSchedule(Movie movie);
//}
//
//public class SchedulingHelper { /* Buy tickets for whichever movie is available soonest at the closest theater */
//    public Ticket[] purchaseNextAvailable(Location myLocation, int quantity, int creditCardNumber) {
//    }
//}
