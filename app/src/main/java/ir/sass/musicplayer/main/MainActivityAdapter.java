package ir.sass.musicplayer.main;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

import ir.sass.musicplayer.fragments.FoldersFragment;
import ir.sass.musicplayer.fragments.PathModl;

public class MainActivityAdapter extends FragmentPagerAdapter
{

    public MainActivityAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0 :
                return FoldersFragment.newInstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount()
    {
        return 1;
    }
}
