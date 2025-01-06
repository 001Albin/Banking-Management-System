package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JLabel label1,label2,label3;
    JTextField t1;
    JPasswordField p1;
    JButton btn1,btn2,btn3;
    Login(){
        super("Bank Management System");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);

        ImageIcon j1=new ImageIcon(ClassLoader.getSystemResource("icons/card.png"));
        Image j2=j1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon j3= new ImageIcon(j2);
        JLabel jmage=new JLabel(j3);
        jmage.setBounds(630,340,100,100);
        add(jmage);

        label1=new JLabel("Welcome to Astar Bank");
        label1.setForeground(Color.white);
        label1.setFont(new Font("AvantGrade",Font.BOLD,34));
        label1.setBounds(225,125,450,40);
        add(label1);

        label2=new JLabel("Card No: ");
        label2.setFont(new Font("Ralway",Font.BOLD,25));
        label2.setForeground(Color.white);
        label2.setBounds(150,190,375,30);
        add(label2);

        t1=new JTextField(15);
        t1.setBounds(300,190,230,30);
        t1.setFont(new Font("Arial",Font.BOLD,14));
        add(t1);

        label3=new JLabel("PIN No: ");
        label3.setFont(new Font("Ralway",Font.BOLD,25));
        label3.setForeground(Color.white);
        label3.setBounds(150,250,375,30);
        add(label3);

        p1=new JPasswordField(15);
        p1.setBounds(300,250,230,30);
        p1.setFont(new Font("Arial",Font.BOLD,14));
        add(p1);

        btn1=new JButton("SIGN IN");
        btn1.setFont(new Font("Arial",Font.BOLD,14));
        btn1.setForeground(Color.white);
        btn1.setBackground(Color.black);
        btn1.addActionListener(this);
        btn1.setBounds(300,300,100,30);
        add(btn1);

        btn2=new JButton("Clear");
        btn2.setFont(new Font("Arial",Font.BOLD,14));
        btn2.setForeground(Color.white);
        btn2.setBackground(Color.black);
        btn2.addActionListener(this);
        btn2.setBounds(430,300,100,30);
        add(btn2);

        btn3=new JButton("Sign Up");
        btn3.setFont(new Font("Arial",Font.BOLD,14));
        btn3.setForeground(Color.white);
        btn3.setBackground(Color.black);
        btn3.addActionListener(this);
        btn3.setBounds(300,350,230,30);
        add(btn3);

        ImageIcon b1=new ImageIcon(ClassLoader.getSystemResource("icons/backbg.png"));
        Image b2=b1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon b3= new ImageIcon(b2);
        JLabel backimage=new JLabel(b3);
        backimage.setBounds(0,0,850,480);
        add(backimage);

        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(850, 480);
        setLocation(370,175);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if(e.getSource()==btn1){
                Conn c=new Conn();
                String cardno=t1.getText();
                String pin= p1.getText();
                String q="select * from login where card_number='"+cardno+"'and pin='"+pin+"'";
                ResultSet rs=c.statement.executeQuery(q);
                if(rs.next()){
                    setVisible(false);
                    new main_Class(pin);
                }else {
                   JOptionPane.showMessageDialog(null,"Incorrect CARD or PIN number");
                }
            } else if (e.getSource()==btn2) {
                t1.setText("");
                p1.setText("");
            } else if (e.getSource()==btn3) {
                new SignUp();
                setVisible(false);
            }
        }catch (Exception ee){
            System.out.println(ee+" error occured");
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
