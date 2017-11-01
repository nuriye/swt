import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class Program {

	private JFrame frame;
	private JTextField inputFieldLiter;
	private JTextField outputFieldCups;
	private JTextField outputFieldTeaspoons;
	private JTextField outputFieldDrops;
	private JRadioButton rdbtnUk;
	private JRadioButton rdbtnUs;
	private JButton btnBerechnen;
	private ButtonGroup unitGroup;
	
	private JCheckBox cbCups;
	private JCheckBox cbTeaspoons;
	private JCheckBox cbDrops;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Program window = new Program();
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
	public Program() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		// user input block
		JLabel lblGebenSieLiter = new JLabel("Liter:");
		inputFieldLiter = new JTextField();
		inputFieldLiter.setColumns(10);
		
		// unit system block
		JLabel lblWelcheEinheit = new JLabel("Einheitensystem");
		ButtonGroup unitSystemsGroup = new ButtonGroup();
		rdbtnUk = new JRadioButton("UK");
		rdbtnUs = new JRadioButton("US");
		unitSystemsGroup.add(rdbtnUk);
		unitSystemsGroup.add(rdbtnUs);
		rdbtnUk.setSelected(true);
		
		// unit block
		JLabel lblWelcheEinheitenSollen = new JLabel("In eine einzelne Einheit umrechnen (gerundet)?");
		//unitGroup = new ButtonGroup();
		cbCups = new JCheckBox("Cups");
		cbTeaspoons = new JCheckBox("Teaspoons");
		cbDrops = new JCheckBox("Drops");
		//unitGroup.add(cbCups);
		//unitGroup.add(cbTeaspoons);
		//unitGroup.add(cbDrops);

		
		// result block
		JLabel lblErgebnis = new JLabel("Ergebnis:");
		JLabel lblCups = new JLabel("Cups");
		outputFieldCups = new JTextField();
		outputFieldCups.setColumns(10);
		
		JLabel lblTeaspoons = new JLabel("Teaspoons");
		outputFieldTeaspoons = new JTextField();
		outputFieldTeaspoons.setColumns(10);
		
		JLabel lblDrops = new JLabel("Drops");
		outputFieldDrops = new JTextField();
		outputFieldDrops.setColumns(10);
		
		// button for calculation
		btnBerechnen = new JButton("Berechnen!");
		
		
		/* 
		 * Button event starts calculation
		 */
		btnBerechnen.addActionListener(new ActionListener() {
			
			
			// Executes when button is pressed
	        public void actionPerformed(ActionEvent calc) {
        		outputFieldCups.setText("");
        		outputFieldTeaspoons.setText("");
        		outputFieldDrops.setText("");
	        	
	            if(calc.getSource() == btnBerechnen){
	            	outputFieldCups.setText("");
		        	outputFieldTeaspoons.setText("");
		        	outputFieldDrops.setText("");
	            	String inputLiter = inputFieldLiter.getText();
	            	double liter;
	            	double cups;
	            	double teaspoons;
	        		double drops;
	            	Calculator calculation;
	            	
	            	try {
	            		liter = Double.parseDouble(inputLiter);
	            		
		            	calculation = new Calculator(liter, rdbtnUk.isSelected(), rdbtnUs.isSelected(), cbCups.isSelected(), cbTeaspoons.isSelected(), cbDrops.isSelected());
		            	
		            	System.out.println(liter + " Liter\n"
		            			+ "rdbtnUk " + rdbtnUk.isSelected() + "\n"
		            			+ "rdbtnUs " + rdbtnUs.isSelected() + "\n"
		            			+ "cbCups " + cbCups.isSelected() + "\n"
		            			+ "cbTeaspoons " + cbTeaspoons.isSelected() + "\n"
		            			+ "cbDrops " + cbDrops.isSelected() + "\n"
		            			);
		            	
//		            	// no units are selected, therefor all will be caluclated
//		            	if (rdbtnUk.isSelected() && (cbCups.isSelected() && cbTeaspoons.isSelected() && cbDrops.isSelected()) == false) {
//		            		calculation.calcAllUk();
//						} else if (rdbtnUs.isSelected() && (cbCups.isSelected() && cbTeaspoons.isSelected() && cbDrops.isSelected()) == false) {
//							calculation.calcAllUs();
//						} else if (rdbtnUk.isSelected() && cbCups.isSelected()) {
//							calculation.calcCupsUk();
//						} else if (rdbtnUs.isSelected() && cbCups.isSelected()) {
//							calculation.calcCupsUs();
//						} else if (rdbtnUk.isSelected() && cbTeaspoons.isSelected()) {
//							calculation.calcTeaspoonsUk();
//						} else if (rdbtnUs.isSelected() && cbTeaspoons.isSelected()) {
//							calculation.calcTeaspoonsUs();
//						}

		            	cups = calculation.getCups();
		            	teaspoons = calculation.getTeaspoons();
		        		drops = calculation.getDrops();
		        		
		        		// format long eliminates .0 at the end
		        		outputFieldCups.setText(String.format("%d",(long)cups));
		        		outputFieldTeaspoons.setText(String.format("%d",(long)teaspoons));
		        		outputFieldDrops.setText(String.format("%d",(long)drops));
		        		
		        		//unitGroup.clearSelection();
		        		
	            	} catch (NumberFormatException e) {
	            		// TODO Anzeige der Fehlermeldung in JFrame frame
	            		System.out.println("Bitte geben Sie eine Zahl ein.");
	            	}
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
										.addComponent(cbCups)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
												.addComponent(lblErgebnis, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(outputFieldCups, 0, 0, Short.MAX_VALUE)
												.addComponent(lblCups))
											.addGap(25)))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(cbTeaspoons)
										.addComponent(outputFieldTeaspoons, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblTeaspoons))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblDrops)
										.addComponent(outputFieldDrops, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
										.addComponent(cbDrops))
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
								.addComponent(cbCups)
								.addComponent(cbTeaspoons)
								.addComponent(cbDrops))
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
	
}
