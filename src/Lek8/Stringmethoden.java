package Lek8;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class Stringmethoden {
    public static void main(String[] args)  throws IOException {

        String seite = "<body id=\"www-wikipedia-org\">"
                + "<div class=\"central-textlogo\">"
                + "<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb"
                + "/b/bb/Wikipedia_wordmark.svg/174px-Wikipedia_wordmark.svg.png\">"
                + "</div>"
                + "</body>";

        String start = "<img src=\"";
        String bildLink = "";
        int startIndex = seite.indexOf(start); // Index: 59 bei "<"; start: <img src="

        if (startIndex != 1) {
            startIndex += start.length(); // startIndex nach rechts geschoben, wo der Link beginnt; nun: 69
            int endeIndex = seite.indexOf('\"', startIndex); // Index: 182

            bildLink = seite.substring(startIndex, endeIndex);
        }
        else {
            throw new IOException("Konnte kein Bild finden!");
        }

        String downloadUrl = bildLink;

        URL url = new URL(downloadUrl);
        BufferedImage image = ImageIO.read(url);
        ImageIO.write(image, "png", new File("bild.png"));

        System.out.println("Bild heruntergeladen und im Ordner gespeichert!");
    }
}