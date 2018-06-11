package com.devnagri.androidstudio;

import java.io.File;


public class ClientDetection {

    private static String[] knownInstallPaths = {
            "/usr/bin/phraseapp",
            "/usr/local/bin/phraseapp",
            System.getProperty("user.home") + "/bin/phraseapp",
    };


    public static String findClientInstallation(){
        for(String path : knownInstallPaths){
            File f = new File(path);
            if (f.exists()){
                return path;
            }
        }
        return null;
    }
}
