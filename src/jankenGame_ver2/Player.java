package jankenGame_ver2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Player implements ActionListener{

	//ボタン作成
	public static void createButton(JPanel footerPanel){
		//ボタンを表示
		JButton btnStone = new JButton("グー");
		btnStone = setButton(btnStone);
		footerPanel.add(btnStone,BorderLayout.WEST);

		JButton btnScissors = new JButton("チョキ");
		btnScissors = setButton(btnScissors);
		footerPanel.add(btnScissors,BorderLayout.CENTER);

		JButton btnPaper = new JButton("パー");
		btnPaper = setButton(btnPaper);
		footerPanel.add(btnPaper,BorderLayout.EAST);

	}
	//ボタン設定
	public static JButton setButton(JButton btn){
		int btnSizeX = (640-20)/3;
		btn.setPreferredSize(new Dimension(btnSizeX,50));
		btn.setFont(new Font("MSゴシック",Font.PLAIN,24));


		Player ply = new Player();
		btn.addActionListener(ply);

		return btn;
	}

	public void actionPerformed(ActionEvent e){
		String cmd = e.getActionCommand();
		int plyHand = 0;

		if(cmd.equals("グー")) plyHand = 1;
		else if(cmd.equals("チョキ")) plyHand = 2;
		else if(cmd.equals("パー")) plyHand = 3;

		if(plyHand == 1) Panel.contentsLabel.setText("グー");
		else if(plyHand == 2) Panel.contentsLabel.setText("チョキ");
		else if(plyHand == 3) Panel.contentsLabel.setText("パー");

		int comHand = Computer.decidesComHand();
		VictoryOrDefeat.decisionVictoryOrDefeat(comHand, plyHand);

	}

}
