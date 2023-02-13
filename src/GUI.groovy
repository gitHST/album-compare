import java.nio.file.Files;
import java.nio.file.Paths;

public class GUI {
    public static void main(String[] args) {


        /*
        // create jframe
        JFrame frame = new JFrame();
        // set title
        frame.setTitle("Album Rank");
        // idk
        frame.setLayout(new BorderLayout());
        // set frame size
        frame.setSize(1920, 1080);
        // makes it exit upon closing
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this will make the app to always display at the center
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        */

        // INPUT FOR ALBUM URL AS STANDS
        String link = System.in.newReader().readLine()

        DownloadAlbumCover(link);
    }

    public static void DownloadAlbumCover(String url) {
        String siteContent = new URL(url).text;
        int index = siteContent.indexOf("<img aria-hidden=\"false\" draggable=\"false\" loading=\"eager\" src=")
        String imageUrl = siteContent.substring((index + 64), (index + 128));
        println(imageUrl);
        String destinationFilePath = "C:\\Users\\lcwbr\\repos\\Misc\\AlbumCompare\\test.png";
        InputStream inputStream = null;
        try {
            inputStream = new URL(imageUrl).openStream();
            Files.copy(inputStream, Paths.get(destinationFilePath));
        }
        catch (IOException e) {
            System.out.println("Exception Occurred " + e);
        }
        finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                }
                catch (IOException e) {
                    // Ignore
                }
            }
        }
    }
}
