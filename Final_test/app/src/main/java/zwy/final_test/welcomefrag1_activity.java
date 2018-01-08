package zwy.final_test;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class welcomefrag1_activity extends Fragment {
    public static welcomefrag1_activity newInstance(){
        return new welcomefrag1_activity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container , Bundle savedInstanceState){
        return inflater.inflate(R.layout.welcomefrag1, container, false);
    }
}
