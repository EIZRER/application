import java.awt.EventQueue;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));

		setContentPane(contentPane);
		
		JPanel bottom = new JPanel();
		bottom.setBackground(new Color(228, 228, 228));
		bottom.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		
		JPanel sidebar = new JPanel();
		sidebar.setForeground(new Color(0, 0, 0));
		sidebar.setBackground(new Color(46, 46, 46));
		sidebar.setBorder(new EmptyBorder(0, 0, 0, 0));
		sidebar.setBounds(0, 0, 340, 900);
		
		JPanel top = new JPanel();
		top.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(sidebar, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(1)
							.addComponent(top, GroupLayout.DEFAULT_SIZE, 1184, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(1)
							.addComponent(bottom, GroupLayout.DEFAULT_SIZE, 1184, Short.MAX_VALUE)
							.addGap(1))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(top, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(bottom, GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE))
				.addComponent(sidebar, GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)
		);
		sidebar.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("@Mybuuz");
		lblNewLabel.setBounds(30, 23, 88, 52);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Myanmar Text", Font.BOLD, 18));
		sidebar.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Нүүр");
		lblNewLabel_2.setBounds(45, 127, 61, 20);
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 14));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		sidebar.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Үнэлгээ");
		lblNewLabel_2_1.setForeground(new Color(160, 160, 160));
		lblNewLabel_2_1.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(46, 170, 88, 20);
		sidebar.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Хоолны цэс");
		lblNewLabel_2_2.setForeground(new Color(160, 160, 160));
		lblNewLabel_2_2.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblNewLabel_2_2.setBounds(45, 212, 110, 20);
		sidebar.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Захиалгийн түүх");
		lblNewLabel_2_2_1.setForeground(new Color(160, 160, 160));
		lblNewLabel_2_2_1.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblNewLabel_2_2_1.setBounds(45, 255, 120, 20);
		sidebar.add(lblNewLabel_2_2_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(114, 114, 114));
		panel.setBounds(10, 360, 145, 2);
		sidebar.add(panel);
		
		JLabel lblNewLabel_3 = new JLabel("Тохиргоо");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblNewLabel_3.setForeground(new Color(160, 160, 160));
		lblNewLabel_3.setBounds(45, 381, 89, 14);
		sidebar.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Таны туслах");
		lblNewLabel_3_1.setForeground(new Color(114, 114, 114));
		lblNewLabel_3_1.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(30, 723, 89, 14);
		sidebar.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Холбогдох хаяг");
		lblNewLabel_3_1_1.setForeground(new Color(114, 114, 114));
		lblNewLabel_3_1_1.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblNewLabel_3_1_1.setBounds(30, 755, 120, 14);
		sidebar.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Гарах");
		lblNewLabel_3_1_2.setForeground(new Color(114, 114, 114));
		lblNewLabel_3_1_2.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblNewLabel_3_1_2.setBounds(66, 802, 89, 14);
		sidebar.add(lblNewLabel_3_1_2);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(147, 147, 147));
		panel_8.setBounds(10, 127, 28, 20);
		sidebar.add(panel_8);
		
		JPanel panel_8_1 = new JPanel();
		panel_8_1.setBackground(new Color(147, 147, 147));
		panel_8_1.setBounds(10, 170, 28, 20);
		sidebar.add(panel_8_1);
		
		JPanel panel_8_2 = new JPanel();
		panel_8_2.setBackground(new Color(147, 147, 147));
		panel_8_2.setBounds(10, 212, 28, 20);
		sidebar.add(panel_8_2);
		
		JPanel panel_8_2_1 = new JPanel();
		panel_8_2_1.setBackground(new Color(147, 147, 147));
		panel_8_2_1.setBounds(10, 255, 28, 20);
		sidebar.add(panel_8_2_1);
		
		JPanel panel_8_2_2 = new JPanel();
		panel_8_2_2.setBackground(new Color(147, 147, 147));
		panel_8_2_2.setBounds(10, 381, 28, 20);
		sidebar.add(panel_8_2_2);
		
		JPanel panel_8_2_2_1 = new JPanel();
		panel_8_2_2_1.setBackground(new Color(147, 147, 147));
		panel_8_2_2_1.setBounds(28, 802, 28, 20);
		sidebar.add(panel_8_2_2_1);
		bottom.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(46, 46, 46));
		panel_1.setBounds(72, 41, 396, 254);
		bottom.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Дансны үлдэгдэл");
		lblNewLabel_6.setBounds(114, 40, 156, 25);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("9,000₮");
		lblNewLabel_6_1.setForeground(Color.WHITE);
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_6_1.setBounds(69, 122, 173, 54);
		panel_1.add(lblNewLabel_6_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(147, 147, 147));
		panel_2.setBounds(248, 198, 114, 34);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("Цэнэглэх");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setBounds(34, 0, 80, 34);
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("+");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setBounds(10, 0, 14, 34);
		panel_2.add(lblNewLabel_8);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(147, 147, 147));
		panel_3.setBounds(42, 32, 54, 48);
		panel_1.add(panel_3);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(46, 46, 46));
		panel_1_1.setBounds(537, 41, 580, 254);
		bottom.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_6_2 = new JLabel("Өнөөдрийн сэт \r\nхоол");
		lblNewLabel_6_2.setForeground(Color.WHITE);
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6_2.setBounds(106, 11, 236, 89);
		panel_1_1.add(lblNewLabel_6_2);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(new Color(147, 147, 147));
		panel_3_1.setBounds(42, 32, 54, 48);
		panel_1_1.add(panel_3_1);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBackground(new Color(147, 147, 147));
		panel_3_2.setBounds(319, 32, 236, 200);
		panel_1_1.add(panel_3_2);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Цуйван сэт");
		lblNewLabel_6_1_1.setForeground(Color.WHITE);
		lblNewLabel_6_1_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_6_1_1.setBounds(73, 123, 236, 54);
		panel_1_1.add(lblNewLabel_6_1_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(new Color(147, 147, 147));
		panel_2_1.setBounds(73, 198, 126, 34);
		panel_1_1.add(panel_2_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("Захиалах");
		lblNewLabel_7_1.setForeground(Color.WHITE);
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7_1.setBounds(34, 1, 92, 34);
		panel_2_1.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("+");
		lblNewLabel_8_1.setForeground(Color.WHITE);
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_8_1.setBounds(10, 0, 14, 34);
		panel_2_1.add(lblNewLabel_8_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(72, 334, 718, 377);
		bottom.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Сүүлд идсэн түүх");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_9.setBounds(38, 11, 188, 25);
		panel_4.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Захиалсан хоол");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10.setBounds(54, 75, 127, 14);
		panel_4.add(lblNewLabel_10);
		
		JLabel lblNewLabel_10_1 = new JLabel("Он, Сар, Өдөр");
		lblNewLabel_10_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10_1.setBounds(233, 75, 127, 14);
		panel_4.add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_10_2 = new JLabel("Тоо ширхэг");
		lblNewLabel_10_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10_2.setBounds(404, 75, 127, 14);
		panel_4.add(lblNewLabel_10_2);
		
		JLabel lblNewLabel_10_3 = new JLabel("Нийт дүн");
		lblNewLabel_10_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10_3.setBounds(554, 75, 127, 14);
		panel_4.add(lblNewLabel_10_3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(114, 114, 114));
		panel_6.setBounds(36, 116, 645, 2);
		panel_4.add(panel_6);
		
		JPanel panel_6_1 = new JPanel();
		panel_6_1.setBackground(new Color(114, 114, 114));
		panel_6_1.setBounds(36, 164, 645, 2);
		panel_4.add(panel_6_1);
		
		JPanel panel_6_1_1 = new JPanel();
		panel_6_1_1.setBackground(new Color(114, 114, 114));
		panel_6_1_1.setBounds(38, 218, 645, 2);
		panel_4.add(panel_6_1_1);
		
		JPanel panel_6_1_2 = new JPanel();
		panel_6_1_2.setBackground(new Color(114, 114, 114));
		panel_6_1_2.setBounds(36, 269, 645, 2);
		panel_4.add(panel_6_1_2);
		
		JLabel lblNewLabel_10_4_1_1 = new JLabel("Тактуритан");
		lblNewLabel_10_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10_4_1_1.setBounds(54, 231, 127, 27);
		panel_4.add(lblNewLabel_10_4_1_1);
		
		JLabel lblNewLabel_10_4_1_1_1 = new JLabel("Онигири");
		lblNewLabel_10_4_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10_4_1_1_1.setBounds(54, 180, 127, 27);
		panel_4.add(lblNewLabel_10_4_1_1_1);
		
		JLabel lblNewLabel_10_4_1_1_2 = new JLabel("Будаатай хуурга");
		lblNewLabel_10_4_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10_4_1_1_2.setBounds(54, 129, 127, 27);
		panel_4.add(lblNewLabel_10_4_1_1_2);
		
		JLabel lblNewLabel_10_4_1_1_3 = new JLabel("Цуйван");
		lblNewLabel_10_4_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10_4_1_1_3.setBounds(54, 282, 127, 27);
		panel_4.add(lblNewLabel_10_4_1_1_3);
		
		JLabel lblNewLabel_10_4_1_1_2_1 = new JLabel("2021.10.17\r\n");
		lblNewLabel_10_4_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10_4_1_1_2_1.setBounds(233, 129, 127, 27);
		panel_4.add(lblNewLabel_10_4_1_1_2_1);
		
		JLabel lblNewLabel_10_4_1_1_2_2 = new JLabel("2021.10.16");
		lblNewLabel_10_4_1_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10_4_1_1_2_2.setBounds(233, 177, 127, 27);
		panel_4.add(lblNewLabel_10_4_1_1_2_2);
		
		JLabel lblNewLabel_10_4_1_1_2_3 = new JLabel("2021.10.15");
		lblNewLabel_10_4_1_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10_4_1_1_2_3.setBounds(233, 231, 127, 27);
		panel_4.add(lblNewLabel_10_4_1_1_2_3);
		
		JLabel lblNewLabel_10_4_1_1_2_4 = new JLabel("2021.10.14");
		lblNewLabel_10_4_1_1_2_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10_4_1_1_2_4.setBounds(233, 282, 127, 27);
		panel_4.add(lblNewLabel_10_4_1_1_2_4);
		
		JLabel lblNewLabel_10_4_1_1_2_5 = new JLabel("1");
		lblNewLabel_10_4_1_1_2_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10_4_1_1_2_5.setBounds(442, 129, 89, 27);
		panel_4.add(lblNewLabel_10_4_1_1_2_5);
		
		JLabel lblNewLabel_10_4_1_1_2_6 = new JLabel("4");
		lblNewLabel_10_4_1_1_2_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10_4_1_1_2_6.setBounds(442, 180, 89, 27);
		panel_4.add(lblNewLabel_10_4_1_1_2_6);
		
		JLabel lblNewLabel_10_4_1_1_2_7 = new JLabel("1");
		lblNewLabel_10_4_1_1_2_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10_4_1_1_2_7.setBounds(442, 231, 89, 27);
		panel_4.add(lblNewLabel_10_4_1_1_2_7);
		
		JLabel lblNewLabel_10_4_1_1_2_8 = new JLabel("1");
		lblNewLabel_10_4_1_1_2_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10_4_1_1_2_8.setBounds(442, 282, 89, 27);
		panel_4.add(lblNewLabel_10_4_1_1_2_8);
		
		JLabel lblNewLabel_10_4_1_1_2_9 = new JLabel("8,000₮");
		lblNewLabel_10_4_1_1_2_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10_4_1_1_2_9.setBounds(554, 126, 127, 27);
		panel_4.add(lblNewLabel_10_4_1_1_2_9);
		
		JLabel lblNewLabel_10_4_1_1_2_10 = new JLabel("8,000₮");
		lblNewLabel_10_4_1_1_2_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10_4_1_1_2_10.setBounds(554, 180, 127, 27);
		panel_4.add(lblNewLabel_10_4_1_1_2_10);
		
		JLabel lblNewLabel_10_4_1_1_2_11 = new JLabel("8,000₮");
		lblNewLabel_10_4_1_1_2_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10_4_1_1_2_11.setBounds(554, 231, 127, 27);
		panel_4.add(lblNewLabel_10_4_1_1_2_11);
		
		JLabel lblNewLabel_10_4_1_1_2_12 = new JLabel("8,000₮");
		lblNewLabel_10_4_1_1_2_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10_4_1_1_2_12.setBounds(554, 282, 127, 27);
		panel_4.add(lblNewLabel_10_4_1_1_2_12);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		panel_5.setBounds(818, 334, 299, 377);
		bottom.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_9_1 = new JLabel("Хамгийн их идсэн хоол\r\n");
		lblNewLabel_9_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_9_1.setBounds(40, 11, 216, 25);
		panel_5.add(lblNewLabel_9_1);
		top.setLayout(null);
		
		JLabel toptext = new JLabel("Сайн байна уу, Дөлгөөн ");
		toptext.setFont(new Font("Tahoma", Font.PLAIN, 30));
		toptext.setBounds(41,27,416,42);
		
		toptext.setLabelFor(toptext);
		top.add(toptext);
		toptext.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel lblNewLabel_1 = new JLabel("Өлсөж байна уу ?");
		lblNewLabel_1.setForeground(new Color(114, 114, 114));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(41, 62, 238, 22);
		top.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("Дөлгөөн");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(978, 27, 69, 22);
		top.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Ку-3 анги");
		lblNewLabel_5.setForeground(new Color(114, 114, 114));
		lblNewLabel_5.setBounds(978, 49, 62, 14);
		top.add(lblNewLabel_5);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 255, 255));
		panel_7.setBounds(1065, 27, 50, 42);
		top.add(panel_7);
		contentPane.setLayout(gl_contentPane);
	}
}