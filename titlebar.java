package classes;

import javax.swing.*;
import java.awt.*;

public class titlebar  extends JPanel {
    //construtor
    titlebar(){

        this.setPreferredSize(new Dimension(100,200));
        this.setBackground(Color.YELLOW);
        JLabel label = new JLabel("TODO_list");
        label.setPreferredSize(new Dimension(200,200));
        label.setFont(new Font("Bahnschrift Condensed", Font.ITALIC,20));
        label.setHorizontalAlignment(JLabel.CENTER);
        this.add(label);

    }



}
