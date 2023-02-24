package PoSS;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;




public class Menu extends JFrame {
	private Image crisbrew = new ImageIcon(Menu.class.getResource("/res/crissbrew.png")).getImage().getScaledInstance(200,200,Image.SCALE_SMOOTH);
	private Image mocha = new ImageIcon(Menu.class.getResource("/res/MochaLatte.png")).getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH);
	private Image affogato = new ImageIcon(Menu.class.getResource("/res/affogato1.png")).getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH);
	private Image americano = new ImageIcon(Menu.class.getResource("/res/americanoicon.png")).getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH);
	private Image cappucino = new ImageIcon(Menu.class.getResource("/res/Cappuccino1.png")).getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH);
	private Image cmacchiatto = new ImageIcon(Menu.class.getResource("/res/cmachiatto.png")).getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH);
	private Image cortado = new ImageIcon(Menu.class.getResource("/res/cortado1.png")).getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH);
	private Image einspanner = new ImageIcon(Menu.class.getResource("/res/Einspanner121.png")).getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH);
	private Image espresso = new ImageIcon(Menu.class.getResource("/res/espresso.png")).getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH);
	private Image flatwhite = new ImageIcon(Menu.class.getResource("/res/flatwhite.png")).getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH);
	private Image matcha = new ImageIcon(Menu.class.getResource("/res/matcha.png")).getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH);
	private Image ristretto1 = new ImageIcon(Menu.class.getResource("/res/ristretto1.png")).getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH);
	private Image vanilla = new ImageIcon(Menu.class.getResource("/res/vanil.png")).getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH);

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private JTextField TFTotalPrice;
	private JTextField TFQty;
	private JTextArea TAOrders;


	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void PrintReceipt() {
		String format = "CRIS BREW\nDasmariñas, Cavite";
		String order = TAOrders.getText();
		Document rcp = new Document();
		try {
            PdfWriter.getInstance(rcp, new FileOutputStream(new File("order.pdf")));
            rcp.open();
            Paragraph title = new Paragraph(format);
            title.setAlignment(Element.ALIGN_CENTER);
            rcp.add(title);
            
            Paragraph listoforder = new Paragraph(order);
            listoforder.setAlignment(Element.ALIGN_JUSTIFIED);
            rcp.add(listoforder);
            
      
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            rcp.close();
        }
    }
		
		
	
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1182, 768);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(69, 80, 67));
		contentPane.setBackground(new Color(100, 98, 102));
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		int AmericanoM = 100;
		int AmericanoL = 120;
		int EspressoM = 120;
		int EspressoL = 140;
		int LatteM = 150;
		int LatteL = 170;
		int MacchiatoM = 170;
		int MacchiatoL = 190;
		int RistrettoM = 170;
		int RistrettoL = 190;
		int FlatwhiteM = 170;
		int FlatwhiteL = 190;
		int AffogatoM = 180;
		int AffogatoL = 200;
		int VanillaM = 150;
		int VanillaL = 170;
		int CortadoM = 170;
		int CortadoL = 190;
		int MatchaM = 170;
		int MatchaL = 190;
		int CappuccinoM = 120;
		int CappuccinoL = 140;
		int EinspannerM = 170;
		int EinspannerL = 190;
		
		JTextArea TAPrice = new JTextArea();
		TAPrice.setRows(10);
		TAPrice.setColumns(20);
		TAPrice.setLineWrap(true);
		TAPrice.setEditable(false);
		TAPrice.setBounds(594, 477, 243, 174);
		contentPane.add(TAPrice);
		
		JButton latte_btn = new JButton("Choco latte");
		latte_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TAPrice.append("ChcLatte");
			}
		});
		latte_btn.setBackground(new Color(211, 211, 211));
		latte_btn.setIcon(new ImageIcon(mocha));
		latte_btn.setFont(new Font("Tahoma", Font.BOLD, 13));
		latte_btn.setBounds(691, 85, 157, 47);
		contentPane.add(latte_btn);
		panel.setBackground(new Color(79, 71, 64));
		panel.setBounds(-22, 0, 236, 731);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon(crisbrew));
		lblNewLabel_3.setBounds(45, 10, 165, 160);
		panel.add(lblNewLabel_3);
		
		JButton logout_btn = new JButton("Log Out");
		logout_btn.setFont(new Font("Tahoma", Font.BOLD, 12));
		logout_btn.setBounds(82, 684, 85, 21);
		panel.add(logout_btn);
		
		JLabel lblNewLabel_4 = new JLabel("Cafe");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 29));
		lblNewLabel_4.setBounds(92, 162, 64, 49);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Point of Sales");
		lblNewLabel_5.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(66, 204, 125, 25);
		panel.add(lblNewLabel_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(895, 0, 273, 731);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Qty");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(134, 50, 70, 28);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Name");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(10, 50, 70, 28);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Price:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_2.setBounds(203, 50, 70, 28);
		panel_1.add(lblNewLabel_2_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 77, 253, 19);
		panel_1.add(separator_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Total:");
		lblNewLabel_1_2_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
		lblNewLabel_1_2_1.setBounds(10, 476, 122, 25);
		panel_1.add(lblNewLabel_1_2_1);
		
		TFTotalPrice = new JTextField();
		TFTotalPrice.setColumns(10);
		TFTotalPrice.setBounds(68, 473, 195, 28);
		panel_1.add(TFTotalPrice);
		
		TAOrders = new JTextArea();
		TAOrders.setColumns(20);
		TAOrders.setRows(10);
		TAOrders.setEditable(false);
		TAOrders.setBounds(10, 86, 253, 379);
		panel_1.add(TAOrders);
		

		

		
		JLabel lblOrderSummary = new JLabel("Order Summary");
		lblOrderSummary.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 22));
		lblOrderSummary.setBounds(49, 10, 201, 40);
		panel_1.add(lblOrderSummary);
		
	
		
		JLabel lblNewLabel = new JLabel("Beverages:");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 22));
		lblNewLabel.setBounds(240, 27, 201, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_2 = new JLabel("Price:");
		lblNewLabel_1_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
		lblNewLabel_1_2.setBounds(594, 452, 122, 25);
		contentPane.add(lblNewLabel_1_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(105, 92, 78));
		panel_2.setBounds(225, 463, 280, 234);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Preferences");
		lblNewLabel_1.setBounds(10, 10, 104, 24);
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
		
		
		
		JButton pref_hot_btn = new JButton("Hot");
		pref_hot_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(TAPrice.getText().equals("Amrcn")){
					TAPrice.append(" Hot ");
				}
				else if(TAPrice.getText().equals("Xprss")) {
					TAPrice.append(" Hot ");
				}
				else if(TAPrice.getText().equals("ChcLatte")) {
					TAPrice.append(" Hot ");
				}
				else if(TAPrice.getText().equals("Mccht")) {
					TAPrice.append(" Hot ");
				}
				else if(TAPrice.getText().equals("Rsttrt")) {
					TAPrice.append(" Hot ");
				}
				else if(TAPrice.getText().equals("FWhite")) {
					TAPrice.append(" Hot ");
				}
				else if(TAPrice.getText().equals("Affgt")) {
					TAPrice.append(" Hot ");
				}
				else if(TAPrice.getText().equals("Vnlla")) {
					TAPrice.append(" Hot ");
				}
				else if(TAPrice.getText().equals("Crtdo")) {
					TAPrice.append(" Hot ");
				}
				else if(TAPrice.getText().equals("Mtcha")) {
					TAPrice.append(" Hot ");
				}
				else if(TAPrice.getText().equals("Cppccno")) {
					TAPrice.append(" Hot ");
				}
				else if(TAPrice.getText().equals("Enspnnr")) {
					TAPrice.append(" Hot ");
				}
				
				
				
			};
		});
		pref_hot_btn.setBorderPainted(false);
		pref_hot_btn.setBorder(new LineBorder(new Color(254, 104, 104), 0, true));
		pref_hot_btn.setBackground(new Color(255, 104, 104));
		pref_hot_btn.setBounds(10, 44, 104, 38);
		panel_2.add(pref_hot_btn);
		pref_hot_btn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton pref_cold_btn = new JButton("Cold");
		pref_cold_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(TAPrice.getText().equals("Amrcn")){
					TAPrice.append(" Cold ");
				}
				else if(TAPrice.getText().equals("Xprss")) {
					TAPrice.append(" Error - Please Clear! ");
				}
				else if(TAPrice.getText().equals("ChcLatte")) {
					TAPrice.append(" Cold ");
				}
				else if(TAPrice.getText().equals("Mccht")) {
					TAPrice.append(" Cold ");
				}
				else if(TAPrice.getText().equals("Rsttrt")) {
					TAPrice.append(" Cold ");
				}
				else if(TAPrice.getText().equals("FWhite")) {
					TAPrice.append(" Cold ");
				}
				else if(TAPrice.getText().equals("Affgt")) {
					TAPrice.append(" Cold ");
				}
				else if(TAPrice.getText().equals("Vnlla")) {
					TAPrice.append(" Cold ");
				}
				else if(TAPrice.getText().equals("Crtdo")) {
					TAPrice.append(" Cold ");
				}
				else if(TAPrice.getText().equals("Mtcha")) {
					TAPrice.append(" Cold ");
				}
				else if(TAPrice.getText().equals("Cppccno")) {
					TAPrice.append(" Cold ");
				}
				else if(TAPrice.getText().equals("Enspnnr")) {
					TAPrice.append(" Cold ");
				}
			}
		});
		pref_cold_btn.setBorderPainted(false);
		pref_cold_btn.setBackground(new Color(121, 193, 253));
		pref_cold_btn.setBounds(155, 44, 104, 38);
		panel_2.add(pref_cold_btn);
		pref_cold_btn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		// list/container pang store ng multiplied values inside if else statement//
		List<Integer> results = new ArrayList<Integer>();
		
		JButton medium_btn = new JButton("Medium");
		medium_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int tp = 0;
				 
				 //HOT SECTOR MEDIUM
				 if(TAPrice.getText().equals("Amrcn Hot ")) {
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * AmericanoM;
					 TAPrice.append(" Medium         "+ qtyval + "                " + "\u20b1 " +  tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Xprss Hot ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * EspressoM;
					 TAPrice.append(" Medium          "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Mccht Hot ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * MacchiatoM;
					 TAPrice.append(" Medium          "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("ChcLatte Hot ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * LatteM;
					 TAPrice.append(" Medium    "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Rsttrt Hot ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * RistrettoM;
					 TAPrice.append(" Medium           "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("FWhite Hot ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * FlatwhiteM;
					 TAPrice.append(" Medium        "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Affgt Hot ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * AffogatoM;
					 TAPrice.append(" Medium             "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Vnlla Hot ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * VanillaM;
					 TAPrice.append(" Medium            "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Crtdo Hot ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * CortadoM;
					 TAPrice.append(" Medium           "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Mtcha Hot ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * MatchaM;
					 TAPrice.append(" Medium          "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Cppccno Hot ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * CappuccinoM;
					 TAPrice.append(" Medium     "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Enspnnr Hot ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * EinspannerM;
					 TAPrice.append(" Medium     "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 
				 
				 // MEDIUM SECTOR COLD ===========================================================
				 if(TAPrice.getText().equals("Amrcn Cold ")) {
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * AmericanoM;
					 TAPrice.append(" Medium       "+ qtyval + "                " + "\u20b1 " +  tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Xprss Cold ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * EspressoM;
					 TAPrice.append(" Medium        "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Mccht Cold ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * MacchiatoM;
					 TAPrice.append(" Medium        "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("ChcLatte Cold ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * LatteM;
					 TAPrice.append(" Medium  "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Rsttrt Cold ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * RistrettoM;
					 TAPrice.append(" Medium         "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("FWhite Cold ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * FlatwhiteM;
					 TAPrice.append(" Medium      "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Affgt Cold ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * AffogatoM;
					 TAPrice.append(" Medium           "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Vnlla Cold ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * VanillaM;
					 TAPrice.append(" Medium          "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Crtdo Cold ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * CortadoM;
					 TAPrice.append(" Medium         "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Mtcha Cold ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * MatchaM;
					 TAPrice.append(" Medium        "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Cppccno Cold ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * CappuccinoM;
					 TAPrice.append(" Medium   "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Enspnnr Cold ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * EinspannerM;
					 TAPrice.append(" Medium   "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 
				 
				 
				TFTotalPrice.setText(TFTotalPrice.getText()+tp);
				results.add(tp);
			}
		});
		medium_btn.setBackground(new Color(226, 192, 101));
		medium_btn.setBounds(10, 120, 104, 38);
		panel_2.add(medium_btn);
		medium_btn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton large_btn = new JButton("Large");
		large_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tp = 0;
				// LARGE HOT SECTOR =================================================================
				if(TAPrice.getText().equals("Amrcn Hot ")) {
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * AmericanoL;
					 TAPrice.append(" Large             "+ qtyval + "                " + "\u20b1 " +  tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Xprss Hot ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * EspressoL;
					 TAPrice.append(" Large              "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Mccht Hot ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * MacchiatoL;
					 TAPrice.append(" Large              "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("ChcLatte Hot ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * LatteL;
					 TAPrice.append(" Large        "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Rsttrt Hot ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * RistrettoL;
					 TAPrice.append(" Large               "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("FWhite Hot ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * FlatwhiteL;
					 TAPrice.append(" Large            "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Affgt Hot ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * AffogatoL;
					 TAPrice.append(" Large                 "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Vnlla Hot ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * VanillaL;
					 TAPrice.append(" Large                "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Crtdo Hot ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * CortadoL;
					 TAPrice.append(" Large               "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Mtcha Hot ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * MatchaL;
					 TAPrice.append(" Large              "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Cppccno Hot ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * CappuccinoL;
					 TAPrice.append(" Large         "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Enspnnr Hot ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * EinspannerL;
					 TAPrice.append(" Large         "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				
				// LARGE COLD SECTOR =============================================================
				if(TAPrice.getText().equals("Amrcn Cold ")) {
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * AmericanoL;
					 TAPrice.append(" Large           "+ qtyval + "                " + "\u20b1 " +  tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Xprss Cold ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * EspressoL;
					 TAPrice.append(" Large            "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Mccht Cold ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * MacchiatoL;
					 TAPrice.append(" Large            "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("ChcLatte Cold ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * LatteL;
					 TAPrice.append(" Large      "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Rsttrt Cold ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * RistrettoL;
					 TAPrice.append(" Large             "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("FWhite Cold ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * FlatwhiteL;
					 TAPrice.append(" Large          "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Affgt Cold ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * AffogatoL;
					 TAPrice.append(" Large               "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Vnlla Cold ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * VanillaL;
					 TAPrice.append(" Large              "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Crtdo Cold ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * CortadoL;
					 TAPrice.append(" Large             "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Mtcha Cold ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * MatchaL;
					 TAPrice.append(" Large            "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Cppccno Cold ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * CappuccinoL;
					 TAPrice.append(" Large       "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				 else if(TAPrice.getText().equals("Enspnnr Cold ")){
					 int qtyval = Integer.parseInt(TFQty.getText());
					 tp = qtyval * EinspannerL;
					 TAPrice.append(" Large       "+ qtyval + "                " + "\u20b1 " + tp+ "\n");
				 }
				TFTotalPrice.setText(TFTotalPrice.getText()+tp);
				results.add(tp);
			}
		});
		large_btn.setBackground(new Color(183, 150, 38));
		large_btn.setBounds(155, 120, 104, 38);
		panel_2.add(large_btn);
		large_btn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		TFQty = new JTextField();
		TFQty.setFont(new Font("Tahoma", Font.BOLD, 12));
		TFQty.setHorizontalAlignment(SwingConstants.CENTER);
		TFQty.setText("1");
		TFQty.setBounds(130, 181, 104, 28);
		panel_2.add(TFQty);
		TFQty.setColumns(10);
	
		JButton add_btn = new JButton("Add");
		add_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String totalorder = TAOrders.getText() + TAPrice.getText();
				TAOrders.setText(totalorder);
				
				int total = 0;
				for(int i = 0; i <results.size(); i++) {
					total+=results.get(i);
				}
				
				TFTotalPrice.setText(String.valueOf(total));
				TAPrice.setText(null);
			}
		});
		add_btn.setBackground(new Color(14, 184, 107));
		add_btn.setFont(new Font("Tahoma", Font.BOLD, 14));
		add_btn.setBounds(740, 666, 102, 31);
		contentPane.add(add_btn);
		

		JButton confirm_btn = new JButton("Confirm");
		confirm_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrintReceipt();
				
				
			}
		});
		confirm_btn.setBackground(new Color(14, 184, 107));
		confirm_btn.setFont(new Font("Tahoma", Font.BOLD, 14));
		confirm_btn.setBounds(161, 595, 102, 47);
		panel_1.add(confirm_btn);
		
		JLabel lblNewLabel_1_1 = new JLabel("Size:");
		lblNewLabel_1_1.setBounds(10, 97, 122, 13);
		panel_2.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Quantity:");
		lblNewLabel_1_1_1.setBounds(40, 178, 92, 29);
		panel_2.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
		
		
		JButton clear_btn = new JButton("Clear");
		clear_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TAOrders.setText(null);
				TFTotalPrice.setText(null);
				results.clear();
				
			}
		});
		clear_btn.setFont(new Font("Tahoma", Font.BOLD, 14));
		clear_btn.setBounds(161, 525, 102, 47);
		panel_1.add(clear_btn);
		
		JButton btnClearPrice = new JButton("Clear");
		btnClearPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TAPrice.setText(null);
			}
		});
		btnClearPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClearPrice.setBounds(594, 666, 102, 31);
		contentPane.add(btnClearPrice);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(177, 165, 150));
		panel_3.setBounds(213, 0, 683, 438);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton eins_btn = new JButton("Einspänner");
		eins_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TAPrice.append("Enspnnr");
			}
		});
		eins_btn.setBounds(479, 342, 157, 47);
		panel_3.add(eins_btn);
		eins_btn.setIcon(new ImageIcon(einspanner));
		eins_btn.setBackground(new Color(211, 211, 211));
		eins_btn.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JButton cappu_btn = new JButton("Cappuccino");
		cappu_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TAPrice.append("Cppccno");
			}
		});
		cappu_btn.setBounds(258, 342, 157, 47);
		panel_3.add(cappu_btn);
		cappu_btn.setIcon(new ImageIcon(cappucino));
		cappu_btn.setBackground(new Color(211, 211, 211));
		cappu_btn.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JButton matcha_btn = new JButton("Matcha");
		matcha_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TAPrice.append("Mtcha");
			}
		});
		matcha_btn.setBounds(36, 342, 157, 47);
		panel_3.add(matcha_btn);
		matcha_btn.setIcon(new ImageIcon(matcha));
		matcha_btn.setForeground(new Color(75, 55, 43));
		matcha_btn.setFont(new Font("Tahoma", Font.BOLD, 13));
		matcha_btn.setBackground(new Color(211, 211, 211));
		
		JButton Cortado_btn = new JButton(" Cortado");
		Cortado_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TAPrice.append("Crtdo");
			}
		});
		Cortado_btn.setHorizontalAlignment(SwingConstants.LEADING);
		Cortado_btn.setBounds(479, 251, 157, 47);
		panel_3.add(Cortado_btn);
		Cortado_btn.setIcon(new ImageIcon(cortado));
		Cortado_btn.setForeground(new Color(75, 55, 43));
		Cortado_btn.setFont(new Font("Tahoma", Font.BOLD, 13));
		Cortado_btn.setBackground(new Color(211, 211, 211));
		
		JButton flat_btn = new JButton("Flat White");
		flat_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TAPrice.append("FWhite");
			}
		});
		flat_btn.setBounds(479, 168, 157, 47);
		panel_3.add(flat_btn);
		flat_btn.setIcon(new ImageIcon(flatwhite));
		flat_btn.setBackground(new Color(211, 211, 211));
		flat_btn.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JButton van_btn = new JButton("Vanilla ");
		van_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TAPrice.append("Vnlla");
			}
		});
		van_btn.setBounds(258, 251, 157, 47);
		panel_3.add(van_btn);
		van_btn.setIcon(new ImageIcon(vanilla));
		van_btn.setForeground(new Color(75, 55, 43));
		van_btn.setFont(new Font("Tahoma", Font.BOLD, 13));
		van_btn.setBackground(new Color(211, 211, 211));
		
		JButton ristr_btn = new JButton("Ristretto");
		ristr_btn.setBounds(258, 168, 157, 47);
		panel_3.add(ristr_btn);
		ristr_btn.setIcon(new ImageIcon(ristretto1));
		ristr_btn.setBackground(new Color(211, 211, 211));
		ristr_btn.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JButton espresso_btn = new JButton("Espresso");
		espresso_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TAPrice.append("Xprss");
			}
		});
		espresso_btn.setBounds(258, 83, 157, 47);
		panel_3.add(espresso_btn);
		espresso_btn.setIcon(new ImageIcon(espresso));
		espresso_btn.setBackground(new Color(211, 211, 211));
		espresso_btn.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JButton macchiato_btn = new JButton("Macchiato");
		macchiato_btn.setBounds(36, 168, 157, 47);
		panel_3.add(macchiato_btn);
		macchiato_btn.setIcon(new ImageIcon(cmacchiatto));
		macchiato_btn.setForeground(new Color(75, 55, 43));
		macchiato_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TAPrice.append("Mccht");
			}
		});
		macchiato_btn.setBackground(new Color(211, 211, 211));
		macchiato_btn.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JButton affo_btn = new JButton("Affogato");
		affo_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TAPrice.append("Affgt");
			}
		});
		affo_btn.setBounds(36, 251, 157, 47);
		panel_3.add(affo_btn);
		affo_btn.setIcon(new ImageIcon(affogato));
		affo_btn.setForeground(new Color(75, 55, 43));
		affo_btn.setFont(new Font("Tahoma", Font.BOLD, 12));
		affo_btn.setBackground(new Color(211, 211, 211));
		
		JButton americano_btn = new JButton("Americano");
		americano_btn.setBounds(36, 83, 157, 47);
		panel_3.add(americano_btn);
		americano_btn.setIcon(new ImageIcon(americano));
		americano_btn.setBackground(new Color(211, 211, 211));
		americano_btn.setFont(new Font("Tahoma", Font.BOLD, 13));
		americano_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TAPrice.append("Amrcn");
			}
		});
		ristr_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TAPrice.append("Rsttrt");
			}
			
		});
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(895, 0, 1, 2);
		contentPane.add(separator_2);
		
		
	}
}
