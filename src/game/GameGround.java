package game;

public class GameGround implements KeyAcepptable {
    private int mapSize;
    private boolean stateRunning;
    private int[] keyQueue;
    private int keyQueueSize;

    public GameGround() {
        mapSize = 5;
        keyQueue = new int[1];
        keyQueueSize = 0;
    }
    public int getMapSize() {
        return mapSize;
    }
    protected int getKey() {
        int key = keyQueue[keyQueueSize - 1];
        keyQueueSize--;
        return key;
    }
    @Override
    public void setKey(int key) {
        if (this.keyQueueSize < this.keyQueue.length) {
            this.keyQueueSize++;
        }
        this.key[this.keyQueueSize - 1] = key;
    }
}
