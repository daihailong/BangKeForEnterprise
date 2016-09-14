package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import base.BaseFragment;
import cqut.edu.cn.bangke_enterprise.R;
import fragment.iView.INewsView;

/**
 * Created by dhl on 2016/9/12.
 */
public class NewsFragment extends MainFragment implements INewsView {

    static NewsFragment newsFragment;

    public static NewsFragment newInstants() {
        if (newsFragment == null) {
            newsFragment = new NewsFragment();
        }
        return newsFragment;
    }


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
        View view = inflater.inflate(R.layout.frag_news,container,false);
        return view;
    }

    @Override
    public void findView(View view) {

    }

    @Override
    public void dismissRefreshLayout(boolean is) {

    }

    @Override
    public void getDatas() {

    }
}
