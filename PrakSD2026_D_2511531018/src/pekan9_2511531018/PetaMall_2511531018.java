package pekan9_2511531018;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class PetaMall_2511531018 extends JFrame {

    private JComboBox<String> cmbAwal_1018;
    private JComboBox<String> cmbTujuan_1018;

    private JButton btnBFS_1018;
    private JButton btnDFS_1018;
    private JButton btnReset_1018;

    private JLabel lblJalur_1018;
    private JLabel lblNode_1018;
    private JLabel lblJumlah_1018;

    private GraphPanel_1018 panelGraph_1018;

    private HashMap<String, ArrayList<String>> graph_1018;

    public PetaMall_2511531018() {

        setTitle("PENCARIAN JALUR MALL MENGGUNAKAN BFS DAN DFS");
        setSize(1000,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        initGraph();

        JPanel top = new JPanel();

        cmbAwal_1018 = new JComboBox<>(graph_1018.keySet().toArray(new String[0]));
        cmbTujuan_1018 = new JComboBox<>(graph_1018.keySet().toArray(new String[0]));

        btnBFS_1018 = new JButton("BFS");
        btnDFS_1018 = new JButton("DFS");
        btnReset_1018 = new JButton("RESET");

        top.add(new JLabel("Lokasi Awal"));
        top.add(cmbAwal_1018);

        top.add(new JLabel("Lokasi Tujuan"));
        top.add(cmbTujuan_1018);

        top.add(btnBFS_1018);
        top.add(btnDFS_1018);
        top.add(btnReset_1018);

        add(top, BorderLayout.NORTH);

        panelGraph_1018 = new GraphPanel_1018();
        add(panelGraph_1018, BorderLayout.CENTER);

        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(3,1));

        lblJalur_1018 = new JLabel("Jalur : ");
        lblNode_1018 = new JLabel("Node Dikunjungi : ");
        lblJumlah_1018 = new JLabel("Jumlah Node Dikunjungi : 0");

        bottom.add(lblJalur_1018);
        bottom.add(lblNode_1018);
        bottom.add(lblJumlah_1018);

        add(bottom, BorderLayout.SOUTH);

        btnBFS_1018.addActionListener(e -> BFS_1018());
        btnDFS_1018.addActionListener(e -> DFS_1018());
        btnReset_1018.addActionListener(e -> resetGraph_1018());

        setVisible(true);
    }

    private void initGraph() {

        graph_1018 = new HashMap<>();

        addEdge("Pintu Utama","Customer Service");
        addEdge("Pintu Utama","ATM Center");

        addEdge("Customer Service","Food Court");
        addEdge("Customer Service","Lift");

        addEdge("Food Court","Bioskop");
        addEdge("Food Court","Mushola");

        addEdge("Bioskop","Area Bermain");
        addEdge("Bioskop","Lift");

        addEdge("Lift","Toko Fashion");
        addEdge("Lift","Toko Elektronik");

        addEdge("Toko Fashion","Supermarket");
        addEdge("Area Bermain","Toko Fashion");

        addEdge("Toko Elektronik","Supermarket");

        addEdge("ATM Center","Mushola");
        addEdge("ATM Center","Parkiran");

        addEdge("Parkiran","Pintu Utama");
    }

    private void addEdge(String a,String b){

        graph_1018.putIfAbsent(a,new ArrayList<>());
        graph_1018.putIfAbsent(b,new ArrayList<>());

        graph_1018.get(a).add(b);
        graph_1018.get(b).add(a);
    }

    private void BFS_1018(){

        String start = cmbAwal_1018.getSelectedItem().toString();
        String goal = cmbTujuan_1018.getSelectedItem().toString();

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        HashMap<String,String> parent = new HashMap<>();

        ArrayList<String> urutan = new ArrayList<>();

        queue.add(start);
        visited.add(start);

        while(!queue.isEmpty()){

            String current = queue.poll();

            urutan.add(current);

            if(current.equals(goal))
                break;

            for(String next : graph_1018.get(current)){

                if(!visited.contains(next)){

                    visited.add(next);
                    parent.put(next,current);
                    queue.add(next);
                }
            }
        }

        tampilkanHasil(goal,parent,urutan);
    }

    private void DFS_1018(){

        String start = cmbAwal_1018.getSelectedItem().toString();
        String goal = cmbTujuan_1018.getSelectedItem().toString();

        Stack<String> stack = new Stack<>();
        Set<String> visited = new HashSet<>();
        HashMap<String,String> parent = new HashMap<>();

        ArrayList<String> urutan = new ArrayList<>();

        stack.push(start);

        while(!stack.isEmpty()){

            String current = stack.pop();

            if(visited.contains(current))
                continue;

            visited.add(current);

            urutan.add(current);

            if(current.equals(goal))
                break;

            ArrayList<String> tetangga = graph_1018.get(current);

            for(int i=tetangga.size()-1;i>=0;i--){

                String next = tetangga.get(i);

                if(!visited.contains(next)){

                    parent.put(next,current);
                    stack.push(next);
                }
            }
        }

        tampilkanHasil(goal,parent,urutan);
    }

    private void tampilkanHasil(String goal,
                                HashMap<String,String> parent,
                                ArrayList<String> urutan){

        ArrayList<String> path = new ArrayList<>();

        String current = goal;

        while(current != null){

            path.add(current);
            current = parent.get(current);
        }

        Collections.reverse(path);

        lblJalur_1018.setText("Jalur : " + path);
        lblNode_1018.setText("Node Dikunjungi : " + urutan);
        lblJumlah_1018.setText("Jumlah Node Dikunjungi : " + urutan.size());

        panelGraph_1018.setVisited(urutan,path);
    }

    private void resetGraph_1018(){

        lblJalur_1018.setText("Jalur : ");
        lblNode_1018.setText("Node Dikunjungi : ");
        lblJumlah_1018.setText("Jumlah Node Dikunjungi : 0");

        panelGraph_1018.reset();
    }

    class GraphPanel_1018 extends JPanel{

        HashMap<String,Point> posisi = new HashMap<>();

        ArrayList<String> visited = new ArrayList<>();
        ArrayList<String> path = new ArrayList<>();

        public GraphPanel_1018(){

            posisi.put("Bioskop",new Point(400,70));
            posisi.put("Area Bermain",new Point(650,70));

            posisi.put("Food Court",new Point(220,180));
            posisi.put("Toko Fashion",new Point(650,180));

            posisi.put("Customer Service",new Point(220,300));
            posisi.put("Lift",new Point(450,300));
            posisi.put("Toko Elektronik",new Point(700,300));

            posisi.put("Pintu Utama",new Point(220,450));
            posisi.put("ATM Center",new Point(450,450));
            posisi.put("Supermarket",new Point(700,450));

            posisi.put("Parkiran",new Point(220,560));
            posisi.put("Mushola",new Point(450,560));
        }

        public void setVisited(ArrayList<String> v,ArrayList<String> p){

            visited = v;
            path = p;
            repaint();
        }

        public void reset(){

            visited.clear();
            path.clear();
            repaint();
        }

        protected void paintComponent(Graphics g){

            super.paintComponent(g);

            Graphics2D g2 = (Graphics2D) g;

            for(String a : graph_1018.keySet()){

                for(String b : graph_1018.get(a)){

                    Point p1 = posisi.get(a);
                    Point p2 = posisi.get(b);

                    g2.drawLine(
                            p1.x,p1.y,
                            p2.x,p2.y);
                }
            }

            for(String node : posisi.keySet()){

                Point p = posisi.get(node);

                if(path.contains(node))
                    g2.setColor(Color.GREEN);

                else if(visited.contains(node))
                    g2.setColor(Color.ORANGE);

                else
                    g2.setColor(Color.LIGHT_GRAY);

                g2.fillOval(p.x-25,p.y-25,50,50);

                g2.setColor(Color.BLACK);
                g2.drawOval(p.x-25,p.y-25,50,50);

                g2.drawString(node,p.x-35,p.y-35);
            }
        }
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(
                () -> new PetaMall_2511531018()
        );
    }
}