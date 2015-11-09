package me.silfen.deansilfen.criminalintent;

import android.support.v4.app.Fragment;
import android.util.Log;

/**
 * Created by deansilfen on 11/8/15.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    public static final String TAG = "CrimeListActivity";

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
