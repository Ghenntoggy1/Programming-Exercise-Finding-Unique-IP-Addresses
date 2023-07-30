PROJECT TITLE: "Programming Exercise: Finding Unique IP Addresses"

PURPOSE OF PROJECT: Modify existing code to do additional tasks. Specifically:
                    task 1 - find the number of unique IP addresses;
                    task 2 - examine all the web log entries in records and print 
                    those LogEntrys that have a status code greater than a certain 
                    number num;
                    task 3 - examine all the web logs in records and returns an ArrayList 
                    of Strings of unique IP addresses that had access on a given day;
                    task 4 - find the number of unique IP addresses in records that have 
                    a status code in the range from low to high, inclusive.
                    Also, make use of Object oriented principle of programming.

DATE: 30.07.2023

HOW TO START THIS PROJECT: Use BlueJ Environment to open project named "package.bluej". 
                           Find inside of this project 4 classes: 
                           LogEntry (organizes all the variables from the WebLogParser
                           and return a string with them)
                           WebLogParser (take line from WebLog and make it an object of
                           type LogEntry that holds all information about specific log)
                           LogAnalyzer (stores all log entries and print them on the screen)
                           Tester - compile, create object of type Tester 
                           and start one of the following functions: 
                           "testUniqueIP" for task 1;
                           "testAllHigherThanNum" for task 2;
                           "testUniqueIPsOnDay" for task 3;
                           "testUniqueIPsInRange" for task 4;
                           It chooses automatically one file from the project folder.
                           You may choose another one web log example file, but should modify
                           filename in the code.

AUTHOR: Gusev Roman

USER INSTRUCTIONS: If your time zone is different from Durham, 
                   USA, you may want to temporarily change the time zone on your 
                   computer as the time zone setting of your computer affects the 
                   output value from the getAccessTime method.
                   you will need 6 imports: 
                   "edu.duke.FileResource" (simplified version of 
                   File function from Java);
                   "java.text.SimpleDateFormat";
                   "java.text.ParsePosition";
                   "java.util.ArrayList", 
                   "java.util.Date";
                   "java.util.Locale;";
