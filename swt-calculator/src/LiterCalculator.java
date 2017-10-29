import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import net.miginfocom.swing.MigLayout;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class LiterCalculator {

	private JFrame frame;
	private JTextField inputFieldLiter;
	private JTextField outputFieldCups;
	private JTextField outputFieldTeaspoons;
	private JTextField outputFieldDrops;
	private JRadioButton rdbtnUk;
	private JRadioButton rdbtnUs;
	private JButton btnBerechnen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LiterCalculator window = new LiterCalculator();
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
	public LiterCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblGebenSieLiter = new JLabel("Geben Sie Liter ein:");
		
		// user input field for liters
		inputFieldLiter = new JTextField();
		inputFieldLiter.setColumns(10);
		
		JLabel lblWelcheEinheit = new JLabel("Welche Einheit?");
		
		// defines available unit systems
		ButtonGroup group = new ButtonGroup();
		rdbtnUk = new JRadioButton("UK");
		rdbtnUs = new JRadioButton("US");
		group.add(rdbtnUk);
		group.add(rdbtnUs);
		
		JLabel lblWelcheEinheitenSollen = new JLabel("Welche Einheiten sollen berechnet werden?");
		
		JCheckBox chckbxCups = new JCheckBox("Cups");
		JCheckBox chckbxTeaspoons = new JCheckBox("Teaspoons");
		JCheckBox chckbxDrops = new JCheckBox("Drops");
		
		JLabel lblErgebnis = new JLabel("Ergebnis:");
		
		// defines available units for conversion
		JLabel lblCups = new JLabel("Cups");
		JLabel lblTeaspoons = new JLabel("Teaspoons");
		JLabel lblDrops = new JLabel("Drops");
		
		outputFieldCups = new JTextField();
		outputFieldCups.setColumns(10);
		
		outputFieldTeaspoons = new JTextField();
		outputFieldTeaspoons.setColumns(10);
		
		outputFieldDrops = new JTextField();
		outputFieldDrops.setColumns(10);
		
		btnBerechnen = new JButton("Berechnen!");
		
		// add action listener for button click
		btnBerechnen.addActionListener(new ActionListener() {

	        public void actionPerformed(ActionEvent e) {
	            //Execute when button is pressed
	            if(e.getSource() == btnBerechnen){
	            	// System.out.println("You clicked the button");
	                calculate();

	            }

	        }

	    });
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(16)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblGebenSieLiter)
							.addGap(4)
							.addComponent(inputFieldLiter, GroupLayout.PREFERRED_SIZE, 294, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblWelcheEinheitenSollen)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblWelcheEinheit, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(rdbtnUk)
									.addGap(18)
									.addComponent(rdbtnUs))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(chckbxCups)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
												.addComponent(lblErgebnis, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(outputFieldCups, 0, 0, Short.MAX_VALUE)
												.addComponent(lblCups))
											.addGap(25)))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(chckbxTeaspoons)
										.addComponent(outputFieldTeaspoons, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblTeaspoons))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblDrops)
										.addComponent(outputFieldDrops, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
										.addComponent(chckbxDrops))
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnBerechnen)))))
					.addGap(16))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(16)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(lblGebenSieLiter))
						.addComponent(inputFieldLiter, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtnUk)
								.addComponent(rdbtnUs)
								.addComponent(lblWelcheEinheit))
							.addGap(18)
							.addComponent(lblWelcheEinheitenSollen)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(chckbxCups)
								.addComponent(chckbxTeaspoons)
								.addComponent(chckbxDrops))
							.addGap(28)
							.addComponent(lblErgebnis)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCups)
								.addComponent(lblTeaspoons)
								.addComponent(lblDrops))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(outputFieldCups, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(outputFieldTeaspoons, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(outputFieldDrops, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(104)
							.addComponent(btnBerechnen)))
					.addGap(5))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
	
	private void calculate() {
		
		double liter = Float.parseFloat(inputFieldLiter.getText());
		double drops = 0;
		double teaspoons = 0;
		double cups = 0;
		
		// convert liter to smallest unit drops
		int inputInDrops = (int) (liter * 20000);

		
		/* 
		 * Conversion table
		 * 
		 * Source: https://www.unitconverters.net/
		 * 
		 * ==== UK ====
		 * 1l = 20000 drops
		 * 1 teaspoon = 118.38776042 drops
		 * 1 cup = 48 teaspoon
		 * 
		 * ==== US ====
		 * 1l = 20000 drops
		 * 1 teaspoon = 98.578431875 drops
		 * 1 cup = 48 teaspoon
		 * 
		 */
		
		/*
		 * if unit system UK is checked, do the following code
		 */
		if (rdbtnUk.isSelected()) {
			// calculate bottom up from drops to cups
			drops = inputInDrops % 118.38776042;
			teaspoons = (inputInDrops/118.38776042) % 48;
			cups = (inputInDrops/(118.38776042*48));
		
		/*
		 * if unit system USA is checked, do the following code
		 */
		} else if (rdbtnUs.isSelected()) {
			// calculate bottom up from drops to cups
			drops = inputInDrops % 118.38776042;
			teaspoons = (inputInDrops/98.578431875) % 48;
			cups = (inputInDrops/(98.578431875*48));
			
		} else {
			System.out.println("Bitte ein Einheitensystem wählen!");
		}
		
		
		String dropsToString = String.valueOf(drops);
		String teaspoonsToString = String.valueOf(teaspoons);
		String cupsToString = String.valueOf(cups);
		
		outputFieldDrops.setText(String.valueOf(dropsToString));
		outputFieldTeaspoons.setText(String.valueOf(teaspoonsToString));
		outputFieldCups.setText(cupsToString);


		
	}
}
