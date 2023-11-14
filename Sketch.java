import processing.core.PApplet;

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
      
      // Draws stick figures
      for (int intSecondY = 90; intSecondY < 390; intSecondY += 100){
        for (int intSecondX = 80; intSecondX < 380; intSecondX += 100){
          stickFigure(intSecondX, intSecondY, 15, 15, (float) 0.5 * intSecondY + 50, (float) 0.57 * intSecondY + 20, (float) 0.8 * intSecondY + 20);
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
   * @param emojiX is the x coordinate 
   * @param emojiY is the y coordinate
   * @param emojiWidth is the width
   * @param emojiHeight is the height
   */
  public void emoji(float emojiX, float emojiY, float emojiWidth, float emojiHeight) {
    
    // Sun middle
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
   * Draws stick figures at various locations with changing colours specified by the method parameters
   * @param stickX is the X coordinate 
   * @param stickY is the Y coordinate
   * @param stickWidth is the width 
   * @param stickHeight is the height
   * @param colourR is the Red in RGB
   * @param colourG is the Green in RGB
   * @param colourB is the Blue in RGB
   */
  public void stickFigure(float stickX, float stickY, float stickWidth, float stickHeight, float colourR, float colourG, float colourB) {
    // Head of stick figure
    stroke(colourR, colourG, colourB);
    noFill();
    ellipse(stickX, stickY, stickWidth, stickHeight);

    // Body of stick figure
    stroke(colourR, colourG, colourB);
    noFill();
    line(stickX, stickY + 8, stickX, stickY + 28);

    // Right arm of stick figure
    stroke(colourR, colourG, colourB);
    noFill();
    line(stickX, stickY + 14, stickX + 14, stickY + 6);

    // Left arm of stick figure
    stroke(colourR, colourG, colourB);
    noFill();
    line(stickX, stickY + 14, stickX - 7, stickY + 24);

    // Right leg of stick figure
    stroke(colourR, colourG, colourB);
    noFill();
    line(stickX, stickY + 28, stickX + 12, stickY + 42);

    // Left leg of stick figure
    stroke(colourR, colourG, colourB);
    noFill();
    line(stickX, stickY + 28, stickX - 12, stickY + 42);

  }

  
  /**
   * Draws colour of pixel that is right of the mouse
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