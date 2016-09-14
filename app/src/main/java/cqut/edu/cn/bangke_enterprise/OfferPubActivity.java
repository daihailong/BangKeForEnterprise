package cqut.edu.cn.bangke_enterprise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVObject;
import com.avos.avoscloud.SaveCallback;
import com.dd.processbutton.iml.ActionProcessButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import utils.ClearEditText;

public class OfferPubActivity extends AppCompatActivity {


    @BindView(R.id.tv_offer_name)
    ClearEditText tv_offer_name;
    @BindView(R.id.tv_offer_wage)
    ClearEditText tv_offer_wage;
    @BindView(R.id.tv_offer_location)
    ClearEditText tv_offer_location;
    @BindView(R.id.tv_limit_exp)
    ClearEditText tv_limit_exp;
    @BindView(R.id.tv_limit_edu)
    ClearEditText tv_limit_edu;
    @BindView(R.id.et_offer_desc)
    ClearEditText et_offer_desc;
    @BindView(R.id.btn_login_In)
    ActionProcessButton btn_login_In;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer_pub);
        ButterKnife.bind(this);
    }


    public void offerPub(){
        AVObject newOffer = new AVObject("offer");
        newOffer.put("offer_name",tv_offer_name.getText().toString());
        newOffer.put("offer_wage",tv_offer_wage.getText().toString());
        newOffer.put("position", tv_offer_location.getText().toString());
        newOffer.put("exp_limit", tv_limit_exp.getText().toString());
        newOffer.put("edu_limit", tv_limit_edu.getText().toString());
        newOffer.put("recr_requ", et_offer_desc.getText().toString());
        newOffer.saveInBackground(new SaveCallback() {
            @Override
            public void done(AVException e) {

            }
        });
    }


    @OnClick(R.id.btn_login_In)
    public void doOfferPub(View view){
        offerPub();
    }


}
