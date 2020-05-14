package Hanoi;

public class Main {

	public static void main(String[] args) {
		int n = 4;
		Hanoi h = new Hanoi();
		h.initialize(n);
		h.printPiles();
		//n: 円盤の枚数
		//0番の杭を二番に杭に一番の杭を経由している
		h.hanoi(n,0,2,1);
	}

}
