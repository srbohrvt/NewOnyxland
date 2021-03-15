import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class OnyxLandGUI {
    public JFrame menuframe;
    public JFrame gameFrame;
    public MenuPanel menupanel;
    public JLabel nameGame;
    private Image background;

    public OnyxLandGUI(){
        menuframe=new JFrame("OnyxLand");

        //creating backgroung img
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("src/img/background2.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        menuframe.setContentPane(new JLabel(imageIcon));
        menuframe.getContentPane().setLayout(new BoxLayout(menuframe.getContentPane(), BoxLayout.PAGE_AXIS));

        /*nameGame = new JLabel("Onyx Land");
        nameGame.setHorizontalAlignment(SwingConstants.CENTER);
        nameGame.setFont(new Font("Bernard MT Condensed",Font.PLAIN,28));
        nameGame.setForeground(new Color(212, 210, 210));*/

        menuframe.setSize(500,500);
        menuframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //menuframe.getContentPane().add(nameGame,BorderLayout.NORTH);

        menupanel = new MenuPanel(1);
        menuframe.getContentPane().add(menupanel);

        menuframe.setVisible(true);

        if (menupanel.newGameButton != null) {
            menupanel.newGameButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    menuframe.getContentPane().removeAll();
                    menuframe.getContentPane().repaint();

                    menuframe.setSize(500,500);
                    menuframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    menupanel = new MenuPanel(2);
                    menuframe.getContentPane().add(menupanel);

                    menuframe.setVisible(true);
                }
            });
            menupanel.exitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    menuframe.dispose();
                }
            });
        }
    }



}
