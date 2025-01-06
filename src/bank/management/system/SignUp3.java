package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp3 extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton submit,cancel;
    String formNo;
    SignUp3(String formNo){
        this.formNo=formNo;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        JLabel l1=new JLabel("Page 3");
        l1.setFont(new Font("AvantGrade",Font.BOLD,30));
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel l2=new JLabel("Account Details");
        l2.setFont(new Font("AvantGrade",Font.BOLD,25));
        l2.setBounds(280,70,600,50);
        add(l2);

        JLabel l3=new JLabel("Account Type:");
        l3.setFont(new Font("AvantGrade",Font.BOLD,15));
        l3.setBounds(100,140,200,50);
        add(l3);

        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("AvantGrade",Font.PLAIN,15));
        r1.setBounds(110,180,200 ,30);
        r1.setBackground(new Color(155,255,255));
        add(r1);

        r2=new JRadioButton("Fixed Deposit");
        r2.setFont(new Font("AvantGrade",Font.PLAIN,15));
        r2.setBounds(330,180,200,30);
        r2.setBackground(new Color(155,255,255));
        add(r2);

        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("AvantGrade",Font.PLAIN,15));
        r3.setBounds(110,210,200,30);
        r3.setBackground(new Color(155,255,255));
        add(r3);

        r4=new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("AvantGrade",Font.PLAIN,15));
        r4.setBounds(330,210,200,30);
        r4.setBackground(new Color(155,255,255));
        add(r4);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel l4=new JLabel("Card Number:");
        l4.setFont(new Font("AvantGrade",Font.BOLD,15));
        l4.setBounds(100,260,200,50);
        add(l4);

        JLabel l5=new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("AvantGrade",Font.PLAIN,12));
        l5.setBounds(100,300,200,20);
        add(l5);

        JLabel l6=new JLabel("XXXX-XXXX-XXXX-4512");
        l6.setFont(new Font("AvantGrade",Font.BOLD,15));
        l6.setBounds(330,260,200,50);
        add(l6);

        JLabel l7=new JLabel("(It would appear on atm card/cheque Book and Statements)");
        l7.setFont(new Font("AvantGrade",Font.PLAIN,12));
        l7.setBounds(330,300,500,20);
        add(l7);

        JLabel l8=new JLabel("PIN:");
        l8.setFont(new Font("AvantGrade",Font.BOLD,15));
        l8.setBounds(100,330,200,30);
        add(l8);

        JLabel l9=new JLabel("XXXX");
        l9.setFont(new Font("AvantGrade",Font.PLAIN,15));
        l9.setBounds(330,330,200,30);
        add(l9);

        JLabel l10=new JLabel("(4-Digit Password)");
        l10.setFont(new Font("AvantGrade",Font.PLAIN,12));
        l10.setBounds(100,360,200,20);
        add(l10);

        JLabel l11=new JLabel("Services Required:");
        l11.setFont(new Font("AvantGrade",Font.BOLD,15));
        l11.setBounds(100,400,200,30);
        add(l11);

        c1=new JCheckBox("ATM CARD");
        c1.setBackground(new Color(155,255,255));
        c1.setFont(new Font("AvantGrade",Font.BOLD,15));
        c1.setBounds(100,440,200,30);
        add(c1);

        c2=new JCheckBox("Internet Banking");
        c2.setBackground(new Color(155,255,255));
        c2.setFont(new Font("AvantGrade",Font.BOLD,15));
        c2.setBounds(350,440,200,30);
        add(c2);

        c3=new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(155,255,255));
        c3.setFont(new Font("AvantGrade",Font.BOLD,15));
        c3.setBounds(100,480,200,30);
        add(c3);

        c4=new JCheckBox("Email Alert");
        c4.setBackground(new Color(155,255,255));
        c4.setFont(new Font("AvantGrade",Font.BOLD,15));
        c4.setBounds(350,480,200,30);
        add(c4);

        c5=new JCheckBox("Cheque Book");
        c5.setBackground(new Color(155,255,255));
        c5.setFont(new Font("AvantGrade",Font.BOLD,15));
        c5.setBounds(100,520,200,30);
        add(c5);

        c6=new JCheckBox("E-Statement");
        c6.setBackground(new Color(155,255,255));
        c6.setFont(new Font("AvantGrade",Font.BOLD,15));
        c6.setBounds(350,520,200,30);
        add(c6);

        JCheckBox c7=new JCheckBox("I hereby declares that the above entered details correct to the best of my knowledge.",true);
        c7.setBackground(new Color(155,255,255));
        c7.setFont(new Font("AvantGrade",Font.BOLD,15));
        c7.setBounds(100,600,800,20);
        add(c7);

        JLabel l12=new JLabel("Form No:");
        l12.setFont(new Font("AvantGrade",Font.BOLD,14));
        l12.setBounds(600,10,100,30);
        add(l12);

        JLabel l13=new JLabel(formNo);
        l13.setFont(new Font("AvantGrade",Font.BOLD,14));
        l13.setBounds(700,10,100,30);
        add(l13);

        submit=new JButton("Submit");
        submit.setFont(new Font("Lato",Font.PLAIN,20));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(500,650,100,30);
        submit.addActionListener(this);
        add(submit);

        cancel=new JButton("Cancel");
        cancel.setFont(new Font("Lato",Font.PLAIN,20));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(200,650,100,30);
        cancel.addActionListener(this);
        add(cancel);

        setLayout(null);
        setSize(800,750);
        setLocation(400,30);
        getContentPane().setBackground(new Color(155,255,255));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype="";
        if((r1.isSelected())){
            atype="Saving Account";
        }else if((r2.isSelected())){
            atype="Fixed Deposit";
        }else if((r3.isSelected())){
            atype="Current Account";
        }else if((r4.isSelected())){
            atype="Recurring Deposit Account";
        }
        Random ran= new Random();
        long first7=(ran.nextLong() % 90000000L)+45129974000000000L;
        String cardNo=""+Math.abs(first7);
        long first3=(ran.nextLong() % 9000L)+1000L;
        String pin=""+Math.abs(first3);

        String fac="";
        if((c1.isSelected())){
            fac+="ATM CARD";
        }else if((c2.isSelected())){
            fac+="Internet Banking";
        }else if((c3.isSelected())){
            fac+="Mobile Banking";
        }else if((c4.isSelected())){
            fac+="Email Alert";
        }else if((c5.isSelected())){
            fac+="Cheque Book";
        }else if((c6.isSelected())){
            fac+="E-Statement";
        }


        try{
            if(e.getSource()==submit){
                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the fields");
                }else{
                    Conn c1=new Conn();
                    String q1="insert into signupthree values('"+formNo+"', '"+atype+"', '"+cardNo+"', '"+pin+"', '"+fac+"')";
                    String q2="insert into login values('"+formNo+"', '"+cardNo+"', '"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number: "+cardNo+"\n Pin: "+pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            }else if(e.getSource()==cancel){
                System.exit(0);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SignUp3("");
    }
}
