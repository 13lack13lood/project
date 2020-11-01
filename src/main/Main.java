package main;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.ImageIcon;

import javax.swing.ImageIcon;

import game.entities.Player;
import game.gamePanel.GamePanel;
import menus.StartMenu;

public class Main {

	public static void main(String[] args) {
		Frame frame = new Frame();
		
		StartMenu startMenu = new StartMenu(new ImageIcon("res/chicken.png"),new Font("Comic Sans MS",Font.BOLD,20));
		
		Player player = new Player(new ImageIcon("res/chicken.png"), Frame.SQUARE, 8);
		GamePanel gamePanel = new GamePanel(player);
		gamePanel.setFocusable(true);
		
		Frame.container.add(startMenu, BorderLayout.CENTER);
		Frame.container.add(gamePanel, BorderLayout.CENTER);

		frame.setVisible(true);
	}
}
