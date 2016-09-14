package fragment.iView;

import base.BaseView;

/**
 * Created by dhl on 2016/9/13.
 */
public interface IOfferPubView extends BaseView {
    void dismissRefreshLayout(boolean is);
    void dismissLoadingLayout(boolean is);
    void getDatas(boolean isReload);
}
