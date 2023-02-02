package com.onyxtest.frontlight;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.onyx.android.sdk.api.device.FrontLightController;
public class MyReceiver extends BroadcastReceiver {



    @Override
    public void onReceive(Context context, Intent intent) {

        if(intent.getAction().equals("increase")) {
            if (FrontLightController.hasCTMBrightness(context)) {
                FrontLightController.increaseBrightness(context, FrontLightController.LIGHT_TYPE_CTM_WARM);
                FrontLightController.increaseBrightness(context, FrontLightController.LIGHT_TYPE_CTM_COLD);
            } else if (FrontLightController.hasFLBrightness(context)) {
                FrontLightController.increaseBrightness(context, FrontLightController.LIGHT_TYPE_FL);
            }

        }else if(intent.getAction().equals("decrease")){
            if (FrontLightController.hasCTMBrightness(context)) {
                FrontLightController.decreaseBrightness(context, FrontLightController.LIGHT_TYPE_CTM_WARM);
                FrontLightController.decreaseBrightness(context, FrontLightController.LIGHT_TYPE_CTM_COLD);
            } else if (FrontLightController.hasFLBrightness(context)) {
                FrontLightController.decreaseBrightness(context, FrontLightController.LIGHT_TYPE_FL);
            }
        }
    }


}