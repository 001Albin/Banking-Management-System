package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    FastCash(String pin){
        this.pin=pin;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel l1=new JLabel("SELECT WITHDRAWAL AMOUNT");
        l1.setFont(new Font("System",Font.BOLD,18));
        l1.setForeground(Color.WHITE);
        l1.setBounds(460,180,400,35);
        l3.add(l1);

        b1=new JButton("Rs.100");
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(65,125,128));
        b1.setBounds(410,274,150,35);
        b1.addActionListener(this);
        l3.add(b1);

        b2=new JButton("Rs.500");
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(65,125,128));
        b2.setBounds(700,274,150,35);
        b2.addActionListener(this);
        l3.add(b2);

        b3=new JButton("Rs.1000");
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(65,125,128));
        b3.setBounds(700,318,150,35);
        b3.addActionListener(this);
        l3.add(b3);

        b4=new JButton("Rs.2000");
        b4.setForeground(Color.WHITE);
        b4.setBackground(new Color(65,125,128));
        b4.setBounds(700,360,150,35);
        b4.addActionListener(this);
        l3.add(b4);

        b5=new JButton("Rs.5000");
        b5.setForeground(Color.WHITE);
        b5.setBackground(new Color(65,125,128));
        b5.setBounds(410,318,150,35);
        b5.addActionListener(this);
        l3.add(b5);

        b6=new JButton("Rs.100000");
        b6.setForeground(Color.WHITE);
        b6.setBackground(new Color(65,125,128));
        b6.setBounds(410,360,150,35);
        b6.addActionListener(this);
        l3.add(b6);

        b7=new JButton("Back");
        b7.setForeground(Color.WHITE);
        b7.setBackground(new Color(65,125,128));
        b7.setBounds(700,406,150,35);
        b7.addActionListener(this);
        l3.add(b7);

        setLayout(null);
        setSize(1550, 1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==b7){
                setVisible(false);
                new main_Class(pin);
            }else{
                String amount=((JButton)e.getSource()).getText().substring(3);
                Conn c= new Conn();
                Date date=new Date();
                try {
                    ResultSet rs=c.statement.executeQuery("select * from bank where pin='"+pin+"'");
                    int balance=0;
                    while (rs.next()) {
                        if (rs.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(rs.getString("ammount"));
                        } else {
                            balance -= Integer.parseInt(rs.getString("ammount"));
                        }
                    }
                        String num = "17";
                        if (balance < Integer.parseInt(amount)) {
                            JOptionPane.showMessageDialog(null, "Insufficient Balance");
                            return;
                        }

                        c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Withdraw','"+amount+"')");
                        JOptionPane.showMessageDialog(null,"Rs."+amount+" Debited successfully");


                }catch (Exception ae){
                    ae.printStackTrace();
                }
                setVisible(false);
                new main_Class(pin);
            }
    }

    public static void main(String[] args) {
        new FastCash("");
    }
}