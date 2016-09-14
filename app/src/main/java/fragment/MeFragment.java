package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cqut.edu.cn.bangke_enterprise.R;
import fragment.iView.IMeView;

/**
 * Created by dhl on 2016/9/12.
 */
public class MeFragment extends  MainFragment implements IMeView{


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_me,container,false);
        return view;
    }

    @Override
    public void dismissRefreshLayout(boolean is) {

    }

    @Override
    public void getDatas() {

    }
}
