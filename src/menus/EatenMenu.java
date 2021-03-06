/* Harry Zhu and Justin Lee
 * ICS3U7 Ms. Strelkovska
 * November 14, 2020
 * Final project
 * This is the class for the menu when the player is eaten
 */

package menus;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import main.Frame;
import tools.Tools;

public class EatenMenu extends JPanel implements ActionListener {
	private JButton next;
	private ImageIcon eaten, filmore;

	public EatenMenu(ImageIcon eaten, ImageIcon filmore) {
		this.setBackground(Tools.WATER);
		this.eaten = eaten;
		this.filmore = filmore;
		
		next = new JButton();

		// Next button
		next.setBounds(190, 421, 120, 50);
		next.addActionListener(this);
		next.setText("NEXT");
		next.setFont(Tools.font);
		next.setBorder(BorderFactory.createLineBorder(Color.black));
		next.setBackground(Color.white);

		//add all the components
		this.add(next);
		
		this.setLayout(null);
		
		repaint();
		
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == next) { // Goes to end menu
			Frame.layout.show(Frame.container, "endmenu");
		}
	}
	// Paints Filmore eaten screen
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(eaten.getImage(), 10, 0, 500, 250, null); //draws the text
		g.drawImage(filmore.getImage(), 16, 250, (int) (192 * 2.5), (int) (64 * 2.5), null); //draws the filmore image
	}
}
