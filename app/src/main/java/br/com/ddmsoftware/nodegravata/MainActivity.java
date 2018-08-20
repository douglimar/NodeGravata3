package br.com.ddmsoftware.nodegravata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.firebase.analytics.FirebaseAnalytics;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;

    public static final String EXTRA_MESSAGE = "br.com.ddmsoftware.nodegravata.MESSAGE";


    final String[] aNodeTypes = {"FOURINHAND","HALF WINDSOR","FULL WINDSOR","NICKY","BOW TIE",
            "KELVIN","ORIENTAL","PRATT","ST.ANDREW","BALTHUS","HANOVER","PLATTSBURGH",
            "GRANTTCHESTER","VICTORIA","CAFE","ELDREDGE","TRINITY","CHRISTENSEN"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtain the FirebaseAnalytics instance.
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        createListView();

        // Create a AdView
        // Load Advertisement Banner
        AdView mAdView = findViewById(R.id.adViewMainActivity);
        AdRequest adRequest = new AdRequest.Builder().build();

        mAdView.loadAd(adRequest);

        // add back arrow to toolbar
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {

            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }


    public void createListView(){

        TieNode tieNode = new TieNode();

        ArrayList<TieNode> tieNodes = (ArrayList<TieNode>) tieNode.initializeData(getApplicationContext());
        ListView lista = findViewById(R.id.lista);
        lista.setAdapter(new CustomItemListBaseAdapter(this, tieNodes));

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                loadTieNodeInfoActivity(i);

                Bundle bundle = new Bundle();
                bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "1");
                bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "On Tie Node Click");
                bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "image");
                mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
            }
        });

    }

    public void loadTieNodeInfoActivity(int position){

        Intent intent = new Intent(this, MainFragmentTieActivity.class);
        intent.putExtra(EXTRA_MESSAGE, aNodeTypes[position]);
        startActivity(intent);
    }

}
