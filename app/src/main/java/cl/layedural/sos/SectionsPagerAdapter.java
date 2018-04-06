package cl.layedural.sos;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter {
    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return ProfileFragment.newInstance();
            case 1:
                return PreferencesFragment.newInstance();
            default:
                return PreferencesFragment.newInstance();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
