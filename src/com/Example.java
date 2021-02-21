package com;

import java.awt.*;
import javax.swing.*;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author 19616
 * @Date 2021/1/7 20:32
 */
public class Example extends javax.swing.JFrame {
    public void CreateJFrame(String title) {
        JFrame jf = new JFrame(title);
        Container container = jf.getContentPane();
        JLabel jl = new JLabel("this is a jframe window");
        jl.setHorizontalAlignment(SwingConstants.CENTER);

        container.add(jl);
        container.setBackground(Color.white);
        jf.setVisible(true);
        jf.setSize(200,150);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Example().CreateJFrame("biaoti");
    }
}
