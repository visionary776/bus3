package es.esy.pskovbus.pskovbus;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
/*import android.net.Uri;*/
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import android.content.SharedPreferences;
import android.widget.PopupMenu;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button startDestination;
    Button finalDestination;
    Button changeTime;
    Button openMap;
    ImageButton favourite;
    TextView timeTable;
    TextView transitResult;
    TextView finalStopName;
    TextView startDestinationLabel;


    SharedPreferences fav1;
    int savefav1, savefav2,savefav3;
    public static final String FAVORITE1="Favorite1";
    public static final String FAVORITE2="Favorite2";
    public static final String FAVORITE3="Favorite3";
    public static final String FAVORITE_PREF="Favorites";
// testing

    int stopId=0;
    int finaldestId=0;
    String[][] timetableList;
    String route;
    int DIALOG_TIME = 1;
    int myHour = 12;
    int myMinute = 00;
    int anotherTime=2400;
    int buttonColor=0xFFA1D702;
    int buttonClicked=0xFF75AC00;
    ArrayList<String> geopoints = new ArrayList<String>();

    private static final String TAG="myLogs";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        startDestinationLabel=(TextView)findViewById(R.id.startDestinationLabel);
        timeTable=(TextView)findViewById(R.id.timeTable);
        transitResult=(TextView)findViewById(R.id.transitResult);
        finalStopName=(TextView)findViewById(R.id.finalStopName);

        startDestination=(Button)findViewById(R.id.startDestination);
        startDestination.setOnClickListener(this);
        finalDestination=(Button)findViewById(R.id.finalDestination);
        finalDestination.setOnClickListener(this);
        changeTime=(Button)findViewById(R.id.changeTime);
        changeTime.setOnClickListener(this);
        openMap=(Button)findViewById(R.id.openMap);
        openMap.setOnClickListener(this);
        favourite=(ImageButton)findViewById(R.id.favourite);
        favourite.setOnClickListener(this);




    }






    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.startDestination:
                startDestination.setBackgroundColor(buttonClicked);
                Intent intent1=new Intent(this, ListStopActivity.class);
                startActivityForResult (intent1,1);

                break;
            case R.id.finalDestination:
                finalDestination.setBackgroundColor(buttonClicked);
                Intent intent2=new Intent(this, ListStopActivity.class);
                startActivityForResult (intent2,2);

                break;
            case R.id.changeTime:
                changeTime.setBackgroundColor(buttonClicked);
                showDialog(DIALOG_TIME);

                break;
            case R.id.openMap:
                openMap.setBackgroundColor(buttonClicked);
                Intent intent3=new Intent(this, MapsActivity.class);
                intent3.putExtra("geopoints", geopoints);
                openMap.setBackgroundColor(buttonColor);
                startActivity(intent3);
                break;
            case R.id.favourite:
                favourite.setBackgroundColor(buttonClicked);
                showPopupMenu(v);


                break;


            default:
                break;
        }
    }



    private void addGeoPoint(int id){

        StopData stopdata=new StopData();
        String label=stopdata.getStopNameById(id);
        double []coords=stopdata.getGeoCoord(id);
        String pointX= Double.toString(coords[0]);
        String pointY= Double.toString(coords[1]);
        geopoints.add(label);
        geopoints.add(pointX);
        geopoints.add(pointY);



    }

    protected  void setResult(int stopId, int anotherTime){
        DataArrays dataarrays=new DataArrays();
        StopData stopdata=new StopData();
        String stopName=stopdata.getStopNameById(stopId);
        startDestinationLabel.setText(stopName);
        if(geopoints.size()>0){ geopoints.clear();}
        addGeoPoint(stopId);

        timetableList=dataarrays.getTimetableList(stopId, anotherTime);



        String resultToText="";
        timeTable.setText(resultToText);

        for (String []k:timetableList) {
            if (k!=null) {
                for(String l:k) {

                    if (l != null) {
                        resultToText+=l;
                    }
                }
            }
            resultToText+="\n";
        }
        changeTime.setBackgroundColor(buttonColor);
        timeTable.append(resultToText);

    }


    protected void setTransitresult(int stopId, int finaldestId){
        DataArrays dataarrays=new DataArrays();
        StopData stopdata=new StopData();
        if(geopoints.size()>0){ geopoints.clear();}
        addGeoPoint(stopId);
        addGeoPoint(finaldestId);


        String [][] transitWay;
        Stop startPoint=stopdata.getStopById(stopId);
        Stop finalPoint=stopdata.getStopById(finaldestId);
        String finalDestName=stopdata.getStopNameById(finaldestId);
        finalStopName.setText(finalDestName);
        if(stopId!=0&finaldestId!=0){
            transitWay=dataarrays.getTransitWay(startPoint,finalPoint);
            String resultTransitText="";

            if (transitWay!=null) {
                resultTransitText=transitWay[0][0]+"\n";
                if (transitWay[1]!=null) {
                    for(int l=0; l<transitWay[1].length; l++) {
                        for (String id: transitWay[2]){
                            int id1=Integer.parseInt(id);
                            if (id1!=0) {
                                addGeoPoint(id1);
                            }
                        }
                        if (transitWay[1][l]!=null) {
                            resultTransitText += transitWay[1][l] + "\n";
                        }
                    }
                }
            }
            transitResult.setText(resultTransitText);
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        startDestination.setBackgroundColor(buttonColor);
        finalDestination.setBackgroundColor(buttonColor);



        if (data == null) {
            return;
        }
        if (requestCode == 1) {
            stopId = data.getIntExtra("stopId", 0);
             setResult(stopId, anotherTime);
                if(finaldestId!=0){
                setTransitresult(stopId,finaldestId);
            }
        }
             if (requestCode == 2) {
            finaldestId = data.getIntExtra("stopId", 0);
            setTransitresult(stopId,finaldestId);
        }
    }
    String transitToString(int a) {
        String str = Integer.toString(a);
        String str2 = "";
        if(str.length() == 4) {
            str2 = str.substring(0, 2) + ":" + str.substring(2, 4);
        }

        if(str.length() == 3) {
            str2 = str.substring(0, 1) + ":" + str.substring(1, 3);
        }

        if(str.length() == 2) {
            str2 = "00:" + str.substring(0, 2);
        }

        if(str.length() == 1) {
            str2 = "00:0" + str;
        }

        return str2;
    }
    protected Dialog onCreateDialog(int id) {

        if (id == DIALOG_TIME) {
            TimePickerDialog tpd = new TimePickerDialog(this, myCallBack, myHour, myMinute, true);

            return tpd;


        }


        return super.onCreateDialog(id);
    }

    TimePickerDialog.OnTimeSetListener myCallBack = new TimePickerDialog.OnTimeSetListener() {
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            myHour = hourOfDay;
            myMinute = minute;
            anotherTime=myHour*100+myMinute;
            String timeinStr=transitToString(anotherTime);

            Toast toast=Toast.makeText(MainActivity.this, "Выбранное время: "+timeinStr, Toast.LENGTH_LONG);
            toast.setGravity(Gravity.BOTTOM,0,250);
            toast.show();
            changeTime.setBackgroundColor(buttonColor);
            if (stopId!=0) {
                setResult(stopId, anotherTime);
            }

        }
    };

    private void loadFavorite() {
        fav1 = getSharedPreferences(FAVORITE_PREF, Context.MODE_PRIVATE);
        savefav1=fav1.getInt(FAVORITE1, 0);
        savefav2=fav1.getInt(FAVORITE2, 0);
        savefav3=fav1.getInt(FAVORITE3, 0);


    }

    private void showPopupMenu (View v ){
        PopupMenu popupMenu = new PopupMenu(this,v);
        final Menu menu = popupMenu.getMenu();
        loadFavorite();
        StopData stopdata=new StopData();
        if(savefav1!=0) {
            String stopname=stopdata.getStopNameById(savefav1);
            menu.add(0, 1, 0, stopname);
        }else{
            menu.add(0, 1, 0, "Добавьте остановку...");
        }

        if(savefav2!=0) {
            String stopname=stopdata.getStopNameById(savefav2);
            menu.add(0, 2, 0, stopname);
        }
        if(savefav3!=0) {
            String stopname = stopdata.getStopNameById(savefav3);
            menu.add(0, 3, 0, stopname);

            menu.add(0, 4, 0, "Очистить");
        }
        favourite.setBackgroundColor(buttonColor);
        popupMenu.show();





        popupMenu.setOnMenuItemClickListener( new PopupMenu.OnMenuItemClickListener(){




            @Override
            public boolean onMenuItemClick(MenuItem item) {



                switch (item.getItemId()){
                    case 1:

                        stopId=savefav1;
                        saveFavClick();
                        break;
                    case 2:
                        stopId=savefav2;
                        saveFavClick();
                        break;
                    case 3:
                        stopId=savefav3;
                        saveFavClick();
                        break;
                    case 4:
                        clearClick();
                        break;


                }


                return false;
            }
        });

    }



    private void saveFavClick() {
        loadFavorite();

        if (stopId!=0) {
            setResult(stopId, anotherTime);
        } else{
        Intent intent1=new Intent(this, ListStopActivity.class);
        startActivityForResult (intent1,1);
    }
        if (finaldestId != 0) {
            setTransitresult(stopId, finaldestId);
        }
    }

    private void clearClick(){
        loadFavorite();
        fav1 = getSharedPreferences(FAVORITE_PREF, Context.MODE_PRIVATE);
        SharedPreferences.Editor ed = fav1.edit();

        ed.clear();
        ed.apply();
        Log.d(TAG, "очистили:");


    }

}
