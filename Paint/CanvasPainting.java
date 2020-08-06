package Paint;

public class CanvasPainting {
    public static void main(String args[]){
        Canvas canvas = new Canvas(10,20);
        displayColoredCanvas(canvas);
        System.out.println();
        draw(canvas, 1, 1, 3, 4);
        draw(canvas,2,3,6,6);

        displayColoredCanvas(canvas);
        System.out.println();
        Color color1 = new Color();
        color1.setColor('R');
        Color color2 = new Color();
        color2.setColor('B');
        Color color3 = new Color();
        color3.setColor('G');
        fill(canvas,color1,2,2);
        fill(canvas,color2,5,4);
        fill(canvas,color3,8,2);
        displayColoredCanvas(canvas);

    }

    private static void draw(Canvas canvas, int topLeftx, int topfety, int bottomrightx, int bottomrighty) {
        canvas.draw(topLeftx,topfety, bottomrightx, bottomrighty);
    }

    private static void displayColoredCanvas(Canvas canvas) {
        canvas.display();
    }

    public static void fill(Canvas canvas, Color color, int x, int y){
        canvas.fillColor(color,x,y);
    }


}
class Color{
   private char color;

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }
}
class Canvas {
    private static char mat[][];
    private static int pixel_X;
    private static int pixel_Y;

    public Canvas(int pixelX, int pixelY){
        pixel_X = pixelX+1;
        pixel_Y = pixelY+1;
        createMatrix(pixel_X, pixel_Y);
    }

    private void createMatrix(int pixelX, int pixelY) {
        mat = new char[pixelX][pixelY];
        for(int i=0;i<pixelX;i++){
            for(int j=0;j<pixelY;j++){
                if(i==0 || j==0 || i==pixelX-1 || j==pixelY-1) {
                    mat[i][j] = '*';
                }
            }
        }
    }

    public void fillColor(Color color, int x, int y) {
        if(x<=0 || x>=pixel_X-1 || y<=0 || y>=pixel_Y-1){
            return;
        }

        if(mat[x][y]!='*' && mat[x][y]!=color.getColor()){
            mat[x][y]=color.getColor();
            fillColor(color,x, y+1);
            fillColor(color,x,y-1);
            fillColor(color,x-1,y);
            fillColor(color,x+1,y);
        }
    }

    public void display() {
        for(int i=0;i<pixel_X;i++){
            for(int j=0;j<pixel_Y;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void draw(int topLeftx, int topfety, int bottomrightx, int bottomrighty) {
        for(int i=topLeftx;i<=bottomrightx;i++){
            for(int j=topfety;j<=bottomrighty;j++){
                if(i==topLeftx || i==bottomrightx || j == topfety || j == bottomrighty)
                        mat[i][j]='*';
            }
        }
    }
}
