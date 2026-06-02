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
	import java.util.LinkedList;
	import java.util.Queue;

	
	public class MergeSortGUI_2511531018 extends JFrame{
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
		private Queue<int[]> mergeQueue_1018 = new LinkedList<>();

		private boolean isMerging_1018 = false;
		private boolean copying_1018 = false;
		private int left_1018;
		private int mid_1018;
		private int right_1018;
		private int k_1018;
		private int[] temp_1018;

		/**
		 * Create the frame.
		 * @return 
		 */
		public MergeSortGUI_2511531018() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane_1018 = new JPanel();
			contentPane_1018.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane_1018);
			contentPane_1018.setLayout(null);
			setTitle("Merge sort langkah per langkah");
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
		        for (int i_1018 = 0; i_1018 < parts_1018.length; i_1018++) {
		            array_1018[i_1018] = Integer.parseInt(parts_1018[i_1018].trim());
		        }
		    } catch (NumberFormatException e_1018) {
		        JOptionPane.showMessageDialog(this, "Masukkan hanya angka!", "Error", JOptionPane.ERROR_MESSAGE);
		        return;
		    }

		    labelArray_1018 = new JLabel[array_1018.length];
		    panelArray_1018.removeAll();

		    for (int i_1018 = 0; i_1018 < array_1018.length; i_1018++) {
		        labelArray_1018[i_1018] = new JLabel(String.valueOf(array_1018[i_1018]));
		        labelArray_1018[i_1018].setFont(new Font("Arial", Font.BOLD, 24));
		        labelArray_1018[i_1018].setOpaque(true);
		        labelArray_1018[i_1018].setBackground(Color.WHITE);
		        labelArray_1018[i_1018].setBorder(BorderFactory.createLineBorder(Color.BLACK));
		        labelArray_1018[i_1018].setPreferredSize(new Dimension(50, 50));
		        labelArray_1018[i_1018].setHorizontalAlignment(SwingConstants.CENTER);
		        panelArray_1018.add(labelArray_1018[i_1018]);
		        
		        mergeQueue_1018.clear();
		        generateMergeSteps_1018(0, array_1018.length - 1);

		        stepButton_1018.setEnabled(true);
		        stepArea_1018.setText("");

		        stepCount_1018 = 1;
		        isMerging_1018 = false;

		        panelArray_1018.revalidate();
		        panelArray_1018.repaint();
		    }
		 }
		    private void generateMergeSteps_1018(int left_1018, int right_1018) {
		        if (left_1018 >= right_1018) {
		            return;
		        }
		        int mid_1018 = (left_1018 + right_1018) / 2;
		        generateMergeSteps_1018(left_1018, mid_1018);
		        generateMergeSteps_1018(mid_1018 + 1, right_1018);
		        mergeQueue_1018.offer(new int[] {
		                left_1018, mid_1018, right_1018
		            });
		    }
		    
		    private void performStep_1018() {
		    resetHighlights_1018();
		    if (!isMerging_1018 && !mergeQueue_1018.isEmpty()) {
		        int[] range_1018 = mergeQueue_1018.poll();
		        left_1018 = range_1018[0];
		        mid_1018 = range_1018[1];
		        right_1018 = range_1018[2];
		        temp_1018 = new int[right_1018 - left_1018 + 1];
		        i_1018 = left_1018;
		        j_1018 = mid_1018 + 1;
		        k_1018 = 0;
		        copying_1018 = false;
		        isMerging_1018 = true;
		        stepArea_1018.append("Langkah " + stepCount_1018++ + ": Mulai merge dari " + left_1018 + " ke "
		                + right_1018 + "\n");

		        return;
		    }

		    if (isMerging_1018 && !copying_1018) {
		        if (i_1018 <= mid_1018 && j_1018 <= right_1018) {
		            labelArray_1018[i_1018].setBackground(Color.CYAN);
		            labelArray_1018[j_1018].setBackground(Color.CYAN);
		            if (array_1018[i_1018] <= array_1018[j_1018]) {
		                temp_1018[k_1018++] = array_1018[i_1018++];
		            } else {
		                temp_1018[k_1018++] = array_1018[j_1018++];
		            }
		            stepArea_1018.append("Langkah " + stepCount_1018++ + ": Bandingkan dan salin elemen\n");
		            return;
		        } else if (i_1018 <= mid_1018) {
		            temp_1018[k_1018++] = array_1018[i_1018++];
		            stepArea_1018.append("Langkah " + stepCount_1018++ + ": Salin sisa kiri\n");
		            return;
		        } else if (j_1018 <= right_1018) {
		            temp_1018[k_1018++] = array_1018[j_1018++];
		            stepArea_1018.append("Langkah " + stepCount_1018++ + ": Salin sisa kanan\n");
		            return;
		        } else {
		            copying_1018 = true;
		            k_1018 = 0;
		            return;
		        }
		    }
		    
		    if (copying_1018 && k_1018 < temp_1018.length) {
		        array_1018[left_1018 + k_1018] = temp_1018[k_1018];
		        labelArray_1018[left_1018 + k_1018].setText(String.valueOf(temp_1018[k_1018]));
		        labelArray_1018[left_1018 + k_1018].setBackground(Color.GREEN);
		        k_1018++;
		        stepArea_1018.append("Langkah " + stepCount_1018++ + ": Tempelkan ke array utama\n");
		        return;
		    }
		    
		    if (copying_1018 && k_1018 == temp_1018.length) {
		        isMerging_1018 = false;
		        copying_1018 = false;
		    }
		    
		    if (mergeQueue_1018.isEmpty() && !isMerging_1018) {
		        stepArea_1018.append("Selesai.\n");
		        stepButton_1018.setEnabled(false);
		        JOptionPane.showMessageDialog(this, "Merge Sort selesai!");
		    }
		}
		    
		    private void resetHighlights_1018() {
		        if (labelArray_1018 == null) return;
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
		        mergeQueue_1018.clear();
		        isMerging_1018 = false;
		        stepCount_1018 = 1;
		    }
		    public static void main(String[] args) {
				SwingUtilities.invokeLater(() -> {
					MergeSortGUI_2511531018 gui = new MergeSortGUI_2511531018();
					gui.setVisible(true);

			}); 
	}	    

}
