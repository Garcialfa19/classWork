package David.Figuras;

public class Rectangle {

    int sx;
    int sy;
    int swidth;
    int sheight;

    public Rectangle(int sx, int sy, int swidth, int sheight) {
        this.sx = sx;
        this.sy = sy;
        this.swidth = swidth;
        this.sheight = sheight;
    }

    public int getSx() {
        return sx;
    }

    public void setSx(int sx) {
        this.sx = sx;
    }

    public int getSy() {
        return sy;
    }

    public void setSy(int sy) {
        this.sy = sy;
    }

    public int getSwidth() {
        return swidth;
    }

    public void setSwidth(int swidth) {
        this.swidth = swidth;
    }

    public int getSheight() {
        return sheight;
    }

    public void setSheight(int sheight) {
        this.sheight = sheight;
    }
}
