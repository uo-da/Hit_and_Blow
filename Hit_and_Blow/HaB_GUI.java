import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class HaB_GUI extends JFrame {
    @SuppressWarnings("unchecked")
    public void HaB_Performed() {

        // JButton_Tbuttonの作成
        JButton Tbutton = new JButton();
        //

        // Ansarray_答えの配列を作成
        Hit_and_Blow HaB = new Hit_and_Blow();
        final int[] Ansarray = HaB.hit_and_blow();
        //

        // JFrame_HaBframeの作成
        JFrame HaBframe = new JFrame("Hit_and_Blow");
        //

        // JPanel_HaBpanel作成
        JPanel HaBpanel = new JPanel();
        HaBpanel.setLayout(null);
        //

        // JFrame_設定
        HaBframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        HaBframe.setSize(840, 400);
        HaBframe.setResizable(false);
        HaBframe.setLocation(100, 200);
        //

        // ColorData_色の配列を作成(String)
        String[] colordata = { "青", "赤", "緑", "黄", "桃", "白" };
        //

        // JomboBox_プルダウンメニューを作成
        MyCellRenderer renderer = new MyCellRenderer();
        UIManager.put("ComboBox.selectionBackground", Color.WHITE);

        JComboBox<String> HaBcomI1 = new JComboBox<>(colordata);
        HaBcomI1.setBounds(80, 60, 60, 30);
        HaBcomI1.setForeground(new Color(30, 144, 255));
        HaBcomI1.setBackground(Color.WHITE);
        HaBcomI1.setRenderer(renderer);
        HaBcomI1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent anEvent) {

                String ColorChange = null;
                int[] ColorArray = new int[4];
                for (int i = 0; i < ColorArray.length; i++) {

                    ColorChange = (String) HaBcomI1.getSelectedItem();

                    switch (ColorChange) {
                        case "青":
                            ColorArray[i] = 0;
                            HaBcomI1.setForeground(new Color(30, 144, 255));
                            break;

                        case "赤":
                            ColorArray[i] = 1;
                            HaBcomI1.setForeground(new Color(220, 20, 60));
                            break;

                        case "緑":
                            ColorArray[i] = 2;
                            HaBcomI1.setForeground(new Color(34, 139, 34));
                            break;

                        case "黄":
                            ColorArray[i] = 3;
                            HaBcomI1.setForeground(new Color(255, 215, 0));
                            break;

                        case "桃":
                            ColorArray[i] = 4;
                            HaBcomI1.setForeground(Color.PINK);
                            break;

                        case "白":
                            ColorArray[i] = 5;
                            HaBcomI1.setForeground(Color.BLACK);
                            break;
                    }
                }
            }

        });

        JComboBox<String> HaBcomI2 = new JComboBox<>(colordata);
        HaBcomI2.setBounds(200, 60, 60, 30);
        HaBcomI2.setForeground(new Color(30, 144, 255));
        HaBcomI2.setBackground(Color.WHITE);
        HaBcomI2.setRenderer(renderer);
        HaBcomI2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent anEvent) {

                String ColorChange = null;
                int[] ColorArray = new int[4];
                for (int i = 0; i < ColorArray.length; i++) {

                    ColorChange = (String) HaBcomI2.getSelectedItem();

                    switch (ColorChange) {
                        case "青":
                            ColorArray[i] = 0;
                            HaBcomI2.setForeground(new Color(30, 144, 255));
                            break;

                        case "赤":
                            ColorArray[i] = 1;
                            HaBcomI2.setForeground(new Color(220, 20, 60));
                            break;

                        case "緑":
                            ColorArray[i] = 2;
                            HaBcomI2.setForeground(new Color(34, 139, 34));
                            break;

                        case "黄":
                            ColorArray[i] = 3;
                            HaBcomI2.setForeground(new Color(255, 215, 0));
                            break;

                        case "桃":
                            ColorArray[i] = 4;
                            HaBcomI2.setForeground(Color.PINK);
                            break;

                        case "白":
                            ColorArray[i] = 5;
                            HaBcomI2.setForeground(Color.BLACK);
                            break;
                    }
                }
            }

        });

        JComboBox<String> HaBcomI3 = new JComboBox<>(colordata);
        HaBcomI3.setBounds(320, 60, 60, 30);
        HaBcomI3.setForeground(new Color(30, 144, 255));
        HaBcomI3.setBackground(Color.WHITE);
        HaBcomI3.setRenderer(renderer);
        HaBcomI3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent anEvent) {

                String ColorChange = null;
                int[] ColorArray = new int[4];
                for (int i = 0; i < ColorArray.length; i++) {

                    ColorChange = (String) HaBcomI3.getSelectedItem();

                    switch (ColorChange) {
                        case "青":
                            ColorArray[i] = 0;
                            HaBcomI3.setForeground(new Color(30, 144, 255));
                            break;

                        case "赤":
                            ColorArray[i] = 1;
                            HaBcomI3.setForeground(new Color(220, 20, 60));
                            break;

                        case "緑":
                            ColorArray[i] = 2;
                            HaBcomI3.setForeground(new Color(34, 139, 34));
                            break;

                        case "黄":
                            ColorArray[i] = 3;
                            HaBcomI3.setForeground(new Color(255, 215, 0));
                            break;

                        case "桃":
                            ColorArray[i] = 4;
                            HaBcomI3.setForeground(Color.PINK);
                            break;

                        case "白":
                            ColorArray[i] = 5;
                            HaBcomI3.setForeground(Color.BLACK);
                            break;
                    }
                }
            }

        });

        JComboBox<String> HaBcomI4 = new JComboBox<>(colordata);
        HaBcomI4.setBounds(440, 60, 60, 30);
        HaBcomI4.setForeground(new Color(30, 144, 255));
        HaBcomI4.setBackground(Color.WHITE);
        HaBcomI4.setRenderer(renderer);
        HaBcomI4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent anEvent) {

                String ColorChange = null;
                int[] ColorArray = new int[4];
                for (int i = 0; i < ColorArray.length; i++) {

                    ColorChange = (String) HaBcomI4.getSelectedItem();

                    switch (ColorChange) {
                        case "青":
                            ColorArray[i] = 0;
                            HaBcomI4.setForeground(new Color(30, 144, 255));
                            break;

                        case "赤":
                            ColorArray[i] = 1;
                            HaBcomI4.setForeground(new Color(220, 20, 60));
                            break;

                        case "緑":
                            ColorArray[i] = 2;
                            HaBcomI4.setForeground(new Color(34, 139, 34));
                            break;

                        case "黄":
                            ColorArray[i] = 3;
                            HaBcomI4.setForeground(new Color(255, 215, 0));
                            break;

                        case "桃":
                            ColorArray[i] = 4;
                            HaBcomI4.setForeground(Color.PINK);
                            break;

                        case "白":
                            ColorArray[i] = 5;
                            HaBcomI4.setForeground(Color.BLACK);
                            break;
                    }
                }
            }

        });
        //

        // JButton_HitButtonの作成＆Hitルールのウィンドウ作成
        JButton HitButton = new JButton();
        HitButton.setText(" HIT ");
        HitButton.setBounds(80, 200, 120, 30);
        HitButton.setBackground(Color.WHITE);

        HitButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent anEvent) {

                JFrame HitFrame = new JFrame("Hit_Rule");
                HitFrame.setSize(400, 200);
                HitFrame.setResizable(false);
                HitFrame.setLocation(100, 0);

                JPanel HitPanel = new JPanel();
                HitPanel.setLayout(null);

                JLabel HitLabel = new JLabel("・HIT…ヒット : 答えと色も場所も同じ所が何箇所あるか");
                HitLabel.setBounds(20, 60, 500, 30);

                HitPanel.add(HitLabel);
                HitFrame.add(HitPanel);

                HitFrame.setVisible(true);
            }

        });
        //

        // JButton_BlowButtonの作成＆Blowルールのウィンドウ作成
        JButton BlowButton = new JButton();
        BlowButton.setText(" BLOW ");
        BlowButton.setBounds(380, 200, 120, 30);
        BlowButton.setBackground(Color.WHITE);

        BlowButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent anEvent) {

                JFrame BlowFrame = new JFrame("Blow_Rule");
                BlowFrame.setSize(400, 200);
                BlowFrame.setResizable(false);
                BlowFrame.setLocation(540, 0);

                JPanel BlowPanel = new JPanel();
                BlowPanel.setLayout(null);

                JLabel BlowLabel = new JLabel("・BLOW…ブロー : 答えと場所は違うが同じ色が何箇所あるか");
                BlowLabel.setBounds(20, 60, 500, 30);

                BlowPanel.add(BlowLabel);
                BlowFrame.add(BlowPanel);

                BlowFrame.setVisible(true);
            }

        });
        //

        // JButton_Roundの作成＆Roundルールのウィンドウ作成
        JButton Rbutton = new JButton();
        Rbutton.setText(" ROUND 1");
        Rbutton.setBounds(80, 270, 120, 30);
        Rbutton.setBackground(Color.WHITE);

        Rbutton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent anEvent) {

                JFrame Rframe = new JFrame("Round_Rule");
                Rframe.setSize(400, 200);
                Rframe.setResizable(false);
                Rframe.setLocation(100, 600);

                JPanel Rpanel = new JPanel();
                Rpanel.setLayout(null);

                JLabel Rlabel = new JLabel("・ROUND…ラウンド : 8 回以内にゲームをクリアしよう");
                Rlabel.setBounds(20, 60, 500, 30);

                Rpanel.add(Rlabel);
                Rframe.add(Rpanel);

                Rframe.setVisible(true);
            }

        });
        //

        // JButton_Tbutton＆HaBtimerの設定
        Timer HaBtimer = new Timer();
        HaBtimer.scheduleAtFixedRate(new TimerTask() {
            int iTime = 0;
            int jtime = 0;
            int zTime = 0;
            Format f = new DecimalFormat("00");

            public void run() {

                iTime++;
                zTime++;

                if (iTime == 3600) {
                    HaBtimer.cancel();
                }

                if (zTime > 59) {
                    jtime++;
                    zTime = 0;

                }

                Tbutton.setText(f.format(jtime) + ":" + f.format(zTime));
                Tbutton.setBounds(380, 270, 120, 30);
                Tbutton.setBackground(Color.WHITE);

            }
        }, 0, 1000);
        //

        // JButton_Rule
        JButton RuleButton = new JButton();
        RuleButton.setText("RULE");
        RuleButton.setBounds(80, 130, 80, 30);
        RuleButton.setForeground(Color.GRAY);
        RuleButton.setBackground(Color.WHITE);

        RuleButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent anEvent) {

                JFrame RuleFrame = new JFrame("HaB_Rule");
                RuleFrame.setSize(400, 340);
                RuleFrame.setResizable(false);
                RuleFrame.setLocation(540, 600);

                JPanel RulePanel = new JPanel();
                RulePanel.setLayout(null);

                JLabel RuleS1a = new JLabel("STEP 1 : コンピュータが「青・赤・緑・黄・桃・白」から 4 ");
                RuleS1a.setBounds(20, 10, 500, 30);
                JLabel RuleS1b = new JLabel("色を 1 回ずつ使った形で「あたり」を決める ");
                RuleS1b.setBounds(69, 30, 500, 30);

                JLabel RuleS2a = new JLabel("STEP 2 : たとえば、あたりが「桃・白・赤・黄」で、プレイ ");
                RuleS2a.setBounds(20, 80, 500, 30);
                JLabel RuleS2b = new JLabel("ヤーが「青・赤・緑・黄」と答える ");
                RuleS2b.setBounds(69, 100, 500, 30);

                JLabel RuleS3a = new JLabel("STEP 3 : 色も場所も同じところは最後の「黄」1 箇所 ");
                RuleS3a.setBounds(20, 150, 500, 30);
                JLabel RuleS3b = new JLabel("「黄」を除くと答えと合っている色は「赤」の 1 色 ");
                RuleS3b.setBounds(61, 170, 500, 30);
                JLabel RuleS3c = new JLabel("ですので、「 1 ヒット & 1 ブロー」となる ");
                RuleS3c.setBounds(69, 190, 500, 30);

                JLabel RuleS4a = new JLabel("STEP 4 : これを繰り返して最終的に「 4 ヒット」、つまり ");
                RuleS4a.setBounds(20, 240, 500, 30);
                JLabel RuleS4b = new JLabel("答えと一緒になったらクリア ");
                RuleS4b.setBounds(69, 260, 500, 30);

                RulePanel.add(RuleS1a);
                RulePanel.add(RuleS1b);
                RulePanel.add(RuleS2a);
                RulePanel.add(RuleS2b);
                RulePanel.add(RuleS3a);
                RulePanel.add(RuleS3b);
                RulePanel.add(RuleS3c);
                RulePanel.add(RuleS4a);
                RulePanel.add(RuleS4b);

                RuleFrame.add(RulePanel);

                RuleFrame.setVisible(true);
            }

        });
        //

        JButton TrueButton = new JButton();
        TrueButton.setVisible(false);

        JButton FalseButton = new JButton();
        FalseButton.setVisible(false);

        // JLabel_ResultLabelの作成
        JLabel ProblemLabel = new JLabel();
        ProblemLabel.setText("");

        JLabel ResultLabelI1 = new JLabel();
        ResultLabelI1.setText("");

        JLabel ResultLabelI2 = new JLabel();
        ResultLabelI2.setText("");

        JLabel ResultLabelI3 = new JLabel();
        ResultLabelI3.setText("");

        JLabel ResultLabelI4 = new JLabel();
        ResultLabelI3.setText("");

        JLabel ResultLabelI5 = new JLabel();
        ResultLabelI5.setText("");
        //

        JLabel BorderTop = new JLabel();
        BorderTop.setText("------------------------------------------------------");
        BorderTop.setBounds(530, 45, 500, 30);

        JLabel RoundLabelR1 = new JLabel();
        RoundLabelR1.setText(" Round : " + "1" + "  Hit : " + "0" + "  Blow : " + "0");
        RoundLabelR1.setBounds(530, 60, 500, 30);
        RoundLabelR1.setForeground(Color.GRAY);

        JLabel RoundLabelR2 = new JLabel();
        RoundLabelR2.setText(" Round : " + "2" + "  Hit : " + "0" + "  Blow : " + "0");
        RoundLabelR2.setBounds(530, 90, 500, 30);
        RoundLabelR2.setForeground(Color.GRAY);

        JLabel RoundLabelR3 = new JLabel();
        RoundLabelR3.setText(" Round : " + "3" + "  Hit : " + "0" + "  Blow : " + "0");
        RoundLabelR3.setBounds(530, 120, 500, 30);
        RoundLabelR3.setForeground(Color.GRAY);

        JLabel RoundLabelR4 = new JLabel();
        RoundLabelR4.setText(" Round : " + "4" + "  Hit : " + "0" + "  Blow : " + "0");
        RoundLabelR4.setBounds(530, 150, 500, 30);
        RoundLabelR4.setForeground(Color.GRAY);

        JLabel RoundLabelR5 = new JLabel();
        RoundLabelR5.setText(" Round : " + "5" + "  Hit : " + "0" + "  Blow : " + "0");
        RoundLabelR5.setBounds(530, 180, 500, 30);
        RoundLabelR5.setForeground(Color.GRAY);

        JLabel RoundLabelR6 = new JLabel();
        RoundLabelR6.setText(" Round : " + "6" + "  Hit : " + "0" + "  Blow : " + "0");
        RoundLabelR6.setBounds(530, 210, 500, 30);
        RoundLabelR6.setForeground(Color.GRAY);

        JLabel RoundLabelR7 = new JLabel();
        RoundLabelR7.setText(" Round : " + "7" + "  Hit : " + "0" + "  Blow : " + "0");
        RoundLabelR7.setBounds(530, 240, 500, 30);
        RoundLabelR7.setForeground(Color.GRAY);

        JLabel RoundLabelR8 = new JLabel();
        RoundLabelR8.setText(" Round : " + "8" + "  Hit : " + "0" + "  Blow : " + "0");
        RoundLabelR8.setBounds(530, 270, 500, 30);
        RoundLabelR8.setForeground(Color.GRAY);
        
        JLabel BorderBottom = new JLabel();
        BorderBottom.setText("------------------------------------------------------");
        BorderBottom.setBounds(530, 280, 500, 30);

        // JButton_GoButton
        JButton GoButton = new JButton();
        GoButton.setText("GO");
        GoButton.setBounds(420, 130, 80, 30);
        GoButton.setForeground(new Color(220, 20, 60));
        GoButton.setBackground(Color.WHITE);

        GoButton.addActionListener(new ActionListener() {

            int count = 0;

            public void actionPerformed(ActionEvent anEvent) {

                String ComItem = null;
                int[] HaBarray = new int[4];

                for (int i = 0; i < HaBarray.length; i++) {

                    if (i == 0) {
                        ComItem = (String) HaBcomI1.getSelectedItem();
                    } else if (i == 1) {
                        ComItem = (String) HaBcomI2.getSelectedItem();
                    } else if (i == 2) {
                        ComItem = (String) HaBcomI3.getSelectedItem();
                    } else if (i == 3) {
                        ComItem = (String) HaBcomI4.getSelectedItem();
                    }

                    // swich_各Colorをint型の整数0-5に置き換え
                    switch (ComItem) {
                        case "青":
                            HaBarray[i] = 0;
                            break;

                        case "赤":
                            HaBarray[i] = 1;
                            break;

                        case "緑":
                            HaBarray[i] = 2;
                            break;

                        case "黄":
                            HaBarray[i] = 3;
                            break;

                        case "桃":
                            HaBarray[i] = 4;
                            break;

                        case "白":
                            HaBarray[i] = 5;
                            break;
                    }

                }

                // プルダウンメニューの重複をエラーメッセージで表示
                int flg = 0;
                for (int i = 0; i < HaBarray.length; i++) {
                    for (int j = 0; j < HaBarray.length; j++) {
                        if (i == j) {
                        } else {
                            if (HaBarray[i] == HaBarray[j]) {

                                ProblemLabel.setText("※同じ色を設定しないでください");
                                ProblemLabel.setBounds(197, 10, 500, 30);
                                ProblemLabel.setForeground(new Color(220, 20, 60));

                                flg = 1;

                            }

                        }

                    }

                }

                if (flg == 0) {

                    // エラーメッセージの上書き
                    ProblemLabel.setText("");

                    // 判定のメソッドを呼び出し
                    HitJudge hj = new HitJudge();
                    BlowJudge bj = new BlowJudge();

                    final int hitcount = hj.Hjudge(Ansarray, HaBarray);
                    final int blowcount = bj.Bjudge(Ansarray, HaBarray);
                    //

                    // デバッグ出力結果の表示
                    for (int i = 0; i < Ansarray.length; i++) {

                        String[] DebugA = new String[6];

                        switch (Ansarray[i]) {
                            case 0:
                                DebugA[i] = "青";
                                break;

                            case 1:
                                DebugA[i] = "赤";
                                break;

                            case 2:
                                DebugA[i] = "緑";
                                break;

                            case 3:
                                DebugA[i] = "黄";
                                break;

                            case 4:
                                DebugA[i] = "桃";
                                break;

                            case 5:
                                DebugA[i] = "白";
                                break;
                        }

                        System.out.print(" Ans " + DebugA[i] + " ");

                    }

                    System.out.println();

                    for (int i = 0; i < HaBarray.length; i++) {

                        String[] DebugHaB = new String[6];

                        switch (HaBarray[i]) {
                            case 0:
                                DebugHaB[i] = "青";
                                break;

                            case 1:
                                DebugHaB[i] = "赤";
                                break;

                            case 2:
                                DebugHaB[i] = "緑";
                                break;

                            case 3:
                                DebugHaB[i] = "黄";
                                break;

                            case 4:
                                DebugHaB[i] = "桃";
                                break;

                            case 5:
                                DebugHaB[i] = "白";
                                break;
                        }

                        System.out.print(" Inp " + DebugHaB[i] + " ");

                    }

                    System.out.print("Hit : " + hitcount + " " + "Blow : " + blowcount);

                    System.out.println();
                    //

                    // HITとBLOWのカウント表示
                    HitButton.setText(hitcount + " HIT ");
                    HitButton.setBounds(80, 200, 120, 30);

                    BlowButton.setText(blowcount + " BLOW ");
                    BlowButton.setBounds(380, 200, 120, 30);
                    //

                    if (count < 7) {

                        count++;
                        Rbutton.setText(" ROUND " + (count + 1));
                        Rbutton.setBounds(80, 270, 120, 30);

                    } else if (hitcount == 4) {

                        count++;
                        Rbutton.setText(" GAME CLEAR ");
                        Rbutton.setBounds(80, 270, 120, 30);
                        Rbutton.setForeground(new Color(30, 144, 255));
                        GoButton.setEnabled(false);
                        HaBtimer.cancel();

                    } else {

                        count++;
                        Rbutton.setText(" GAME OVER ");
                        Rbutton.setBounds(80, 270, 120, 30);
                        Rbutton.setForeground(new Color(220, 20, 60));
                        GoButton.setEnabled(false);
                        HaBtimer.cancel();

                        FalseButton.setText("RESET");
                        FalseButton.setBounds(250, 130, 80, 30);
                        FalseButton.setForeground(new Color(220, 20, 60));
                        FalseButton.setBackground(Color.WHITE);
                        FalseButton.setVisible(true);

                        FalseButton.addActionListener(new ActionListener() {

                            public void actionPerformed(ActionEvent anEvent) {

                                HaB_GUI HaB = new HaB_GUI();
                                HaB.HaB_Performed();
                                HaBframe.dispose();
                            }

                        });

                        ResultLabelI1.setText("----- RESULT -----");
                        ResultLabelI1.setBounds(242, 195, 500, 30);

                        ResultLabelI2.setText("ROUND");
                        ResultLabelI2.setBounds(267, 215, 500, 30);

                        ResultLabelI3.setText("OVER");
                        ResultLabelI3.setBounds(271, 235, 500, 30);

                        ResultLabelI4.setText("ANSWER");
                        ResultLabelI4.setBounds(263, 255, 500, 30);

                        String[] AnsColor = new String[4];
                        for (int change = 0; change < Ansarray.length; change++) {

                            if (Ansarray[change] == 0) {
                                AnsColor[change] = "青";
                            } else if (Ansarray[change] == 1) {
                                AnsColor[change] = "赤";
                            } else if (Ansarray[change] == 2) {
                                AnsColor[change] = "緑";
                            } else if (Ansarray[change] == 3) {
                                AnsColor[change] = "黄";
                            } else if (Ansarray[change] == 4) {
                                AnsColor[change] = "桃";
                            } else if (Ansarray[change] == 5) {
                                AnsColor[change] = "白";
                            }
                        }

                        ResultLabelI5.setText(AnsColor[0] + " " + AnsColor[1] + " " + AnsColor[2] + " " + AnsColor[3]);
                        ResultLabelI5.setBounds(259, 275, 500, 30);

                    }

                    if (hitcount == 4) {

                        TrueButton.setText("RESET");
                        TrueButton.setBounds(250, 130, 80, 30);
                        TrueButton.setForeground(new Color(220, 20, 60));
                        TrueButton.setBackground(Color.WHITE);
                        TrueButton.setVisible(true);

                        TrueButton.addActionListener(new ActionListener() {

                            public void actionPerformed(ActionEvent anEvent) {

                                HaB_GUI HaB = new HaB_GUI();
                                HaB.HaB_Performed();
                                HaBframe.dispose();
                            }

                        });

                        GoButton.setEnabled(false);
                        HaBtimer.cancel();

                        Rbutton.setText(" GAME CLEAR ");
                        Rbutton.setBounds(80, 270, 120, 30);
                        Rbutton.setForeground(new Color(30, 144, 255));
                        HaBtimer.cancel();

                        ResultLabelI1.setText("--- RESULT ---");
                        ResultLabelI1.setBounds(253, 195, 500, 30);

                        ResultLabelI2.setText("CLERE ROUND");
                        ResultLabelI2.setBounds(250, 215, 500, 30);

                        ResultLabelI3.setText("" + count);
                        ResultLabelI3.setBounds(286, 235, 500, 30);

                        ResultLabelI4.setText("ANSWER");
                        ResultLabelI4.setBounds(263, 255, 500, 30);

                        String[] AnsColor = new String[4];
                        for (int change = 0; change < Ansarray.length; change++) {

                            if (Ansarray[change] == 0) {
                                AnsColor[change] = "青";
                            } else if (Ansarray[change] == 1) {
                                AnsColor[change] = "赤";
                            } else if (Ansarray[change] == 2) {
                                AnsColor[change] = "緑";
                            } else if (Ansarray[change] == 3) {
                                AnsColor[change] = "黄";
                            } else if (Ansarray[change] == 4) {
                                AnsColor[change] = "桃";
                            } else if (Ansarray[change] == 5) {
                                AnsColor[change] = "白";
                            }
                        }

                        ResultLabelI5.setText(AnsColor[0] + " " + AnsColor[1] + " " + AnsColor[2] + " " + AnsColor[3]);
                        ResultLabelI5.setBounds(259, 275, 500, 30);

                    } else if (count < 7) {

                        FalseButton.setText("✖");
                        FalseButton.setBounds(250, 130, 80, 30);
                        FalseButton.setBackground(Color.WHITE);
                        FalseButton.setVisible(true);

                    }

                    String[] DebugHaB = new String[6];
                    for (int i = 0; i < HaBarray.length; i++) {

                        switch (HaBarray[i]) {
                            case 0:
                                DebugHaB[i] = "青";
                                break;

                            case 1:
                                DebugHaB[i] = "赤";
                                break;

                            case 2:
                                DebugHaB[i] = "緑";
                                break;

                            case 3:
                                DebugHaB[i] = "黄";
                                break;

                            case 4:
                                DebugHaB[i] = "桃";
                                break;

                            case 5:
                                DebugHaB[i] = "白";
                                break;
                        }
                    }
                    
                    if (count == 1) {
                        RoundLabelR1.setText(" Round : " + count + "  Hit : " + hitcount + "  Blow : " + blowcount
                                + "  " + DebugHaB[0] + "  " + DebugHaB[1] + "  " + DebugHaB[2] + "  " + DebugHaB[3]);
                        RoundLabelR1.setBounds(530, 60, 500, 30);
                        RoundLabelR1.setForeground(Color.BLACK);
                    } else if (count == 2) {
                        RoundLabelR2.setText(" Round : " + count + "  Hit : " + hitcount + "  Blow : " + blowcount
                                + "  " + DebugHaB[0] + "  " + DebugHaB[1] + "  " + DebugHaB[2] + "  " + DebugHaB[3]);
                        RoundLabelR2.setBounds(530, 90, 500, 30);
                        RoundLabelR2.setForeground(Color.BLACK);
                    } else if (count == 3) {
                        RoundLabelR3.setText(" Round : " + count + "  Hit : " + hitcount + "  Blow : " + blowcount
                                + "  " + DebugHaB[0] + "  " + DebugHaB[1] + "  " + DebugHaB[2] + "  " + DebugHaB[3]);
                        RoundLabelR3.setBounds(530, 120, 500, 30);
                        RoundLabelR3.setForeground(Color.BLACK);
                    } else if (count == 4) {
                        RoundLabelR4.setText(" Round : " + count + "  Hit : " + hitcount + "  Blow : " + blowcount
                                + "  " + DebugHaB[0] + "  " + DebugHaB[1] + "  " + DebugHaB[2] + "  " + DebugHaB[3]);
                        RoundLabelR4.setBounds(530, 150, 500, 30);
                        RoundLabelR4.setForeground(Color.BLACK);
                    } else if (count == 5) {
                        RoundLabelR5.setText(" Round : " + count + "  Hit : " + hitcount + "  Blow : " + blowcount
                                + "  " + DebugHaB[0] + "  " + DebugHaB[1] + "  " + DebugHaB[2] + "  " + DebugHaB[3]);
                        RoundLabelR5.setBounds(530, 180, 500, 30);
                        RoundLabelR5.setForeground(Color.BLACK);
                    } else if (count == 6) {
                        RoundLabelR6.setText(" Round : " + count + "  Hit : " + hitcount + "  Blow : " + blowcount
                                + "  " + DebugHaB[0] + "  " + DebugHaB[1] + "  " + DebugHaB[2] + "  " + DebugHaB[3]);
                        RoundLabelR6.setBounds(530, 210, 500, 30);
                        RoundLabelR6.setForeground(Color.BLACK);
                    } else if (count == 7) {
                        RoundLabelR7.setText(" Round : " + count + "  Hit : " + hitcount + "  Blow : " + blowcount
                                + "  " + DebugHaB[0] + "  " + DebugHaB[1] + "  " + DebugHaB[2] + "  " + DebugHaB[3]);
                        RoundLabelR7.setBounds(530, 240, 500, 30);
                        RoundLabelR7.setForeground(Color.BLACK);
                    } else if (count == 8) {
                        RoundLabelR8.setText(" Round : " + count + "  Hit : " + hitcount + "  Blow : " + blowcount
                                + "  " + DebugHaB[0] + "  " + DebugHaB[1] + "  " + DebugHaB[2] + "  " + DebugHaB[3]);
                        RoundLabelR8.setBounds(530, 270, 500, 30);
                        RoundLabelR8.setForeground(Color.BLACK);
                    }

                }
            }

        });
        //

        // JPanel_add
        HaBpanel.add(HaBcomI1);
        HaBpanel.add(HaBcomI2);
        HaBpanel.add(HaBcomI3);
        HaBpanel.add(HaBcomI4);
        HaBpanel.add(GoButton);
        HaBpanel.add(HitButton);
        HaBpanel.add(BlowButton);
        HaBpanel.add(Rbutton);
        HaBpanel.add(Tbutton);
        HaBpanel.add(RuleButton);
        HaBpanel.add(ProblemLabel);
        HaBpanel.add(TrueButton);
        HaBpanel.add(FalseButton);
        HaBpanel.add(ResultLabelI1);
        HaBpanel.add(ResultLabelI2);
        HaBpanel.add(ResultLabelI3);
        HaBpanel.add(ResultLabelI4);
        HaBpanel.add(ResultLabelI5);
        HaBpanel.add(RoundLabelR1);
        HaBpanel.add(RoundLabelR2);
        HaBpanel.add(RoundLabelR3);
        HaBpanel.add(RoundLabelR4);
        HaBpanel.add(RoundLabelR5);
        HaBpanel.add(RoundLabelR6);
        HaBpanel.add(RoundLabelR7);
        HaBpanel.add(RoundLabelR8);
        HaBpanel.add(BorderTop);
        HaBpanel.add(BorderBottom);

        HaBframe.add(HaBpanel);
        //

        HaBframe.setVisible(true);
    }
}