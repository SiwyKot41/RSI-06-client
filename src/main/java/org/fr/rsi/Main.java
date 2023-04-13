package org.fr.rsi;

import org.fr.rsi.ImageServerImpl;
import org.fr.rsi.ImageServerImplService;

import javax.swing.*;
import javax.xml.ws.soap.MTOMFeature;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ImageServerImplService service  = new ImageServerImplService();

        ImageServerImpl port = service.getImageServerImplPort(new MTOMFeature());
        byte[] image = port.downloadImage("mona-lisa.jpg");


        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        JLabel label = new JLabel(new ImageIcon(image));
        frame.add(label);
        frame.setVisible(true);

        System.out.println("imageServer.downloadImage() : Download Successful");
    }
}