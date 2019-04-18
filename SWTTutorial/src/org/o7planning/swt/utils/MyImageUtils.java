package org.o7planning.swt.utils;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

public class MyImageUtils {
	public static Image getImage(Display display,String resourcePath) {
		InputStream input=null;
		try {
			/*getResourceAsStream no se tim kiem file trong cung 1 folder voi file nay 
			Nen minh can phai dat vao 1 folder co cap thap hon, sau do chi can truyen path
			la folder/ten file la duoc
			*/
			input=MyImageUtils.class.getResourceAsStream(resourcePath);
			 Image image = new Image(display, input);
	            return image;
	        } finally {
	            closeQuietly(input);
	        }
	    }
	 
	    private static void closeQuietly(InputStream is) {
	        try {
	            if (is != null) {
	                is.close();
	            }
	        } catch (IOException e) {
	        }
		}
}