package p.kevin.notificacion;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;


public class CuentameFirebaseIDService extends FirebaseInstanceIdService {

    private static final String TAG = "UDBDEBUG";

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String refreshToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "new Token " + refreshToken);
    }

}
