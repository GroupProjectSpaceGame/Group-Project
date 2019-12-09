package userInterface;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu {

	private JFrame frame;
	private JTextArea txtrGameName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
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
	public MainMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(72, 61, 139));
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnPlay = new JButton("PLAY");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InGame nw = new InGame();
				nw.nextWindow();
			}
		});
		
		btnPlay.setBackground(UIManager.getColor("Button.shadow"));
		btnPlay.setBounds(175, 85, 89, 23);
		frame.getContentPane().add(btnPlay);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBackground(UIManager.getColor("Button.shadow"));
		btnExit.setBounds(175, 185, 89, 23);
		frame.getContentPane().add(btnExit);
		
		txtrGameName = new JTextArea();
		txtrGameName.setForeground(new Color(255, 255, 153));
		txtrGameName.setBackground(new Color(72,61,139));
		txtrGameName.setText("GAME NAME");
		txtrGameName.setFont(new Font("Garamond", Font.BOLD, 58));
		txtrGameName.setBounds(29, 11, 381, 64);
		frame.getContentPane().add(txtrGameName);
	}
}
