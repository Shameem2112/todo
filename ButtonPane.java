package classes;

import javax.swing.*;
import java.awt.*;

public class ButtonPane extends JPanel {
    private JButton addtask;
    private  JButton clear;

    //Constructor
    ButtonPane() {
        this.setPreferredSize(new Dimension(200, 200));
        this.setBackground(Color.black);
        addtask = new JButton("ADD TASK");
        addtask.setFont(new Font("Bahnschrift Condensed", Font.BOLD, 20));
        addtask.setBorder(BorderFactory.createMatteBorder(2, 1, 2, 2, Color.blue));
        addtask.setBackground(Color.cyan);
        this.add(addtask);
        clear = new JButton("CLEAR");
        clear.setFont(new Font("Bahnschrift Condensed", Font.BOLD, 20));
        clear.setBorder(BorderFactory.createMatteBorder(2, 1, 1, 2, Color.blue));
        clear.setBackground(Color.cyan);
        this.add(clear);

    }
    public JButton getAddtask(){
        return addtask;
    }
    public JButton getClear(){
        return clear;
    }

}
