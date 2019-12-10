package userInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class ShipInventory {

	private JFrame frame;

	/**
	 * Launch the application.
	 * @return 
	 */
	public static void inventoryWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShipInventory window = new ShipInventory();
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
	public ShipInventory() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(160, 82, 45));
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnWeapons = new JMenu("Weapons");
		menuBar.add(mnWeapons);
		
		JMenuItem mntmWeapon = new JMenuItem("Weapon1");
		mnWeapons.add(mntmWeapon);
	}
}
