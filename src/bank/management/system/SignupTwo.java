package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {

    JTextField pan, aadhar;
    JButton next;
    JRadioButton eyes, eno, syes, sno;

    JComboBox religion, category, occupation, education, income;
    String formno;

    SignupTwo(String formno){

        this.formno = formno;
        // setBounds will only work if setLayout is set to null
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");


        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);


        JLabel religionLabel = new JLabel("Religion:");
        religionLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        religionLabel.setBounds(100, 140, 100, 30);
        add(religionLabel);

        String [] valReligion = {"Hindu", "Muslim", "Sikh", "Christian"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.white);
        add(religion);

        JLabel categoryLabel = new JLabel("Category:");
        categoryLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        categoryLabel.setBounds(100, 190, 200, 30);
        add(categoryLabel);

        String [] valCategory = {"General", "OBC", "SC", "ST", "Other"};
        category = new JComboBox(valCategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.white);
        add(category);


        JLabel incomeLabel = new JLabel("Income:");
        incomeLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        incomeLabel.setBounds(100, 240, 200, 30);
        add(incomeLabel);

        String [] incomeCategory = {"Null", "< 1,50,000", "<2,50,000", "< 5,00,000", "Up to 10,00,000"};
        income = new JComboBox(incomeCategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.white);
        add(income);

        JLabel educationalLabel = new JLabel("Educational");
        educationalLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        educationalLabel.setBounds(100, 290, 200, 30);
        add(educationalLabel);

        JLabel QualificationLabel = new JLabel("Qualification:");
        QualificationLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        QualificationLabel.setBounds(100, 315, 200, 30);
        add(QualificationLabel);

        String [] educationValues = {"Non-Graduation", "Graduation", "Post-Graduation", "Doctorate", "PHD"};
        education = new JComboBox(educationValues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.white);
        add(education);


        JLabel occupationLabel = new JLabel("Occupation:");
        occupationLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        occupationLabel.setBounds(100, 390, 200, 30);
        add(occupationLabel);


        String [] occupationalValues = {"Salaried", "Self-Employed", "Business", "Student", "Retired" ,"Others"};
        occupation = new JComboBox(occupationalValues);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.white);
        add(occupation);


        JLabel panLabel = new JLabel("PAN Number:");
        panLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        panLabel.setBounds(100, 440, 200, 30);
        add(panLabel);

        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);

        JLabel aadharLabel = new JLabel("Aadhar Number:");
        aadharLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        aadharLabel.setBounds(100, 490, 200, 30);
        add(aadharLabel);

        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);


        JLabel seniorLabel = new JLabel("Senior Citizen:");
        seniorLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        seniorLabel.setBounds(100, 540, 200, 30);
        add(seniorLabel);

        syes = new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.white);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.white);
        add(sno);


        ButtonGroup seniorGroup = new ButtonGroup();
        seniorGroup.add(syes);
        seniorGroup.add(sno);

        JLabel existingAccountLabel = new JLabel("Existing Account:");
        existingAccountLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        existingAccountLabel.setBounds(100, 590, 200, 30);
        add(existingAccountLabel);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.white);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.white);
        add(eno);


        ButtonGroup existingAccountGroup = new ButtonGroup();
        existingAccountGroup.add(syes);
        existingAccountGroup.add(sno);

        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    // Implement the actionPerformed method
    public void actionPerformed(ActionEvent ae) {
        String string_religion =  (String)religion.getSelectedItem();
        String string_category = (String) category.getSelectedItem();
        String string_income = (String) income.getSelectedItem();
        String string_education = (String) education.getSelectedItem();
        String string_occupation = (String) occupation.getSelectedItem();
        String string_seniorCitizen = null;
        if(syes.isSelected()){
            string_seniorCitizen = "Yes";
        }
        else if(sno.isSelected()){
            string_seniorCitizen = "No";
        }

        String existingAccount = null;
        if(eyes.isSelected()){
            existingAccount = "Yes";
        }
        else if(eno.isSelected()){
            existingAccount = "No";
        }


        String string_pan = pan.getText();
        String string_aadhar = aadhar.getText();

        try{
            Conn c = new Conn();
            String query = "insert into signuptwo values('"+formno+"', '"+string_religion+"', '"+string_category+"', '"+string_income+"', '"+string_education+"'," + "'"+string_occupation+"', '"+string_pan+"', '"+string_aadhar+"', '"+string_seniorCitizen+"', '"+existingAccount+"')";
            c.s.executeUpdate(query);

        } catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new SignupTwo("");
    }
}