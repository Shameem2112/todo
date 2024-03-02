package classes;

import javax.swing.*;
import java.awt.*;

public class task extends JPanel {
    private JLabel index;
    private JTextField taskdone;
    private JButton done;
    private boolean checked;

//Construtor
    task(){
        this.setPreferredSize(new Dimension(40,40));
        this.setBackground(Color.red);
        this.setLayout(new BorderLayout());
        checked= false;
        index = new JLabel();
        index.setPreferredSize(new Dimension(40,40));
        index.setHorizontalAlignment(JLabel.CENTER);
        this.add(index,BorderLayout.WEST);

        taskdone = new JTextField("add your task");
        taskdone.setPreferredSize(new Dimension(50,100));
        taskdone.setLayout(new BorderLayout());
        taskdone.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.darkGray));
        taskdone.setBackground(Color.CYAN);
        this.add(taskdone,BorderLayout.CENTER);
        done= new JButton("DONE");
        done.setPreferredSize(new Dimension(10,20));
        done.setLayout(new BorderLayout());
        done.setBorder(BorderFactory.createMatteBorder(2,2,2,2,Color.darkGray));
        done.setBackground(Color.orange);
        this.add(done,BorderLayout.SOUTH);
    }
    public  void ChangedState(){
        this.setBackground(Color.GREEN.brighter());
        taskdone.setBackground(Color.green);
        checked= true;

    }
    public JButton getDone(){
        return done;
    }
}
