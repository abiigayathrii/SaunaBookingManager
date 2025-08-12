class Booking {
    String name;
    String date;

    Booking(String name, String date) {
        this.name = name;
        this.date = date;
    }
}

public class SaunaBookingSystem {
    public static void main(String[] args) {
        Booking[] bookings = {
            new Booking("Alice", "2025-08-15"),
            new Booking("Bob", "2025-08-12"),
            new Booking("Charlie", "2025-08-18")
        };

        System.out.println("=== All Bookings ===");
        for (Booking b : bookings) {
            System.out.println(b.name + " - " + b.date);
        }

        String searchName = "Bob";
        System.out.println("\nSearching for: " + searchName);
        boolean found = false;
        for (Booking b : bookings) {
            if (b.name.equalsIgnoreCase(searchName)) {
                System.out.println("Found: " + b.name + " - " + b.date);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No booking found for " + searchName);
        }

        for (int i = 0; i < bookings.length - 1; i++) {
            for (int j = i + 1; j < bookings.length; j++) {
                if (bookings[i].date.compareTo(bookings[j].date) > 0) {
                    Booking temp = bookings[i];
                    bookings[i] = bookings[j];
                    bookings[j] = temp;
                }
            }
        }

        System.out.println("\n=== Sorted by Date ===");
        for (Booking b : bookings) {
            System.out.println(b.name + " - " + b.date);
        }
    }
}
