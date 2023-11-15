import processing.core.PApplet;

/**
* A program that draws a pattern chattering emojis and lollipops that change colour.
* @author: B. Au
*/

public class Sketch extends PApplet {
	  
  public void settings() {
	  // Size of screen
    size(400, 400);
  }

  public void setup() {
    // Background colour of screen
    background(255);
  }

  public void draw() {
      // Draws yellow emoji
      for (int y = 40; y <= 340; y += 100) {
        for (int x = 50; x <= 350; x += 100) {
            emoji(x, y, 40, 40);
        }
     }
      
      // Draws lollipops
      for (int intSecondY = 80; intSecondY < 380; intSecondY += 100){
        for (int intSecondX = 100; intSecondX < 390; intSecondX += 100){
          stickLollipop(intSecondX, intSecondY, 15, 15, (float) 0.5 * intSecondY + 50, (float) 0.57 * intSecondY + 20, (float) 0.8 * intSecondY + 20);
        }
      }
    
      // Draws a circle with the colour of parameters to the right of the mouse
      int colourMouse = readColour(20);
      fill(colourMouse);
      stroke(0);
      if(mousePressed){
        ellipse(mouseX, mouseY, 10, 10);
        }
      }

  /**
   * Draws an emoji at different locations specified by the method parameters
   * @author B. Au
   * @param emojiX is the x coordinate 
   * @param emojiY is the y coordinate
   * @param emojiWidth is the width
   * @param emojiHeight is the height
   */
  public void emoji(float emojiX, float emojiY, float emojiWidth, float emojiHeight) {
    
    // Face middle
    stroke(0);
    fill(254, 234, 30);
    ellipse(emojiX, emojiY, emojiWidth, emojiHeight);

    // Mouth
    stroke(0);
    fill(255);
    rect(emojiX - 10, emojiY + 5, emojiWidth - 20, emojiHeight - 35);

    // teeth
    stroke(0);
    fill(255);
    line(emojiX - 10, emojiY + 8, emojiX + 9, emojiY + 8);

    stroke(0);
    fill(255);
    line(emojiX - 5, emojiY + 5, emojiX - 5, emojiY + 10);

    stroke(0);
    fill(255);
    line(emojiX, emojiY + 5, emojiX, emojiY + 10);

    stroke(0);
    fill(255);
    line(emojiX + 5, emojiY + 5, emojiX + 5, emojiY + 10);

    // Eyes
    stroke(0);
    fill(0);
    ellipse(emojiX - 8, emojiY - 5, emojiWidth - 35, emojiHeight - 30);

    stroke(0);
    fill(0);
    ellipse(emojiX + 8, emojiY - 5, emojiWidth - 35, emojiHeight - 30);
  }

 /**
   * Draws lollipops at various locations with changing colours specified by the method parameters
   * @author B. Au
   * @param lollipopX is the X coordinate 
   * @param lollipopY is the Y coordinate
   * @param lollipopWidth is the width 
   * @param lollipopHeight is the height
   * @param colourR is the Red in RGB
   * @param colourG is the Green in RGB
   * @param colourB is the Blue in RGB
   */
  public void stickLollipop(float lollipopX, float lollipopY, float lollipopWidth, float lollipopHeight, float colourR, float colourG, float colourB) {
    // lollipop outer loop
    stroke(colourR, colourG, colourB);
    fill(235, 137, 52);
    ellipse(lollipopX, lollipopY, lollipopWidth, lollipopHeight);

    // lollipop head
    stroke(colourR, colourG, colourB);
    fill(190, 232, 50);
    triangle(lollipopX - 8, lollipopY - 8, lollipopX + 8, lollipopY - 8, lollipopX, lollipopY - 20);

    // Second section of lollipop
    stroke(colourR, colourG, colourB);
    fill(135, 130, 60);
    ellipse(lollipopX, lollipopY, lollipopWidth - 5, lollipopHeight - 5);

    // Center of lollipop
    stroke(colourR, colourG, colourB);
    fill(232, 51, 22);
    ellipse(lollipopX, lollipopY, lollipopWidth - 10, lollipopHeight - 10);

    // Stick of lollipop
    stroke(colourR, colourG, colourB);
    noFill();
    line(lollipopX, lollipopY + 8, lollipopX, lollipopY + 28);

  }
  
  /**
   * Draws colour of pixel that is right of the mouse
   * @author B. Au
   * @param intPixel the pixels to the right of mouse
   * @return the colour of the pixel that is the parameter to the right of the mouse when pressed
   */
  public int readColour(int intPixels){
    if(mousePressed){
      return get(mouseX + intPixels, mouseY);
    }
    else{
      return color(0);
    }
  }
}