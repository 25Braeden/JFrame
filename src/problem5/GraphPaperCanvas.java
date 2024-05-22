package problem5;
import java.awt.*;

class GraphPaperCanvas extends Canvas
{
    private Image vm;

    public GraphPaperCanvas( Image vm )
    {
        this.vm = vm;
        setBackground( Color.white );
    }

    public void setVm( Image vm )
    {
        this.vm = vm;
    }

    public void paint( Graphics g )
    {
        g.drawImage(vm,0,0,this);
    }

    public void update(Graphics g) { paint(g); }	// don't clear screen on repaint

}