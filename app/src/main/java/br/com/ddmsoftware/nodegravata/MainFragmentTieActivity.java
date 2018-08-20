package br.com.ddmsoftware.nodegravata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class MainFragmentTieActivity extends AppCompatActivity {

    ImageView imageView;
    String message;
    List lista;

    String language;

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragment_tie);

        language = Locale.getDefault().getLanguage();

        // Recebe parametros da MAIN ACTIVITY  { Nome do Nó da Gravata }

        Intent intent = getIntent();
        message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        CustomTieNodeLoader customTieNodeLoader = new CustomTieNodeLoader();

        switch (message) {
            case "FOURINHAND"  : {
                lista = customTieNodeLoader.loadFourInHandsSteps(language);
                this.setTitle(R.string.four_in_hand);
                break; }
            case "HALF WINDSOR": {
                lista = customTieNodeLoader.loadHalfWindsorSteps(language);
                this.setTitle(R.string.half_windsor_name);
                break; }
            case "FULL WINDSOR": {
                lista = customTieNodeLoader.loadFullWindsorSteps(language);
                this.setTitle(R.string.full_windsor_name);
                break; }
            case "NICKY": {
                lista = customTieNodeLoader.loadNickySteps(language);
                this.setTitle(R.string.nicky_name);
                break; }
            case "BOW TIE": {
                lista = customTieNodeLoader.loadBowTieSteps(language);
                this.setTitle(R.string.bow_tie_name);
                break; }
            case "KELVIN": {
                lista = customTieNodeLoader.loadKelvinSteps(language);
                this.setTitle(R.string.kelvin_name);
                break; }
            case "ORIENTAL": {
                lista = customTieNodeLoader.loadOrientalSteps(language);
                this.setTitle(R.string.oriental_name);
                break; }
            case "PRATT": {
                lista = customTieNodeLoader.loadPrattSteps(language);
                this.setTitle(R.string.pratt_name);
                break; }
            case "ST.ANDREW": {
                lista = customTieNodeLoader.loadStAndrewSteps(language);
                this.setTitle(R.string.standrew_name);
                break; }
            case "BALTHUS": {
                lista = customTieNodeLoader.loadBalthusSteps(language);
                this.setTitle(R.string.balthus_name);
                break; }
            case "HANOVER": {
                lista = customTieNodeLoader.loadHanoverSteps(language);
                this.setTitle(R.string.hanover_name);
                break; }
            case "PLATTSBURGH": {
                lista = customTieNodeLoader.loadPlattsburgSteps(language);
                this.setTitle(R.string.plattsburgh_name);
                break; }
            case "GRANTTCHESTER": {
                lista = customTieNodeLoader.loadGranttchesterSteps(language);
                this.setTitle(R.string.granttchester_name);
                break; }
            case "VICTORIA": {
                lista = customTieNodeLoader.loadVictoriaSteps(language);
                this.setTitle(R.string.victoria_name);
                break; }
            case "CAFE": {
                lista = customTieNodeLoader.loadCafeSteps(language);
                this.setTitle(R.string.café_name);
                break; }
            case "ELDREDGE": {
                lista = customTieNodeLoader.loadEldredgeSteps(language);
                this.setTitle(R.string.eldredge_name);
                break; }
            case "TRINITY": {
                lista = customTieNodeLoader.loadTrinitySteps(language);
                this.setTitle(R.string.trinity_name);
                break; }
            case "CHRISTENSEN": {
                lista = customTieNodeLoader.loadChristensenSteps(language);
                this.setTitle(R.string.christensen_name);
                break; }
        }



        //imageView.setImageResource(R.drawable.fourinhand08);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        // Create a AdView
        // Load Advertisement Banner
        AdView mAdView = findViewById(R.id.adViewTeste);
        AdRequest adRequest = new AdRequest.Builder().build();

        mAdView.loadAd(adRequest);

        // add back arrow to toolbar
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {

            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */

        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            /*
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            ImageView imageView = (ImageView) rootView.findViewById(R.id.imgTie);
            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));

            TextView textViewTip = (TextView) rootView.findViewById(R.id.textViewTip); */

            String language = Locale.getDefault().getLanguage();

            View rootView = inflater.inflate(R.layout.fragment_main2, container, false);
            TextView textView = rootView.findViewById(R.id.tvTesteSection);
            ImageView imageView = rootView.findViewById(R.id.imageViewTeste);
            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));

            TextView textViewTip = rootView.findViewById(R.id.tvDescTeste);

            // Create a AdView
            // Load Advertisement Banner

            /*
            AdView mAdView = (AdView) rootView.findViewById(R.id.adViewTeste);
            AdRequest adRequest = new AdRequest.Builder().build();

            mAdView.loadAd(adRequest);
            */

            List<CustomTieNodeLoader> lista = new ArrayList();

            // Recebe parametros da MAIN ACTIVITY  { Nome do Nó da Gravata }
            Intent intent = getActivity().getIntent();
            String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

            CustomTieNodeLoader customTieNodeLoader = new CustomTieNodeLoader();

            //lista = customTieNodeLoader.loadFourInHandsSteps();

            int i = getArguments().getInt(ARG_SECTION_NUMBER);

            switch (message) {
                case "FOURINHAND"  : { lista = customTieNodeLoader.loadFourInHandsSteps(language);  break; }
                case "HALF WINDSOR": { lista = customTieNodeLoader.loadHalfWindsorSteps(language); break; }
                case "FULL WINDSOR": { lista = customTieNodeLoader.loadFullWindsorSteps(language); break; }
                case "NICKY": { lista = customTieNodeLoader.loadNickySteps(language); break; }
                case "BOW TIE": { lista = customTieNodeLoader.loadBowTieSteps(language); break; }
                case "KELVIN": { lista = customTieNodeLoader.loadKelvinSteps(language); break; }
                case "ORIENTAL": { lista = customTieNodeLoader.loadOrientalSteps(language); break; }
                case "PRATT": { lista = customTieNodeLoader.loadPrattSteps(language); break; }
                case "ST.ANDREW": { lista = customTieNodeLoader.loadStAndrewSteps(language); break; }
                case "BALTHUS": { lista = customTieNodeLoader.loadBalthusSteps(language); break; }
                case "HANOVER": { lista = customTieNodeLoader.loadHanoverSteps(language); break; }
                case "PLATTSBURGH": { lista = customTieNodeLoader.loadPlattsburgSteps(language); break; }
                case "GRANTTCHESTER": { lista = customTieNodeLoader.loadGranttchesterSteps(language); break; }
                case "VICTORIA": { lista = customTieNodeLoader.loadVictoriaSteps(language); break; }
                case "CAFE": { lista = customTieNodeLoader.loadCafeSteps(language); break; }
                case "ELDREDGE": { lista = customTieNodeLoader.loadEldredgeSteps(language); break; }
                case "TRINITY": { lista = customTieNodeLoader.loadTrinitySteps(language); break; }
                case "CHRISTENSEN": { lista = customTieNodeLoader.loadChristensenSteps(language); break; }
            }

            imageView.setImageResource(lista.get(i-1).getNodeStepPicture());
            textViewTip.setText(lista.get(i-1).getNodeStepDescription());

            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return lista.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0: {
                    //imageView.setImageResource(R.drawable.fourinhand01);
                    return "SECTION 1";
                }
                case 1:{
                    //imageView.setImageResource(R.drawable.fourinhand02);
                    return "SECTION 2";
                }
                case 2: {
                    //imageView.setImageResource(R.drawable.fourinhand03);
                    return "SECTION 3";
                }
                case 3: {
                    //imageView.setImageResource(R.drawable.fourinhand04);
                    return "SECTION 4";
                }
                case 4: {
                    //imageView.setImageResource(R.drawable.fourinhand05);
                    return "SECTION 5";
                }
                case 5: {
                    //imageView.setImageResource(R.drawable.fourinhand06);
                    return "SECTION 5";
                }
                case 6: {
                    //imageView.setImageResource(R.drawable.fourinhand07);
                    return "SECTION 6";
                }
                case 7: {
                    //imageView.setImageResource(R.drawable.fourinhand08);
                    return "SECTION 7";
                }
            }
            return null;
        }
    }

}
