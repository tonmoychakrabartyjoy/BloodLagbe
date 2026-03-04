import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class BloodLagbe extends JFrame implements ActionListener {

    BackgroundPanel p1, p2, p3, p4;

    Color c1, c2, c3, c4, c5;

    Font f1, f2, f3;

    JLabel j1, j2, j3, j4, j5, j6, j7, j8,j9, j10, j11, j12, j13,j14, j15, j16, j17, j18;

    JButton b1, b2, b3, b4, b5, b6;

    JTextField t1, t2, t3, t4, t5, t6, t7, t8,t9;
	
	JTextArea t10;
	
	JCheckBox x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15;
	
	boolean noButtonPressed = false;

    public BloodLagbe() {
        super("BLOOD LAGBE");
        setBounds(150, 80, 1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c1 = new Color(77, 255, 255);
        c2 = new Color(230, 57, 0);
        c3 = new Color(51, 51, 51);
        c4 = new Color(230, 230, 230);
        c5 = new Color(240, 240, 117);

        f1 = new Font("Bebas Neue", Font.BOLD, 50);
        f2 = new Font("Anton", Font.ITALIC, 40);
        f3 = new Font("Anton", Font.PLAIN, 20);

        p1 = new BackgroundPanel("E:\\My project\\FontPage.jpg");
        p1.setLayout(null);
        p1.setBackground(null);
        p1.setBounds(30, 20, 1000, 600);
        super.add(p1);

        j1 = new JLabel("BLOOD LAGBE???");
        j1.setBounds(300, 30, 500, 70);
        j1.setForeground(c2);
        j1.setFont(f1);
        p1.add(j1);

        j2 = new JLabel("Are You a - ");
        j2.setBounds(400, 200, 300, 50);
        j2.setForeground(c3);
        j2.setFont(f2);
        p1.add(j2);

        b1 = new JButton("DONOR");
        b1.setBounds(400, 300, 150, 40);
        b1.setBackground(c4);
        b1.setForeground(c3);
        p1.add(b1);
        b1.addActionListener(this);

        b2 = new JButton("PATIENT");
        b2.setBounds(700, 300, 150, 40);
        b2.setBackground(c4);
        b2.setForeground(c3);
        p1.add(b2);
		b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent b) {
        try {
            if (b.getSource() == b1) {
                p2 = new BackgroundPanel("C:\\Users\\HP\\OneDrive - American International University-Bangladesh\\Documents\\Java\\final project\\2ndPanel.jpg");
                p2.setLayout(null);
                p2.setBackground(null);
                p2.setBounds(0, 0, 1000, 700);

                p1.removeAll();
                p1.add(p2);
                p1.revalidate();
                p1.repaint();

                j1 = new JLabel("BLOOD LAGBE???");
                j1.setBounds(300, 30, 500, 70);
                j1.setBackground(null);
                j1.setForeground(c2);
                j1.setFont(f1);
                j1.setOpaque(false);
                p2.add(j1);

                j3 = new JLabel("DONOR INFORMATION");
                j3.setBounds(450, 100, 500, 30);
                j3.setBackground(null);
                j3.setForeground(Color.BLUE);
                j3.setOpaque(false);
                p2.add(j3);

                j4 = new JLabel("NAME - ");
                j4.setBounds(30, 170, 100, 40);
                j4.setBackground(null);
                j4.setForeground(Color.BLACK);
                j4.setOpaque(false);
                p2.add(j4);

                t1 = new JTextField();
                t1.setBounds(140, 170, 150, 40);
                t1.setForeground(c3);
                t1.setBackground(c4);
                t1.setOpaque(true);
                t1.setFont(f3);
                p2.add(t1);

                j5 = new JLabel("FATHER'S NAME - ");
                j5.setBounds(30, 220, 125, 40);
                j5.setBackground(null);
                j5.setForeground(Color.BLACK);
                j5.setOpaque(false);
                p2.add(j5);

                t2 = new JTextField();
                t2.setBounds(140, 220, 150, 40);
                t2.setForeground(c3);
                t2.setBackground(c4);
                t2.setOpaque(true);
                t2.setFont(f3);
                p2.add(t2);

                j6 = new JLabel("MOBILE NO - ");
                j6.setBounds(30, 270, 125, 40);
                j6.setBackground(null);
                j6.setForeground(Color.BLACK);
                j6.setOpaque(false);
                p2.add(j6);

                t3 = new JTextField();
                t3.setBounds(140, 270, 150, 40);
                t3.setForeground(c3);
                t3.setBackground(c4);
                t3.setOpaque(true);
                t3.setFont(f3);
                p2.add(t3);

                j7 = new JLabel("AGE - ");
                j7.setBounds(30, 320, 125, 40);
                j7.setBackground(null);
                j7.setForeground(Color.BLACK);
                j7.setOpaque(false);
                p2.add(j7);

                t4 = new JTextField();
                t4.setBounds(140, 320, 150, 40);
                t4.setForeground(c3);
                t4.setBackground(c4);
                t4.setOpaque(true);
                t4.setFont(f3);
                p2.add(t4);

                j8 = new JLabel("BLOOD GP - ");
                j8.setBounds(30, 370, 125, 40);
                j8.setBackground(null);
                j8.setForeground(Color.BLACK);
                j8.setOpaque(false);
                p2.add(j8);

				
				t5=new JTextField();
				t5.setBounds(140,370,150,40);
				t5.setForeground(c3);
				t5.setBackground(c4);
				t5.setOpaque(true);
				t5.setFont(f3);
				p2.add(t5);
				
				j9=new JLabel("Did You Ever Donated Blood Before?  ");
				j9.setBounds(30,450,250,40);
				j9.setBackground(null);
				j9.setForeground(Color.BLACK);
				j9.setOpaque(false);
				//j6.setFont(f3);
				p2.add(j9);
				
				
				b3=new JButton("YES");
				b3.setBounds(200,500,100,20);
				b3.setBackground(c4);
				b3.setForeground(c3);
				b3.setOpaque(true);
				p2.add(b3);
				b3.addActionListener(this);
				
				
				b4=new JButton("NO");
				b4.setBounds(350,500,100,20);
				b4.setBackground(c4);
				b4.setForeground(c3);
				b4.setOpaque(true);
				p2.add(b4);
				b4.addActionListener(this);
				
				
				b5=new JButton("SUBMIT");
				b5.setBounds(450,600,150,40);
				b5.setBackground(c4);
				b5.setForeground(c3);
				b5.setOpaque(true);
				p2.add(b5);
				b5.addActionListener(this);
				
				
				
				j13=new JLabel("Are you suffering from any of these diseases: ");
				j13.setBounds(550,130,300,40);
				j13.setBackground(c5);
				j13.setForeground(Color.BLACK);
				j13.setOpaque(false);
				//j6.setFont(f3);
				p2.add(j13);
				
				x1=new JCheckBox("Hepatitis");
				x1.setBounds(455,170,100,40);
				x1.setOpaque(false);
				x1.setBackground(null);
				p2.add(x1);
				
				x2=new JCheckBox("Asthama");
				x2.setBounds(455,220,100,40);
				x2.setOpaque(false);
				x2.setBackground(null);
				p2.add(x2);
				
				x3=new JCheckBox("Diabetes");
				x3.setBounds(455,270,100,40);
				x3.setOpaque(false);
				x3.setBackground(null);
				p2.add(x3);
				
				x4=new JCheckBox("Flu");
				x4.setBounds(455,320,100,40);
				x4.setOpaque(false);
				x4.setBackground(null);
				p2.add(x4);
				
				x5=new JCheckBox("Tendonitis");
				x5.setBounds(455,370,100,40);
				x5.setOpaque(false);
				x5.setBackground(null);
				p2.add(x5);
				
				x6=new JCheckBox("Cholesterol");
				x6.setBounds(655,170,100,40);
				x6.setOpaque(false);
				x6.setBackground(null);
				p2.add(x6);
				
				x7=new JCheckBox("Bursitis");
				x7.setBounds(655,220,100,40);
				x7.setOpaque(false);
				x7.setBackground(null);
				p2.add(x7);
				
				x8=new JCheckBox("Malaria");
				x8.setBounds(655,270,100,40);
				x8.setOpaque(false);
				x8.setBackground(null);
				p2.add(x8);
				
				x9=new JCheckBox("Jaundice");
				x9.setBounds(655,320,100,40);
				x9.setOpaque(false);
				x9.setBackground(null);
				p2.add(x9);
				
				
				x10=new JCheckBox("Epilepsy");
				x10.setBounds(655,370,100,40);
				x10.setOpaque(false);
				x10.setBackground(null);
				p2.add(x10);
				
				
				
				x11=new JCheckBox("Tuberculosis");
				x11.setBounds(855,170,100,40);
				x11.setOpaque(false);
				x11.setBackground(null);
				p2.add(x11);
				
				x12=new JCheckBox("Typhooid");
				x12.setBounds(855,220,100,40);
				x12.setOpaque(false);
				x12.setBackground(null);
				p2.add(x12);
				
				
				x13=new JCheckBox("Herat Diseases");
				x13.setBounds(855,270,150,40);
				x13.setOpaque(false);
				x13.setBackground(null);
				p2.add(x13);
				
				
				x14=new JCheckBox("Kidney Diseases");
				x14.setBounds(855,320,150,40);
				x14.setOpaque(false);
				x14.setBackground(null);
				p2.add(x14);
				
				x15=new JCheckBox("Lung Diseases");
				x15.setBounds(855,370,150,40);
				x15.setOpaque(false);
				x15.setBackground(null);
				p2.add(x15);
            }
			else if(b.getSource()==b2){
				p4 = new BackgroundPanel("C:\\Users\\HP\\OneDrive - American International University-Bangladesh\\Documents\\Java\\final project\\2ndPanel.jpg");
				p4.setLayout(null);
				p4.setBackground(null);
				p4.setBounds(00,00,1000,700);
			
				p1.removeAll();
				p1.add(p4);
				p1.revalidate();
				p1.repaint();
				
				j14=new JLabel("BLOOD LAGBE???");
				j14.setBounds(300,30,500,70);
				j14.setBackground(null);
				j14.setForeground(c2);
				j14.setFont(f1);
				j14.setOpaque(false);
				p4.add(j14);
				
				
				j15=new JLabel("PATIENT INFORMATION");
				j15.setBounds(450,100,500,30);
				j15.setBackground(null);
				j15.setForeground(Color.BLUE);
				j15.setOpaque(false);
				p4.add(j15);
				
				
				j16=new JLabel("NAME - ");
				j16.setBounds(30,170,100,40);
				j16.setBackground(null);
				j16.setForeground(Color.BLACK);
				j16.setOpaque(false);
				//j4.setFont(f3);
				p4.add(j16);
				
				t7=new JTextField();
				t7.setBounds(155,170,150,40);
				t7.setForeground(c3);
				t7.setBackground(c4);
				t7.setOpaque(true);
				t7.setFont(f3);
				p4.add(t7);
				
				
				j17=new JLabel(" FATHER's NAME - ");
				j17.setBounds(30,220,120,40);
				j17.setBackground(null);
				j17.setForeground(Color.BLACK);
				j17.setOpaque(false);
				//j4.setFont(f3);
				p4.add(j17);
				
				t8=new JTextField();
				t8.setBounds(155,220,150,40);
				t8.setForeground(c3);
				t8.setBackground(c4);
				t8.setOpaque(true);
				t8.setFont(f3);
				p4.add(t8);
				
				
				
				j18=new JLabel(" BLOOD GP -");
				j18.setBounds(30,270,120,40);
				j18.setBackground(null);
				j18.setForeground(Color.BLACK);
				j18.setOpaque(false);
				//j4.setFont(f3);
				p4.add(j18);
				
				t9=new JTextField();
				t9.setBounds(155,270,150,40);
				t9.setForeground(c3);
				t9.setBackground(c4);
				t9.setOpaque(true);
				t9.setFont(f3);
				p4.add(t9);
				
				
				b6=new JButton("SEARCH");
				b6.setBounds(130,350,100,40);
				b6.setBackground(c4);
				b6.setForeground(c3);
				b6.setOpaque(true);
				p4.add(b6);
				b6.addActionListener(this);
				
			

				
				t10=new JTextArea();
				t10.setBounds(550,170,300,300);
				t10.setForeground(c3);
				t10.setBackground(c4);
				t10.setOpaque(true);
				t10.setFont(f3);
				t10.setEditable(false);
				t10.setLineWrap(true);
				t10.setWrapStyleWord(true);
				p4.add(t10);
			}

			else if (b.getSource() == b3) {
				noButtonPressed = false;
				
				
				p3=new BackgroundPanel("");
				p3.setLayout(null);
				p3.setBackground(null);
				p3.setBounds(50,530,380,100);
				
				
				p2.add(p3);
				p2.revalidate();
				p2.repaint();
				
				
				j10=new JLabel("How Many Months Ago Did You Last Donate Blood:");
				j10.setBounds(10,10,400,40);
				j10.setBackground(Color.WHITE);
				j10.setForeground(Color.BLACK);
				j10.setOpaque(false);
				//j6.setFont(f3);
				p3.add(j10);
				
				j11=new JLabel("I have donated Blood last ");
				j11.setBounds(10,60,150,40);
				j11.setBackground(Color.WHITE);
				j11.setForeground(Color.BLACK);
				j11.setOpaque(false);
				//j6.setFont(f3);
				p3.add(j11);
				
				
				t6=new JTextField();
				t6.setBounds(165,60,50,40);
				t6.setForeground(c3);
				t6.setBackground(c4);
				t6.setOpaque(true);
				t6.setFont(f3);
				p3.add(t6);
				
				j12=new JLabel("Months ago. ");
				j12.setBounds(220,60,100,40);
				j12.setBackground(Color.WHITE);
				j12.setForeground(Color.BLACK);
				j12.setOpaque(false);
				//j6.setFont(f3);
				p3.add(j12);
			}

			else if (b.getSource() == b4) {
				noButtonPressed = true;
				if (p3 != null) {
					p2.remove(p3);
					p2.revalidate();
					p2.repaint();
				}
			}

			else if (b.getSource() == b5) {
				saveDonorData();
			}

			else if (b.getSource() == b6) {
				searchDonor();
			}

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "An unexpected error occurred: " + ex.getMessage());
        }
    }

	private void saveDonorData() {
		try {
        
			String name = t1.getText().trim();
			String fatherName = t2.getText().trim();
			String mobile = t3.getText().trim();
			String age = t4.getText().trim();
			String bloodGp = t5.getText().trim();
			String monthsAgo = "0";
			if (noButtonPressed) {
				monthsAgo = "4";
			} else if (t6 != null && !t6.getText().isEmpty()) {
				monthsAgo = t6.getText().trim();
			}

			StringBuilder diseases = new StringBuilder();
			JCheckBox[] diseaseChecks = { x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15 };
			for (int i=0; i<diseaseChecks.length; i++) {
				JCheckBox checkBox = diseaseChecks[i];
				if (checkBox != null && checkBox.isSelected()) {
					diseases.append(checkBox.getText()).append(", ");
				}
			}
			if (diseases.length() > 0) {
				diseases.setLength(diseases.length() - 2);  
			}

        
			FileWriter fw = new FileWriter("donors.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter out = new PrintWriter(bw);
			out.println(name + "; " + fatherName + "; " + mobile + "; " + age + "; " + monthsAgo + "; " + bloodGp + "; " + diseases);
			out.close();

        
			JOptionPane.showMessageDialog(this, "Donor data saved successfully!");
			
			noButtonPressed = false;

        
			p1.removeAll();
			p1.add(j1);
			p1.add(j2);
			p1.add(b1);
			p1.add(b2);
			p1.revalidate();
			p1.repaint();

		} catch (IOException ex) {
			ex.printStackTrace();
			JOptionPane.showMessageDialog(this, "Error saving donor data: " + ex.getMessage());
		}
	}

	private void searchDonor() {
		try {
			String patientBloodGp = t9.getText().trim();
			if (patientBloodGp.isEmpty()) {
				JOptionPane.showMessageDialog(this, "Please enter blood group to search.");
				return;
			}


			File file = new File("donors.txt");
			if (!file.exists()) {
				JOptionPane.showMessageDialog(this, "No donor data found.");
				return;
			}

			BufferedReader br = new BufferedReader(new FileReader(file));
			String details;
			StringBuilder matchedDonors = new StringBuilder();
			boolean found = false;

			while ((details = br.readLine()) != null) {
				String[] donar = details.split(";");
				if (donar.length < 7) continue;

				String name = donar[0].trim();
				String fatherName = donar[1].trim();
				String mobile = donar[2].trim();
				int age = Integer.parseInt(donar[3].trim());
				int monthsAgo = Integer.parseInt(donar[4].trim());
				String bloodGp = donar[5].trim();
				String diseases = donar[6].trim();

				if (monthsAgo >= 4 && age >= 18 && diseases.isEmpty() && bloodGp.equalsIgnoreCase(patientBloodGp)) {
					found = true;
					matchedDonors.append("Name: ").append(name).append("\n")
						.append("Father's Name: ").append(fatherName).append("\n")
						.append("Mobile: ").append(mobile).append("\n")
						.append("Age: ").append(age).append("\n")
						.append("Blood Group: ").append(bloodGp).append("\n")
						.append("No Disease him/her");
				}
			}

			br.close();

			if (found) {
				t10.setText(matchedDonors.toString());
			} else {
				t10.setText("No matching donors found.");
			}
			JOptionPane.showMessageDialog(this, "Thank you");

		} catch (Exception ex) {
			ex.printStackTrace();
			JOptionPane.showMessageDialog(this, "Error during search: " + ex.getMessage());
		}
	}

}
