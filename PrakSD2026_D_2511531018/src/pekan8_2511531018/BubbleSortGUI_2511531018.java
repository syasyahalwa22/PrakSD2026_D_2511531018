package pekan8_2511531018;

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

public class BubbleSortGUI_2511531018 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane_1018;
	private int[] array_1018;
	private JLabel[] labelArray_1018;
	JButton stepButton_1018;
	private JButton resetButton_1018;
	JButton setButton_1018;
	private JTextField inputField_1018;
	private JPanel panelArray_1018;
	private JTextArea stepArea_1018;
	
	private int i_1018 = 1, j_1018;
	private boolean sorting_1018 = false;
	private int stepCount_1018 = 1;

	/**
	 * Create the frame.
	 */
	public BubbleSortGUI_2511531018() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane_1018 = new JPanel();
		contentPane_1018.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane_1018);
		contentPane_1018.setLayout(null);
		setTitle("Bubble sort langkah per langkah");
		setSize(750, 400);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		// panel input
		JPanel inputPanel = new JPanel(new FlowLayout());
		inputField_1018 = new JTextField(30);
		setButton_1018 = new JButton ("Set Array");
		inputPanel.add(new JLabel("Masukkan angka (pisahkan dengan koma): "));
		inputPanel.add(inputField_1018);
		inputPanel.add(setButton_1018);
		
		// panel array visual
		panelArray_1018 = new JPanel();
		panelArray_1018.setLayout(new FlowLayout());
		
		// panel kontrol
		JPanel controlPanel = new JPanel();
		stepButton_1018 = new JButton("Langkah Selanjutnya");
		resetButton_1018 = new JButton("Reset");
		stepButton_1018.setEnabled(false);
		controlPanel.add(stepButton_1018);
		controlPanel.add(resetButton_1018);
		
		// area teks untuk log langkah-langkah
		stepArea_1018 = new JTextArea(8,60);
		stepArea_1018.setEditable(false);
		stepArea_1018.setFont(new Font("Monospaced", Font.PLAIN, 14));
		JScrollPane scrollPane = new JScrollPane(stepArea_1018);
		
		// tambahkan ke panel ke frame
		add(inputPanel, BorderLayout.NORTH);
		add(panelArray_1018, BorderLayout.CENTER);
		add(controlPanel, BorderLayout.SOUTH);
		add(scrollPane, BorderLayout.EAST);
		
		// event set array
		setButton_1018.addActionListener(e -> setArrayFromInput_1018());
		
		// event langkah selanjutnya
		stepButton_1018.addActionListener(e -> performStep_1018());
		
		// event reset
		resetButton_1018.addActionListener(e -> reset_1018());
		
	}
	private void setArrayFromInput_1018() {
	    String text_1018 = inputField_1018.getText().trim();
	    if (text_1018.isEmpty()) return;
	    String[] parts_1018 = text_1018.split(",");
	    array_1018 = new int[parts_1018.length];

	    try {
	        for (int k_1018 = 0; k_1018 < parts_1018.length; k_1018++) {
	            array_1018[k_1018] = Integer.parseInt(parts_1018[k_1018].trim());
	        }
	    } catch (NumberFormatException e_1018) {
	        JOptionPane.showMessageDialog(this, "Masukkan hanya angka " + "yang dipisahkan koma!", "Error",
	                JOptionPane.ERROR_MESSAGE);
	        return;
	    }

	    i_1018 = 0;
	    j_1018 = 0;
	    stepCount_1018 = 1;
	    sorting_1018 = true;

	    stepButton_1018.setEnabled(true);
	    stepArea_1018.setText("");
	    panelArray_1018.removeAll();

	    labelArray_1018 = new JLabel[array_1018.length];
	    for (int k_1018 = 0; k_1018 < array_1018.length; k_1018++) {
	        labelArray_1018[k_1018] = new JLabel(String.valueOf(array_1018[k_1018]));
	        labelArray_1018[k_1018].setFont( new Font("Arial", Font.BOLD, 24));
	        labelArray_1018[k_1018].setOpaque(true);
	        labelArray_1018[k_1018].setBackground(Color.WHITE);
	        labelArray_1018[k_1018].setBorder(BorderFactory.createLineBorder(Color.BLACK));
	        labelArray_1018[k_1018].setPreferredSize(new Dimension(50, 50));
	        labelArray_1018[k_1018].setHorizontalAlignment(SwingConstants.CENTER);
	        panelArray_1018.add(labelArray_1018[k_1018]);
	    }

	    panelArray_1018.revalidate();
	    panelArray_1018.repaint();
	}
	
	private void performStep_1018() {
	    if (!sorting_1018 || i_1018 >= array_1018.length - 1) {
	        sorting_1018 = false;
	        stepButton_1018.setEnabled(false);
	        JOptionPane.showMessageDialog(this, "Sorting selesai!");
	        return;
	    }

	    resetHighlights_1018();
	    StringBuilder stepLog_1018 = new StringBuilder();
	    labelArray_1018[j_1018].setBackground(Color.CYAN);
	    labelArray_1018[j_1018 + 1].setBackground(Color.CYAN);

	    if (array_1018[j_1018] > array_1018[j_1018 + 1]) {
	        // Swap
	        int temp_1018 = array_1018[j_1018];
	        array_1018[j_1018] = array_1018[j_1018 + 1];
	        array_1018[j_1018 + 1] = temp_1018;
	        labelArray_1018[j_1018].setBackground(Color.RED);
	        labelArray_1018[j_1018 + 1].setBackground(Color.RED);

	        stepLog_1018.append("Langkah ").append(stepCount_1018).append(": Menukar elemen ke-")
	                .append(j_1018).append(" (").append(array_1018[j_1018 + 1]).append(") dengan ke-")
	                .append(j_1018 + 1).append(" (").append(array_1018[j_1018]).append(")\n");
	    } else {
	        stepLog_1018.append("Langkah ").append(stepCount_1018).append(": Tidak ada pertukaran antara ke-")
	                .append(j_1018).append(" dan ke-").append(j_1018 + 1).append("\n");
	    }

	    stepLog_1018.append("Hasil: ").append(arrayToString_1018(array_1018)).append("\n\n");
	    stepArea_1018.append(stepLog_1018.toString());
	    updateLabels_1018();
	    j_1018++;

	    if (j_1018 >= array_1018.length - i_1018 - 1) {
	        j_1018 = 0;
	        i_1018++;
	    }

	    stepCount_1018++;

	    if (i_1018 >= array_1018.length - 1) {
	        sorting_1018 = false;
	        stepButton_1018.setEnabled(false);
	        JOptionPane.showMessageDialog(this, "Sorting selesai!");
	    }
	}
	
	private void updateLabels_1018() {
	    for (int k_1018 = 0; k_1018 < array_1018.length; k_1018++) {
	        labelArray_1018[k_1018].setText(String.valueOf(array_1018[k_1018]));
	    }
	}

	private void resetHighlights_1018() {
	    for (JLabel label_1018 : labelArray_1018) {
	        label_1018.setBackground(Color.WHITE);
	    }
	}

	private void reset_1018() {
	    inputField_1018.setText("");
	    panelArray_1018.removeAll();
	    panelArray_1018.revalidate();
	    panelArray_1018.repaint();
	    stepArea_1018.setText("");
	    stepButton_1018.setEnabled(false);
	    sorting_1018 = false;
	    i_1018 = 0;
	    j_1018 = 0;
	    stepCount_1018 = 1;
	}

	private String arrayToString_1018(int[] arr_1018) {
	    StringBuilder sb_1018 = new StringBuilder();
	    for (int k_1018 = 0; k_1018 < arr_1018.length; k_1018++) {
	        sb_1018.append(arr_1018[k_1018]);
	        if (k_1018 < arr_1018.length - 1) {
	            sb_1018.append(", ");
	        }
	    }
	    return sb_1018.toString();
	}
	    public static void main(String[] args) {
			SwingUtilities.invokeLater(() -> {
				BubbleSortGUI_2511531018 gui = new BubbleSortGUI_2511531018();
				gui.setVisible(true);
			});
	
}
}
