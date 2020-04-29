package Main;

import java.awt.*;

public class game extends Frame {
	public game() {      
        // Setting Frame width and height
		final int width = 700;
		final int height = 500;
        this.setSize(width,height); 
        
        //Setting the title of Frame
        this.setTitle("Pong by John Yu"); 
        
        //Setting the layout for the Frame
        this.setLayout(new FlowLayout());
        
        /* By default frame is not visible so 
         * we are setting the visibility to true 
         * to make it visible.
         */
        this.setVisible(true); 
	}
}
