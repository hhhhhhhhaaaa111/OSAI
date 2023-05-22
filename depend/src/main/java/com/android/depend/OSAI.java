package com.android.depend;

import android.content.Context;
import android.util.Log;

import com.tonyodev.fetch2.Fetch;
import com.tonyodev.fetch2.FetchConfiguration;

public class OSAI {

    public OSAI(Context context){
        FetchConfiguration fetchConfiguration = new FetchConfiguration.Builder(context).build();
        Fetch fetch = Fetch.Impl.getInstance(fetchConfiguration);
        Log.e("OSAI","OK!!!");
    }

}
