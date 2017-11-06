package es.esy.pskovbus.pskovbus;

import java.util.Calendar;

/**
 * Created by root on 09.10.16.
 */
public class TimeData {

    Calendar clnd = Calendar.getInstance();
    int weekday;
    int hour;
    int minutes;
    int date;
    int month;
    int time;
    int today;

    int[] holidays;
    int timeshift=0;

    public TimeData() {
        this.weekday = this.clnd.get(Calendar.DAY_OF_WEEK);
        this.hour = this.clnd.get(Calendar.HOUR_OF_DAY);
        this.minutes = this.clnd.get(Calendar.MINUTE);
        this.date = this.clnd.get(Calendar.DATE);
        this.month = this.clnd.get(Calendar.MONTH);
        this.time = this.hour * 100 + this.minutes;
        this.today = this.month * 100 + this.date;
        this.holidays = new int[]{1, 7, 123, 208, 401, 409, 512, 904, 1112};
    }

    int getTimeshift(){
        time=getTimeNow();
        if (time>2359){///  если заполночь, то смотрим вчерашнее расписание
            if(today>1){today-=1;}
            if (weekday==0){weekday=7;}else{ weekday-=1;}
        }

        for(int i = 0; i < holidays.length; ++i) {// если праздник то по воскресению
            if(today == holidays[i]) {
                return timeshift=2;
            }
            if (weekday==0){
                timeshift=2;
            }else if (weekday==7){
                timeshift=1;
            }else{  timeshift=0;}

        }return timeshift;
    }


    int getTimeNow(){
        if (time<100){
            time+=2400;
        }
        return time;
    }


}
