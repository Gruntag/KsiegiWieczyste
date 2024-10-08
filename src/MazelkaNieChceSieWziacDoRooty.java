import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class MazelkaNieChceSieWziacDoRooty
{
    public static void main(String[] args)
    {
        URL url;
        InputStream is = null;
        BufferedReader br;
        String line;

        try {
            url = new URL("https://ekw.ms.gov.pl/eukw_ogol/menu.do");
            is = url.openStream();  // throws an IOException
            br = new BufferedReader(new InputStreamReader(is));

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (MalformedURLException mue) {
            mue.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (is != null) is.close();
            } catch (IOException ioe) {
                // nothing to see here
            }
        }
        System.out.println("a moskal się wziął");
    }
}
