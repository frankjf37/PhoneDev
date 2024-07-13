import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkingDemo {
    public static void main(String[] args) throws UnknownHostException {
        
        String url = "www.mundodeportivo.com";

        InetAddress inetAddress = Inet4Address.getByName(url);

        System.out.println("Address : " + Arrays.toString(inetAddress.getAddress()));

        //getHostAddress() method
        System.out.println("Host Address : " + inetAddress.getHostAddress());

        //isAnyLocalAddress() method
        System.out.println("isAnyLocalAddress : " + inetAddress.isAnyLocalAddress());

        //isLinkLocalAdddress() method
        System.out.println("isLinkLocalAddress : " + inetAddress.isLinkLocalAddress());

    }

}
