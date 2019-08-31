package structural.flyweight.code;

import java.util.Objects;

public class ThickPen implements Pen {
     
    final BrushSize brushSize = BrushSize.THICK;    //intrinsic state - shareable
    private String color = null;                    //extrinsic state - supplied by client
     
    public void setColor(String color) {
        this.color = color;
    }
 
    @Override
    public void draw(String content) {
        System.out.println("Drawing THICK content in color : " + color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ThickPen)) return false;
        ThickPen thickPen = (ThickPen) o;
        return brushSize == thickPen.brushSize &&
                Objects.equals(color, thickPen.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brushSize, color);
    }
}