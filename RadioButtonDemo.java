import javax.swing.*;
import java.awt.*;

public class AnimalImagesApp extends JFrame {

    public AnimalImagesApp() {

        setTitle("Animal Images");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1));

        // Bird
        JLabel birdLabel = new JLabel("Bird");
        birdLabel.setIcon(new ImageIcon("images/bird.jfif"));

        // Cat
        JLabel catLabel = new JLabel("Cat");
        catLabel.setIcon(new ImageIcon("images/cat.jfif"));

        // Dog
        JLabel dogLabel = new JLabel("Dog");
        dogLabel.setIcon(new ImageIcon("images/dog.jfif"));

        // Pig (note capital P must match your file)
        JLabel pigLabel = new JLabel("Pig");
        pigLabel.setIcon(new ImageIcon("images/Pig.jfif"));

        // Rabbit
        JLabel rabbitLabel = new JLabel("Rabbit");
        rabbitLabel.setIcon(new ImageIcon("images/Rabbit.jfif"));

        // Add to frame
        add(birdLabel);
        add(catLabel);
        add(dogLabel);
        add(pigLabel);
        add(rabbitLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new AnimalImagesApp();
    }
}