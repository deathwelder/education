package ru.hui.pc1;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {

    public MyWindow() {
        setTitle("New Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setVisible(true);

        JButton button = new JButton("Button 1 Page Start");
        add(button, BorderLayout.PAGE_START);
        button = new JButton("Button 2 CENTER");
        button.setPreferredSize(new Dimension(200, 300));
        add(button, BorderLayout.CENTER);
        button = new JButton("Button 3 LINE START");
        add(button, BorderLayout.LINE_START);
        button = new JButton("Long named Button");
        add(button, BorderLayout.LINE_END);
        button = new JButton("PAGE END");
        add(button, BorderLayout.PAGE_END);

        setVisible(true);
    }


}