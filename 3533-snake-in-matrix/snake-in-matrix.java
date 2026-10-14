
class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int row = 0, col = 0;

        for (int i = 0; i < commands.size(); i++) {
            String s = commands.get(i);

            if (s.equals("RIGHT")) {
                col++;
            }
            else if (s.equals("LEFT")) {
                col--;
            }
            else if (s.equals("UP")) {
                row--;
            }
            else if (s.equals("DOWN")) {
                row++;
            }
        }

        return row * n + col;
    }
}
