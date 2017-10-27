import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class LiterCalculator {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblWelcheEinheit = new JLabel("Welche Einheit?");
		
		JRadioButton rdbtnUk = new JRadioButton("UK");
		
		JRadioButton rdbtnUsa = new JRadioButton("USA");
		
		JLabel lblWelcheEinheitenSollen = new JLabel("Welche Einheiten sollen berechnet werden?");
		
		JCheckBox chckbxCups = new JCheckBox("Cups");
		
		JCheckBox chckbxTeaspoons = new JCheckBox("Teaspoons");
		
		JCheckBox chckbxDrops = new JCheckBox("Drops");
		
		JLabel lblErgebnis = new JLabel("Ergebnis:");
		
		JLabel lblCups = new JLabel("Cups");
		
		JLabel lblTeaspoons = new JLabel("Teaspoons");
		
		JLabel lblDrops = new JLabel("Drops");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JButton btnBerechnen = new JButton("Berechnen!");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(16)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblGebenSieLiter)
							.addGap(4)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 294, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblWelcheEinheitenSollen)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblWelcheEinheit, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(rdbtnUk)
									.addGap(18)
									.addComponent(rdbtnUsa))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(chckbxCups)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
												.addComponent(lblErgebnis, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(textField_1, 0, 0, Short.MAX_VALUE)
												.addComponent(lblCups))
											.addGap(25)))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(chckbxTeaspoons)
										.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblTeaspoons))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblDrops)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
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
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtnUk)
								.addComponent(rdbtnUsa)
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
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(104)
							.addComponent(btnBerechnen)))
					.addGap(5))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
