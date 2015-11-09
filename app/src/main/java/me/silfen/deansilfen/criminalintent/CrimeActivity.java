package me.silfen.deansilfen.criminalintent;

import android.support.v4.app.Fragment;
import android.util.Log;

public class CrimeActivity extends SingleFragmentActivity {
    public static final String TAG = "CrimeActivity";

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
