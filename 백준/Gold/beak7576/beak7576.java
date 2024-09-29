import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class beakre7576 {

    static Integer row = 0;
    static Integer col = 0;
    static Queue<int[]> que = new LinkedList<>();
    static int[] forX = new int[] {1, -1 ,0 ,0};
    static int[] forY = new int[] {0, 0, 1, -1};


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] temp = input.split(" ");

        col = Integer.parseInt(temp[0]);
        row = Integer.parseInt(temp[1]);
        Integer[][] map = new Integer[row][col];

        for (int i = 0 ; i < row ; i++) {
            input = sc.nextLine();
            temp = input.split(" ");
            for (int j = 0 ; j < col ; j++) {
                map[i][j] = Integer.parseInt(temp[j]);
                if (map[i][j] == 1) {
                    int[] t1 = new int[] {i, j};
                    que.add(t1);
                }
            }
        }
        if (isDone(map)) {
            System.out.println("0");
            return;
        }
        System.out.println(bfs(map));
    }

    static public boolean isDone(Integer[][] map) {
        for (int i = 0 ; i < row ; i++) {
            for (int j = 0 ; j < col ; j++) {
                if (map[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    static public void mapPrinter(Integer[][] map) {
        for (int i = 0 ; i < row ; i ++) {
            for (int j = 0 ; j < col ; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    static public Integer bfs(Integer[][] map) {
        Integer result = 0;
        if (que.size() == 0)
            return -1;
        int queueSize = que.size();
        while (!que.isEmpty()) {
            queueSize--;
            int[] point = que.remove();
            int x = point[0];
            int y = point[1];
            for (int i = 0 ; i < 4 ; i++) {
                int curX = forX[i] + x;
                int curY = forY[i] + y;
                if (curX >= row || curY >= col || curX < 0 || curY < 0)
                    continue ;
                if (map[curX][curY] == -1 || map[curX][curY] == 1)
                    continue;
                if (map[curX][curY] == 0) {
                    int[] temp2 = new int[] {curX, curY};
                    map[curX][curY] = 1;
                    que.add(temp2);
                }
            }
            if (queueSize == 0) {
                queueSize = que.size();
                result++;
                mapPrinter(map);
                if (isDone(map))
                    return result;
            }
        }

        return -1;
    }
}