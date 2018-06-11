package com.example.android.tourguidecroatia;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
/**
 * Created by djalél on 10/06/2018.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    /** Context of the app */
    private Context mContext;
    /**
     * Create a new {@link CategoryAdapter} object.
     *
     +     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CitiesFragment();
        } else if (position == 1){
            return new HotelsFragment();
        } else if (position == 2) {
            return new IslandsFragment();
        } else {
            return new NationalparksFragment();
        }
    }
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_Cities);
        } else if (position == 1) {
            return mContext.getString(R.string.category_Hotels);
        } else if (position == 2) {
            return mContext.getString(R.string.category_islands);
        } else {
            return mContext.getString(R.string.category_nationalparks);
        }
    }
}
