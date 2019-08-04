package ir.sass.musicplayer.fragments;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Environment;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import ir.sass.musicplayer.R;
import ir.sass.musicplayer.main.MainActivityAdapter;

import static android.provider.CalendarContract.CalendarCache.URI;

public class FoldersFragment extends Fragment implements ListAdapter.OnFragmentRelation {
    List<PathModl> listPaths = new ArrayList<>();
    ListAdapter activityAdapter;
    RecyclerView listPathsView;
    public FoldersFragment() {
        // Required empty public constructor
    }


    public static FoldersFragment newInstance()
    {
        FoldersFragment fragment = new FoldersFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_folders, container, false);
        listPathsView = view.findViewById(R.id.folder_list);
        listPathsView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        getFolders();
        return view;
    }
    private File file;

    public void getFolders()
    {
        if(isAdded())
        {
            String[] proj =
                    new String[]{MediaStore.Audio.Media.DISPLAY_NAME,MediaStore.Audio.Media.DATA};
            Cursor cursor =
                    getActivity()
                            .getContentResolver()
                            .query(MediaStore.Audio.Media.INTERNAL_CONTENT_URI,
                                    proj,
                null,null,null);
            while (cursor.moveToNext())
            {
                listPaths.add(
                        new PathModl(
                        cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.DISPLAY_NAME)),
                        cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.DATA))
                        ));
            }
        }

    }

    public void setListOfDirs()
    {
        activityAdapter = new ListAdapter(listPaths,this);
        listPathsView.setAdapter(activityAdapter);
        activityAdapter.notifyDataSetChanged();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
            // TODO => when we need context
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
