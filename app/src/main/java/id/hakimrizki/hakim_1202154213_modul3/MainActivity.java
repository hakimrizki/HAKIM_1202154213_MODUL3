package id.hakimrizki.hakim_1202154213_modul3;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;

import id.hakimrizki.hakim_1202154213_modul3.AirMineral.KoleksiAirMineral;
import id.hakimrizki.hakim_1202154213_modul3.AirMineral.RecyclerAdapter;

public class MainActivity extends AppCompatActivity {

    private Context mContext;
    RecyclerView recyclerView;
    RelativeLayout relativeLayout;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = getApplicationContext();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        relativeLayout = (RelativeLayout)findViewById(R.id.rl);
        mLayoutManager = new GridLayoutManager(mContext, 3);
        RecyclerAdapter adapter=new RecyclerAdapter(this, KoleksiAirMineral.getAirMineral());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
