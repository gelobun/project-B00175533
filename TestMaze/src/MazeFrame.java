import java.util.Stack;

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
		generateMazeRandomDFS(0, 0);
		MazeSolverBFS();
		
	}
	
	
	public void generateMazeRandomDFS(int M, int N) {
		Stack stack = new Stack();
		
		Cell test = grid[0][0];
		
		
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[0].length; j++) {
				grid[i][j] = new Cell(i, j);
				int random = (int)(Math.random() * 30);
				System.out.print(random + "\t");
			}
			System.out.println();
		}
		
		stack.push(test);
		stack.pop();
		
			
	}
	
	public void MazeSolverBFS() {
		
		
		
	}
	
	public void initialiseGrid() {
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[0].length; j++) {
				grid[i][j] = new Cell(i, j);
			}
		}
		
	}
	
	public static void main(String[] args) {
		new MazeFrame().setVisible(true);
	}

}
