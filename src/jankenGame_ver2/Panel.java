package jankenGame_ver2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel {

	public static JLabel headerLabel;
	public static JLabel contentsLabel;

	public static void createPanel(JFrame frame){
		//ヘッダーパネル
		JPanel headerPanel = setPanel(Color.BLACK,new Dimension(640,50)); //パネルを生成
		headerLabel = setFont(Color.WHITE,new JLabel("さあ、じゃんけんで勝負だ！"),24); //ラベルを生
		headerPanel.add(headerLabel); //パネルにラベルを追加
		frame.add(headerPanel,BorderLayout.NORTH); //フレームにパネルを追加

		//コンテンツパネル
		JPanel contentsPanel = setPanel(Color.WHITE,new Dimension(640,380));
		contentsLabel = setFont(Color.BLACK,new JLabel("じゃんけん..."),50);
		contentsPanel.add(contentsLabel);
		frame.add(contentsPanel,BorderLayout.CENTER);

		//フッターパネル
		JPanel footerPanel = setPanel(Color.BLACK,new Dimension(640,50));
		Player.createButton(footerPanel); //パネルにボタンを追加
		frame.add(footerPanel,BorderLayout.SOUTH); //パネルをフレームに追加

	}

	//パネル作成
	public static JPanel setPanel(Color clr,Dimension dim){
		JPanel panel = new JPanel(); //パネル生成
		panel.setPreferredSize(dim); //Dimensionオブジェクトを通じてパネルサイズを設定
		panel.setLayout(new BorderLayout());
		panel.setBackground(clr);

		return panel;
	}

	//ラベルフォント設定
	public static JLabel setFont(Color clr,JLabel label,int fontsize){
		label.setForeground(clr);
		label.setFont(new Font("MSゴシック",Font.PLAIN,fontsize));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);

		return label;
	}
}
