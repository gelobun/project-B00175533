import javax.swing.*;

public class MazeFrame extends JFrame {
	int M = 10; 
	int N = 10;
	Cell [][] grid = new Cell[M][N];
	
	public MazeFrame() {
		setTitle("perfect maze");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initialiseGrid();
		grid[0][0].right = false;
		grid[1][1].left = false;
		grid[0][0].bottom = false;
		grid[6][1].top = false;
		add(new MazeCanvas(grid));
	
		
	}
	
	public void GRandom() {
		// add more.
		
		// stack and queue
	}
	
	public void initialiseGrid() {
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[0].length; j++) {
				grid[i][j] = new Cell();
			}
		}
		
	}
	
	public static void main(String[] args) {
		new MazeFrame().setVisible(true);
	}

}
