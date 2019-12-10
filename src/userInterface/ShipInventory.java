package userInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

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
		
		JButton btnGetLocation = new JButton("Get Location");
		btnGetLocation.setBounds(312, 206, 112, 23);
		frame.getContentPane().add(btnGetLocation);
		
		ImageIcon bckgrnd = new ImageIcon("./interior");
		
		JLabel lblNewLabel = new JLabel(bckgrnd);
		lblNewLabel.setBounds(0, 0, 434, 240);
		frame.getContentPane().add(lblNewLabel);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnWeapons = new JMenu("Weapons");
		menuBar.add(mnWeapons);
		
		JMenuItem mntmWeapon = new JMenuItem("Weapon1");
		mnWeapons.add(mntmWeapon);
		
		JMenu mnShields = new JMenu("Shields");
		menuBar.add(mnShields);
		
		JMenu mnLoot = new JMenu("Loot");
		menuBar.add(mnLoot);
	}
}
