import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe {

    private JPanel TicTacToe;
    private JButton button9;
    private JButton resetButton;
    private JButton exitButton;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button2;
    private JButton button3;
    private JButton button1;
    private JButton button8;
    private JTextField xCount;
    private JTextField oCount;
    private int oCount1 = 0;
    private int xCount1 = 0;
    private String startGame = "X";
    private int b1 = 10;
    private int b2 = 10;
    private int b3 = 10;
    private int b4 = 10;
    private int b5 = 10;
    private int b6 = 10;
    private int b7 = 10;
    private int b8 = 10;
    private int b9 = 10;
    private int i = 0;

    private void winningGame() {
        if (b1 == 1 && b2 == 1 && b3 == 1) {
            JFrame far = new JFrame();
            JOptionPane.showMessageDialog(far, "Player X Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount1++;
            xCount.setText(String.valueOf(xCount1));
            resetResult();


        } else if (b4 == 1 && b5 == 1 && b6 == 1) {
            JFrame far = new JFrame();
            JOptionPane.showMessageDialog(far, "Player X Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount1++;
            xCount.setText(String.valueOf(xCount1));
            resetResult();
        } else if (b7 == 1 && b8 == 1 && b9 == 1) {
            JFrame far = new JFrame();
            JOptionPane.showMessageDialog(far, "Player X Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount1++;
            xCount.setText(String.valueOf(xCount1));
            resetResult();
        } else if (b1 == 1 && b5 == 1 && b9 == 1) {
            JFrame far = new JFrame();
            JOptionPane.showMessageDialog(far, "Player X Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount1++;
            xCount.setText(String.valueOf(xCount1));
            resetResult();
        } else if (b3 == 1 && b5 == 1 && b7 == 1) {
            JFrame far = new JFrame();
            JOptionPane.showMessageDialog(far, "Player X Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount1++;
            xCount.setText(String.valueOf(xCount1));
            resetResult();
        } else if (b1 == 1 && b4 == 1 && b7 == 1) {
            JFrame far = new JFrame();
            JOptionPane.showMessageDialog(far, "Player X Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount1++;
            xCount.setText(String.valueOf(xCount1));
            resetResult();
        } else if (b2 == 1 && b5 == 1 && b8 == 1) {
            JFrame far = new JFrame();
            JOptionPane.showMessageDialog(far, "Player X Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount1++;
            xCount.setText(String.valueOf(xCount1));
            resetResult();
        } else if (b3 == 1 && b6 == 1 && b9 == 1) {
            JFrame far = new JFrame();
            JOptionPane.showMessageDialog(far, "Player X Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount1++;
            xCount.setText(String.valueOf(xCount1));
            resetResult();
        }


        if (b1 == 0 && b2 == 0 && b3 == 0) {
            JFrame far = new JFrame();
            JOptionPane.showMessageDialog(far, "Player O Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount1++;
            oCount.setText(String.valueOf(oCount1));
            resetResult();
        } else if (b4 == 0 && b5 == 0 && b6 == 0) {
            JFrame far = new JFrame();
            JOptionPane.showMessageDialog(far, "Player O Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount1++;
            oCount.setText(String.valueOf(oCount1));
            resetResult();
        } else if (b7 == 0 && b8 == 0 && b9 == 0) {
            JFrame far = new JFrame();
            JOptionPane.showMessageDialog(far, "Player O Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount1++;
            oCount.setText(String.valueOf(oCount1));
            resetResult();
        } else if (b1 == 0 && b5 == 0 && b9 == 0) {
            JFrame far = new JFrame();
            JOptionPane.showMessageDialog(far, "Player O Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount1++;
            oCount.setText(String.valueOf(oCount1));
            resetResult();
        } else if (b3 == 0 && b5 == 0 && b7 == 0) {
            JFrame far = new JFrame();
            JOptionPane.showMessageDialog(far, "Player O Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount1++;
            oCount.setText(String.valueOf(oCount1));
            resetResult();
        } else if (b1 == 0 && b4 == 0 && b7 == 0) {
            JFrame far = new JFrame();
            JOptionPane.showMessageDialog(far, "Player O Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount1++;
            oCount.setText(String.valueOf(oCount1));
            resetResult();
        } else if (b2 == 0 && b5 == 0 && b8 == 0) {
            JFrame far = new JFrame();
            JOptionPane.showMessageDialog(far, "Player O Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount1++;
            oCount.setText(String.valueOf(oCount1));
            resetResult();
        } else if (b3 == 0 && b6 == 0 && b9 == 0) {
            JFrame far = new JFrame();
            JOptionPane.showMessageDialog(far, "Player O Win", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount1++;
            oCount.setText(String.valueOf(oCount1));
            resetResult();
        } else if (i == 9) {
            JFrame far = new JFrame();
            JOptionPane.showMessageDialog(far, "No One Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            resetResult();
        }


    }

    private void chosePlayer() {
        if (startGame.equalsIgnoreCase("X")) {
            startGame = "O";
        } else {
            startGame = "X";
        }

    }

    private void resetResult() {
        button1.setText(null);
        button2.setText(null);
        button3.setText(null);
        button4.setText(null);
        button5.setText(null);
        button6.setText(null);
        button7.setText(null);
        button8.setText(null);
        button9.setText(null);
        b1 = 10;
        b2 = 10;
        b3 = 10;
        b4 = 10;
        b5 = 10;
        b6 = 10;
        b7 = 10;
        b8 = 10;
        b9 = 10;
        i = 0;

    }


    public TicTacToe() {
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setText(null);
                button2.setText(null);
                button3.setText(null);
                button4.setText(null);
                button5.setText(null);
                button6.setText(null);
                button7.setText(null);
                button8.setText(null);
                button9.setText(null);
                b1 = 10;
                b2 = 10;
                b3 = 10;
                b4 = 10;
                b5 = 10;
                b6 = 10;
                b7 = 10;
                b8 = 10;
                b9 = 10;
                xCount.setText("0");
                oCount.setText("0");

            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame far = new JFrame("Exit");
                if (JOptionPane.showConfirmDialog(far, "Confirm You Want To Exit", "Tit Tac Toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
                    System.exit(0);
                }
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setText(startGame);

                if (startGame.equalsIgnoreCase("X")) {
                    button1.setForeground(Color.RED);
                    b1 = 1;
                    i++;
                } else {
                    button1.setForeground(Color.YELLOW);
                    b1 = 0;
                    i++;
                }
                chosePlayer();
                winningGame();
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button2.setText(startGame);

                if (startGame.equalsIgnoreCase("X")) {
                    button2.setForeground(Color.RED);
                    b2 = 1;
                    i++;
                } else {
                    button2.setForeground(Color.YELLOW);
                    b2 = 0;
                    i++;
                }
                chosePlayer();
                winningGame();
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button3.setText(startGame);

                if (startGame.equalsIgnoreCase("X")) {
                    button3.setForeground(Color.RED);
                    b3 = 1;
                    i++;
                } else {
                    button3.setForeground(Color.YELLOW);
                    b3 = 0;
                    i++;
                }
                chosePlayer();
                winningGame();
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button4.setText(startGame);

                if (startGame.equalsIgnoreCase("X")) {
                    button4.setForeground(Color.RED);
                    b4 = 1;
                    i++;
                } else {
                    button4.setForeground(Color.YELLOW);
                    b4 = 0;
                    i++;
                }
                chosePlayer();
                winningGame();
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button5.setText(startGame);

                if (startGame.equalsIgnoreCase("X")) {
                    button5.setForeground(Color.RED);
                    b5 = 1;
                    i++;
                } else {
                    button5.setForeground(Color.YELLOW);
                    b5 = 0;
                    i++;
                }
                chosePlayer();
                winningGame();
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button6.setText(startGame);

                if (startGame.equalsIgnoreCase("X")) {
                    button6.setForeground(Color.RED);
                    b6 = 1;
                    i++;
                } else {
                    button6.setForeground(Color.YELLOW);
                    b6 = 0;
                    i++;
                }
                chosePlayer();
                winningGame();
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button7.setText(startGame);

                if (startGame.equalsIgnoreCase("X")) {
                    button7.setForeground(Color.RED);
                    b7 = 1;
                    i++;
                } else {
                    button7.setForeground(Color.YELLOW);
                    b7 = 0;
                    i++;
                }
                chosePlayer();
                winningGame();
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button8.setText(startGame);

                if (startGame.equalsIgnoreCase("X")) {
                    button8.setForeground(Color.RED);
                    b8 = 1;
                    i++;
                } else {
                    button8.setForeground(Color.YELLOW);
                    b8 = 0;
                    i++;
                }
                chosePlayer();
                winningGame();
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button9.setText(startGame);

                if (startGame.equalsIgnoreCase("X")) {
                    button9.setForeground(Color.RED);
                    b9 = 1;
                    i++;
                } else {
                    button9.setForeground(Color.YELLOW);
                    b9 = 0;
                    i++;
                }
                chosePlayer();
                winningGame();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TicTacToe");
        frame.setContentPane(new TicTacToe().TicTacToe);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setSize(1000, 600);
        frame.setVisible(true);

    }


}

