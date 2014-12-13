package cloudyun.com.listfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import cloudyun.com.listfragment.data.Flower;

/**
 * Created by 2013_13_mbp on 13/12/14.
 */
public class MyFragment extends Fragment {

    List<Flower> flowers;

    public MyFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.my_fragment, container, false);
        return rootView;
    }

}
