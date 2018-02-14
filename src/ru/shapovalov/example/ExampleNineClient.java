package ru.shapovalov.example;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class ExampleNineClient extends JFrame implements Runnable {
    private static Socket socket;
    private static ObjectOutputStream objectOutputStream;
    private static ObjectInputStream objectInputStream;

    public static void main(String[] args) {
        new Thread(new ExampleNineClient("Test")).start();
        new Thread(new ExampleNineServer()).start();

    }

    public ExampleNineClient(String name) {
        super(name);
        setLayout(new FlowLayout());
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        final JTextField t1 = new JTextField(10);
        final JButton b1 = new JButton("Send");
        b1.addActionListener(a -> {
            if (a.getSource() == b1) sendMessage(t1.getText());
        });
        add(t1);
        add(b1);
    }


    @Override
    public void run() {
        try {
            socket = new Socket(InetAddress.getByName("127.0.0.1"), 5678);
            while (true) {
                objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                objectInputStream = new ObjectInputStream(socket.getInputStream());
                JOptionPane.showMessageDialog(null, (String) objectInputStream.readObject());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void sendMessage(Object obj) {
        try {
            objectOutputStream.flush();
            objectOutputStream.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
