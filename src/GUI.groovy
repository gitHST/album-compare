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
        SearchPanel searchPanel = new SearchPanel()
        ChoosePanel choosePanel = new ChoosePanel()
        ResultsPanel resultsPanel = new ResultsPanel()

        // adding panels to main panel
        masterPanel.add(startPanel.startPanel, "1")
        masterPanel.add(searchPanel.searchPanel, "2")
        masterPanel.add(choosePanel.choosePanel, "3")
        masterPanel.add(resultsPanel.resultsPanel, "4")

        ImageIcon album = new ImageIcon("C:\\Users\\lcwbr\\repos\\Misc\\AlbumCompare\\src\\Luv Is Rage 2¬Lil Uzi Vert.png")
        JLabel albumLabel = new JLabel(album)
        searchPanel.add(albumLabel)

        frame.getContentPane().add(masterPanel, BorderLayout.CENTER);
        frame.setVisible(true)
        layout.show(masterPanel, "1")

    }
}



