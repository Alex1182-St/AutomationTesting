package Library;

import org.openqa.selenium.WebDriver;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScreenshotTaking {

    public void screenShotCapture (String screenName)
    {
        try {
            Thread.sleep(1000);
            Robot rob = new Robot();

            // It saves screenshot to desired path
            String path = "C:\\Users\\stepanyuk\\Desktop\\Folder\\" + screenName+ ".jpg";

            // Used to get ScreenSize and capture image
            Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage image = rob.createScreenCapture(capture);
            ImageIO.write(image, "jpg", new File(path));
            System.out.println("\nScreenshot saved");
        }
        catch (AWTException | IOException | InterruptedException ex) {
            System.out.println(ex);
        }
    }
}

