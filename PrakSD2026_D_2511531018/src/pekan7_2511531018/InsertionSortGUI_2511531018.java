package pekan7_2511531018;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class InsertionSortGUI_2511531018 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int[] array_1018;
	private JLabel[] labelArray;
	private JButton stepButton, resetButton, setButton;
	private JTextField inputField;
	private JPanel panelArray;
	private JTextArea stepArea;
	
	private int i_1018 = 1, j_1018;
	private boolean sorting = false;
	private int stepCount = 1;
 	

	public InsertionSortGUI_2511531018() {
		setTitle("Insertion Sort Langkah per Langkah");
		setSize(750, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		// Panel input
		JPanel inputPanel = new JPanel(new FlowLayout());
		inputField = new JTextField(30);
		setButton = new JButton("Set Array");
		inputPanel.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
		inputPanel.add(inputField);
		inputPanel.add(setButton);
		
		// Panel array visual
		panelArray = new JPanel();
		panelArray.setLayout(new FlowLayout());
		
		// Panel kontrol
		JPanel controlPanel = new JPanel();
		stepButton = new JButton("Langkah Selanjutnya");
		resetButton = new JButton("Reset");
		stepButton.setEnabled(false);
		controlPanel.add(stepButton);
		controlPanel.add(resetButton);
		
		//Area teks untuk log langkah-langkah
		stepArea = new JTextArea(8, 60);
		stepArea.setEditable(false);
		stepArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
		JScrollPane scrollPane = new JScrollPane(stepArea);
		
		//Tambahkan panel ke frame
		add(inputPanel, BorderLayout.NORTH);
		add(panelArray, BorderLayout.CENTER);
		add(controlPanel, BorderLayout.SOUTH);
		add(scrollPane, BorderLayout.EAST);
		
		// Event Set Array
		setButton.addActionListener(e -> setArrayFromInput_1018());
		
		// Event Langkah Selanjutnya
		stepButton.addActionListener(e -> performStep_1018());
		
		// Event Reset
		resetButton.addActionListener(e -> reset_1018());
	}
	
	private void setArrayFromInput_1018() {
		String text = inputField.getText().trim();
		if(text.isEmpty()) return;
		String[] parts = text.split(",");
		array_1018 = new int[parts.length];
		try {
			for (int k_1018 = 0; k_1018 < parts.length; k_1018++) {
				array_1018[k_1018] = Integer.parseInt(parts[k_1018].trim()); }
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(this, "Masukkan hanyan angka yang dipisahkan "
						+ "dengan koma!", "Error", JOptionPane.ERROR_MESSAGE);
				return;	}
			i_1018 = 1;
			stepCount = 1;
			sorting = true;
			stepButton.setEnabled(true);
			stepArea.setText("");
			panelArray.removeAll();
			labelArray = new JLabel[array_1018.length];
			for (int k_1018 = 0; k_1018 < array_1018.length; k_1018++) {
				labelArray[k_1018] = new JLabel(String.valueOf(array_1018[k_1018]));
				labelArray[k_1018].setFont(new Font("Arial", Font.BOLD, 24));
				labelArray[k_1018].setBorder(BorderFactory.createLineBorder(Color.BLACK));
				labelArray[k_1018].setPreferredSize(new Dimension(50, 50));
				labelArray[k_1018].setHorizontalAlignment(SwingConstants.CENTER);
				panelArray.add(labelArray[k_1018]);
	}
			panelArray.revalidate();
			panelArray.repaint();
			
		}
	
	private void performStep_1018() {
		if (i_1018 < array_1018.length && sorting) {
			int key_1018 = array_1018[i_1018];
			j_1018 = i_1018 - 1;
			
			StringBuilder stepLog = new StringBuilder();
			stepLog.append("Langkah ").append(stepCount).append(": Memasukkan ").append(key_1018).append("\n");
			
			while (j_1018 >= 0 && array_1018[j_1018] > key_1018) {
				array_1018[j_1018 + 1] = array_1018[j_1018];
				j_1018--;
			}
			array_1018[j_1018 + 1] = key_1018;
			
			updateLabels();
			stepLog.append("Hasil: ").append(arrayToString(array_1018)).append("\n\n");
			stepArea.append(stepLog.toString());
			
			i_1018++;
			stepCount++;
			
			if (i_1018 == array_1018.length) {
				sorting = false;
				stepButton.setEnabled(false);
				JOptionPane.showMessageDialog(this, "Sorting selesai!");
			}
		}
	}
	
	private void updateLabels() {
		for (int k_1018 = 0; k_1018 < array_1018.length; k_1018++) {
			labelArray[k_1018].setText(String.valueOf(array_1018[k_1018]));
		}
	}
	private void reset_1018() {
		inputField.setText("");
		panelArray.removeAll();
		panelArray.revalidate();
		panelArray.repaint();
		stepArea.setText("");
		stepButton.setEnabled(false);
		sorting = false;
		i_1018 = 1;
		stepCount = 1;
	}
	
	private String arrayToString(int[] arr) {
	    StringBuilder sb = new StringBuilder();
	    for (int k_1018 = 0; k_1018 < arr.length; k_1018++) {
	        sb.append(arr[k_1018]); // INI YANG BENAR
	        if (k_1018 < arr.length - 1) {
	            sb.append(", ");
	        }
	    }
	    return sb.toString();
	}


	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			InsertionSortGUI_2511531018 gui = new InsertionSortGUI_2511531018();
			gui.setVisible(true);
		});
	}
		
	}
			
	
	
