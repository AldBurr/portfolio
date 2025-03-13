package unit12.activities;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
public class SearchPrinter 
{
    public static void main(String[] args) throws IOException 
    {
        URL url = new URL("https://search.yahoo.com");
        URLConnection connection = url.openConnection();
        connection.connect();
        InputStream inputStream = connection.getInputStream();
        Scanner scan = new Scanner(inputStream);
        while(scan.hasNext())
        {
            System.out.println(scan.nextLine());
        }
        scan.close();
    }
}
