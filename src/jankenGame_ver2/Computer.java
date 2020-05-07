package jankenGame_ver2;

import java.util.Random;

public class Computer {
	public static int decidesComHand(){
		Random random = new Random();
		int rnd = random.nextInt(3)+1; //1~3の乱数を取得

		if(rnd==1) Panel.contentsLabel.setText("グー");
		else if(rnd==2) Panel.contentsLabel.setText("チョキ");
		else if(rnd==3) Panel.contentsLabel.setText("パー");

		return rnd;
	}
}
