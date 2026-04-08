// MarvellousMain.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JLabel;

class MarvellousLogin extends Template implements ActionListener , Runnable
{
    JButton SUBMIT;
    JLabel label1, label2, label3, TopLabel;
    final JtextField text , text2;
    private static int attepmt = 3;

    MarvellousLogin()
    {
        TopLabel = new JLabel();
        TopLabel.setHorizontalAlignment(SwingConstants.CENTER);
        TopLabel.setText("Marvellous Packer Unpacker : Login ");
        TopLabel.setForeground(Color.BLUE);

        Dimension topsize = TopLabel.getPreferredSize();
        TopLable.setBounds(50,40,topsize,width,topsize,height);
        _header.add(TopLabel);

        label1 = new JLabel();
        label1 = setText("Username : ");
        label1 = setForeground(Color.white);

        Dimension size = lable1.getPreferredSize();

        label1.setBounds(50,135,size);
    }
}