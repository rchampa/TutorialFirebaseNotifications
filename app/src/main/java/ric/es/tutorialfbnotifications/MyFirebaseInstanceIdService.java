package ric.es.tutorialfbnotifications;


import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Ricardo on 23/10/2016.
 */

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {

    private static String TAG = "FirebaseInstanceIdService";

    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "New token:  " + refreshedToken);
        SharedPreferences prefs = getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);
        prefs.edit().putString("token",refreshedToken).apply();

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
//        sendRegistrationToServer(refreshedToken);

        //cQsAGSjI6k0:APA91bF96P9D2aGdjEPF0GTD8yi6NFB1rKn8K9pTmBp1Lj6wB9YU1MhDSkHokj2SEHuFDfVp2N8LTf43jNxdk7_Edg2HZ8WnV8qiQU3WqSbxz2bceHZigtnE-f0tOWUKPrTFXpDFAGQP

    }

}
