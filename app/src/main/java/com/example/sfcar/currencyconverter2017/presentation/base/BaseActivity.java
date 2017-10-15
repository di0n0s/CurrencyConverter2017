package com.example.sfcar.currencyconverter2017.presentation.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.example.sfcar.currencyconverter2017.R;
import com.example.sfcar.currencyconverter2017.presentation.utils.Constants;

import butterknife.BindView;
import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {

    private String currentTag;
    private Fragment currentFragment;

    @BindView(R.id.fragment_container)
    FrameLayout fragmentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        ButterKnife.bind(this);

        if (savedInstanceState != null) {
            currentTag = savedInstanceState.getString(Constants.CURRENT_FRAGMENT_TAG);
            currentFragment = getSupportFragmentManager().getFragment(savedInstanceState, Constants.CURRENT_SAVED_FRAGMENT);
        }

        initFragment();
    }

    private void initFragment() {
        if (currentFragment == null) {
            Fragment fragment = createFragment();
            if (fragment != null) {
                getSupportFragmentManager().beginTransaction().replace(fragmentContainer.getId(), fragment, ((BaseFragment) fragment).getFragmentTag()).commit();
                currentFragment = fragment;
                currentTag = fragment.getTag();
            }
        } else
            getSupportFragmentManager().beginTransaction().replace(fragmentContainer.getId(), currentFragment).commit();
    }

    protected abstract Fragment createFragment();

}
