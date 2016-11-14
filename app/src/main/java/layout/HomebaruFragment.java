package layout;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nanark.tasktwo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomebaruFragment extends Fragment {


    public HomebaruFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_homebaru,container,false);
    }

}
