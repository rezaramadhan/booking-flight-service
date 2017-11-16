package id.booking.flight.helper;

public class Main {
	public static void main(String[] args) throws Exception {
        MySQLAccess dao = new MySQLAccess();
        String tableName = "booking_domain";
        String query = "select * from booking_domain.users";
        dao.readDatabase(tableName, query);
    }
}