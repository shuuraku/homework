package box;

public class box {
    float length;
    float width;
    int height;
    public box(float length,float width,int height){
        this.length =length;
        this.width =width;
        this.height = height;
    }
    public boolean validat(float length,float width, int height){
        if(this.length >= length && this.width >= width && this.height >= height)
            return true;
        return false;
    }
}
