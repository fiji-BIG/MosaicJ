package ch.epfl.big;

import ij.IJ;
import ij.ImageJ;

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

       /* final ImageJ ij = new ImageJ();
        ij.ui().showUI();
        new MosaicJ_().run("");
        //IJ.run("MosaicJ", "");
        //DebugTools.enableLogging("DEBUG");
        //ij.command().run(ArgoLight.class, true).get();*/
    }

}
