package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import base.BaseFragment;
import cqut.edu.cn.bangke_enterprise.R;

/**
 * Created by dhl on 2016/9/13.
 */
public class MainFragment extends BaseFragment {

    ViewPager mViewPager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_main, container, false);
        findView(view);
        return view;
    }

    @Override
    public void findView(View view) {
        mViewPager = (ViewPager) view.findViewById(R.id.main_view_pager);
        mViewPager.setOffscreenPageLimit(4);
    }

    public void initView() {
    }


    public List<MainFragment> getFragmentList() {
        List<MainFragment> list = new ArrayList<>();
        MainFragment home = HomeFragment.newInstance();
        MainFragment news = new NewsFragment();
        MainFragment me = new MeFragment();
        MainFragment offerPub = new OfferPubFragment();

        list.add(home);
        list.add(news);
        list.add(offerPub);
        list.add(me);
        return list;
    }

}
