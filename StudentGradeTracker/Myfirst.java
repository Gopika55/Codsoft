package jframepro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;

public class Myfirst extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtfrench;
	private JTextField txtenglish;
	private JTextField txtmaths;
	private JTextField txtscience;
	private JTextField txtcomp;
	private JTextField lbltot_1;
	private JTextField lblavg_1;
	private JTextField lblgra_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Myfirst frame = new Myfirst();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Myfirst() {
		setFont(new Font("Goudy Old Style", Font.BOLD | Font.ITALIC, 18));
		setTitle("Student Grade Tracker");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 744, 559);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Student Name");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(38, 81, 199, 42);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("Student Grade Tracker");
		lblNewLabel.setBounds(222, 11, 291, 40);
		lblNewLabel.setFont(new Font("Felix Titling", Font.BOLD, 18));
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("French");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setBounds(58, 167, 172, 32);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("English");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3.setBounds(58, 216, 166, 40);
		contentPane.add(lblNewLabel_3);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));
		textField.setBounds(261, 84, 172, 36);
		contentPane.add(textField);
		textField.setColumns(10);

		txtfrench = new JTextField();
		txtfrench.setHorizontalAlignment(SwingConstants.CENTER);
		txtfrench.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));
		txtfrench.setBounds(261, 167, 119, 32);
		contentPane.add(txtfrench);
		txtfrench.setColumns(10);

		txtenglish = new JTextField();
		txtenglish.setHorizontalAlignment(SwingConstants.CENTER);
		txtenglish.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));
		txtenglish.setBounds(261, 220, 119, 32);
		contentPane.add(txtenglish);
		txtenglish.setColumns(10);

		JButton btnNewButton = new JButton("calc");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double french, english, maths, science, computerscience, total, avgerge;
				String grade;

				french = Integer.parseInt(txtfrench.getText());
				english = Integer.parseInt(txtenglish.getText());
				maths = Integer.parseInt(txtmaths.getText());
				science = Integer.parseInt(txtscience.getText());
				computerscience = Integer.parseInt(txtcomp.getText());

				total = (french + english + maths + science + computerscience);

				avgerge = total / 5;

				if (avgerge >= 85) {
					grade = "A";
				} else if (avgerge >= 75) {
					grade = "B";
				} else if (avgerge >= 65) {
					grade = "C";
				} else if (avgerge >= 45) {
					grade = "D";
				} else {
					grade = "F";
				}

				lbltot_1.setText(String.valueOf(total));

				lblavg_1.setText(String.valueOf(avgerge));

				lblgra_1.setText(String.valueOf(grade));
			}
		});
		btnNewButton.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBounds(166, 471, 119, 49);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel_4 = new JLabel("Mathmatics");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_4.setBounds(58, 277, 172, 32);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Science");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_5.setBounds(80, 337, 128, 23);
		contentPane.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("ComputerScience");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_6.setBounds(79, 396, 138, 32);
		contentPane.add(lblNewLabel_6);

		txtmaths = new JTextField();
		txtmaths.setHorizontalAlignment(SwingConstants.CENTER);
		txtmaths.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));
		txtmaths.setBounds(261, 277, 120, 32);
		contentPane.add(txtmaths);
		txtmaths.setColumns(10);

		txtscience = new JTextField();
		txtscience.setHorizontalAlignment(SwingConstants.CENTER);
		txtscience.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));
		txtscience.setBounds(261, 332, 120, 32);
		contentPane.add(txtscience);
		txtscience.setColumns(10);

		txtcomp = new JTextField();
		txtcomp.setHorizontalAlignment(SwingConstants.CENTER);
		txtcomp.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 15));
		txtcomp.setBounds(261, 396, 120, 32);
		contentPane.add(txtcomp);
		txtcomp.setColumns(10);

		JLabel lbltot = new JLabel("Total");
		lbltot.setHorizontalAlignment(SwingConstants.CENTER);
		lbltot.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));
		lbltot.setBounds(454, 191, 68, 25);
		contentPane.add(lbltot);

		JLabel lblavg = new JLabel("Avgerge");
		lblavg.setHorizontalAlignment(SwingConstants.CENTER);
		lblavg.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));
		lblavg.setBounds(454, 258, 79, 21);
		contentPane.add(lblavg);

		JLabel lblgrade = new JLabel("Grade");
		lblgrade.setHorizontalAlignment(SwingConstants.CENTER);
		lblgrade.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));
		lblgrade.setBounds(454, 316, 68, 27);
		contentPane.add(lblgrade);

		lbltot_1 = new JTextField();
		lbltot_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbltot_1.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));
		lbltot_1.setBounds(548, 187, 119, 32);
		contentPane.add(lbltot_1);
		lbltot_1.setColumns(10);

		lblavg_1 = new JTextField();
		lblavg_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblavg_1.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));
		lblavg_1.setBounds(548, 254, 119, 28);
		contentPane.add(lblavg_1);
		lblavg_1.setColumns(10);

		lblgra_1 = new JTextField();
		lblgra_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblgra_1.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));
		lblgra_1.setBounds(548, 313, 119, 32);
		contentPane.add(lblgra_1);
		lblgra_1.setColumns(10);

		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				txtfrench.setText("");
				txtenglish.setText("");
				txtmaths.setText("");
				txtscience.setText("");
				txtcomp.setText("");
				lbltot_1.setText("");
				lblavg_1.setText("");
				lblgra_1.setText("");

			}
		});
		btnNewButton_1.setBounds(327, 471, 119, 49);
		contentPane.add(btnNewButton_1);

		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(240, 230, 140));
		panel.setBounds(442, 144, 241, 260);
		contentPane.add(panel);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(188, 143, 143));
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(38, 60, 690, 474);
		contentPane.add(panel_1);
	}
}
