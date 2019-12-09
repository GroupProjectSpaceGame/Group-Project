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


public class InGame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		
		final JMenu mnEnemyship = new JMenu("EnemyShip1");
		mnEnemyship.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JMenuItem mntmAttack = new JMenuItem("Attack");
				mnEnemyship.add(mntmAttack);
			}
		});
		mnEnemyship.setForeground(Color.YELLOW);
		mnEnemyship.setBounds(10, 11, 107, 22);
		frame.getContentPane().add(mnEnemyship);
		

		
		JMenu mnEnemyship_2 = new JMenu("EnemyShip2");
		mnEnemyship_2.setForeground(Color.YELLOW);
		mnEnemyship_2.setBounds(166, 11, 107, 22);
		frame.getContentPane().add(mnEnemyship_2);
		
		JMenuItem mntmAttack_1 = new JMenuItem("Attack");
		mnEnemyship_2.add(mntmAttack_1);
		
		JMenu mnEnemyship_1 = new JMenu("EnemyShip3");
		mnEnemyship_1.setForeground(Color.YELLOW);
		mnEnemyship_1.setBounds(317, 11, 107, 22);
		frame.getContentPane().add(mnEnemyship_1);
		
		JMenuItem mntmAttack_2 = new JMenuItem("Attack");
		mnEnemyship_1.add(mntmAttack_2);
		
		JMenu mnPlayership = new JMenu("playerShip");
		mnPlayership.setForeground(Color.YELLOW);
		mnPlayership.setBounds(142, 174, 107, 22);
		frame.getContentPane().add(mnPlayership);
		
		JMenu mnSelectweapon = new JMenu("selectWeapon");
		mnPlayership.add(mnSelectweapon);
		
		JButton btnWeapon = new JButton("weapon1");
		mnSelectweapon.add(btnWeapon);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
