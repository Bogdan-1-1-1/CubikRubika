import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;


public class Cube {
    public static void main(String[] args) {
        myButt[][] side1 = Cube.makeSide(Color.WHITE);
        myButt[][] side2 = Cube.makeSide(Color.RED);
        myButt[][] side3 = Cube.makeSide(Color.ORANGE);
        myButt[][] side4 = Cube.makeSide(Color.GREEN);
        myButt[][] side5 = Cube.makeSide(Color.BLUE);
        myButt[][] side6 = Cube.makeSide(Color.YELLOW ); //создаем грани нашего кубика

       MultiKeyPressListener key = new MultiKeyPressListener() {
             // @Override
             public synchronized void keyPressed(KeyEvent e) {
                pressed.add(e.getKeyChar()+"");
                if (pressed.size() == 2) {
                   switch (pressed.get(0)) {
                      case "a" :
                        switch (pressed.get(1)) {
                           case "q" :
                               changeSides(side1[0][0], side1[1][0], side1[2][0], side3[0][0], side3[1][0], side3[2][0]);
                               changeSides(side6[0][0], side6[1][0], side6[2][0], side5[0][0], side5[1][0], side5[2][0]);
                               changeSides(side1[0][0], side1[1][0], side1[2][0], side6[0][0], side6[1][0], side6[2][0]);
                               break;
                           case "z" :
                               changeSides(side1[0][0], side1[1][0], side1[2][0], side5[0][0], side5[1][0], side5[2][0]);
                               changeSides(side6[0][0], side6[1][0], side6[2][0], side3[0][0], side3[1][0], side3[2][0]);
                               changeSides(side1[0][0], side1[1][0], side1[2][0], side6[0][0], side6[1][0], side6[2][0]);
                               break;
                      }
                        break;
                      case "d" :
                        switch (pressed.get(1)) {
                            case "e" :
                                changeSides(side1[0][2], side1[1][2], side1[2][2], side3[0][2], side3[1][2], side3[2][2]);
                                changeSides(side6[0][2], side6[1][2], side6[2][2], side5[0][2], side5[1][2], side5[2][2]);
                                changeSides(side1[0][2], side1[1][2], side1[2][2], side6[0][2], side6[1][2], side6[2][2]);
                                break;
                            case "c" :
                                changeSides(side1[0][2], side1[1][2], side1[2][2], side5[0][2], side5[1][2], side5[2][2]);
                                changeSides(side6[0][2], side6[1][2], side6[2][2], side3[0][2], side3[1][2], side3[2][2]);
                                changeSides(side1[0][2], side1[1][2], side1[2][2], side6[0][2], side6[1][2], side6[2][2]);
                                break;
                        }
                        break;
                      case "s" : //"расширенная кнопка)"
                        switch (pressed.get(1)) {
                            case "w":
                                changeSides(side1[0][1], side1[1][1], side1[2][1], side3[0][1], side3[1][1], side3[2][1]);
                                changeSides(side6[0][1], side6[1][1], side6[2][1], side5[0][1], side5[1][1], side5[2][1]);
                                changeSides(side1[0][1], side1[1][1], side1[2][1], side6[0][1], side6[1][1], side6[2][1]);
                                break;
                            case "x":
                                changeSides(side1[0][1], side1[1][1], side1[2][1], side5[0][1], side5[1][1], side5[2][1]);
                                changeSides(side6[0][1], side6[1][1], side6[2][1], side3[0][1], side3[1][1], side3[2][1]);
                                changeSides(side1[0][1], side1[1][1], side1[2][1], side6[0][1], side6[1][1], side6[2][1]);
                                break;
                            case "a":
                                changeSides(side2[1][0], side2[1][1], side2[1][2], side6[1][0], side6[1][1], side6[1][2]);
                                changeSides(side1[1][0], side1[1][1], side1[1][2], side4[1][0], side4[1][1], side4[1][2]);
                                changeSides(side2[1][0], side2[1][1], side2[1][2], side4[1][0], side4[1][1], side4[1][2]);
                                break;
                            case "d":
                                changeSides(side2[1][0], side2[1][1], side2[1][2], side1[1][0], side1[1][1], side1[1][2]);
                                changeSides(side6[1][0], side6[1][1], side6[1][2], side4[1][0], side4[1][1], side4[1][2]);
                                changeSides(side2[1][0], side2[1][1], side2[1][2], side4[1][0], side4[1][1], side4[1][2]);
                                break;
                        }
                        break;
                      case "w" :
                        switch (pressed.get(1)){
                            case "q" :
                                changeSides(side2[0][0], side2[0][1], side2[0][2], side6[0][0], side6[0][1], side6[0][2]);
                                changeSides(side1[0][0], side1[0][1], side1[0][2], side4[0][0], side4[0][1], side4[0][2]);
                                changeSides(side2[0][0], side2[0][1], side2[0][2], side4[0][0], side4[0][1], side4[0][2]);
                                break;
                            case "e" :
                                changeSides(side2[0][0], side2[0][1], side2[0][2], side1[0][0], side1[0][1], side1[0][2]);
                                changeSides(side6[0][0], side6[0][1], side6[0][2], side4[0][0], side4[0][1], side4[0][2]);
                                changeSides(side2[0][0], side2[0][1], side2[0][2], side4[0][0], side4[0][1], side4[0][2]);
                                break;

                        }
                        break;
                      case "x" :
                        switch(pressed.get(1)){
                            case "z":
                                changeSides(side2[2][0], side2[2][1], side2[2][2], side6[2][0], side6[2][1], side6[2][2]);
                                changeSides(side1[2][0], side1[2][1], side1[2][2], side4[2][0], side4[2][1], side4[2][2]);
                                changeSides(side2[2][0], side2[2][1], side2[2][2], side4[2][0], side4[2][1], side4[2][2]);
                                break;
                            case "c":
                                changeSides(side2[2][0], side2[2][1], side2[2][2], side1[2][0], side1[2][1], side1[2][2]);
                                changeSides(side6[2][0], side6[2][1], side6[2][2], side4[2][0], side4[2][1], side4[2][2]);
                                changeSides(side2[2][0], side2[2][1], side2[2][2], side4[2][0], side4[2][1], side4[2][2]);
                                break;
                        }

                   }
                }
             }

             @Override
             public synchronized void keyReleased(KeyEvent e) {
              pressed.removeAll(pressed);
              }

             @Override
              public void keyTyped(KeyEvent e) {/* Not used */}
       }; // пишем поведение при нажатии на клавиши

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                side1[i][j].addKeyListener(key);
                side2[i][j].addKeyListener(key);
                side3[i][j].addKeyListener(key);
                side4[i][j].addKeyListener(key);
                side5[i][j].addKeyListener(key);
                side6[i][j].addKeyListener(key);
            }
        }
        side1[1][1].setText("1");
        side2[1][1].setText("2");
        side3[1][1].setText("3");
        side4[1][1].setText("4");
        side5[1][1].setText("5");
        side6[1][1].setText("6");
        ///////////////////////////////////////////////////////////////////////////////////////////////
        JFrame frame1 = new JFrame();                                    //Создание рамок/панелей для граней куба
        frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JFrame frame2 = new JFrame();
        JFrame frame3 = new JFrame();
        JFrame frame4 = new JFrame();
        JFrame frame5 = new JFrame();
        JFrame frame6 = new JFrame();


        JPanel panel1 = new JPanel(new GridLayout(3,3));
        Cube.setButtons(panel1, side1);
        JPanel panel2 = new JPanel(new GridLayout(3,3));
        Cube.setButtons(panel2, side2);
        JPanel panel3 = new JPanel(new GridLayout(3,3));
        Cube.setButtons(panel3, side3);
        JPanel panel4 = new JPanel(new GridLayout(3,3));
        Cube.setButtons(panel4, side4);
        JPanel panel5 = new JPanel(new GridLayout(3,3));
        Cube.setButtons(panel5, side5);
        JPanel panel6 = new JPanel(new GridLayout(3,3));
        Cube.setButtons(panel6, side6);

        Cube.formFrame(frame1, panel1);
        Cube.formFrame(frame2, panel2);
        Cube.formFrame(frame3, panel3);
        Cube.formFrame(frame4, panel4);
        Cube.formFrame(frame5, panel5);
        Cube.formFrame(frame6, panel6);
        /////////////////////////////////////////////////////////////////////////////////////////////
    }

    static myButt[][] makeSide(Color color) {
        myButt[][] btn = new myButt[3][3];
        int k = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                btn[i][j] = new myButt();
                btn[i][j].setBackground(color);
                btn[i][j].setIndex(k);
                k++;
            }
        }
        return btn;
    } //метод создания грани некоторого цвета
    static void formFrame(JFrame frame, JPanel panel){
        frame.add(panel);
        frame.setSize(300,300);
        frame.setResizable(false);
        frame.setVisible(true);
    } //просто сокращение писанины
    static void setButtons(JPanel panel, myButt[][] btn) {
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                panel.add(btn[i][j]);
            }
        }
    }//просто сокращение писанины
    static void changeSides(myButt cube1_1, myButt cube1_2, myButt cube1_3, myButt cube2_1, myButt cube2_2, myButt cube2_3) {
        Color help;

        help = cube1_1.getBackground();
        cube1_1.setBackground(cube2_1.getBackground());
        cube2_1.setBackground(help);

        help = cube1_2.getBackground();
        cube1_2.setBackground(cube2_2.getBackground());
        cube2_2.setBackground(help);

        help = cube1_3.getBackground();
        cube1_3.setBackground(cube2_3.getBackground());
        cube2_3.setBackground(help);
    } //метод для смены цветов сторон
}

class myButt extends JButton {
    private int index = 0; // добавлен индекс сегмента на грани для описания спецического поведения каждого сегмента

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
abstract class MultiKeyPressListener implements KeyListener {
    // Set of currently pressed keys
    ArrayList<String> pressed = new ArrayList<String>();
}  //добавление коллекции для считывания нескольких клавиш сразу
