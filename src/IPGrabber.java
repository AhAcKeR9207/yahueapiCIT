import java.io.*;
import java.util.*;

public class IPGrabber {
   public static String getIp() throws IOException {
      String ip;
      Runtime run = Runtime.getRuntime();
      Process process = run.exec("powershell.exe ping 10.180.63.255; arp -a | select-string 'd0-73-d5' |% { $_.ToString().Trim().Split(' ')[0] }");
      process.getOutputStream().close();
      
      Scanner psOut = new Scanner(new InputStreamReader(process.getInputStream()));
      for (int i = 0; i < 9; i++) { // passes the ping output
         psOut.nextLine();
      }
      
      if (psOut.hasNext()) {
         psOut.nextLine();
         psOut.nextLine();
                  
         // Collects the remaining ips
         ip = psOut.hasNext() ? psOut.nextLine() : null;
         System.out.println("Found ip: " + ip);

         psOut.close();
         return ip;
      } else {
         System.out.println("No ip found...");
         
         psOut.close();
         return null;
      }
   }
}