package ch.epfl.big;

import ij.IJ;
import ij.ImageJ;


/**
 *
 * To launch the plugin (for the layout bug)
 *  - Comment the lines 546-552 where the check of TurboReg is done
 */
public class SimpleIJLaunch {
    public static void main(String[] args) {

        // set the plugins.dir property to make the plugin appear in the Plugins menu
        Class<?> clazz = MosaicJ_.class;
        String url = clazz.getResource("/" + clazz.getName().replace('.', '/') + ".class").toString();
        String pluginsDir = url.substring("file:".length(), url.length() - clazz.getName().length() - ".class".length());
        System.setProperty("plugins.dir", pluginsDir);

        // start ImageJ
        new ImageJ();
        IJ.runPlugIn(clazz.getName(),"");
    }

}
