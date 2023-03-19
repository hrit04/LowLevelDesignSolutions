package main.java.SnakeAndLadder;

public class Player {

    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    int currentPosition;

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public Player(String id, int currentPosition) {
        this.id = id;
        this.currentPosition = currentPosition;
    }

}

