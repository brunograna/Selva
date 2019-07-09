package br.com.selva.view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Perguntas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Perguntas frame = new Perguntas();
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
	public Perguntas() {
		JPanel panelResultado = new JPanel();
		panelResultado.setVisible(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 408, 810);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnOK = new JButton("OK");
		btnOK.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panelResultado.setVisible(true);
				
			}
		});
		btnOK.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnOK.setForeground(Color.BLUE);
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
			}
		});
		btnOK.setBounds(293, 685, 89, 67);
		contentPane.add(btnOK);
		
		
		panelResultado.setBackground(Color.WHITE);
		panelResultado.setBounds(10, 128, 372, 590);
		contentPane.add(panelResultado);
		panelResultado.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(Perguntas.class.getResource("/br/com/selva/imagens/fogos.jpeg")));
		lblNewLabel_2.setBounds(10, 81, 362, 220);
		panelResultado.add(lblNewLabel_2);
		
		JLabel Vencedor1 = new JLabel("Segoe Print");
		Vencedor1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Vencedor1.setBounds(109, 329, 100, 44);
		panelResultado.add(Vencedor1);
		
		JLabel label_5 = new JLabel("Segoe Print");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_5.setBounds(109, 384, 100, 44);
		panelResultado.add(label_5);
		
		JLabel label_6 = new JLabel("Segoe Print");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_6.setBounds(109, 439, 100, 44);
		panelResultado.add(label_6);
		
		JLabel label_7 = new JLabel("Segoe Print");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_7.setBounds(109, 509, 100, 44);
		panelResultado.add(label_7);
		
		JLabel lblNewLabel_3 = new JLabel("Vencedores");
		lblNewLabel_3.setFont(new Font("Segoe Print", Font.PLAIN, 25));
		lblNewLabel_3.setBounds(96, 11, 171, 59);
		panelResultado.add(lblNewLabel_3);
		
		JLabel lbEb = new JLabel("New label");
		lbEb.setIcon(new ImageIcon(Perguntas.class.getResource("/br/com/selva/imagens/eb2.jpg")));
		lbEb.setBounds(10, 181, 99, 111);
		contentPane.add(lbEb);
		
		JLabel labe = new JLabel("New label");
		labe.setIcon(new ImageIcon(Perguntas.class.getResource("/br/com/selva/imagens/ma2.jpg")));
		labe.setBounds(10, 303, 99, 111);
		contentPane.add(labe);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon(Perguntas.class.getResource("/br/com/selva/imagens/aero2.jpg")));
		label.setBounds(10, 439, 99, 111);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon(Perguntas.class.getResource("/br/com/selva/imagens/FEB.png")));
		label_1.setBounds(10, 571, 99, 111);
		contentPane.add(label_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(128, 229, 227, 38);
		contentPane.add(lblNewLabel);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(119, 351, 227, 38);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setBounds(119, 475, 227, 38);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setBounds(119, 602, 227, 38);
		contentPane.add(label_4);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(10, 11, 372, 138);
		contentPane.add(lblNewLabel_1);
	}
}
