import java.util.*;


public class beak7576 {

    static int day = 0;
    static int rowSize = 0;
    static int colSize = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = null;
        input = sc.nextLine();
        // System.out.print(input);

        List<Map<Integer, Integer>> startPoints = new ArrayList<>();
        String row;
        String col;
        String[] temp;
        temp = input.split(" ");
        row = temp[0];
        col = temp[1];
        rowSize = Integer.parseInt(row);
        colSize = Integer.parseInt(col);
        int startX = 0;
        int startY = 0;

        String[][] tomaotoMap = new String[rowSize][colSize];
        for (int i = 0 ; i < colSize ; i++) {
            input = sc.nextLine();
            temp = input.split(" ");
            for (int j = 0 ; j < rowSize ; j++) {
                tomaotoMap[j][i] = temp[j];
                if (temp[j].equals("1")) {
                    startX = i;
                    startY = j;
                    Map<Integer, Integer> startPosition = new HashMap<>();
                    startPosition.put(startX, startY);
                    startPoints.add(startPosition);
                }
            }
        }
        Stack<Map<Integer, Integer>> stack = new Stack();
        Stack<List<Map<Integer, Integer>>> test =  new Stack();
        Queue<List<Map<Integer,Integer>>> test2 = new LinkedList<>();
        test.push(startPoints);
        test2.add(startPoints);
        dfs(tomaotoMap, test2);
        System.out.println("");
        mapPrinter(tomaotoMap, rowSize, colSize);
    }

    public static void dfs(String[][] map, Queue<List<Map<Integer,Integer>>> stack) {
        Integer x = 0;
        Integer y = 0;
        if (stack.size() == 0) {
            return ;
        }
        if (isDone(map)) {
            System.out.println(day);
            return ;
        }
        int tee = stack.size();
        
        while (tee-- > 0) {

        List<Map<Integer, Integer>> position = stack.remove();
        for (Map<Integer, Integer> point : position) {
            List<Map<Integer, Integer>> awe = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : point.entrySet()) {
                x = entry.getKey();
                y = entry.getValue();
            }
            for (int i = 0 ; i < 4 ; i ++) {
                Map<Integer, Integer> currentPoint = new HashMap<>();
                Map<Integer, Integer> target = fourWay(i, x, y);
                Integer postX = 0;
                Integer postY = 0;
                for (Map.Entry<Integer, Integer> ent : target.entrySet()) {
                    postX = ent.getKey();
                    postY = ent.getValue();
                }
                if (postX >= colSize || postY >= rowSize || postX < 0 || postY < 0) {
                    continue;
                }
                if (map[postY][postX].equals("-1") || map[postY][postX].equals("1")) {
                    continue;
                }
                map[postY][postX] = "1";
                currentPoint.put(postX, postY);
                awe.add(currentPoint);
            }
            stack.add(awe);
        }
        }
        // mapPrinter(map, rowSize, colSize);
        day++;
        if (isDone(map) == false && stack.size() > 0) {
            dfs(map, stack);
        } else {
            if (isDone(map) == false && stack.size() == 0) {
                System.out.println("-1");
                return ;
            }
            System.out.print(day);
        }
    }

    public static boolean isDone (String[][] map) {
        boolean result = true;
        for (int i = 0 ; i < colSize; i ++)  {
            for (int j = 0 ; j < rowSize ; j++) {
                if (map[j][i].equals("0")) {
                    return false;
                }
            }
        }
        return result;
    }

    public static Map<Integer, Integer> fourWay(int input, Integer x, Integer y) {
        Map<Integer, Integer> result = new HashMap<>();
        if (input == 0) {
            result.put(x + 1, y);
        } else if (input == 1) {
            result.put(x - 1, y);
        } else if (input == 2) {
            result.put(x, y + 1);
        } else if (input == 3) {
            result.put(x, y - 1);
        }

        return result;
    }

    public static void mapPrinter(String[][] map, int row, int col) {
        for (int i = 0 ; i < col ; i++) {
            for (int j = 0 ; j < row; j ++) {
                System.out.print(map[j][i] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
