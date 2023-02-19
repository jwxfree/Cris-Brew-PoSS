package PoSS;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.Label;
import javax.swing.JTextField;
import java.awt.TextField;
import java.awt.Image;
import javax.swing.JTextArea;
public class Receipt extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Receipt frame = new Receipt();
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
	public Receipt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1182, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 1209, 731);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(386, 0, 794, 788);
		panel_2.setBackground(new Color(177, 165, 150));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(452, 582, 251, 34);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Total:");
		lblNewLabel_3.setBounds(359, 582, 83, 30);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 27));
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("RECEIPT");
		lblNewLabel_4.setBounds(83, 38, 503, 49);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 55));
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Name");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_5.setBounds(145, 132, 83, 32);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("QTY");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_6.setBounds(364, 130, 58, 36);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Price");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_7.setBounds(566, 131, 82, 34);
		panel_2.add(lblNewLabel_7);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(83, 106, 622, 440);
		panel_2.add(textArea);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(611, 9, 1, 1);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Image img = new ImageIcon(this.getClass().getResource("/res/BIG BIG LOGO .png")).getImage().getScaledInstance(400,400, Image.SCALE_SMOOTH);
		lblNewLabel.setBounds(-4, 90, 352, 332);
		lblNewLabel.setIcon(new ImageIcon(img));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("C r i s  B r e w");
		lblNewLabel_1.setForeground(new Color(240, 240, 240));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(115, 415, 166, 29);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/res/Coffee_bg.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img2));
		lblNewLabel_2.setBounds(0, 0, 387, 731);
		panel.add(lblNewLabel_2);
		
	}
}
