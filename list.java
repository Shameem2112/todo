package classes;

import javax.swing.*;
import java.awt.*;

public class list extends JPanel {
    public list(){
        GridLayout gridLayout = new GridLayout(10,1);
         gridLayout.setVgap(5);
         this.setLayout(gridLayout);
         this.setBackground(Color.blue);


    }
}
