import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Przeliczenie {

    private JLabel zamiana, etC, etK, etF, konwersacja;
    private JButton buC, buK, buF, clear;
    private JTextArea txC, txK, txF, txKonwertowanie;

    public Przeliczenie() {
        JFrame myWindow = new JFrame("Kamil Sawicki przeliczanie");

        myWindow.setContentPane(myContentPane());
        myWindow.setSize(500,400);
        myWindow.setResizable(false);
        myWindow.setLocationRelativeTo(null);

        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }

    public JPanel myContentPane() {
        JPanel myPanel = new JPanel(null);
        Font czcionka = new Font("Arial",Font.BOLD,14);

        myPanel.setBackground(Color.CYAN);
        // Etykiety
        zamiana = new JLabel();
        zamiana.setText("Zamiana jednostek");
        zamiana.setBounds(165,5,150,30);
        zamiana.setOpaque(true);
        zamiana.setBackground(new Color(128,0,128));
        zamiana.setForeground(Color.WHITE);
        zamiana.setHorizontalAlignment(JLabel.CENTER);
        zamiana.setVerticalAlignment(JLabel.CENTER);
        zamiana.setFont(czcionka);
        myPanel.add(zamiana);

        etC = new JLabel();
        etC.setText("°C");
        etC.setBounds(100,45,30,30);
        etC.setOpaque(true);
        etC.setBackground(new Color(128,0,128));
        etC.setForeground(Color.WHITE);
        etC.setHorizontalAlignment(JLabel.CENTER);
        etC.setVerticalAlignment(JLabel.CENTER);
        etC.setFont(czcionka);
        myPanel.add(etC);

        etK = new JLabel();
        etK.setText("K");
        etK.setBounds(100,85,30,30);
        etK.setOpaque(true);
        etK.setBackground(new Color(128,0,128));
        etK.setForeground(Color.WHITE);
        etK.setHorizontalAlignment(JLabel.CENTER);
        etK.setVerticalAlignment(JLabel.CENTER);
        etK.setFont(czcionka);
        myPanel.add(etK);

        etF = new JLabel();
        etF.setText("F");
        etF.setBounds(100,125,30,30);
        etF.setOpaque(true);
        etF.setBackground(new Color(128,0,128));
        etF.setForeground(Color.WHITE);
        etF.setHorizontalAlignment(JLabel.CENTER);
        etF.setVerticalAlignment(JLabel.CENTER);
        etF.setFont(czcionka);
        myPanel.add(etF);

        konwersacja = new JLabel();
        konwersacja.setText("Konwersacja");
        konwersacja.setBounds(190,165,100,30);
        konwersacja.setOpaque(true);
        konwersacja.setBackground(new Color(128,0,128));
        konwersacja.setForeground(Color.WHITE);
        konwersacja.setHorizontalAlignment(JLabel.CENTER);
        konwersacja.setVerticalAlignment(JLabel.CENTER);
        konwersacja.setFont(czcionka);
        myPanel.add(konwersacja);

        // Pola tekstowe
        txC = new JTextArea();
        txC.setBounds(140,45,200,30);
        txC.setBorder(new LineBorder(Color.BLACK));
        txC.setForeground(Color.BLACK);
        txC.setFont(czcionka);
        myPanel.add(txC);

        txK = new JTextArea();
        txK.setBounds(140,85,200,30);
        txK.setBorder(new LineBorder(Color.BLACK));
        txK.setForeground(Color.BLACK);
        txK.setFont(czcionka);
        myPanel.add(txK);

        txF = new JTextArea();
        txF.setBounds(140,125,200,30);
        txF.setBorder(new LineBorder(Color.BLACK));
        txF.setForeground(Color.BLACK);
        txF.setFont(czcionka);
        myPanel.add(txF);

        txKonwertowanie = new JTextArea();
        txKonwertowanie.setBounds(100,200,280,100);
        txKonwertowanie.setEditable(false);
        txKonwertowanie.setBorder(new LineBorder(Color.BLACK));
        txKonwertowanie.setForeground(Color.BLACK);
        txKonwertowanie.setFont(czcionka);
        myPanel.add(txKonwertowanie);

        // Przyciski
        buC = new JButton();
        buC.setText("A");
        buC.setBounds(350,45,60,30);
        buC.setHorizontalAlignment(JButton.CENTER);
        buC.setVerticalAlignment(JButton.CENTER);
        buC.setFont(czcionka);
        myPanel.add(buC);

        buK = new JButton();
        buK.setText("B");
        buK.setBounds(350,85,60,30);
        buK.setHorizontalAlignment(JButton.CENTER);
        buK.setVerticalAlignment(JButton.CENTER);
        buK.setFont(czcionka);
        myPanel.add(buK);

        buF = new JButton();
        buF.setText("C");
        buF.setBounds(350,125,60,30);
        buF.setHorizontalAlignment(JButton.CENTER);
        buF.setVerticalAlignment(JButton.CENTER);
        buF.setFont(czcionka);
        myPanel.add(buF);

        clear = new JButton();
        clear.setText("CLEAR");
        clear.setBounds(190,320,100,30);
        clear.setHorizontalAlignment(JButton.CENTER);
        clear.setVerticalAlignment(JButton.CENTER);
        clear.setFont(czcionka);
        myPanel.add(clear);

        buC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    //Pobieranie danych z pola tekstowego
                Double celjusze = Double.valueOf(txC.getText());

                    // Obliczanie
                Double kelwiny = celjusze + 273.15;
                Double fahrenheity = celjusze * 2 + 30;

                txKonwertowanie.append("°C: " + String.valueOf(celjusze) + "\n");
                txKonwertowanie.append("K: " + String.valueOf(kelwiny) + "\n");
                txKonwertowanie.append("F: " + String.valueOf(fahrenheity) + "\n");
            }
        });

        buK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    //Pobieranie danych z pola tekstowego
                Double kelwiny = Double.valueOf(txK.getText());

                    // Obliczanie
                Double celjusze = kelwiny - 273.15;
                Double fahrenheity = (kelwiny - 273.15) * 9/5 + 32;

                txKonwertowanie.append("°C: " + String.valueOf(celjusze) + "\n");
                txKonwertowanie.append("K: " + String.valueOf(kelwiny) + "\n");
                txKonwertowanie.append("F: " + String.valueOf(fahrenheity) + "\n");
            }
        });

        buF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    //Pobieranie danych z pola tekstowego
                Double fahrenheity = Double.valueOf(txF.getText());

                    // Obliczanie
                Double celjusze = (fahrenheity - 30) / 2;
                Double kelwiny = (fahrenheity - 32) * 5/9 + 273.15;

                txKonwertowanie.append("°C: " + String.valueOf(celjusze) + "\n");
                txKonwertowanie.append("K: " + String.valueOf(kelwiny) + "\n");
                txKonwertowanie.append("F: " + String.valueOf(fahrenheity) + "\n");
            }
        });

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txKonwertowanie.setText("");
                txC.setText("");
                txK.setText("");
                txF.setText("");
            }
        });

        return myPanel;
    }

    public static void main(String[] args){new Przeliczenie();}
}
