package PoSS;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class Loginpos extends JFrame {
	private Image logobg = new ImageIcon(Loginpos.class.getResource("/res/cb_newlogo.png")).getImage().getScaledInstance(400,400,Image.SCALE_SMOOTH);

	private JPanel contentPane;
	private JTextField tfUser;
	private JLabel lblPassword;
	private JPasswordField pfPass;
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginpos frame = new Loginpos();
					frame.setVisible(true);
					frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Loginpos() {
		setTitle("Cris Brew");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 761, 576);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(79, 71, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblLogo = new JLabel();
		lblLogo.setBounds(169, 33, 351, 311);
		lblLogo.setIcon(new ImageIcon(logobg));
		contentPane.add(lblLogo);
		
		JLabel lblUser = new JLabel("USER:");
		lblUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblUser.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUser.setForeground(new Color(223, 217, 204));
		lblUser.setBounds(203, 355, 74, 29);			
		contentPane.add(lblUser);
		
		tfUser = new JTextField();
		tfUser.setBounds(276, 357, 211, 29);
		contentPane.add(tfUser);
		tfUser.setColumns(10);
		
		lblPassword = new JLabel("PASSWORD:");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setForeground(new Color(223, 217, 204));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(169, 391, 97, 29);
		contentPane.add(lblPassword);
		
		pfPass = new JPasswordField();
		pfPass.setBounds(276, 394, 211, 27);
		contentPane.add(pfPass);
		
		
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String user = tfUser.getText();
			char[] pass = pfPass.getPassword();
			if(user.equals("user")&&(iscorrectpass(pass))){
				Menu main1 = new Menu();
				main1.setVisible(true);
				Loginpos.this.setVisible(false);
			}
			else {
				JOptionPane.showMessageDialog(null,"Invalid Credentials","Error",JOptionPane.ERROR_MESSAGE);
			}
			
		}

	
		
		});
		btnLogin.setBounds(332, 432, 89, 23);
		contentPane.add(btnLogin);
	
	}
	
	private static boolean iscorrectpass(char [] pass) {
		boolean isCorrect = true;
		
		char [] truepass = {'a', 'd', 'm', 'i','n'};
		
		if(pass.length != truepass.length) {
			isCorrect = false;
		}
		else {
			isCorrect = Arrays.equals(pass, truepass);
		}
		return isCorrect;
	}
}
