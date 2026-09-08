

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.imageio.ImageIO;

public class ImageConverter {

    public static String convert(Color color) {
        int red = color.getRed();
        int green = color.getGreen();
        int blue = color.getBlue();

        if (red == 237 && green == 28 && blue == 36) {
            return "R";
        } else if (red == 0 && green == 0 && blue == 0) {
            return "B";
        } else if (red == 255 && green == 255 && blue == 255) {
            return "W";
        } else if (red == 255 && green == 242 && blue == 0) {
            return "Y";
        } else {
            return "(" + red + ", " + green + ", " + blue + ")";
        }
    }

    public static void main(String[] args) {
        try {
            BufferedImage image = ImageIO.read(new File("./smiley.png"));

            if (image == null) {
                System.out.println("Could not open the image.");
                return;
            }

            try (PrintWriter outputFile = new PrintWriter("output.txt")) {
                int width = image.getWidth();
                int height = image.getHeight();

                for (int y = 0; y < height; y++) {
                    for (int x = 0; x < width; x++) {
                        Color color = new Color(image.getRGB(x, y), true);

                        outputFile.print(convert(color));
                        outputFile.print(" ");
                    }

                    outputFile.println();
                }
            }

            System.out.println("Image converted successfully.");

        } catch (IOException exception) {
            System.out.println("Error reading or writing the file:");
            exception.printStackTrace();
        }
    }
}