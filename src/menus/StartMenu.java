/* Harry Zhu and Justin Lee
 * ICS3U7 Ms. Strelkovska
 * November 14, 2020
 * Final project
 * This is the class for the start menu
 */

package menus;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.Frame;

public class StartMenu extends JPanel implements ActionListener {
	//VARIABLES
	private JButton play, info, exit;
	private ImageIcon chicken;
	private JLabel title;

	public StartMenu(ImageIcon chicken, Font font) {
		this.chicken = chicken;
		this.setBackground(new Color(105, 206, 236));

		// Set title 
		title = new JLabel();
		title.setText("Crossy Road But Scuffed");
		title.setLocation(20, 10);
		title.setSize(500, 100);
		title.setFont(font.deriveFont(38f));

		// Button that starts the game
		play = new JButton();
		play.setBounds(30, 350, 120, 75);
		play.addActionListener(this);
		play.setText("PLAY");
		play.setFont(font);
		play.setBorder(BorderFactory.createLineBorder(Color.black));
		play.setBackground(Color.white);

		// Instruction menu button
		info = new JButton();
		info.setBounds(190, 350, 120, 75);
		info.addActionListener(this);
		info.setText("INFO");
		info.setFont(font);
		info.setBorder(BorderFactory.createLineBorder(Color.black));
		info.setBackground(Color.white);

		// Button that exits the program
		exit = new JButton();
		exit.setBounds(350, 350, 120, 75);
		exit.addActionListener(this);
		exit.setText("EXIT");
		exit.setFont(font);
		exit.setBorder(BorderFactory.createLineBorder(Color.black));
		exit.setBackground(Color.white);

		this.setLayout(null);
		
		//add all the components
		this.add(play);
		this.add(info);
		this.add(exit);
		this.add(title);
		
		repaint();

		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == play) { // Goes to game panel
			Frame.layout.show(Frame.container, "gamepanel");
		} else if (e.getSource() == info) { // Goes to the first page of the instructions menu
			Frame.layout.show(Frame.container, "instructionmenu1");
		} else if (e.getSource() == exit) { // Exits the program
			System.exit(0);
		}
	}
	
	// Paints chicken image
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(chicken.getImage(), 120, 90, 250, 250, null);
	}
}
