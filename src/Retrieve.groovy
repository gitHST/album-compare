import java.nio.file.Files
import java.nio.file.Paths

class Retrieve {

    static downloadCover(String url, String destination) {
        String albumUrl = getInfo(url, "<img aria-hidden=\"false\" draggable=\"false\" loading=\"eager\" src=", 64, 64);
        InputStream inputStream = null;
        inputStream = new URL(albumUrl).openStream();

        String s = fileFriendlyName(url)

        def dir = new File(destination)

        if (dir.listFiles().any { it.name == (s + ".png") }) {
            println("The file name '$s' exists in the directory")
        } else {
            println("The file name '$s' does not exist in the directory")
            Files.copy(inputStream, Paths.get((destination + s + ".png")))
            if (inputStream != null) {
                inputStream.close();
            }
        }

    }

    static String getAlbumName(String url) {
        String boobs = getInfo(url, "<meta property=\"og:title\" content=", 35, 256);
        String[] parts = boobs.split("\"");
        return parts[0].replace("&quot;", "\"").replace("&amp;", "&")

    }

    private static String fileFriendlyName(String url) {
        String boobs = getInfo(url, "lang=\"en\" dir=\"ltr\"><head><meta charSet=\"utf-8\"/><title>", 56, 256);
        String[] parts = boobs.split("\\|");
        return ((parts[0].substring(0, parts[0].length() - 1)).split(" - Album by ")).collect { it.trim() }.join("¬")
    }

    private static String getInfo(String url, String key, int position, int len) {
        String siteContent = new URL(url).text;
        print(siteContent)
        int index = siteContent.indexOf(key);
        return siteContent.substring((index + position), (index+ position + len));
    }

}
