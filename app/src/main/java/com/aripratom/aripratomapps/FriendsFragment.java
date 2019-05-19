package com.aripratom.aripratomapps;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */

//19 Mei 2019
public class FriendsFragment extends Fragment {


    public FriendsFragment() {
        // Required empty public constructor
    }

    public static FriendsFragment newInstance() {
        return new FriendsFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_friends, container, false);

        Button btn_ari = (Button) view.findViewById(R.id.btn_ari);
        btn_ari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                case R.id.btn_ari:
                Intent ari = new Intent(getActivity(),FriendsDataActivity.class);
                ari.putExtra(FriendsDataActivity.EXTRA_NIM,"10116322");
                ari.putExtra(FriendsDataActivity.EXTRA_NAME,"Ari Abdul Majid");
                ari.putExtra(FriendsDataActivity.EXTRA_KELAS,"IF - 8");
                ari.putExtra(FriendsDataActivity.EXTRA_TELP,"087726572124");
                ari.putExtra(FriendsDataActivity.EXTRA_EMAIL,"ariabdulmajid@gmail.com");
                ari.putExtra(FriendsDataActivity.EXTRA_SOSMED,"@ariabdulmajid");
                startActivity(ari);
                break;
                }
         }

       });

        Button btn_chandra = (Button) view.findViewById(R.id.btn_chandra);
        btn_chandra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){

                case R.id.btn_chandra:
                Intent chandra = new Intent(getActivity(),FriendsDataActivity.class);
                    chandra.putExtra(FriendsDataActivity.EXTRA_NIM,"10116333");
                    chandra.putExtra(FriendsDataActivity.EXTRA_NAME,"Chandra Septian");
                    chandra.putExtra(FriendsDataActivity.EXTRA_KELAS,"IF - 8");
                    chandra.putExtra(FriendsDataActivity.EXTRA_TELP,"0895339871333");
                    chandra.putExtra(FriendsDataActivity.EXTRA_EMAIL,"cseptian48@gmail.com");
                    chandra.putExtra(FriendsDataActivity.EXTRA_SOSMED,"@cseptian_");
                startActivity(chandra);
                break;
                }
            }
        });

        Button btn_adit = (Button) view.findViewById(R.id.btn_adit);
        btn_adit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){

                    case R.id.btn_adit:
                        Intent adit = new Intent(getActivity(),FriendsDataActivity.class);
                        adit.putExtra(FriendsDataActivity.EXTRA_NIM,"10116359");
                        adit.putExtra(FriendsDataActivity.EXTRA_NAME,"Aditia Renaldi");
                        adit.putExtra(FriendsDataActivity.EXTRA_KELAS,"IF - 8");
                        adit.putExtra(FriendsDataActivity.EXTRA_TELP,"082120010715");
                        adit.putExtra(FriendsDataActivity.EXTRA_EMAIL,"renaldiaditia07_@gmail.com");
                        adit.putExtra(FriendsDataActivity.EXTRA_SOSMED,"@aditiarenaldii_");
                        startActivity(adit);
                        break;
                }
            }
        });

        Button btn_luthfi = (Button) view.findViewById(R.id.btn_luthfi);
        btn_luthfi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){

                    case R.id.btn_luthfi:
                        Intent luthfi = new Intent(getActivity(),FriendsDataActivity.class);
                        luthfi.putExtra(FriendsDataActivity.EXTRA_NIM,"10116365");
                        luthfi.putExtra(FriendsDataActivity.EXTRA_NAME,"Luthfi Alfarisi");
                        luthfi.putExtra(FriendsDataActivity.EXTRA_KELAS,"IF - 8");
                        luthfi.putExtra(FriendsDataActivity.EXTRA_TELP,"081313873670");
                        luthfi.putExtra(FriendsDataActivity.EXTRA_EMAIL,"luthfialfarizi98@gmail.com");
                        luthfi.putExtra(FriendsDataActivity.EXTRA_SOSMED,"@luthfi_alfariz");
                        startActivity(luthfi);
                        break;
                }
            }
        });

        Button btn_habib = (Button) view.findViewById(R.id.btn_habib);
        btn_habib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){

                    case R.id.btn_habib:
                        Intent habib = new Intent(getActivity(),FriendsDataActivity.class);
                        habib.putExtra(FriendsDataActivity.EXTRA_NIM,"10116369");
                        habib.putExtra(FriendsDataActivity.EXTRA_NAME,"Muhammad Habib");
                        habib.putExtra(FriendsDataActivity.EXTRA_KELAS,"IF - 8");
                        habib.putExtra(FriendsDataActivity.EXTRA_TELP,"082167418821");
                        habib.putExtra(FriendsDataActivity.EXTRA_EMAIL,"mhabibnf@mahasiswa.unikom.ac.id");
                        habib.putExtra(FriendsDataActivity.EXTRA_SOSMED,"@mhabibnf");
                        startActivity(habib);
                        break;
                }
            }
        });

        Button btn_ilyas = (Button) view.findViewById(R.id.btn_ilyas);
        btn_ilyas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){

                    case R.id.btn_ilyas:
                        Intent ilyas = new Intent(getActivity(),FriendsDataActivity.class);
                        ilyas.putExtra(FriendsDataActivity.EXTRA_NIM,"10116339");
                        ilyas.putExtra(FriendsDataActivity.EXTRA_NAME,"Muhammad Ilyas");
                        ilyas.putExtra(FriendsDataActivity.EXTRA_KELAS,"IF - 8");
                        ilyas.putExtra(FriendsDataActivity.EXTRA_TELP,"");
                        ilyas.putExtra(FriendsDataActivity.EXTRA_EMAIL,"");
                        ilyas.putExtra(FriendsDataActivity.EXTRA_SOSMED,"");
                        startActivity(ilyas);
                        break;
                }
            }
        });

        Button btn_rica = (Button) view.findViewById(R.id.btn_rica);
        btn_rica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){

                    case R.id.btn_rica:
                        Intent rica = new Intent(getActivity(),FriendsDataActivity.class);
                        rica.putExtra(FriendsDataActivity.EXTRA_NIM,"41816238");
                        rica.putExtra(FriendsDataActivity.EXTRA_NAME,"Rica Rahmawati");
                        rica.putExtra(FriendsDataActivity.EXTRA_KELAS,"IK HUMAS 3");
                        rica.putExtra(FriendsDataActivity.EXTRA_TELP,"082258226994");
                        rica.putExtra(FriendsDataActivity.EXTRA_EMAIL,"44ricar@gmail.com");
                        rica.putExtra(FriendsDataActivity.EXTRA_SOSMED,"@ricaa.r");
                        startActivity(rica);
                        break;
                }
            }
        });
        return view;
    }

}
