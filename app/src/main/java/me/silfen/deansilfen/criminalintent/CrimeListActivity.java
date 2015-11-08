package me.silfen.deansilfen.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by deansilfen on 11/8/15.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
