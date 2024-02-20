package game;

public class Snake implements KeyAcepptable {
    public class Body {
        int x, y;
        public Body() {
        }
        public Body(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }
    }
    private int size, key;
    private Body[] bodys;
    public Snake(int mapSize) {
        bodys = new Body[mapSize];
        size = 1;
        bodys[0] = new Body();
    }
    @Override
    public void setKey(int key) {
        this.key = key;
    }
}
