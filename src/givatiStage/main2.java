/*
package givatiStage;

import javax.swing.*;
import java.awt.*;


      import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

    public class Main2 extends JFrame {

        public static void main(String[] args) {

            Main2 m = new Main2();

        }

        public Main2() {
            setVisible(true);
            setSize(1000,1000);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setResizable(true);
            setLocationRelativeTo(null);
            setLayout(null);

            JLabel title = new JLabel("my text");
            title.setBounds(0,300,100,100);//מיקום
            this.add(title);
            title.setForeground(Color.BLUE);//צבע
            title.setBackground(Color.cyan);//צבע
            title.setOpaque(true);
            Font n = new Font("m",Font.BOLD,20);//עיצוב
            title.setFont(n);

            JButton m1 = new JButton("click 1");
            m1.setBounds(0,0,100,100);
            this.add(m1);

            JButton m2 = new JButton("click 2");
            m2.setBounds(m1.getX(),m1.getY()+m1.getHeight(),m1.getHeight(),m1.getWidth());
            this.add(m2);

            categoris categories = new categoris();
            this.add(categories);
            this.setLayout(null);
            this.setLocationRelativeTo(null);
            this.setSize(500, 500);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setVisible(true);


            JButton m3 = new JButton("click 3");
            m3.setBounds(m1.getX(),m2.getY()+m2.getHeight(),m2.getHeight(),m2.getWidth());
            this.add(m3);
        }

    }




*/