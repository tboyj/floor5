package cyberchicken;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.*;
import java.util.Collections;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Booting Floor5...(Client Version)");
        System.out.println("Trying to initialize FlatLaF...");
        /*GraphicsEnvironment ge = GraphicsEnvironment
                .getLocalGraphicsEnvironment();
// just trying to push it through
        Font[] allFonts = ge.getAllFonts();

        for (Font font : allFonts) {
            System.out.println(font.getFontName(Locale.US));
        }*/
        try {
            FlatLaf.setGlobalExtraDefaults(Collections.singletonMap("@accentColor", "#8C2433")); // Red color
            UIManager.put( "defaultFont", new Font( "Bahnschrift", Font.PLAIN, 13) );
            UIManager.setLookAndFeel( new FlatLightLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        try {
            new Floor5LinServ(780, 680);
        } catch (Exception e) {
            System.err.println("Couldn't run Floor5. Sorry :(");
        }
    }
}