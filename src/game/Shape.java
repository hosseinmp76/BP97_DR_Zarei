package game;

public enum Shape {
	zard(new boolean[][][] {
		{
			{true, false,false, false,false},
			{true, true, true, false,false},
			{false,false,true, false,false},
			{false,false,false,false,false},
			{false,false,false,false,false}
		},
		{
			{false,true,true, false,false},
			{false,true,false,false,false},
			{true ,true,false,false,false},
			{false,false,false, false,false},
			{false, false, false, false,false}
		},
		{
			{true,false,false, false,false},
			{true, true, true, false,false},
			{false,false,true, false,false},
			{false,false,false,false,false},
			{false,false,false,false,false}
		},
		{
			{false,true,true, false,false},
			{false,true,false,false,false},
			{true ,true,false,false,false},
			{false,false,false, false,false},
			{false, false, false, false,false}
		}
	}),
	sabz(new boolean[][][] {
		{
			{true, true, true, false,false},
			{false,false,true, false,false},
			{false,false,true, false,false},
			{false,false,false,false,false},
			{false,false,false,false,false}
		},
		{
			{false,false, true, false,false},
			{false,false,true, false,false},
			{true, true,true, false,false},
			{false,false,false,false,false},
			{false,false,false,false,false}
		},
		{
			{true,false,false, false,false},
			{true, false,false,false,false},
			{true, true, true, false,false},
			{false,false,false,false,false},
			{false,false,false,false,false}
		},
		{
			{true,true, true,false,false},
			{true,false,false,false,false},
			{true,false,false,false,false},
			{false,false,false, false,false},
			{false, false, false, false,false}
		}
	}),
	kamnarenji(new boolean[][][] {
		{
			{true, true, true, false,false},
			{true, true, false, false,false},
			{false,false,false, false,false},
			{false,false,false,false,false},
			{false,false,false,false,false}
		},
		{
			{true, true, false,false,false},
			{true, true, false, false,false},
			{false,true, false, false,false},
			{false,false,false,false,false},
			{false,false,false,false,false}
		},
		{
			{false,true, true, false,false},
			{true ,true, true, false, false},
			{false,false, false, false,false},
			{false,false,false,false,false},
			{false,false,false,false,false}
		},
		{
			{true,false, false, false,false},
			{true ,true,false, false, false},
			{true,true, false, false,false},
			{false,false,false,false,false},
			{false,false,false,false,false}
		}
	}),
	kamsabz(new boolean[][][] {
		{
			{true, true, true, false,false},
			{false,false,true, true,false},
			{false,false,false, false,false},
			{false,false,false,false,false},
			{false,false,false,false,false}
		},
		{
			{false, true,false, false,false},
			{false,true,false, false,false},
			{true,true,false, false,false},
			{true,false,false,false,false},
			{false,false,false,false,false}
		},
		{
			{true, true, false, false,false},
			{false,true,true, true,false},
			{false,false,false, false,false},
			{false,false,false,false,false},
			{false,false,false,false,false}
		},
		{
			{false, true,false, false,false},
			{true,true,false, false,false},
			{true,false,false, false,false},
			{true,false,false,false,false},
			{false,false,false,false,false}
		}
	}),
	ghermez(new boolean[][][] {
		{
			{true,false,false, false,false},
			{true, true, true, false,false},
			{true,false,false, false,false},
			{false,false,false,false,false},
			{false,false,false,false,false}
		},
		{
			{true,true,true, false,false},
			{false,true,false,false,false},
			{false,true,false,false,false},
			{false,false,false, false,false},
			{false, false, false, false,false}
		},
		{
			{true,false,false, false,false},
			{true, true, true, false,false},
			{false,false,true, false,false},
			{false,false,false,false,false},
			{false,false,false,false,false}
		},
		{
			{false,true,true, false,false},
			{false,true,false,false,false},
			{true ,true,false,false,false},
			{false,false,false, false,false},
			{false, false, false, false,false}
		}
	}),
	ghahvei(new boolean[][][] {
		{
			{true, true,false, false,false},
			{false,true, false, false,false},
			{true ,true,false, false,false},
			{false,false,false,false,false},
			{false,false,false,false,false}
		},
		{
			{false,true,true, false,false},
			{false,true,false,false,false},
			{true ,true,false,false,false},
			{false,false,false, false,false},
			{false, false, false, false,false}
		},
		{
			{true,false,false, false,false},
			{true, true, true, false,false},
			{false,false,true, false,false},
			{false,false,false,false,false},
			{false,false,false,false,false}
		},
		{
			{false,true,true, false,false},
			{false,true,false,false,false},
			{true ,true,false,false,false},
			{false,false,false, false,false},
			{false, false, false, false,false}
		}
	}),
	soorati(new boolean[][][] {
		{
			{true, true, true, true,false},
			{false,true, false, false,false},
			{false,false,false, false,false},
			{false,false,false,false,false},
			{false,false,false,false,false}
		},
		{
			{false,true,true, false,false},
			{false,true,false,false,false},
			{true ,true,false,false,false},
			{false,false,false, false,false},
			{false, false, false, false,false}
		},
		{
			{true,false,false, false,false},
			{true, true, true, false,false},
			{false,false,true, false,false},
			{false,false,false,false,false},
			{false,false,false,false,false}
		},
		{
			{false,true,true, false,false},
			{false,true,false,false,false},
			{true ,true,false,false,false},
			{false,false,false, false,false},
			{false, false, false, false,false}
		}
	}),
	banafsh(new boolean[][][] {
		{
			{true, true, false, false,false},
			{false,true, true, false,false},
			{false,false,true, false,false},
			{false,false,false,false,false},
			{false,false,false,false,false}
		},
		{
			{false,true,true, false,false},
			{false,true,false,false,false},
			{true ,true,false,false,false},
			{false,false,false, false,false},
			{false, false, false, false,false}
		},
		{
			{true,false,false, false,false},
			{true, true, true, false,false},
			{false,false,true, false,false},
			{false,false,false,false,false},
			{false,false,false,false,false}
		},
		{
			{false,true,true, false,false},
			{false,true,false,false,false},
			{true ,true,false,false,false},
			{false,false,false, false,false},
			{false, false, false, false,false}
		}
	}),
	nili(new boolean[][][] {
		{
			{false, true,false, false,false},
			{true, true, true, false,false},
			{false,true,false, false,false},
			{false,false,false,false,false},
			{false,false,false,false,false}
		},
		{
			{false,true,true, false,false},
			{false,true,false,false,false},
			{true ,true,false,false,false},
			{false,false,false, false,false},
			{false, false, false, false,false}
		},
		{
			{true,false,false, false,false},
			{true, true, true, false,false},
			{false,false,true, false,false},
			{false,false,false,false,false},
			{false,false,false,false,false}
		},
		{
			{false,true,true, false,false},
			{false,true,false,false,false},
			{true ,true,false,false,false},
			{false,false,false, false,false},
			{false, false, false, false,false}
		}
	}),
	abi(new boolean[][][] {
		{
			{true, true, true, true,true},
			{false,false, false, false,false},
			{false,false,false, false,false},
			{false,false,false,false,false},
			{false,false,false,false,false}
		},
		{
			{false,true,true, false,false},
			{false,true,false,false,false},
			{true ,true,false,false,false},
			{false,false,false, false,false},
			{false, false, false, false,false}
		},
		{
			{true,false,false, false,false},
			{true, true, true, false,false},
			{false,false,true, false,false},
			{false,false,false,false,false},
			{false,false,false,false,false}
		},
		{
			{false,true,true, false,false},
			{false,true,false,false,false},
			{true ,true,false,false,false},
			{false,false,false, false,false},
			{false, false, false, false,false}
		}
	}),
	narenji(new boolean[][][] {
		{
			{true, true, true, true,false},
			{true, false, false, false,false},
			{false,false,false, false,false},
			{false,false,false,false,false},
			{false,false,false,false,false}
		},
		{
			{false,true,true, false,false},
			{false,true,false,false,false},
			{true ,true,false,false,false},
			{false,false,false, false,false},
			{false, false, false, false,false}
		},
		{
			{true,false,false, false,false},
			{true, true, true, false,false},
			{false,false,true, false,false},
			{false,false,false,false,false},
			{false,false,false,false,false}
		},
		{
			{false,true,true, false,false},
			{false,true,false,false,false},
			{true ,true,false,false,false},
			{false,false,false, false,false},
			{false, false, false, false,false}
		}
	}),
	toosi(new boolean[][][] {
		{
			{true, false,false, false,false},
			{true, true, true, false,false},
			{false,true,false, false,false},
			{false,false,false,false,false},
			{false,false,false,false,false}
		},
		{
			{false,true,true, false,false},
			{false,true,false,false,false},
			{true ,true,false,false,false},
			{false,false,false, false,false},
			{false, false, false, false,false}
		},
		{
			{true,false,false, false,false},
			{true, true, true, false,false},
			{false,false,true, false,false},
			{false,false,false,false,false},
			{false,false,false,false,false}
		},
		{
			{false,true,true, false,false},
			{false,true,false,false,false},
			{true ,true,false,false,false},
			{false,false,false, false,false},
			{false, false, false, false,false}
		}
	})
	;
	
