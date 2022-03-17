import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Frame extends JFrame{

    JLabel timeLabel = new JLabel();
    JLabel dayLabel = new JLabel();
    JLabel monthLabel = new JLabel();
    SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
    SimpleDateFormat dayFormat = new SimpleDateFormat("dd");
    SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
    String time;
    String day;
    String month;

    public Frame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Clock");
        this.setSize(400, 250);
        this.setLayout(new FlowLayout());

        timeLabel.setFont(new Font("Verdana", Font.PLAIN, 55));
        timeLabel.setForeground(Color.gray);

        dayLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
        dayLabel.setForeground(Color.gray);

        monthLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
        monthLabel.setForeground(Color.gray);

        this.add(timeLabel);
        this.add(dayLabel);
        this.add(monthLabel);
        this.setVisible(true);

        setTime();
    }

    private void setTime() {

        while (true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day + ":");

            month = monthFormat.format(Calendar.getInstance().getTime());
            monthLabel.setText(month);
        }
    }
}
