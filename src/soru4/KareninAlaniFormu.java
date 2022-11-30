package soru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KareninAlaniFormu {

	private JFrame frame;
	private JTextField txtKareKenar;
	private JLabel lblSonuc;
	private HesapIslemi hesapIslemi;
	private KareAlani kareAlani;
	private IHesapla iHesapla;
	private JComboBox cmbSecim;
	private KareCevresi kareCevresi;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KareninAlaniFormu window = new KareninAlaniFormu();
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
	public KareninAlaniFormu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Karenin bir kenari :");
		lblNewLabel.setBounds(68, 76, 108, 14);
		frame.getContentPane().add(lblNewLabel);
		
		txtKareKenar = new JTextField();
		txtKareKenar.setBounds(210, 73, 86, 20);
		frame.getContentPane().add(txtKareKenar);
		txtKareKenar.setColumns(10);
		
		JButton btnHesapla = new JButton("Hesapla");
		btnHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(cmbSecim.getSelectedItem().toString()=="KareAlani)")
				{
					kareAlani = new KareAlani();
					hesapIslemi = new HesapIslemi(kareAlani);
					lblSonuc.setText(hesapIslemi.Hesap(Double.valueOf(txtKareKenar.getText())));
					
				}
				else if (cmbSecim.getSelectedItem().toString()=="KareCevresi)")
				{
					kareCevresi = new KareCevresi();
					hesapIslemi = new HesapIslemi(kareCevresi);
					lblSonuc.setText(hesapIslemi.Hesap(Double.valueOf(txtKareKenar.getText())));
					
					
				}
				
		
			}
		});
		btnHesapla.setBounds(207, 140, 89, 23);
		frame.getContentPane().add(btnHesapla);
		
		lblSonuc = new JLabel("Sonuc :");
		lblSonuc.setBounds(241, 208, 131, 28);
		frame.getContentPane().add(lblSonuc);
		
		cmbSecim = new JComboBox();
		cmbSecim.setModel(new DefaultComboBoxModel(new String[] {"Seciniz", "KareAlani", "KareCevresi"}));
		cmbSecim.setBounds(210, 32, 86, 22);
		frame.getContentPane().add(cmbSecim);
	}
}
