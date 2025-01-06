package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Mini extends JFrame implements ActionListener {
    String pin;
    JButton b1;
    Mini(String pin){
        this.pin=pin;
        JLabel l1=new JLabel();
        l1.setBounds(20,140,400,250);
        add(l1);

        JLabel l2=new JLabel("Astar Bank");
        l2.setFont(new Font("System",Font.BOLD,15));
        l2.setBounds(150,20,200,20);
        add(l2);

        JLabel l3=new JLabel();
        l3.setBounds(20,80,400,20);
        l2.setFont(new Font("System",Font.BOLD,15));
        add(l3);

        JLabel l4=new JLabel();
        l4.setBounds(20,400,400,20);
        add(l4);

        try {
            Conn c=new Conn();
            ResultSet rs=c.statement.executeQuery("select * from login where pin='"+pin+"'");
            while (rs.next()){
                l3.setText("Card No: "+rs.getString("card_number").substring(0,4)+"XXXXXXXX"+rs.getString("card_number").substring(12));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            int balance=0;
            Conn c=new Conn();
            ResultSet rs=c.statement.executeQuery("select * from bank where pin='"+pin+"'");
            while (rs.next()) {

                l1.setText(l1.getText()+"<html>"+rs.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("ammount")+"<br><br><html>");

                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("ammount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("ammount"));
                }
            }
            l4.setText("Your total Balance is Rs. "+balance);
        }catch (Exception e){
            e.printStackTrace();
        }
        b1=new JButton("Exit");
        b1.setBounds(20, 500,100,25);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);
        b1.addActionListener(this);

        getContentPane().setBackground(new Color(191, 248, 196));
        setSize(400,600);
        setLocation(10,10);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new main_Class(pin);
        setVisible(false);
    }

    public static void main(String[] args) {
        new Mini("");
    }
}
