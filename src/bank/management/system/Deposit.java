package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String  pin;
    JTextField t1;
    JButton b1,b2;
    Deposit(String pin){
        this.pin=pin;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel l1=new JLabel("ENTER THE AMOUNT YOU WANT TO DEPOSIT");
        l1.setFont(new Font("System",Font.BOLD,16));
        l1.setForeground(Color.WHITE);
        l1.setBounds(460,180,400,35);
        l3.add(l1);

        t1=new JTextField();
        t1.setFont(new Font("Raleway",Font.BOLD,22));
        t1.setBackground(new Color(65,125,128));
        t1.setForeground(Color.WHITE);
        t1.setBounds(460,230,355,25 );
        t1.addActionListener(this);
        l3.add(t1);

        b1=new JButton("Deposit");
        b1.setFont(new Font("System",Font.BOLD,16));
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(65,125,128));
        b1.setBounds(700,360,150,35);
        b1.addActionListener(this);
        l3.add(b1);

        b2=new JButton("Back");
        b2.setFont(new Font("System",Font.BOLD,16));
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(65,125,128));
        b2.setBounds(700,406,150,35);
        b2.addActionListener(this);
        l3.add(b2);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String amount=t1.getText();
            Date date=new Date();
            if(e.getSource()==b1){
                if(t1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter the amount you want to deposit");
                }else{
                    Conn c=new Conn();
                    c.statement.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Deposit','"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Rs. "+amount+" deposit successfully");
                    setVisible(false);
                    new main_Class(pin);
                }
            } else if (e.getSource()==b2) {
                setVisible(false);
                new main_Class(pin);
            }
        }catch (Exception es){
            es.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Deposit("");
    }
}
