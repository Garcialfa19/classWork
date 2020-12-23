package David.School;
import David.School.JPanelDrawing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;


public class GradesSystemInterface extends JFrame {

    // selector of files that are opened in the current directory
    private JFileChooser jFileChooser = new JFileChooser(System.getProperty("user.dir"));


    // We create two panels for the interface
    private JPanel leftPanel = new JPanel();
    private JPanelDrawing centralPanel = new JPanelDrawing();

    // We declare and initialize the button
    private JButton openButton = new JButton("Open");
    private JButton closeButton = new JButton("Close");


    // we declare a reference to the object that can be accessed from the private classes
    private GradesSystemInterface thisOne = this;

    public GradesSystemInterface(String title){
        // call the parent constructor
        super(title);

        // we assign a BorderLayout
        this.setLayout(new BorderLayout());

        // we assign a GridLaout
        leftPanel.setLayout(new GridLayout(2,1));

        // assigns the event drivers
        openButton.addActionListener(new EventListener());
        closeButton.addActionListener(new EventListener());

        // adds the components
        leftPanel.add(openButton);
        leftPanel.add(closeButton);


        // Adds the components to GradeSystemInterface
        this.add(leftPanel, BorderLayout.EAST);
        this.add(centralPanel, BorderLayout.CENTER);


        // Indicates the action that is to be performed when the window is closed by the parent method
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // assigns the size of the window with the parent method
        this.setSize(800,600);

        // indicates that the window has to be seen in the screen with the parent method
        this.setVisible(true);

    }

    /**
     * listens to the events of the component that sends them
     */
    private class EventListener implements ActionListener {
        public void actionPerformed(ActionEvent evento) {
            if (evento.getSource() == openButton) {
                JOptionPane.showMessageDialog(thisOne,
                        "does nothing",
                        "DrawingPanel",
                        JOptionPane.ERROR_MESSAGE);

            } else if (evento.getSource() == closeButton){
                thisOne.setVisible(false);
            }
        }
    }


}
