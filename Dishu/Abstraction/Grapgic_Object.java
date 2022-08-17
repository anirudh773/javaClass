
public abstract class Grapgic_Object {
    int x, y;

    void moveTo(int newX, int newY) {
        System.out.println("move to X :" + x + " and move to y:" + y);
    }

    abstract void draw();

    abstract void resize();
}