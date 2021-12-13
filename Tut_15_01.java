import java.net.*;

public class Tut_15_01 {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://www.msbte.org");

        System.out.println("Host name :" + url.getHost());
        System.out.println("Protocol :" + url.getProtocol());
        System.out.println("Port :" + url.getPort());
        System.out.println("File name :" + url.getFile());
    }
}
