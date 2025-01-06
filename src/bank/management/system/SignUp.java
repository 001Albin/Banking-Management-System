package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class SignUp extends JFrame implements ActionListener {

    JTextField tname,tfname,temail,taddress,tcity,tpin,tstate;
    JDateChooser dateChooser;
    JRadioButton r1,r2,r3,rm1,rm2,rm3;
    JButton next;

    Random ran=new Random();
    long first4=(ran.nextLong()%9000L)+1000L;
    String first=" "+Math.abs(first4);

    SignUp(){
        super("Application Form");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1=new JLabel("Application Form NO."+first);
        label1.setFont(new Font("AvantGrade",Font.BOLD,35));
        label1.setBounds(160,20,600,40);
        add(label1);

        JLabel label2=new JLabel("Page 1");
        label2.setFont(new Font("AvantGrade",Font.BOLD,29));
        label2.setBounds(330,70,600,33);
        add(label2);

        JLabel label3=new JLabel("Personal Details");
        label3.setFont(new Font("AvantGrade",Font.BOLD,29));
        label3.setBounds(270,110,600,33);
        add(label3);

        JLabel lname=new JLabel("Name of User:");
        lname.setFont(new Font("AvantGrade",Font.BOLD,20));
        lname.setBounds(100,190,200,30);
        add(lname);

        tname=new JTextField(15);
        tname.setBounds(300,190,300 ,30);
        tname.setFont(new Font("AvantGrade",Font.PLAIN,17));
        add(tname);

        JLabel lfname=new JLabel("Father's Name:");
        lfname.setFont(new Font("AvantGrade",Font.BOLD,20));
        lfname.setBounds(100,240,200,30);
        add(lfname);

        tfname=new JTextField(15);
        tfname.setBounds(300,240,300 ,30);
        tfname.setFont(new Font("AvantGrade",Font.PLAIN,17));
        add(tfname);

        JLabel dobb=new JLabel("Date of Birth:");
        dobb.setFont(new Font("AvantGrade",Font.BOLD,20));
        dobb.setBounds(100,290,200,30);
        add(dobb);

        dateChooser= new JDateChooser();
        dateChooser.setForeground(new Color(4,4,0));
        dateChooser.setFont(new Font("AvantGrade",Font.PLAIN,17));
        dateChooser.setBounds(300,290,300,30);
        add(dateChooser);

        JLabel gen=new JLabel("Gender:");
        gen.setFont(new Font("AvantGrade",Font.BOLD,20));
        gen.setBounds(100,340,200,30);
        add(gen);

        r1=new JRadioButton("Male");
        r1.setFont(new Font("AvantGrade",Font.PLAIN,17));
        r1.setBounds(300,340,100,30);
        r1.setBackground(new Color(254,255,242));
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("AvantGrade",Font.PLAIN,17));
        r2.setBounds(400,340,100,30);
        r2.setBackground(new Color(254,255,242));
        add(r2);

        r3=new JRadioButton("Other");
        r3.setFont(new Font("AvantGrade",Font.PLAIN,17));
        r3.setBounds(500,340,100,30);
        r3.setBackground(new Color(254,255,242));
        add(r3);
        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        JLabel eemail=new JLabel("Email Address:");
        eemail.setFont(new Font("AvantGrade",Font.BOLD,20));
        eemail.setBounds(100,390,200,30);
        add(eemail);

        temail=new JTextField(15);
        temail.setBounds(300,390,300 ,30);
        temail.setFont(new Font("AvantGrade",Font.PLAIN,17));
        add(temail);

        JLabel mmarital=new JLabel("Marital Status:");
        mmarital.setFont(new Font("AvantGrade",Font.BOLD,20));
        mmarital.setBounds(100,440,200,30);
        add(mmarital);

        rm1=new JRadioButton("Married");
        rm1.setFont(new Font("AvantGrade",Font.PLAIN,17));
        rm1.setBounds(300,440,100,30);
        rm1.setBackground(new Color(254,255,242));
        add(rm1);

        rm2=new JRadioButton("Unmarried");
        rm2.setFont(new Font("AvantGrade",Font.PLAIN,17));
        rm2.setBounds(400,440,150,30);
        rm2.setBackground(new Color(254,255,242));
        add(rm2);

        rm3=new JRadioButton("Other");
        rm3.setFont(new Font("AvantGrade",Font.PLAIN,17));
        rm3.setBounds(550,440,100,30);
        rm3.setBackground(new Color(254,255,242));
        add(rm3);
        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(rm1);
        buttonGroup1.add(rm2);
        buttonGroup1.add(rm3);

        JLabel aaddress=new JLabel("Address:");
        aaddress.setFont(new Font("AvantGrade",Font.BOLD,20));
        aaddress.setBounds(100,490,200,30);
        add(aaddress);

        taddress=new JTextField(15);
        taddress.setBounds(300,490,300 ,30);
        taddress.setFont(new Font("AvantGrade",Font.PLAIN,17));
        add(taddress);

        JLabel cityy=new JLabel("City:");
        cityy.setFont(new Font("AvantGrade",Font.BOLD,20));
        cityy.setBounds(100,540,200,30);
        add(cityy);

        tcity=new JTextField(15);
        tcity.setBounds(300,540,300 ,30);
        tcity.setFont(new Font("AvantGrade",Font.PLAIN,17));
        add(tcity);

        JLabel pinn=new JLabel("PIN Code:");
        pinn.setFont(new Font("AvantGrade",Font.BOLD,20));
        pinn.setBounds(100,590,200,30);
        add(pinn);

        tpin=new JTextField(15);
        tpin.setBounds(300,590,300 ,30);
        tpin.setFont(new Font("AvantGrade",Font.PLAIN,17));
        add(tpin);

        JLabel statee=new JLabel("State:");
        statee.setFont(new Font("AvantGrade",Font.BOLD,20));
        statee.setBounds(100,640,200,30);
        add(statee);

        tstate=new JTextField(15);
        tstate.setBounds(300,640,300 ,30);
        tstate.setFont(new Font("AvantGrade",Font.PLAIN,17));
        add(tstate);

        next=new JButton("Next");
        next.setFont(new Font("Lato",Font.PLAIN,20));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,670,100,30);
        next.addActionListener(this);
        add(next);

        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(254,255,242));
        setLayout(null);
        setSize(850,800);
        setLocation(360,20);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formNo=first;
        String name=tname.getText();
        String father=tfname.getText();
        String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(r1.isSelected()){
            gender="Male";
        } else if (r2.isSelected()) {
            gender="Female";
        }else if(r3.isSelected()){
            gender="Other";
        }
        String email=temail.getText();
        String martial=null;
        if(rm1.isSelected()){
            martial="Married";
        } else if (rm2.isSelected()) {
            martial="Unmarried";
        }else if(rm3.isSelected()){
            martial="Other";
        }
        String address=taddress.getText();
        String pinCode=tpin.getText();
        String city=tcity.getText();
        String state=tstate.getText();

        try{
            if(tname.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                Conn conn1=new Conn();
                String q="insert into signup values('"+formNo+"', '"+name+"', '"+father+"', '"+dob+"', '"+gender+"', '"+email+"', '"+martial+"', '"+address+"', '"+city+"', '"+pinCode+"', '"+state+"')";
                conn1.statement.executeUpdate(q);
                new SignUp2(formNo);
                setVisible(false);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SignUp();
    }
}
