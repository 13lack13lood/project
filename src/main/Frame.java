package main;

import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import tools.Tools;

public class Frame extends JFrame {
	//VARIABLES
	public static final int WIDTH = 512, HEIGHT = 512, SQUARE = 64; //width, height, and size of a square of the screen

	public static CardLayout layout;
	public static Container container;
	private ImageIcon icon;

	public Frame() {
		container = getContentPane();
		layout = new CardLayout();
		container.setLayout(layout);

		icon = Tools.icon; 
		setIconImage(icon.getImage()); //set the icon of the frame

		setTitle("Crossy Road But Scuffed");
		setSize(WIDTH + 14, HEIGHT + 30 + 7); //the size of the insets is added to the width and height when setting the size so the actual display is the correct size
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); //frame should not be re-sizable
	}

}
