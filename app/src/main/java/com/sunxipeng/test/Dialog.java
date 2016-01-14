package com.sunxipeng.test;

import android.app.Activity;
import android.content.Context;

/**
 * Created by Administrator on 2016/1/14.
 */
public class Dialog extends android.app.Dialog {

    private static String TAG = Dialog.class.getName();

    public Dialog(Context context) {
        super(context);
    }

    public Dialog(Context context, int i) {
        super(context, i);
    }

    protected Dialog(Context context, boolean flag, android.content.DialogInterface.OnCancelListener oncancellistener) {
        super(context, flag, oncancellistener);
    }

    public void dismiss() {
        Context context = getContext();
        if (context != null && (context instanceof Activity) && ((Activity) context).isFinishing()) {
            return;
        } else {
            super.dismiss();
            return;
        }
    }

    public void show() {
        Object obj = getContext();
        if (obj != null && (!(obj instanceof Activity) || !((Activity) obj).isFinishing())) {
            try {
                super.show();
                return;
            } catch (Exception exception) {
                String str;
                if (exception != null)
                    str = String.valueOf(exception).concat(" is finishing");
                else
                    str = "context is null";

                return;
            }

        }
    }
}
