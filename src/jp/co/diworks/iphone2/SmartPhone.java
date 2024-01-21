package jp.co.diworks.iphone2;

//演習6
public class SmartPhone extends Phone implements Mp3Player, NewFunction {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

	//演習2
	public void play() {
		System.out.println("再生");
	}
	public void stop() {
		System.out.println("停止");
	}
	public void next() {
		System.out.println("次へ");
	}
	public void back() {
		System.out.println("戻る");
	}
	
}
