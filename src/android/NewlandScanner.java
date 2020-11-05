package com.newland.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.Context;
import android.content.Intent;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.util.Log;

public class NewlandScanner extends CordovaPlugin
{
    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {
        Log.d("AA","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        if (action.equals("scan") || action.equals("nlscan.action.SCANNER_RESULT"))
        {
            NewlandReceiver mReceiver = new NewlandReceiver(callbackContext);

            IntentFilter filter = new IntentFilter("nlscan.action.SCANNER_RESULT");        
                
            cordova.getActivity().registerReceiver(mReceiver, filter);
            //sendBroadcast(mIntent);
            return true;
        } else {
            return false;
        }
    }
}