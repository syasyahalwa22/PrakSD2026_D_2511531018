package pekan7_2511531018;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class MahasiswaGUI_2511531018 extends JFrame {
	private JTextField txtNama_1018;
    private JTextField txtNim_1018;
    private JTextField txtProdi_1018;
    private JButton btnTambah_1018;
    private JButton btnHapus_1018;
    private JButton btnSorting_1018;
    private JComboBox<String> cbSorting_1018;
    private JTable table_1018;
    private DefaultTableModel model_1018;
    private JTextArea areaProses_1018;
    private ArrayList<Mahasiswa_2511531018> listMhs_1018;
    
    public MahasiswaGUI_2511531018() {
    	setTitle("Sorting Nama Mahasiswa");
        setSize(750, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        listMhs_1018 = new ArrayList<>();

        // Panel input
        JPanel panelInput = new JPanel(new GridLayout(4, 2, 5, 5));
        panelInput.add(new JLabel("Nama"));
        txtNama_1018 = new JTextField();
        panelInput.add(txtNama_1018);
        panelInput.add(new JLabel("NIM"));
        txtNim_1018 = new JTextField();
        panelInput.add(txtNim_1018);
        panelInput.add(new JLabel("Program Studi"));
        txtProdi_1018 = new JTextField();
        panelInput.add(txtProdi_1018);
        cbSorting_1018 = new JComboBox<>();
        cbSorting_1018.setForeground(new Color(0, 0, 0));
        cbSorting_1018.addItem("Insertion Sort");
        cbSorting_1018.addItem("Selection Sort");
        cbSorting_1018.addItem("Bubble Sort");
        panelInput.add(cbSorting_1018);
        btnSorting_1018 = new JButton("Mulai Sorting");
        panelInput.add(btnSorting_1018);
        getContentPane().add(panelInput, BorderLayout.NORTH);

        // Tabel
        model_1018 = new DefaultTableModel();
        model_1018.addColumn("Nama");
        model_1018.addColumn("NIM");
        model_1018.addColumn("Prodi");
        table_1018 = new JTable(model_1018);
        getContentPane().add(new JScrollPane(table_1018), BorderLayout.CENTER);

        // Panel bawah
        JPanel panelBawah = new JPanel();
        btnTambah_1018 = new JButton("Tambah");
        btnHapus_1018 = new JButton("Hapus");
        panelBawah.add(btnTambah_1018);
        panelBawah.add(btnHapus_1018);
        getContentPane().add(panelBawah, BorderLayout.SOUTH);

        // Area proses
        areaProses_1018 = new JTextArea();
        areaProses_1018.setEditable(false);
        getContentPane().add(new JScrollPane(areaProses_1018), BorderLayout.EAST);
        
        // Tambah
        btnTambah_1018.addActionListener(e -> tambahData());

        // Hapus
        btnHapus_1018.addActionListener(e -> hapusData());

        // Sorting
        btnSorting_1018.addActionListener(e -> mulaiSorting());
    }

    // Tambah data
    private void tambahData() {
        String nama = txtNama_1018.getText();
        String nim = txtNim_1018.getText();
        String prodi = txtProdi_1018.getText();
        if (nama.isEmpty() || nim.isEmpty() || prodi.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data tidak boleh kosong!");
            return;
        }

        Mahasiswa_2511531018 mhs =
                new Mahasiswa_2511531018(nama, nim, prodi);
        listMhs_1018.add(mhs);
        model_1018.addRow(new Object[]{
                nama,
                nim,
                prodi
        });

        txtNama_1018.setText("");
        txtNim_1018.setText("");
        txtProdi_1018.setText("");
    }

    // Hapus data
    private void hapusData() {
        int baris = table_1018.getSelectedRow();
        if (baris != -1) {
            listMhs_1018.remove(baris);
            model_1018.removeRow(baris);
        }
    }

    // Mulai sorting
    private void mulaiSorting() {
        areaProses_1018.setText("");
        String pilihan =
                cbSorting_1018.getSelectedItem().toString();
        ArrayList<Mahasiswa_2511531018> temp =
                new ArrayList<>(listMhs_1018);
        if (pilihan.equals("Insertion Sort")) {
            insertionSort_1018(temp);
        }

        else if (pilihan.equals("Selection Sort")) {
            selectionSort_1018(temp);
        } else {
            bubbleSort_1018(temp);
        }
        tampilkanTabel(temp);
    }

    // Method Insertion Sort
    private void insertionSort_1018(ArrayList<Mahasiswa_2511531018> data) {
        areaProses_1018.append("=== INSERTION SORT ===\n");
        for (int i = 1; i < data.size(); i++) {
            Mahasiswa_2511531018 key = data.get(i);
            int j = i - 1;
            while (j >= 0 &&
                    data.get(j).getNama_1018()
                    .compareToIgnoreCase(key.getNama_1018()) > 0) {
                data.set(j + 1, data.get(j));
                j--;
            }

            data.set(j + 1, key);
            areaProses_1018.append(
                    "Langkah " + i + " : " + tampilNama(data) + "\n");
        }
    }

    // Method Selection Sort
    private void selectionSort_1018(ArrayList<Mahasiswa_2511531018> data) {
        areaProses_1018.append("=== SELECTION SORT ===\n");
        for (int i = 0; i < data.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < data.size(); j++) {
                if (data.get(j).getNama_1018()
                        .compareToIgnoreCase(
                                data.get(min).getNama_1018()) < 0) {
                    min = j;
                }
            }

            Mahasiswa_2511531018 temp = data.get(i);
            data.set(i, data.get(min));
            data.set(min, temp);
            areaProses_1018.append(
                    "Pass " + (i + 1) + " : " + tampilNama(data) + "\n");
        }
    }

    // Bubble Sort
    private void bubbleSort_1018(ArrayList<Mahasiswa_2511531018> data) {
        areaProses_1018.append("=== BUBBLE SORT ===\n");
        for (int i = 0; i < data.size() - 1; i++) {
            for (int j = 0; j < data.size() - i - 1; j++) {
                if (data.get(j).getNama_1018()
                        .compareToIgnoreCase(
                                data.get(j + 1).getNama_1018()) > 0) {
                    Mahasiswa_2511531018 temp = data.get(j);
                    data.set(j, data.get(j + 1));
                    data.set(j + 1, temp);
                }
            }
            areaProses_1018.append(
                    "Pass " + (i + 1) + " : " + tampilNama(data) + "\n");
        }
    }

    // Tampil nama
    private String tampilNama(ArrayList<Mahasiswa_2511531018> data) {
        String hasil = "[";
        for (int i = 0; i < data.size(); i++) {
            hasil += data.get(i).getNama_1018();
            if (i != data.size() - 1) {
                hasil += ", ";
            }
        }
        hasil += "]";
        return hasil;
    }

    // Update tabel
    private void tampilkanTabel(ArrayList<Mahasiswa_2511531018> data) {
        model_1018.setRowCount(0);
        for (Mahasiswa_2511531018 m : data) {
            model_1018.addRow(new Object[]{
                    m.getNama_1018(),
                    m.getNim_1018(),
                    m.getProdi_1018()
            });
        }
    }
    // Method main
    public static void main(String[] args) {
        new MahasiswaGUI_2511531018().setVisible(true);
    }
}

