package zwy.final_test;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class welcomefrag4_activity extends Fragment {
    public static welcomefrag4_activity newInstance(){
        return new welcomefrag4_activity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container , Bundle savedInstanceState){
        return inflater.inflate(R.layout.welcomefrag4, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button button = (Button) getActivity().findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getActivity(), "Clicked", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}