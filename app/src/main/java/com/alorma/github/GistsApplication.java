package com.alorma.github;

import android.app.Application;

import com.alorma.github.sdk.security.ApiConstants;
import com.alorma.github.sdk.security.StoreCredentials;

/**
 * Created by Bernat on 08/07/2014.
 */
public class GistsApplication extends Application{

    public static int AB_COLOR;

    @Override
    public void onCreate() {
        super.onCreate();

        AB_COLOR = getResources().getColor(R.color.accent);
        
        ApiConstants.CLIENT_ID = "5dbfca95aa4de59f4a1c";
        ApiConstants.CLIENT_SECRET = "b3688437884ec6978884abafdce798d8781314d1";
        ApiConstants.CLIENT_CALLBACK = "http://bernatborras.net/giskarios";
    }
}