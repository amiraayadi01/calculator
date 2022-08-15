//
//import java.awt.FlowLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//public class GUI extends JFrame implements ActionListener {
//
//    public SetActionCommandForJButton(){
//        //Flow Layout for the frame
//        this.getContentPane().setLayout(new FlowLayout());
//
//        JButton button = new JButton("add");
//
//        add(button);
//
//        button.addActionListener(this);
//        //define a custom short action command for the button
//        button.setActionCommand("1");
//
//        add(button);
//    }
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        String sum = e.getActionCommand();
//        if (sum.equals("1")){
//            System.out.println("1");
//        }
//    }
//
//    private static void createAndShowGUI() {
//
//        //Create and set up the window.
//
//        JFrame frame = new SetActionCommandForJButton();
//
//        //Display the window.
//
//        frame.pack();
//
//        frame.setVisible(true);
//
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//    }
//
//    public static void main(String[] args) {
//
//        //Schedule a job for the event-dispatching thread:
//
//        //creating and showing this application's GUI.
//
//        javax.swing.SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                createAndShowGUI();
//            }
//        });
//}
//
//}
