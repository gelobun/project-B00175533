
public class Cell {

	boolean left, right, top, bottom;
	
	boolean visited;
	
	int row;
	int col;
	
	public Cell(int r, int c) {
		visited = false;
		row = r;
		col = c;
		left = right = top = bottom = true;
		
	}
	
	
	
	//Cell[][] grid = new Cell[0][0];
}
