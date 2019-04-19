package com.example.modlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String>nama = new ArrayList<>();
    private ArrayList<String>mSize = new ArrayList<>();
    private ArrayList<String>mWeight = new ArrayList<>();
    private ArrayList<String>pRange = new ArrayList<>();
    private ArrayList<String>vRange = new ArrayList<>();
    private ArrayList<String>foto = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        isidata();
    }

    private void isidata (){
        nama.add("Smoant Charon Mini 225w");
        mSize.add("89*45*29mm");
        mWeight.add("160g");
        pRange.add ("1-225W");
        vRange.add ("6.0-8.4V");
        foto.add("https://www.vapourchoice.ca/wp-content/uploads/2018/10/smoant-charon-mini-225-watt-mod.jpg");

        nama.add("Smoant Naboo 225w");
        mSize.add("91*48*31mm");
        mWeight.add("150g");
        pRange.add("1-225W");
        vRange.add("6.0-8.4V");
        foto.add("https://ecs7.tokopedia.net/img/cache/700/product-1/2018/10/4/16100563/16100563_d61b8a3d-dea7-49a6-84d4-2642c0048dc2_1000_1000.jpg");

        nama.add("Smoant Battlestar 200w");
        mSize.add("83*43*25mm");
        mWeight.add("136g");
        pRange.add("1-200W");
        vRange.add("3.0-6.5V");
        foto.add("https://des.gbtcdn.com/uploads/pdm-desc-pic/Electronic/image/2016/11/12/1478917343992895.jpg");

        nama.add("Tesla WYE 200w");
        mSize.add("82*42*39mm");
        mWeight.add("64.5g");
        pRange.add("1-225W");
        vRange.add("6.0-8.4V");
        foto.add("https://www.elementvape.com/media/catalog/product/cache/1/image/1800x/040ec09b1e35df139433887a97daa66f/t/e/tesla_wye_200w_tc_box_mod_black_2.jpg");

        nama.add("Asmodus Minikin V2");
        mSize.add("83*42*35mm");
        mWeight.add("170g");
        pRange.add("5-180W");
        vRange.add("4.0-7.5V");
        foto.add("https://vintagevaperooms.com/wp-content/uploads/2016/10/Asmodus-Minikin-V2-1.jpg");

        nama.add("Augvape VX200");
        mSize.add("87.5*45*29.2mm");
        mWeight.add("100g");
        pRange.add("5-200W");
        vRange.add("0.2-7.2V");
        foto.add("https://ecs7.tokopedia.net/img/cache/700/product-1/2019/2/1/12352592/12352592_bbe78324-cf83-4d69-bcc9-07339ecfb9aa_800_800.jpg");

        nama.add("Augvape V200");
        mSize.add("87.5*45*29.2mm");
        mWeight.add("175g");
        pRange.add("5-200W");
        vRange.add("0.8-4V");
        foto.add("https://ecs7.tokopedia.net/img/cache/700/product-1/2018/2/22/607179/607179_ee37b42b-9604-4632-963d-50c01754dda2_600_600.jpg");

        nama.add("Vaporstorm Puma");
        mSize.add("80.7*43*40mm");
        mWeight.add("70.6g");
        pRange.add("5-200W");
        vRange.add("6.4-8.4V");
        foto.add("https://cdn3.volusion.com/djqrj.kxptz/v/vspfiles/photos/Vapor-Storm-PUMA-Mod-2.jpg?1529427458");

        nama.add("Rincoe Manto X");
        mSize.add("75*40*37mm");
        mWeight.add("137g");
        pRange.add("1-228W");
        vRange.add("6.0-8.0V");
        foto.add("https://ecs7.tokopedia.net/img/cache/700/product-1/2018/12/7/1094329/1094329_d4cb5f5a-d07e-400d-a483-b3e7d68a27d4_600_700.jpg");

        nama.add("Rincoe Manto S");
        mSize.add("80*43*41.5mm");
        mWeight.add("120g");
        pRange.add("1-228W");
        vRange.add("6.0-8.4V");
        foto.add("https://www.elementvape.com/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/r/i/rincoe_manto_s_228w_tc_box_mod_2.jpg");

        nama.add("Hotcig R233");
        mSize.add("90*55*25mm");
        mWeight.add("200g");
        pRange.add("10-233W");
        vRange.add("6.0-8.4V");
        foto.add("https://gloimg.gbtcdn.com/soa/gb/pdm-product-pic/Electronic/2017/09/14/goods_img_big-v1/20170914114557_12207.jpg");

        nama.add("Hotcig R150");
        mSize.add("90*55*25mm");
        mWeight.add("200g");
        pRange.add("1-150W");
        vRange.add("6.4-8.4V");
        foto.add("https://ae01.alicdn.com/kf/HTB1uQCPqyOYBuNjSsD4q6zSkFXag.jpg?width=950&height=569&hash=1519");

        nama.add("Triade DNA 250");
        mSize.add("88*50*40mm");
        mWeight.add("320g");
        pRange.add("1-250W");
        vRange.add("0.5-9.3V");
        foto.add("https://gloimg.gbtcdn.com/soa/gb/pdm-product-pic/Electronic/2017/03/17/goods_img_big-v1/20170317152156_93554.JPG");

        nama.add("Therion DNA 75");
        mSize.add("88.5.5*54*27mm");
        mWeight.add("160g");
        pRange.add("1-75W");
        vRange.add("1.0-6.4V");
        foto.add("https://gloimg.gbtcdn.com/soa/gb/pdm-product-pic/Electronic/2017/03/31/goods_img_big-v1/20170331141814_56452.jpg");

        nama.add("Therion DNA 166");
        mSize.add("88.5*54*27mm");
        mWeight.add("160g");
        pRange.add("1-166W");
        vRange.add("1.0-7.8V");
        foto.add("https://ecs7.tokopedia.net/img/cache/700/product-1/2018/12/7/924458/924458_d841f217-f6d9-432e-9d3b-4664b6f9cf5a_554_554.jpg");

        nama.add("Voopoo Vmate");
        mSize.add("89*47*30mm");
        mWeight.add("100g");
        pRange.add("5-200W");
        vRange.add("0-7.5V");
        foto.add("https://www.elementvape.com/media/catalog/product/cache/1/image/1800x/040ec09b1e35df139433887a97daa66f/v/o/voopoo_vmate_200w_tc_box_mod.jpg");

        initRecyclerView();
    }
    private void initRecyclerView (){
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,nama,mSize,mWeight,pRange,vRange,foto);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}

