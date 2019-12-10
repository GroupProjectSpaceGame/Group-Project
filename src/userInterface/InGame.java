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
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;


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
		lblNewLabel.setBounds(172, 40, 89, 51);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnMyship = new JButton("myShip");
		btnMyship.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShipInventory.inventoryWindow();
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
		
		JCheckBox chckbxTarget = new JCheckBox("Target");
		chckbxTarget.setBackground(Color.BLUE);
		chckbxTarget.setBounds(164, 98, 97, 23);
		frame.getContentPane().add(chckbxTarget);
		final boolean checked = chckbxTarget.isSelected();
		
		final JButton btnAttack = new JButton("Attack");
		btnAttack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(checked){
					String attackMsg = "Attacked!";
					JOptionPane.showMessageDialog(btnAttack, attackMsg);
				}else{
					String failMsg = "You didn't select a target";
					JOptionPane.showMessageDialog(btnAttack, failMsg);
				}
			}
		});
		btnAttack.setBounds(335, 180, 89, 23);
		frame.getContentPane().add(btnAttack);
		

		
		
		

		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
