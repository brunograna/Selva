package br.com.selva.view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.selva.model.usuario;
import br.com.selva.rede.EnvioDeDados;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import javax.swing.JTextPane;

public class app extends JFrame {
	

	private JPanel contentPane;
	private JTextField Visor;
	private String nome;
	usuario usu = new usuario();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					app frame = new app();
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
	public app() {
		nome = JOptionPane.showInputDialog(null, "Qual é o seu nome?");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		Visor = new JTextField();
		Visor.setText(nome);
		usu.setNome(nome);
		Visor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		Visor.setEditable(false);
		Visor.setBounds(10, 11, 414, 50);
		contentPane.add(Visor);
		Visor.setColumns(10);
		
		
		JButton btneb = new JButton("New button");
		btneb.setBounds(10, 74, 185, 80);
		contentPane.add(btneb);
		btneb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println(1);
				usu.setResposta(1);
				montarusuarioresposta();
			}
		});
		btneb.setForeground(new Color(60, 179, 113));
		btneb.setBackground(Color.GREEN);
		btneb.setIcon(new ImageIcon(app.class.getResource("/br/com/selva/img/Eb.jpg")));
		
		JButton button_3 = new JButton("New button");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(3);
				usu.setResposta(3);
				montarusuarioresposta();
			}
		});
		button_3.setIcon(new ImageIcon(app.class.getResource("/br/com/selva/img/ma.jpg")));
		button_3.setForeground(new Color(60, 179, 113));
		button_3.setBackground(new Color(0, 0, 255));
		button_3.setBounds(10, 165, 185, 80);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("New button");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(2);
				usu.setResposta(2);
				montarusuarioresposta();
			}
		});
		button_4.setIcon(new ImageIcon(app.class.getResource("/br/com/selva/img/aero.jpg")));
		button_4.setForeground(new Color(60, 179, 113));
		button_4.setBackground(new Color(192, 192, 192));
		button_4.setBounds(239, 72, 185, 80);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("New button");
		button_5.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				System.out.println(4);
				usu.setResposta(4);
				montarusuarioresposta();
			}
		});
		button_5.setIcon(new ImageIcon(app.class.getResource("/br/com/selva/img/feb.jpg")));
		button_5.setForeground(new Color(60, 179, 113));
		button_5.setBackground(new Color(255, 255, 255));
		button_5.setBounds(239, 165, 185, 80);
		contentPane.add(button_5);
	}
	
	public void montarusuarioresposta() {
		
		java.util.Date dataUtil = new java.util.Date();
  	  	java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());
  	  	
  	  	usu.setDAT_Hora(dataSql.toString());
		new EnvioDeDados(usu);
		
	}
	
}
