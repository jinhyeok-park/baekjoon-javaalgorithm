package gold.beak2206;

import java.util.*;

public class Beak2206 {

    static int[] nx = new int[] {1, -1, 0, 0};
    static int[] ny = new int[] {0, 0, -1, 1};
    static int col;
    static int row;
    static Queue<int[]> queue = new LinkedList();
    static int[] isVisited;
    static Stack<Integer> rootValue = new Stack();
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String input = sc.nextLine();

       String[] temp = input.split(" ");
       row = Integer.parseInt(temp[0]);
       col = Integer.parseInt(temp[1]);
       
       int[][] map = new int[row][col];
       for (int i = 0 ; i < row ; i++) {
        input = sc.nextLine();
            for (int j = 0 ; j < col ; j++) {
                map[i][j] = input.charAt(j) - 48;
            }
       }
       int[] startPoint = new int[] {0,0};
       queue.add(startPoint);
       System.out.println(bfs(map));


       mapViewer(map);
    }

    public static int bfs(int[][] map) {
        int result = 0;
        if (queue.size() == 0) {
            return 0;
        }
        int wallBreaker = 4;
        while (!queue.isEmpty()) {
            int[] point = queue.remove();
            int x = point[0];
            int y = point[1];
            for (int i = 0 ; i < 4 ; i ++) {
                x += nx[i];
                y += ny[i];
                if (x >= row || y >= col || x < 0 || y < 0)
                    continue;
                if (wallBreaker > 0){
                    map[x][y] = 0;
                    wallBreaker--;
                }
                if (map[x][y] == 0) {
                    int[] temp = new int[] {x, y};
                    queue.add(temp);

                    break ;
                }
            }
        }

        return result;
    }

    public static void mapViewer(int[][] map) {
        System.out.println("");
       for (int i = 0 ; i < row ; i++) {
        for (int j = 0 ; j < col; j++) {
            System.out.print(map[i][j]);
        }
        System.out.println("");
       }
       System.out.println("");
    }
}