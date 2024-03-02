package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class appframe extends JFrame {
    private ButtonPane btnpanel ;
    private titlebar tbar;
    private list list1;
    private JButton addtask;
    private JButton clear;
    //construtor
    public appframe(){
        this.setBounds(100,100,700,700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("todo_list");
        btnpanel = new ButtonPane();
        tbar = new titlebar();
        list1 = new list();
        this.add(tbar,BorderLayout.NORTH);
        this.add(btnpanel,BorderLayout.SOUTH);
        this.add(list1,BorderLayout.CENTER);
        addtask =btnpanel.getAddtask();
        clear=btnpanel.getClear();
        addListeners();
    }
    public void addListeners(){
        addtask.addMouseListener( new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                task task1 = new task();
                list1.add(task1);
                task1.getDone().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        task1.ChangedState();
                        clear.remove(task1);
                        revalidate();
                    }
                });
                revalidate();
            }

        });
        clear.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                task task2= new task();
                task2.ChangedState();
                //removeAll();
                remove(task2);
                //dispose();


            }
        });

        }


    }


