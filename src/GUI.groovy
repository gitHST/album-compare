import javax.swing.ImageIcon
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JPanel
import java.awt.BorderLayout
import java.awt.CardLayout
import java.awt.event.ActionEvent
import java.awt.event.ActionListener

public class GUI {

    static void main(String[] args) {
        new GUI();
    }
    //String link = "https://open.spotify.com/album/6yC6aLzX5knhWpKDidwxft"
    // String destination = "C:\\Users\\lcwbr\\repos\\Misc\\AlbumCompare\\albums\\covers\\"


    public JFrame frame;
    public JPanel masterPanel;
    public JPanel searchPanel;
    public JPanel choosePanel;
    public JPanel resultsPanel;
    public CardLayout layout;


    public GUI() {
        // main frame
        frame = new JFrame("Hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // main panel
        masterPanel = new JPanel();
        layout = new CardLayout();
        masterPanel.setLayout(layout)

        // other panels
        StartPanel startPanel = new StartPanel();
        searchPanel = new JPanel();
        choosePanel = new JPanel();
        resultsPanel = new JPanel();

        // adding panels to main panel
        masterPanel.add(startPanel.startPanel, "Main Menu")
        masterPanel.add(searchPanel, "Add Albums")
        masterPanel.add(choosePanel, "Selection Process...")
        masterPanel.add(resultsPanel, "Results")

        ImageIcon album = new ImageIcon("C:\\Users\\lcwbr\\repos\\Misc\\AlbumCompare\\src\\Luv Is Rage 2¬Lil Uzi Vert.png")
        JLabel albumLabel = new JLabel(album)
        searchPanel.add(albumLabel)

        frame.getContentPane().add(masterPanel, BorderLayout.CENTER);
        frame.setVisible(true)
        layout.show(masterPanel, "Main Menu")
        // searchPanel.setVisible(true)

    }
}



