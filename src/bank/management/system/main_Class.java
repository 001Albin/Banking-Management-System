package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class main_Class extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    main_Class(String pin){
        this.pin=pin;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel l1=new JLabel("Please select your Transaction");
        l1.setFont(new Font("System",Font.BOLD,18));
        l1.setForeground(Color.WHITE);
        l1.setBounds(460,180,400,35);
        l3.add(l1);

        b1=new JButton("DEPOSIT");
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(65,125,128));
        b1.setBounds(410,274,150,35);
        b1.addActionListener(this);
        l3.add(b1);

        b2=new JButton("CASH WITHDRAWAL");
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(65,125,128));
        b2.setBounds(700,274,150,35);
        b2.addActionListener(this);
        l3.add(b2);

        b3=new JButton("FAST CASH");
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(65,125,128));
        b3.setBounds(700,318,150,35);
        b3.addActionListener(this);
        l3.add(b3);

        b4=new JButton("MINI STATEMENT");
        b4.setForeground(Color.WHITE);
        b4.setBackground(new Color(65,125,128));
        b4.setBounds(700,360,150,35);
        b4.addActionListener(this);
        l3.add(b4);

        b5=new JButton("PIN CHANGE");
        b5.setForeground(Color.WHITE);
        b5.setBackground(new Color(65,125,128));
        b5.setBounds(410,318,150,35);
        b5.addActionListener(this);
        l3.add(b5);

        b6=new JButton("BALANCE ENQUIRY");
        b6.setForeground(Color.WHITE);
        b6.setBackground(new Color(65,125,128));
        b6.setBounds(410,360,150,35);
        b6.addActionListener(this);
        l3.add(b6);

        b7=new JButton("Eixt");
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
        try{
            if(e.getSource()==b1){
                new Deposit(pin);
            }else if(e.getSource()==b2){
                new Withdrawal(pin);
                setVisible(false);
            }else if(e.getSource()==b3){
                new FastCash(pin);
                setVisible(false);
            }else if(e.getSource()==b4){
                new Mini(pin);
                setVisible(false);
            }else if(e.getSource()==b5){
                new Pin(pin);
                setVisible(false);
            }else if(e.getSource()==b6){
                new BalanceEnquriy(pin);
                setVisible(false);
            }else if(e.getSource()==b7){
                System.exit(0);
            }
        }catch (Exception es){
            es.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new main_Class("");
    }
}