	int dir, i, j;
	boolean[][][] positions;
	Shape(boolean[][][] positions) {
		this.positions = positions;
	}

	public void printPosition() {
		System.out.println(name() + " direction: " + dir + " in (" + i + ", " + j + ")");
	}

	public boolean fit(int r, int c, boolean[][] board, int dir) {
		int rr=r, cc=c;
		o:for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				if (positions[dir][i][j]) {
					rr = i;
					cc = j;
					break o;
				}
			}
		}
		boolean canfit = true;
		o:for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				if (positions[dir][i][j] && ((r+(i-rr)<0) || (r+(i-rr)>=10) || (c+(j-cc)<0) || (c+(j-cc)>=6) || board[r+(i-rr)][c+(j-cc)])) {
					canfit = false;
					break o;
				}
			}
		}
		if (canfit) {
			for (int i=0;i<5;i++) {
				for (int j=0;j<5;j++) {
					if (positions[dir][i][j]) {
						board[r+(i-rr)][c+(j-cc)] = true;
					}
				}
			}
			this.dir = dir;
			this.i = r;
			this.j = c;
		}
		return canfit;
	}
	
	public void unfit(int r, int c, boolean[][] board, int dir) {
		int rr=r, cc=c;
		o:for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				if (positions[dir][i][j]) {
					rr = i;
					cc = j;
					break o;
				}
			}
		}
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				if (positions[dir][i][j]) {
					board[r+(i-rr)][c+(j-cc)] = false;
				}
			}
		}
	}
}