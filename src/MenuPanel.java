import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MenuPanel extends JPanel{
    protected JButton newGameButton;
    protected JButton rulesButton;
    protected JButton exitButton;
    private JButton startButton;
    private JTextField playerName;
    private JTextField parkName;
    private JLabel nameGame;

    public MenuPanel(int i) { // int i - we will have 3 start windows, this i represents number of each one

        switch (i) {
            case 1:
                window1();
                break;
            case 2:
                window2();
                break;
            case 3:
                window3();
                break;
        }
    }
    private void window1() {
       // this.setLayout(new BorderLayout(100,100));
       // this.setLayout(new FlowLayout());
        //background=new ImageIcon("images/menuFrameBcg.jpg").getImage();

        nameGame = new JLabel("Onyx Land");
        nameGame.setFont(new Font("Bernard MT Condensed",Font.PLAIN,35));
        nameGame.setForeground(new Color(212, 210, 210));

        newGameButton=new JButton("New Game");
        newGameButton.setFont(new Font("Bernard MT Condensed",Font.PLAIN,16));
        newGameButton.setForeground(new Color(38, 35, 37));
        newGameButton.setPreferredSize(new Dimension(150,50));
        newGameButton.setBackground(new Color(168, 111, 151));

        rulesButton=new JButton("Rules");
        rulesButton.setFont(new Font("Bernard MT Condensed",Font.PLAIN,16));
        rulesButton.setForeground(new Color(38, 35, 37));
        rulesButton.setPreferredSize(new Dimension(150,50));
        rulesButton.setBackground(new Color(168, 111, 151));

        exitButton = new JButton("Exit");
        exitButton.setPreferredSize(new Dimension(150,50));
        exitButton.setFont(new Font("Bernard MT Condensed",Font.PLAIN,16));
        exitButton.setForeground(new Color(38, 35, 37));
        exitButton.setBackground(new Color(168, 111, 151));


        //this.add(newGameButton,BorderLayout.NORTH);
       // this.add(rulesButton,BorderLayout.CENTER);
        //this.add(exitButton,BorderLayout.SOUTH);

        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(2,0, 2, 0);

        GridBagConstraints gbc0 = new GridBagConstraints();
        gbc0.gridwidth = GridBagConstraints.REMAINDER;
        gbc0.fill = GridBagConstraints.HORIZONTAL;
        gbc0.insets = new Insets(0,0, 100, 0);

        add(nameGame, gbc0);
        add(newGameButton, gbc);
        add(rulesButton, gbc);
        add(exitButton, gbc);

        this.setOpaque(false);


    }
    private void window2() {
        nameGame = new JLabel("Onyx Land");
        nameGame.setFont(new Font("Bernard MT Condensed",Font.PLAIN,35));
        nameGame.setForeground(new Color(212, 210, 210));

        playerName = new JTextField("Player1");
        playerName.setFont(new Font("Hero",Font.PLAIN,23));
        playerName.setBackground(new Color(168, 111, 151));
        playerName.setForeground(new Color(38, 35, 37));
        playerName.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        //playerName.setBorder(null);

        parkName = new JTextField("Disneyland-2");
        parkName.setFont(new Font("Hero",Font.PLAIN,23));
        parkName.setBackground(new Color(168, 111, 151));
        parkName.setForeground(new Color(38, 35, 37));
        parkName.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        //parkName.setBorder(null);

        startButton = new JButton("START");
        startButton.setPreferredSize(new Dimension(150,50));
        startButton.setFont(new Font("Bernard MT Condensed",Font.PLAIN,16));
        startButton.setForeground(new Color(38, 35, 37));
        startButton.setBackground(new Color(168, 111, 151));

        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0,0, 4, 0);

        GridBagConstraints gbc0 = new GridBagConstraints();
        gbc0.gridwidth = GridBagConstraints.REMAINDER;
        gbc0.fill = GridBagConstraints.HORIZONTAL;
        gbc0.insets = new Insets(0,0, 100, 0);

        add(nameGame, gbc0);
        add(playerName, gbc);
        add(parkName, gbc);
        add(startButton, gbc);

        this.setOpaque(false);
    }
    private void window3() {}
}
