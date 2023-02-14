import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JPanel
import java.awt.BorderLayout
import java.awt.CardLayout
import java.awt.event.ActionEvent
import java.awt.event.ActionListener

class StartPanel extends JPanel{

    public JPanel startPanel;


    public StartPanel() {

        startPanel = new JPanel();


        JButton startButton = new JButton("Start")
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GUI.layout.next(GUI.masterPanel);
            }
        });

        startPanel.add(startButton)
    }
}
