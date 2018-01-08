package zwy.final_test;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class welcomefrag3_activity extends Fragment {
    public static welcomefrag3_activity newInstance(){
        return new welcomefrag3_activity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container , Bundle savedInstanceState){
        return inflater.inflate(R.layout.welcomefrag3, container, false);
    }
}