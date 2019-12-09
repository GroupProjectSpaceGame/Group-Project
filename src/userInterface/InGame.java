package userInterface;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;


public class InGame {

	private JFrame frame;

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
				
			}
		});
		btnMyship.setBounds(172, 205, 89, 23);
		frame.getContentPane().add(btnMyship);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
