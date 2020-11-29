package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Canvas;
import javax.swing.JLabel;

public class Calculator {

	private JFrame frmMartsCalculator;
	private JTextField textDisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmMartsCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	//ARITHMETIC METHODS
	double num, ans;
	int calculation;
	
	
	public Calculator() {
		initialize();
	}


	
	
	
	public void operations() {
		
		switch(calculation) {
		case 1:
			ans = num + Double.parseDouble(textDisplay.getText());
			textDisplay.setText(Double.toString(ans));
			break;
		case 2:
			ans = num - Double.parseDouble(textDisplay.getText());
			textDisplay.setText(Double.toString(ans));
			break;
		case 3:
			ans = num * Double.parseDouble(textDisplay.getText());
			textDisplay.setText(Double.toString(ans));
			break;
		case 4:
			ans = num / Double.parseDouble(textDisplay.getText());
			textDisplay.setText(Double.toString(ans));
			break;
		}
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMartsCalculator = new JFrame();
		frmMartsCalculator.getContentPane().setBackground(new Color(105, 105, 105));
		frmMartsCalculator.setTitle("Mart's Calculator");
		frmMartsCalculator.setResizable(false);
		frmMartsCalculator.setType(Type.UTILITY);
		frmMartsCalculator.setBackground(Color.GRAY);
		frmMartsCalculator.setBounds(100, 100, 250, 358);
		frmMartsCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMartsCalculator.getContentPane().setLayout(null);
		
		textDisplay = new JTextField();
		textDisplay.setForeground(new Color(0, 255, 0));
		textDisplay.setBackground(new Color(0, 0, 0));
		textDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		textDisplay.setBounds(10, 36, 212, 33);
		frmMartsCalculator.getContentPane().add(textDisplay);
		textDisplay.setColumns(10);
		
		JButton btnNewButton = new JButton("CE");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(112, 128, 144));
		btnNewButton.setFont(new Font("Mangal", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textDisplay.setText("");
			}
		});
		btnNewButton.setBounds(10, 93, 73, 33);
		frmMartsCalculator.getContentPane().add(btnNewButton);
		
		JButton btnC = new JButton("C");
		btnC.setForeground(new Color(255, 255, 255));
		btnC.setBackground(new Color(112, 128, 144));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String last = textDisplay.getText();
				textDisplay.setText(last.substring(0, last.length()-1));
			}
		});
		btnC.setFont(new Font("Mangal", Font.PLAIN, 11));
		btnC.setBounds(95, 93, 71, 33);
		frmMartsCalculator.getContentPane().add(btnC);
			
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(112, 128, 144));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText(textDisplay.getText() + "7");
			}
		});
		btnNewButton_1.setFont(new Font("Mangal", Font.PLAIN, 11));
		btnNewButton_1.setBounds(10, 138, 44, 33);
		frmMartsCalculator.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("8");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(112, 128, 144));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText(textDisplay.getText() + "8");
			}
		});
		btnNewButton_3.setFont(new Font("Mangal", Font.PLAIN, 11));
		btnNewButton_3.setBounds(70, 138, 44, 33);
		frmMartsCalculator.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("9");
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(112, 128, 144));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText(textDisplay.getText() + "9");
			}
		});
		btnNewButton_4.setFont(new Font("Mangal", Font.PLAIN, 11));
		btnNewButton_4.setBounds(124, 138, 44, 33);
		frmMartsCalculator.getContentPane().add(btnNewButton_4);
		
		
		JButton btnNewButton_6 = new JButton("4");
		btnNewButton_6.setForeground(new Color(255, 255, 255));
		btnNewButton_6.setBackground(new Color(112, 128, 144));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText(textDisplay.getText() + "4");
			}
		});
		btnNewButton_6.setFont(new Font("Mangal", Font.PLAIN, 11));
		btnNewButton_6.setBounds(10, 183, 44, 33);
		frmMartsCalculator.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("5");
		btnNewButton_7.setForeground(new Color(255, 255, 255));
		btnNewButton_7.setBackground(new Color(112, 128, 144));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText(textDisplay.getText() + "5");
			}
		});
		btnNewButton_7.setFont(new Font("Mangal", Font.PLAIN, 11));
		btnNewButton_7.setBounds(70, 183, 44, 33);
		frmMartsCalculator.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("6");
		btnNewButton_8.setForeground(new Color(255, 255, 255));
		btnNewButton_8.setBackground(new Color(112, 128, 144));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText(textDisplay.getText() + "6");
			}
		});
		btnNewButton_8.setFont(new Font("Mangal", Font.PLAIN, 11));
		btnNewButton_8.setBounds(124, 183, 44, 33);
		frmMartsCalculator.getContentPane().add(btnNewButton_8);
		
		
		
		JButton btnNewButton_10 = new JButton("1");
		btnNewButton_10.setForeground(new Color(255, 255, 255));
		btnNewButton_10.setBackground(new Color(112, 128, 144));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText(textDisplay.getText() + "1");
			}
		});
		btnNewButton_10.setFont(new Font("Mangal", Font.PLAIN, 11));
		btnNewButton_10.setBounds(10, 228, 44, 33);
		frmMartsCalculator.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("2");
		btnNewButton_11.setForeground(new Color(255, 255, 255));
		btnNewButton_11.setBackground(new Color(112, 128, 144));
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText(textDisplay.getText() + "2");
			}
		});
		btnNewButton_11.setFont(new Font("Mangal", Font.PLAIN, 11));
		btnNewButton_11.setBounds(70, 228, 44, 33);
		frmMartsCalculator.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("3");
		btnNewButton_12.setForeground(new Color(255, 255, 255));
		btnNewButton_12.setBackground(new Color(112, 128, 144));
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText(textDisplay.getText() + "3");
			}
		});
		btnNewButton_12.setFont(new Font("Mangal", Font.PLAIN, 11));
		btnNewButton_12.setBounds(124, 228, 44, 33);
		frmMartsCalculator.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("=");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operations();
				
			}
		});
		btnNewButton_13.setForeground(new Color(255, 255, 255));
		btnNewButton_13.setBackground(new Color(112, 128, 144));
		btnNewButton_13.setFont(new Font("Mangal", Font.PLAIN, 11));
		btnNewButton_13.setBounds(178, 273, 44, 33);
		frmMartsCalculator.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("0");
		btnNewButton_14.setForeground(new Color(255, 255, 255));
		btnNewButton_14.setBackground(new Color(112, 128, 144));
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText(textDisplay.getText() + "0");
			}
		});
		btnNewButton_14.setFont(new Font("Mangal", Font.PLAIN, 11));
		btnNewButton_14.setBounds(10, 273, 104, 33);
		frmMartsCalculator.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton(".");
		btnNewButton_15.setForeground(new Color(255, 255, 255));
		btnNewButton_15.setBackground(new Color(112, 128, 144));
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String display = textDisplay.getText();
				if(display.contains(".")) {
				textDisplay.setText(textDisplay.getText());
				} else {
					textDisplay.setText(textDisplay.getText() + ".");
				};
			}
		});
		btnNewButton_15.setFont(new Font("Mangal", Font.PLAIN, 11));
		btnNewButton_15.setBounds(124, 273, 44, 33);
		frmMartsCalculator.getContentPane().add(btnNewButton_15);
		
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(167, 12, 55, 16);
		frmMartsCalculator.getContentPane().add(lblNewLabel);
		
		// OPERATIONS
		
		JButton btnNewButton_9 = new JButton("+");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textDisplay.getText());
				calculation = 1;
				lblNewLabel.setText(textDisplay.getText() + "+");
				textDisplay.setText("");
				
			}
		});
		btnNewButton_9.setForeground(new Color(255, 255, 255));
		btnNewButton_9.setBackground(new Color(112, 128, 144));
		btnNewButton_9.setFont(new Font("Mangal", Font.PLAIN, 11));
		btnNewButton_9.setBounds(178, 183, 44, 33);
		frmMartsCalculator.getContentPane().add(btnNewButton_9);
		
		
		JButton btnNewButton_5 = new JButton("-");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textDisplay.getText());
				calculation = 2;
				lblNewLabel.setText(textDisplay.getText() + "-");
				textDisplay.setText("");
				
			}
		});
		
		JButton btnNewButton_2 = new JButton("*");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textDisplay.getText());
				calculation = 3;
				lblNewLabel.setText(textDisplay.getText() + "*");
				textDisplay.setText("");
			}
		});
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(112, 128, 144));
		btnNewButton_2.setFont(new Font("Mangal", Font.PLAIN, 11));
		btnNewButton_2.setBounds(178, 93, 44, 33);
		frmMartsCalculator.getContentPane().add(btnNewButton_2);
		
		btnNewButton_5.setForeground(new Color(255, 255, 255));
		btnNewButton_5.setBackground(new Color(112, 128, 144));
		btnNewButton_5.setFont(new Font("Mangal", Font.PLAIN, 11));
		btnNewButton_5.setBounds(178, 138, 44, 33);
		frmMartsCalculator.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_13_1 = new JButton("/");
		btnNewButton_13_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textDisplay.getText());
				calculation = 4;
				lblNewLabel.setText(textDisplay.getText() + "/");
				textDisplay.setText("");
			}
		});
		btnNewButton_13_1.setForeground(new Color(255, 255, 255));
		btnNewButton_13_1.setBackground(new Color(112, 128, 144));
		btnNewButton_13_1.setFont(new Font("Mangal", Font.PLAIN, 11));
		btnNewButton_13_1.setBounds(178, 229, 44, 33);
		frmMartsCalculator.getContentPane().add(btnNewButton_13_1);
	
		
	
	}
}
