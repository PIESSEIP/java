import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Zgadula {

    private JLabel etykieta1, etykieta2, liczba;
    private JButton przycisk;
    private JTextArea poleTekstowe;

    public Zgadula() {
        JFrame myWindow = new JFrame("Kamil Sawicki 3pp");

        myWindow.setContentPane(myContentPane());
        myWindow.setSize(250,450);
        myWindow.setResizable(false);
        myWindow.setLocationRelativeTo(null);

        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }

    public JPanel myContentPane() {
        JPanel myPanel = new JPanel(null);
        Font czcionka = new Font("Thoma", Font.BOLD, 14);

        // Losowanie liczby
        Random rand = new Random();
        int wylosowanaLiczba = rand.nextInt(50) + 1;
        System.out.println(wylosowanaLiczba);


        etykieta1 = new JLabel();
        etykieta1.setText("ZGADULA");
        etykieta1.setBounds(45,25,150,50);
        etykieta1.setOpaque(true);
        etykieta1.setBackground(Color.WHITE);
        etykieta1.setForeground(Color.BLUE);
        etykieta1.setHorizontalAlignment(JLabel.CENTER);
        etykieta1.setVerticalAlignment(JLabel.CENTER);
        etykieta1.setFont(czcionka);
        myPanel.add(etykieta1);

        liczba = new JLabel();
        liczba.setText("Podaj liczbę: ");
        liczba.setBounds(0,75,150,50);
        liczba.setOpaque(true);
        liczba.setHorizontalAlignment(JLabel.LEFT);
        liczba.setVerticalAlignment(JLabel.CENTER);
        liczba.setFont(czcionka);
        myPanel.add(liczba);

        poleTekstowe = new JTextArea();
        poleTekstowe.setBounds(45,115,150,30);
        myPanel.add(poleTekstowe);

        przycisk = new JButton();
        przycisk.setText("TEST");
        przycisk.setBounds(45,190,150,50);
        przycisk.setHorizontalAlignment(JButton.CENTER);
        przycisk.setVerticalAlignment(JButton.CENTER);
        myPanel.add(przycisk);

        etykieta2 = new JLabel();
        etykieta2 = new JLabel();
        etykieta2.setText("");
        etykieta2.setBounds(45,270,150,100);
        etykieta2.setOpaque(true);
        etykieta2.setBackground(Color.WHITE);
        etykieta2.setHorizontalAlignment(JLabel.CENTER);
        etykieta2.setVerticalAlignment(JLabel.CENTER);
        myPanel.add(etykieta2);


        final int[] proby = {5};
        przycisk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Pobieranie danych z pola tekstowego
                String wprowadzonaLiczba = poleTekstowe.getText();
                int liczba = Integer.valueOf(wprowadzonaLiczba);

                // Sprawdzanie czy trafiono wylosowana liczbe
                if (proby[0] <= 1) {
                    etykieta2.setText("PRZEGRAŁEŚ");
                } else if (liczba != wylosowanaLiczba) {
                    etykieta2.setText("PUDŁO");
                    poleTekstowe.setText("");
                    System.out.println(liczba);
                    proby[0]--;
                    System.out.println("Pozostale proby: " + proby[0]);
                } else {
                    etykieta2.setText("TRAFIONY");
                    System.out.println(liczba);
                }
            }
        });

        return myPanel;
    }

    public static void main(String[] args) { new Zgadula(); }
}
