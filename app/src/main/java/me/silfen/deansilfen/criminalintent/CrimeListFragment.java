package me.silfen.deansilfen.criminalintent;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by deansilfen on 11/8/15.
 */
public class CrimeListFragment extends ListFragment {
    public static final String TAG = "CrimeListFragment";

    private ArrayList<Crime> mCrimes;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate called");
        super.onCreate(savedInstanceState);
        Log.d(TAG, "super.OnCreate called");
        getActivity().setTitle(R.string.crimes_title);
        mCrimes = CrimeLab.get(getActivity()).getCrimes();

        ArrayAdapter<Crime> adapter =
            new ArrayAdapter<Crime>(getActivity(),
                                    android.R.layout.simple_list_item_1,
                                    mCrimes);
        setListAdapter(adapter);
        Log.d(TAG, "returned from onCreate");
    }



}
