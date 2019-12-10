package userInterface;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPopupMenu;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.net.URL;

import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Icon;


public class InGame {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void nextWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InGame window = new InGame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.getContentPane().setLayout(null);
		
		ImageIcon ufo = new ImageIcon("./ufo.png");
		
		JLabel lblNewLabel = new JLabel(ufo);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(20, 59, 74, 51);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel((Icon) ufo);
		label.setBackground(Color.BLACK);
		label.setBounds(103, 59, 74, 51);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel((Icon) ufo);
		label_1.setBackground(Color.BLACK);
		label_1.setBounds(187, 59, 74, 51);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel((Icon) ufo);
		label_2.setBackground(Color.BLACK);
		label_2.setBounds(271, 59, 74, 51);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel((Icon) ufo);
		label_3.setBackground(Color.BLACK);
		label_3.setBounds(350, 59, 74, 51);
		frame.getContentPane().add(label_3);
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(20, 22, 404, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnEnemyship = new JMenu("enemyShip1");
		menuBar.add(mnEnemyship);
		
		JMenuItem mntmAttack = new JMenuItem("Attack");
		mnEnemyship.add(mntmAttack);
		
		JMenu mnEnemyship_1 = new JMenu("enemyShip2");
		menuBar.add(mnEnemyship_1);
		
		JMenuItem menuItem = new JMenuItem("Attack");
		mnEnemyship_1.add(menuItem);
		
		JMenu mnEnemyship_2 = new JMenu("enemyShip3");
		menuBar.add(mnEnemyship_2);
		
		JMenuItem menuItem_1 = new JMenuItem("Attack");
		mnEnemyship_2.add(menuItem_1);
		
		JMenu mnEnemyship_3 = new JMenu("enemyShip4");
		menuBar.add(mnEnemyship_3);
		
		JMenuItem menuItem_2 = new JMenuItem("Attack");
		mnEnemyship_3.add(menuItem_2);
		
		JMenu mnEnemyship_4 = new JMenu("enemyShip5");
		menuBar.add(mnEnemyship_4);
		
		JMenuItem menuItem_3 = new JMenuItem("Attack");
		mnEnemyship_4.add(menuItem_3);
		
		JButton btnMyship = new JButton("myShip");
		btnMyship.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShipInventory nxt = new ShipInventory();
				nxt.inventoryWindow();
			}
		});
		
		

		btnMyship.setBounds(172, 205, 89, 23);
		frame.getContentPane().add(btnMyship);
		
		textField = new JTextField();
		textField.setForeground(Color.RED);
		textField.setBackground(Color.BLUE);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("100/100");
		textField.setBounds(10, 230, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("100/100");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(Color.YELLOW);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.BLUE);
		textField_1.setBounds(338, 230, 86, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.BLUE);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setText("100/100");
		textField_2.setBounds(338, 206, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		

		
		
		

		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
