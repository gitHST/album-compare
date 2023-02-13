import java.nio.file.Files
import java.nio.file.Paths

class Retrieve {

    static void getCover(String url, String destination) {
        String albumUrl = GetInfo(url, "<img aria-hidden=\"false\" draggable=\"false\" loading=\"eager\" src=", 64, 64);
        InputStream inputStream = null;
        inputStream = new URL(albumUrl).openStream();
        Files.copy(inputStream, Paths.get(destination));
        if (inputStream != null) {
            inputStream.close();
        }
    }





    static String GetInfo(String url, String key, int position, int len) {
        String siteContent = new URL(url).text;
        int index = siteContent.indexOf(key)
        return siteContent.substring((index + position), (index+ position + len));
    }

}
