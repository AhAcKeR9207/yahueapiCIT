import java.io.IOException;

public class Main {
   public static void main(String[] args) throws IOException {
      String ip = IPGrabber.getIp();
      
      System.out.println(ip);
   }
}  