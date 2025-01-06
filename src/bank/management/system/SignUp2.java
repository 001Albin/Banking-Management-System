package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp2 extends JFrame implements ActionListener {
    String formNo;
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField tpan,tad;
    JRadioButton r1,r2,e1,e2;
    JButton next;
    SignUp2(String formNo){

        super("Application Form");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formNo=formNo;

        JLabel l1=new JLabel("Page 2");
        l1.setFont(new Font("AvantGrade",Font.BOLD,30));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2=new JLabel("Additional Details");
        l2.setFont(new Font("AvantGrade",Font.BOLD,25));
        l2.setBounds(300,60,600,50);
        add(l2);

        JLabel l3=new JLabel("Religion:");
        l3.setFont(new Font("AvantGrade",Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);

        String religion[] = {"Christian","Hindu","Sikh","Muslim","Other"};
        comboBox= new JComboBox(religion);
        comboBox.setBackground(new Color(255, 255, 255));
        comboBox.setFont(new Font("Sato",Font.PLAIN,15));
        comboBox.setBounds(300,120,320,30);
        add(comboBox);

        JLabel l4=new JLabel("Category:");
        l4.setFont(new Font("AvantGrade",Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);

        String Category[] = {"General","OBC","SC","ST","Other"};
        comboBox2= new JComboBox(Category);
        comboBox2.setBackground(new Color(255, 255, 255));
        comboBox2.setFont(new Font("Sato",Font.PLAIN,15));
        comboBox2.setBounds(300,170,320,30);
        add(comboBox2);

        JLabel l5=new JLabel("Income:");
        l5.setFont(new Font("AvantGrade",Font.BOLD,18));
        l5.setBounds(100,230,100,30);
        add(l5);

        String Income[] = {"Null","< 1,50,000","< 5,50,000","< 10,00,000","< 50,00,000","< 1,00,00,000"};
        comboBox3= new JComboBox(Income);
        comboBox3.setBackground(new Color(255, 255, 255));
        comboBox3.setFont(new Font("Sato",Font.PLAIN,15));
        comboBox3.setBounds(300,230,320,30);
        add(comboBox3);

        JLabel l6=new JLabel("Education:");
        l6.setFont(new Font("AvantGrade",Font.BOLD,18));
        l6.setBounds(100,290,200,30);
        add(l6);

        String Education[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        comboBox4= new JComboBox(Education);
        comboBox4.setBackground(new Color(255, 255, 255));
        comboBox4.setFont(new Font("Sato",Font.PLAIN,15));
        comboBox4.setBounds(300,290,320,30);
        add(comboBox4);

        JLabel l7=new JLabel("Occupation:");
        l7.setFont(new Font("AvantGrade",Font.BOLD,18));
        l7.setBounds(100,350,200,30);
        add(l7);

        String Occupation[] = {"Salaried","Self-Employed","Business","Student","Retired","Other"};
        comboBox5= new JComboBox(Occupation);
        comboBox5.setBackground(new Color(255, 255, 255));
        comboBox5.setFont(new Font("Sato",Font.PLAIN,15));
        comboBox5.setBounds(300,350,320,30);
        add(comboBox5);

        JLabel l8=new JLabel("PAN Number:");
        l8.setFont(new Font("AvantGrade",Font.BOLD,18));
        l8.setBounds(100,410,150,30);
        add(l8);

        tpan=new JTextField();
        tpan.setFont(new Font("AvantGrade",Font.PLAIN,18));
        tpan.setBounds(300,410,325,30);
        add(tpan);

        JLabel l9=new JLabel("Adhar Number:");
        l9.setFont(new Font("AvantGrade",Font.BOLD,18));
        l9.setBounds(100,470,150,30);
        add(l9);

        tad=new JTextField();
        tad.setFont(new Font("AvantGrade",Font.PLAIN,18));
        tad.setBounds(300,470,325,30);
        add(tad);

        JLabel l10=new JLabel("Senior Citizen:");
        l10.setFont(new Font("AvantGrade",Font.BOLD,18));
        l10.setBounds(100,530,150,30);
        add(l10);

        r1=new JRadioButton("Yes");
        r1.setFont(new Font("AvantGrade",Font.PLAIN,17));
        r1.setBounds(300,530,100,30);
        r1.setBackground(new Color(155,255,255));
        add(r1);

        r2=new JRadioButton("No");
        r2.setFont(new Font("AvantGrade",Font.PLAIN,17));
        r2.setBounds(400,530,100,30);
        r2.setBackground(new Color(155,255,255));
        add(r2);

        JLabel l11=new JLabel("Existing Account:");
        l11.setFont(new Font("AvantGrade",Font.BOLD,18));
        l11.setBounds(100,590,200,30);
        add(l11);

        e1=new JRadioButton("Yes");
        e1.setFont(new Font("AvantGrade",Font.PLAIN,17));
        e1.setBounds(300,590,100,30);
        e1.setBackground(new Color(155,255,255));
        add(e1);

        e2=new JRadioButton("No");
        e2.setFont(new Font("AvantGrade",Font.PLAIN,17));
        e2.setBounds(400,590,100,30);
        e2.setBackground(new Color(155,255,255));
        add(e2);

        JLabel l12=new JLabel("Form No:");
        l12.setFont(new Font("AvantGrade",Font.BOLD,14));
        l12.setBounds(600,10,100,30);
        add(l12);

        JLabel l13=new JLabel(formNo);
        l13.setFont(new Font("AvantGrade",Font.BOLD,12));
        l13.setBounds(700,10,100,30);
        add(l13);

        next=new JButton("Next");
        next.setFont(new Font("Lato",Font.PLAIN,20));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(600,650,100,30);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setSize(850,750);
        setLocation(400,40);
        getContentPane().setBackground(new Color(155,255,255));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel=(String) comboBox.getSelectedItem();
        String cate=(String) comboBox2.getSelectedItem();
        String inc=(String) comboBox3.getSelectedItem();
        String edu=(String) comboBox4.getSelectedItem();
        String occu=(String) comboBox5.getSelectedItem();

        String pan=tpan.getText();
        String aadhar=tad.getText();

        String sencitizen=" ";
        if((r1.isSelected())){
            sencitizen="Yes";
        }else if((r2.isSelected())){
            sencitizen="No";
        }

        String existing_acc=" ";
        if((e1.isSelected())){
            existing_acc="Yes";
        }else if((e2.isSelected())){
            existing_acc="No";
        }

        try{
            if(tpan.getText().equals("")||tad.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                Conn c1=new Conn();
                String q="insert into signuptwo values('"+formNo+"', '"+rel+"', '"+cate+"', '"+inc+"', '"+edu+"', '"+occu+"', '"+pan+"', '"+aadhar+"', '"+sencitizen+"', '"+existing_acc+"')";
                c1.statement.executeUpdate(q);
                new SignUp3(formNo);
                setVisible(false);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new SignUp2("");
    }
}
