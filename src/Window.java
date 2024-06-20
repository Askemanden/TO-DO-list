import javax.swing.*;
import java.awt.*;
public class Window extends JFrame {
    JPanel tasks;
    Window() {
        tasks = new JPanel();
        tasks.setLayout(new BoxLayout(tasks, BoxLayout.Y_AXIS));
        add(tasks);
        setLayout(new BorderLayout(10,10));
        setTitle("TO-DO List");
        setLayout(new FlowLayout(10,10,10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

    public void AddTask (String taskname){
        JPanel task = new JPanel();
        task.add(new JLabel(taskname));
        task.add(new JCheckBox());
        task.add(new JButton("Delete"));
        tasks.add(task);

    }
}
