public void paint(Graphics g)
{
   g.setColor(Color.yellow);
   g.fillOval(350, 300, 300, 300);
   g.setColor(Color.blue);
   g.fillOval(425, 400, 50, 50);
   g.fillOval(525, 400, 50, 50);
   g.setColor(Color.red);
   g.drawArc(425, 450, 150, 100, 0, -180);
}
