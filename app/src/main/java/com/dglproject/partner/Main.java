package com.dglproject.partner;

import android.app.Application;
/**
 * Created by Tortuvshin Byambaa on 3/10/2017.
 */
public class Main extends Application{

 	private static boolean sIsChatActivityOpen = false;

    public static boolean isChatActivityOpen() {
        return sIsChatActivityOpen;
    }

    public static void setChatActivityOpen(boolean isChatActivityOpen) {
        Main.sIsChatActivityOpen = isChatActivityOpen;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
