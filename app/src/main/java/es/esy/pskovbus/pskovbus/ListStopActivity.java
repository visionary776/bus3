package es.esy.pskovbus.pskovbus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.SharedPreferences;
import android.content.Context;
import android.widget.Toast;
import android.view.Gravity;

public class ListStopActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener,View.OnClickListener {

    String[] stopnames;
    ListView stoplistView;
    int stopId;

    SharedPreferences fav1;
    int savefav1, savefav2,savefav3;

    public static final String FAVORITE1="Favorite1";
    public static final String FAVORITE2="Favorite2";
    public static final String FAVORITE3="Favorite3";
    public static final String FAVORITE_PREF="Favorites";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_stop);


        stopnames=getStopNameArr();

        stoplistView = (ListView) findViewById(R.id.stoplistView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, stopnames);
        stoplistView.setAdapter(adapter);



        stoplistView.setOnItemClickListener(this);
        stoplistView.setOnItemLongClickListener(this);

        loadFavorite();
        if(savefav1==0){
            Toast toast=Toast.makeText(ListStopActivity.this, "Долгое нажатие на пункт \n добавляет в Мои остановки", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.BOTTOM,0,100);
            toast.show();
        }

    }


    String[] getStopNameArr(){
        StopData stopdata=new StopData();
        String[] result=stopdata.getStopNameArray();
        return result;
    }

    int getStopId(int position){
        StopData stopdata=new StopData();
        return stopdata.getId(position);
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent=new Intent();
        stopnames=getStopNameArr();

        stopId=getStopId(position);
        intent.putExtra("stopId",stopId);

        setResult(RESULT_OK,intent);
        finish();
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        StopData stopdata=new StopData();
       int stopId = stopdata.getId(position);
        saveFavorite(stopId);
        return true;



    }

    private void saveFavorite( int stopId ) {

        fav1 = getSharedPreferences(FAVORITE_PREF, Context.MODE_PRIVATE);
        SharedPreferences.Editor ed = fav1.edit();
        loadFavorite();


        if (savefav1==0) {
            ed.putInt(FAVORITE1, stopId);
            ed.apply();
            Toast toast=Toast.makeText(ListStopActivity.this,"Сохранено!", Toast.LENGTH_SHORT);
            toast.show();

        }else if(savefav2==0){
            ed.putInt(FAVORITE2, stopId);
            ed.apply();
            Toast toast=Toast.makeText(ListStopActivity.this,"Сохранено!", Toast.LENGTH_SHORT);
            toast.show();

        }else if(savefav3==0){
            ed.putInt(FAVORITE3, stopId);
            ed.apply();
            Toast toast=Toast.makeText(ListStopActivity.this,"Сохранено!", Toast.LENGTH_SHORT);
            toast.show();

        }else{
            ed.putInt(FAVORITE1, stopId);
            ed.apply();
            Toast toast=Toast.makeText(ListStopActivity.this,"Перезапись", Toast.LENGTH_SHORT);
            toast.show();

        };
    }

    private void loadFavorite() {
        fav1 = getSharedPreferences(FAVORITE_PREF, Context.MODE_PRIVATE);
        savefav1=fav1.getInt(FAVORITE1, 0 );
        savefav2=fav1.getInt(FAVORITE2, 0);
        savefav3=fav1.getInt(FAVORITE3, 0);


    }

}

