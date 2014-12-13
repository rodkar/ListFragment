package cloudyun.com.listfragment;

import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import cloudyun.com.listfragment.data.Flower;
import cloudyun.com.listfragment.data.FlowerArrayAdapter;
import cloudyun.com.listfragment.data.FlowerData;

/**
 * Created by 2013_13_mbp on 13/12/14.
 */
public class MyFragment extends ListFragment {

    List<Flower> flowers = new FlowerData().getFlowers();

    public MyFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FlowerArrayAdapter adapter = new FlowerArrayAdapter(getActivity(), R.layout.flower_listitem, flowers);
        setListAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.my_fragment, container, false);
        return rootView;
    }

}
