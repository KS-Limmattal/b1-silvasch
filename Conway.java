import java.util.concurrent.TimeUnit;

class Vector2 {
  public int x;
  public int y;

  Vector2(int n, int m) {
    x = n;
    y = m;
  }
}

class Board {
  boolean[] board;
  int width;
  int height;

  Board(int n, int m) {
    super();
    width = n;
    height = m;
    board = new boolean[height * width];
  }

  public void setAlive(int x, int y) {
    int index = coordsToIndex(x, y);
    board[index] = true;
  }

  public void setDead(int x, int y) {
    int index = coordsToIndex(x, y);
    board[index] = false;
  }

  public boolean isAlive(int x, int y) {
    int index = coordsToIndex(x, y);
    return board[index];
  }

  public int countNeighbours(int x, int y) {
    Vector2[] offsets = new Vector2[]{
      new Vector2(-1, -1),
      new Vector2(-1, 0),
      new Vector2(-1, 1),
      new Vector2(0, -1),
      new Vector2(0, 1),
      new Vector2(1, -1),
      new Vector2(1, 0),
      new Vector2(1, 1),
    };

    int neighbourCount = 0;

    for (Vector2 offset: offsets) {
      int offsetX = offset.x + x;
      int offsetY = offset.y + y;

      if (offsetX < 0 || offsetX >= width || offsetY < 0 || offsetY >= height) {
        continue;
      }

      int index = coordsToIndex(offsetX, offsetY);
      if (board[index]) {
        neighbourCount += 1;
      }
    }

    return neighbourCount;
  }

  void fillRandom() {
    for (int i = 0; i < board.length; i++) {
      board[i] = Math.random() < 0.5;
    }
  }

  int coordsToIndex(int x, int y) {
    return width * y + x;
  }

  void print() {
    for (int i = 0; i < board.length; i++) {
      if (board[i]) {
        System.out.print("o");
      } else {
        System.out.print("_");
      }
      if ((i + 1) % width == 0) {
        System.out.println();
      }
    }
  }
}

public class Conway {
  public static void main(String[] args) {
    int n = 20;
    int m = 20;
    int numOfGenerations = 10;
    
    Board board = new Board(n, m);
    board.setAlive(0, 17);
    board.setAlive(1, 17);
    board.setAlive(2, 17);
    board.setAlive(2, 18);
    board.setAlive(1, 19);

    for (int i = 0; i < numOfGenerations; i++) {
      board.print();
      System.out.println();

      try { TimeUnit.MILLISECONDS.sleep(500); } catch(Exception e) {};

      Board newBoard = new Board(board.width, board.height);

      for (int x = 0; x < board.width; x++) {
        for (int y = 0; y < board.height; y++) {
          int neighbours = board.countNeighbours(x, y);
          boolean isAlive = board.isAlive(x, y);
          
          if (isAlive && neighbours < 2) {
            newBoard.setDead(x, y);
          }

          if (isAlive && neighbours > 3) {
            newBoard.setDead(x, y);
          }

          if (isAlive && (neighbours == 2 || neighbours == 3)) {
            newBoard.setAlive(x, y);
          }

          if (!isAlive && neighbours == 3) {
            newBoard.setAlive(x, y);
          }
        }
      }

      board = newBoard;
    }
  }
}
