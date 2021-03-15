import javax.swing.*;
import java.awt.*;

public class OnyxLandGUI {
    public JFrame menuframe;
    public JFrame gameFrame;
    public MenuPanel menupanel;
    public JLabel nameGame;

    public OnyxLandGUI(){
        menuframe=new JFrame("OnyxLand");
        nameGame = new JLabel("Onyx Land");
        nameGame.setHorizontalAlignment(SwingConstants.CENTER);

        nameGame.setFont(new Font("Bernard MT Condensed",Font.PLAIN,28));
        menuframe.setSize(500,500);
        menuframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menupanel =new MenuPanel();
        menuframe.getContentPane().add(nameGame,BorderLayout.NORTH);
        menuframe.getContentPane().add(menupanel);

        menuframe.setVisible(true);
    }



}
