//
public class DoorApplication {
    public static void main(String[] args) {
        Door door = new Door(1236546);
        Door door1 = new Door(54647);
        Key key = new Key();
        key.open(door);
    }
}