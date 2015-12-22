package myexample.testlayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.FlowLayout;

public class MainForm {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm window = new MainForm();
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
	public MainForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 835, 531);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 368, 239);
		frame.getContentPane().add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JButton btnNewButton_4 = new JButton("New button");
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("New button");
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setPreferredSize(new Dimension(70, 23));
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setMinimumSize(new Dimension(60, 23));
		btnNewButton_2.setMaximumSize(new Dimension(60, 23));
		btnNewButton_2.setPreferredSize(new Dimension(60, 23));
		panel.add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 240, 368, 252);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 6, 0, 0));
		
		JLabel label = new JLabel("");
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("");
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("");
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("");
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("");
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("");
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("");
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("");
		panel_1.add(label_7);
		
		JButton btnNewButton = new JButton("New button");
		panel_1.add(btnNewButton);
		
		JLabel label_8 = new JLabel("");
		panel_1.add(label_8);
		
		JButton btnNewButton_16 = new JButton("New button");
		panel_1.add(btnNewButton_16);
		
		JLabel label_9 = new JLabel("");
		panel_1.add(label_9);
		
		JLabel label_10 = new JLabel("");
		panel_1.add(label_10);
		
		JButton btnNewButton_15 = new JButton("New button");
		panel_1.add(btnNewButton_15);
		
		JButton btnNewButton_14 = new JButton("New button");
		panel_1.add(btnNewButton_14);
		
		JLabel label_11 = new JLabel("");
		panel_1.add(label_11);
		
		JLabel label_12 = new JLabel("");
		panel_1.add(label_12);
		
		JLabel label_13 = new JLabel("");
		panel_1.add(label_13);
		
		JLabel label_14 = new JLabel("");
		panel_1.add(label_14);
		
		JButton btnNewButton_17 = new JButton("New button");
		panel_1.add(btnNewButton_17);
		
		JLabel label_15 = new JLabel("");
		panel_1.add(label_15);
		
		JLabel label_16 = new JLabel("");
		panel_1.add(label_16);
		
		JLabel label_17 = new JLabel("");
		panel_1.add(label_17);
		
		JLabel label_18 = new JLabel("");
		panel_1.add(label_18);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(368, 0, 451, 239);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_6 = new JButton("New button");
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("New button");
		panel_2.add(btnNewButton_7);
		
		JButton btnNewButton_9 = new JButton("New button");
		btnNewButton_9.setMargin(new Insets(10, 20, 2, 14));
		panel_2.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("New button");
		panel_2.add(btnNewButton_10);
		
		JButton btnNewButton_8 = new JButton("New button");
		btnNewButton_8.setSize(new Dimension(100, 0));
		btnNewButton_8.setMinimumSize(new Dimension(89, 10));
		btnNewButton_8.setMaximumSize(new Dimension(70, 10));
		btnNewButton_8.setPreferredSize(new Dimension(70, 10));
		panel_2.add(btnNewButton_8);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(368, 240, 451, 252);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(new Rectangle(0, 0, 100, 0));
		btnNewButton_1.setSize(new Dimension(100, 0));
		btnNewButton_1.setMargin(new Insets(2, 25, 2, 14));
		btnNewButton_1.setPreferredSize(new Dimension(89, 20));
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_12 = new JButton("New button");
		panel_3.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("New button");
		panel_3.add(btnNewButton_13);
		
		JButton btnNewButton_11 = new JButton("New button");
		panel_3.add(btnNewButton_11);
	}
}
