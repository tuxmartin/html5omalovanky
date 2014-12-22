/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
 */

/*
 * Aby v apliakci fungoval zoom, je potreba nahradit soubor *CordovaApp.java*,
 * ktery vygeneruje Apache Cordova.
 * Soubor je v platforms/android/src/eu/vancl/martin/html5omalovanky/CordovaApp.java
 * 
 * Pridany kod je v *** ZOOM *** komentarich.
 * 
 * Zdroj: http://stackoverflow.com/a/13031354/1974494
 */

package eu.vancl.martin.html5omalovanky;

import android.os.Bundle;
import org.apache.cordova.*;

// *** ZOOM ***
import android.webkit.WebSettings; 
import android.webkit.WebSettings.ZoomDensity;
//*** ZOOM ***

public class CordovaApp extends CordovaActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.init();
        // Set by <content src="index.html" /> in config.xml

        // *** ZOOM ***
        super.appView.getSettings().setBuiltInZoomControls(true);
        super.appView.getSettings().setSupportZoom(true);
        super.appView.getSettings().setDefaultZoom(ZoomDensity.MEDIUM); 
        // *** ZOOM ***

        loadUrl(launchUrl);
    }
}
