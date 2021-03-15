import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel{
    private JButton newGameButton;
    private JButton rulesButton;
    private JButton exitButton;
    private Image background;
    public MenuPanel(){
       // this.setLayout(new BorderLayout(100,100));
       // this.setLayout(new FlowLayout());
        background=new ImageIcon("images/menuFrameBcg.jpg").getImage();


        newGameButton=new JButton("New Game");
        newGameButton.setFont(new Font("Bernard MT Condensed",Font.PLAIN,16));
        newGameButton.setPreferredSize(new Dimension(150,50));

        rulesButton=new JButton("Rules");
        rulesButton.setFont(new Font("Bernard MT Condensed",Font.PLAIN,16));
        rulesButton.setPreferredSize(new Dimension(150,50));


        exitButton = new JButton("Exit");
        exitButton.setPreferredSize(new Dimension(150,50));
        exitButton.setFont(new Font("Bernard MT Condensed",Font.PLAIN,16));


        //this.add(newGameButton,BorderLayout.NORTH);
       // this.add(rulesButton,BorderLayout.CENTER);
        //this.add(exitButton,BorderLayout.SOUTH);

        this.setLayout(new GridBagLayout());GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;add(newGameButton, gbc);add(rulesButton, gbc);add(exitButton, gbc);

    }

}
