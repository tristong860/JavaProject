import java.*;

public class JavaProject extends java.applet.Applet {
 Graphics screen;
 int x;
 public void init() {
 x=5; //the starting x value for the square
 }//ends init
 public void paint(Graphics screen) {
 for (int count=1;count<100;count=count+1) {//repeat 100 times
 screen.setColor(Color.blue);
 screen.drawRect(x,10,30,30);

 //this next for loop is a dummy for loop which doesn't
 //have any instructions to execute, it just takes time
 //for the program to count up to 60000, which creates
 //the delay necessary for animation,you may have to
 //adjust that number depending on your computers speed

 for (int dummy=1;dummy<60000;dummy=dummy+1) { }
 screen.setColor(Color.white); //set to background color
 screen.fillRect(0,0,500,400);//fill in the whole background
 x=x+1;//before repeating loop, change x to new value of x+1
 }//ends outer for loop
 }//ends paint method
}//ends class 103b
