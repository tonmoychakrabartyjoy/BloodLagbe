import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class BloodLagbe extends JFrame implements ActionListener {

    private JPanel mainPanel; // CardLayout main panel
    private CardLayout cardLayout;

    private BackgroundPanel homePanel, donorPanel, patientPanel;
    private JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9;
    private JTextArea t10;
    private JCheckBox[] diseaseChecks;
    private boolean noButtonPressed = false;

    // Buttons
    private JButton b1, b2, b3, b4, b5, b6;

    public BloodLagbe() {
        super("BLOOD LAGBE");
        setBounds(150, 80, 1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

 
        homePanel = new BackgroundPanel("FontPage.jpg"); 
        homePanel.setLayout(null);

        JLabel j1 = new JLabel("BLOOD LAGBE???");
        j1.setFont(new Font("Bebas Neue", Font.BOLD, 50));
        j1.setForeground(new Color(230, 57, 0));
        j1.setBounds(300, 30, 500, 70);
        homePanel.add(j1);

        JLabel j2 = new JLabel("Are You a - ");
        j2.setFont(new Font("Anton", Font.ITALIC, 40));
        j2.setForeground(new Color(51, 51, 51));
        j2.setBounds(400, 200, 300, 50);
        homePanel.add(j2);

        b1 = new JButton("DONOR");
        b1.setBounds(400, 300, 150, 40);
        b1.addActionListener(this);
        homePanel.add(b1);

        b2 = new JButton("PATIENT");
        b2.setBounds(700, 300, 150, 40);
        b2.addActionListener(this);
        homePanel.add(b2);

        mainPanel.add(homePanel, "HOME");

        
        donorPanel = new BackgroundPanel("2ndPanel.jpg");
        donorPanel.setLayout(null);

        JLabel dHeader = new JLabel("DONOR INFORMATION");
        dHeader.setForeground(Color.BLUE);
        dHeader.setFont(new Font("Anton", Font.BOLD, 30));
        dHeader.setBounds(400, 50, 500, 40);
        donorPanel.add(dHeader);

        JLabel[] labels = new JLabel[5];
        labels[0] = new JLabel("NAME - "); labels[0].setBounds(30, 120, 100, 40);
        labels[1] = new JLabel("FATHER'S NAME - "); labels[1].setBounds(30, 170, 150, 40);
        labels[2] = new JLabel("MOBILE NO - "); labels[2].setBounds(30, 220, 125, 40);
        labels[3] = new JLabel("AGE - "); labels[3].setBounds(30, 270, 125, 40);
        labels[4] = new JLabel("BLOOD GP - "); labels[4].setBounds(30, 320, 125, 40);

        for (JLabel l : labels) donorPanel.add(l);

        t1 = new JTextField(); t1.setBounds(140, 120, 150, 30); donorPanel.add(t1);
        t2 = new JTextField(); t2.setBounds(180, 170, 150, 30); donorPanel.add(t2);
        t3 = new JTextField(); t3.setBounds(140, 220, 150, 30); donorPanel.add(t3);
        t4 = new JTextField(); t4.setBounds(140, 270, 150, 30); donorPanel.add(t4);
        t5 = new JTextField(); t5.setBounds(140, 320, 150, 30); donorPanel.add(t5);

        JLabel donateLabel = new JLabel("Did you ever donate blood?");
        donateLabel.setBounds(30, 370, 300, 30);
        donorPanel.add(donateLabel);

        b3 = new JButton("YES"); b3.setBounds(200, 420, 100, 30); b3.addActionListener(this); donorPanel.add(b3);
        b4 = new JButton("NO"); b4.setBounds(350, 420, 100, 30); b4.addActionListener(this); donorPanel.add(b4);

        t6 = new JTextField(); t6.setBounds(165, 460, 50, 30); donorPanel.add(t6); t6.setVisible(false);

        b5 = new JButton("SUBMIT"); b5.setBounds(400, 550, 150, 40); b5.addActionListener(this); donorPanel.add(b5);

        // Disease checkboxes
        String[] diseases = {"Hepatitis","Asthama","Diabetes","Flu","Tendonitis",
                "Cholesterol","Bursitis","Malaria","Jaundice","Epilepsy",
                "Tuberculosis","Typhooid","Heart Diseases","Kidney Diseases","Lung Diseases"};

        diseaseChecks = new JCheckBox[15];
        int x = 450, y = 120;
        for(int i=0;i<diseases.length;i++){
            diseaseChecks[i] = new JCheckBox(diseases[i]);
            diseaseChecks[i].setOpaque(false);
            diseaseChecks[i].setBounds(x, y, 150, 30);
            donorPanel.add(diseaseChecks[i]);
            y+=50;
            if(y>400){ y=120; x+=200; }
        }

        mainPanel.add(donorPanel, "DONOR");

        
        patientPanel = new BackgroundPanel("2ndPanel.jpg"); 
        patientPanel.setLayout(null);

        JLabel pHeader = new JLabel("PATIENT INFORMATION");
        pHeader.setForeground(Color.BLUE);
        pHeader.setFont(new Font("Anton", Font.BOLD, 30));
        pHeader.setBounds(400, 50, 500, 40);
        patientPanel.add(pHeader);

        JLabel[] pLabels = new JLabel[3];
        pLabels[0] = new JLabel("NAME - "); pLabels[0].setBounds(30, 150, 100, 30);
        pLabels[1] = new JLabel("FATHER'S NAME - "); pLabels[1].setBounds(30, 200, 150, 30);
        pLabels[2] = new JLabel("BLOOD GP - "); pLabels[2].setBounds(30, 250, 100, 30);
        for(JLabel l : pLabels) patientPanel.add(l);

        t7 = new JTextField(); t7.setBounds(155,150,150,30); patientPanel.add(t7);
        t8 = new JTextField(); t8.setBounds(155,200,150,30); patientPanel.add(t8);
        t9 = new JTextField(); t9.setBounds(155,250,150,30); patientPanel.add(t9);

        b6 = new JButton("SEARCH"); b6.setBounds(130, 300, 100, 30); b6.addActionListener(this); patientPanel.add(b6);

        t10 = new JTextArea();
        t10.setEditable(false);
        t10.setLineWrap(true);
        t10.setWrapStyleWord(true);

        JScrollPane scroll = new JScrollPane(t10);
        scroll.setBounds(550, 150, 300, 300);
        patientPanel.add(scroll);

        mainPanel.add(patientPanel, "PATIENT");


        setContentPane(mainPanel);
        cardLayout.show(mainPanel, "HOME");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1) cardLayout.show(mainPanel, "DONOR");
        else if(e.getSource()==b2) cardLayout.show(mainPanel, "PATIENT");
        else if(e.getSource()==b3) t6.setVisible(true);
        else if(e.getSource()==b4){ t6.setVisible(false); noButtonPressed=true; }
        else if(e.getSource()==b5) saveDonor();
        else if(e.getSource()==b6) searchDonor();
    }

    private void saveDonor(){
        try{
            String name = t1.getText().trim();
            String fname = t2.getText().trim();
            String mobile = t3.getText().trim();
            String age = t4.getText().trim();
            String blood = t5.getText().trim();
            String months = noButtonPressed ? "4" : t6.getText().trim();
            StringBuilder diseaseStr = new StringBuilder();
            for(JCheckBox cb:diseaseChecks){
                if(cb.isSelected()) diseaseStr.append(cb.getText()).append(",");
            }
            if(diseaseStr.length()>0) diseaseStr.setLength(diseaseStr.length()-1);

            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("donors.txt",true)));
            out.println(name+";"+fname+";"+mobile+";"+age+";"+months+";"+blood+";"+diseaseStr);
            out.close();

            JOptionPane.showMessageDialog(this,"Donor saved!");
            cardLayout.show(mainPanel,"HOME");
        }catch(Exception ex){ ex.printStackTrace(); }
    }

    private void searchDonor(){
        try{
            String blood = t9.getText().trim();
            if(blood.isEmpty()){ JOptionPane.showMessageDialog(this,"Enter blood group!"); return; }

            File f = new File("donors.txt");
            if(!f.exists()){ JOptionPane.showMessageDialog(this,"No donors found!"); return; }

            BufferedReader br = new BufferedReader(new FileReader(f));
            String line; boolean found=false;
            StringBuilder sb = new StringBuilder();
            while((line=br.readLine())!=null){
                String[] d = line.split(";");
                if(d.length<7) continue;
                int months = Integer.parseInt(d[4].trim());
                int age = Integer.parseInt(d[3].trim());
                String diseases = d[6].trim();
                String b = d[5].trim();
                if(months>=4 && age>=18 && diseases.isEmpty() && b.equalsIgnoreCase(blood)){
                    sb.append("Name: ").append(d[0]).append("\n")
                      .append("Father: ").append(d[1]).append("\n")
                      .append("Mobile: ").append(d[2]).append("\n")
                      .append("Age: ").append(d[3]).append("\n")
                      .append("Blood: ").append(d[5]).append("\n\n");
                    found=true;
                }
            }
            br.close();
            t10.setText(found? sb.toString():"No donors found.");
        }catch(Exception ex){ ex.printStackTrace(); }
    }

    public static void main(String[] args){
        new BloodLagbe().setVisible(true);
    }
}