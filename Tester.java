import java.util.Date;
import java.util.ArrayList;

public class Tester
{
    public void testLogEntry() {
        LogEntry le = new LogEntry("1.2.3.4", new Date(), "example request", 200, 500);
        System.out.println(le);
        LogEntry le2 = new LogEntry("1.2.100.4", new Date(), "example request 2", 300, 400);
        System.out.println(le2);
    }
    
    public void testLogAnalyzer() {
        LogAnalyzer logAnalyzer = new LogAnalyzer();
        logAnalyzer.readFile("short-test_log");
        logAnalyzer.printAll();
    }
    
    public void testUniqIP () {
        LogAnalyzer logAnalyzer = new LogAnalyzer();
        logAnalyzer.readFile("short-test_log");
        int uniqueIPs = logAnalyzer.countUniqueIPs();
        System.out.println("There are " + uniqueIPs + " unique IPs");
    }
    
    public void testAllHigherThanNum () {
        LogAnalyzer logAnalyzer = new LogAnalyzer();
        logAnalyzer.readFile("weblog1_log");
        int num = 400;
        logAnalyzer.printAllHigherThanNum(num);
    }
    
    public void testUniqIPsOnDay () {
        LogAnalyzer logAnalyzer = new LogAnalyzer();
        logAnalyzer.readFile("weblog1_log");
        String someday = "Mar 24";
        ArrayList<String> uniqueIPsOnDay = logAnalyzer.uniqueIPVisitsOnDay(someday);
        System.out.println("There are " + uniqueIPsOnDay.size() + " unique IPs on day " + someday);
    }
    
    public void testUniqueIPsInRange () {
        LogAnalyzer logAnalyzer = new LogAnalyzer();
        logAnalyzer.readFile("weblog1_log");
        int low = 200;
        int high = 299;
        int uniqueIPsInRange = logAnalyzer.countUniqueIPsInRange(low, high);
        System.out.println("There are " + uniqueIPsInRange + " unique IPs with Status Code in range " + low + " - " + high);
    }
}
