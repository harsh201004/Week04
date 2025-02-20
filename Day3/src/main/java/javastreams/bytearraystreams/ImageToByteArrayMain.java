package javastreams.bytearraystreams;
import java.io.IOException;
import java.util.*;

public class ImageToByteArrayMain {
    public static void main(String[] args) {
        String sourceImage = "source_image.jpg";
        String outputImage = "output_image.jpg";

        try {
            // Convert image to byte array
            byte[] imageBytes = ImageToByteArray.convertImageToByteArray(sourceImage);

            // Write byte array back to image file
            ImageToByteArray.writeByteArrayToImage(imageBytes, outputImage);

            // Verify files
            if (Arrays.equals(imageBytes, ImageToByteArray.convertImageToByteArray(outputImage))) {
                System.out.println("The output image is identical to the source image.");
            } else {
                System.out.println("The images are not identical.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }


}

