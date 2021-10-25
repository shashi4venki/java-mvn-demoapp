package demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Timestamp {
  public String getTimestamp() {
    LocalDateTime currentDateTime = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
    String formattedDateTime = currentDateTime.format(formatter);
		return formattedDateTime;
  }
}
