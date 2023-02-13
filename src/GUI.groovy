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
        // String link = System.in.newReader().readLine()
        String link = "https://open.spotify.com/album/4SZko61aMnmgvNhfhgTuD3"
        String destination = "C:\\Users\\lcwbr\\repos\\Misc\\AlbumCompare\\test.png"
        print(Retrieve.getCover(link, destination));
    }

}
