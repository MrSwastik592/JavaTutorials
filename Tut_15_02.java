import java.io.*;
import java.net.*;

public class Tut_15_02 {
    public static void main(String[] args) throws MalformedURLException {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String url = br.readLine();

            URL Url = new URL(url);

            URLConnection uc = Url.openConnection();

            System.out.println("Date : " + uc.getDate());
            System.out.println("Content Type :" + uc.getContentType());
            System.out.println("Content Length : " + uc.getContentLength());
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
