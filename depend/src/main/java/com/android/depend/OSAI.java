package com.android.depend;

import android.content.Context;
import android.util.Log;

import com.osai.middleware.Middleware;
import com.osai.middleware.callback.MiddlewareEventCallback;

public class OSAI {

    public OSAI(Context context){

        Middleware.initialize(context,"D7XG",new MiddlewareEventCallback(){
            @Override
            public void onInit(int exceptionCode) {
                Log.e("OSAI","exceptionCode = " + exceptionCode);
            }
        });

        Middleware.getInstance().getDeviceExpireTime();

    }

}
