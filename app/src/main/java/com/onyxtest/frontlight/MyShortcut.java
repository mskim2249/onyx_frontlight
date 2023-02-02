package com.onyxtest.frontlight;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.onyx.android.sdk.api.device.FrontLightController;


public class MyShortcut extends Activity {


    @Override
    public void onCreate(Bundle icicle){
        super.onCreate(icicle);

        if (Intent.ACTION_CREATE_SHORTCUT.equals(getIntent().getAction())) {
            setupShortcut();
            finish();
            return;
        }

        if (FrontLightController.hasCTMBrightness(this)) {
            FrontLightController.increaseBrightness(this, FrontLightController.LIGHT_TYPE_CTM_WARM);
            FrontLightController.increaseBrightness(this, FrontLightController.LIGHT_TYPE_CTM_COLD);
        } else if (FrontLightController.hasFLBrightness(this)) {
            FrontLightController.increaseBrightness(this, FrontLightController.LIGHT_TYPE_FL);
        }
        finish();

    }
    private void setupShortcut() {
        //새로운 Intent 생성, shortcut클릭시 발생하는 Intent로 사용
        Intent shortcutIntent = new Intent(Intent.ACTION_MAIN);
        shortcutIntent.setClassName(this, this.getClass().getName());
        //shortcutIntent.putExtra(EXTRA_KEY, "TEST123");
        // Home Activity에서 shortcut작성을 클릭했을 경우 Home Activity로의  리턴 값을 정의한다.
        shortcutIntent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);

        Intent intent = new Intent();
        intent.putExtra(Intent.EXTRA_SHORTCUT_INTENT, shortcutIntent);  //shortcut을 클릭했을때 Target Activity로 전송할 action을 지정한다.
        intent.putExtra(Intent.EXTRA_SHORTCUT_NAME, getString(R.string.long_shortcut_1)); //shortcut 명 지정
        Intent.ShortcutIconResource iconResource = Intent.ShortcutIconResource.fromContext(
                this,  R.drawable.vector_1);
        intent.putExtra(Intent.EXTRA_SHORTCUT_ICON_RESOURCE, iconResource); //shortcut으로 사용할 아이콘 지정

        // Now, return the result to the launcher

        setResult(RESULT_OK, intent); // 호출한 화면(Home Activity)로 리턴


    }
}
