import java.util.ArrayList;
import edu.duke.FileResource;

public class LogAnalyzer
{
     private ArrayList<LogEntry> records;
     
     public LogAnalyzer() {
         records = new ArrayList<LogEntry>();
     }
     
     public void readFile(String filename) {
         FileResource fr = new FileResource(filename);
         for (String line : fr.lines()) {
             WebLogParser parser = new WebLogParser();
             LogEntry entry = parser.parseEntry(line);
             records.add(entry);
         }
     }
     
     private ArrayList<String> createUniqueIPsList () {
         ArrayList<String> uniqueIPs = new ArrayList<String>();
         for (LogEntry le : records) {
             String ipAddr = le.getIpAddress();
             if (!uniqueIPs.contains(ipAddr)) {
                 uniqueIPs.add(ipAddr);
             }
         }
         return uniqueIPs;
     }
     
     public int countUniqueIPs () {
         ArrayList<String> uniqueIPs = createUniqueIPsList();
         return uniqueIPs.size();
     }
     
     public ArrayList<String> uniqueIPVisitsOnDay (String someday) {
         ArrayList<String> uniqueIPsOnDay = new ArrayList<String>();
         for (LogEntry le : records) {
             String ipAddr = le.getIpAddress();
             String currDay = le.getAccessTime().toString();
             if (!uniqueIPsOnDay.contains(ipAddr) && currDay.contains(someday)) {
                 uniqueIPsOnDay.add(ipAddr);
             }
         }
         return uniqueIPsOnDay;
     }
     
     public int countUniqueIPsInRange (int low, int high) {
         ArrayList<String> uniqueIPs = new ArrayList<String>();
         for (LogEntry le : records) {
             int statusCode = le.getStatusCode();
             String ipAddr = le.getIpAddress();
             if (statusCode >= low && statusCode <= high && !uniqueIPs.contains(ipAddr)) { 
                 uniqueIPs.add(ipAddr);
             }
         }
         return uniqueIPs.size();
     }
     
     public void printAllHigherThanNum (int num) {
         for (LogEntry le : records) {
             int statusCode = le.getStatusCode();
             if (statusCode > num) {
                 System.out.println(le);
             }
         }
     }
     
     public void printAll() {
         for (LogEntry le : records) {
             System.out.println(le);
         }
     }
}
