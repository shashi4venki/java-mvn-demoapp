package demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Timestamp {
  public String getTimestamp() {
    LocalDateTime currentDateTime = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MMM dd, yyyy HH:mm:ss");
    String formattedDateTime = currentDateTime.format(formatter);
		return formattedDateTime;
  }
}
