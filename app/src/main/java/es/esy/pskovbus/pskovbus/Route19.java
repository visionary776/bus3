package es.esy.pskovbus.pskovbus;

/**
 * Created by root on 19.10.16.
 */

public class Route19  extends Route {
    int[][] stopsTimetable={
            //15   //ЛЕНИНА ОКТЯБРЬ
            {0,544,622,706,750,835,1004,1048,1132,1231,1315,1359,1453,1537,1641,1732,1822,1912,2047,2131,2215},
            {0,544,622,706,750,835,1004,1048,1132,1231,1315,1359,1453,1537,1641,1732,1822,1912,2047,2131,2215},
            {0,544,622,706,750,835,1004,1048,1132,1231,1315,1359,1453,1537,1641,1732,1822,1912,2047,2131,2215},
            //  ЦЕНТРАЛЬНАЯ ГОРОДСКАЯ БИБЛИОТЕКА
            {3},
            {3},
            {3},
            // 24 ОБЛАСТНАЯ БОЛЬНИЦА К ДАМБЕ
            {5},
            {5},
            {5},
            // ХРАМ НЕВСКОГО К ДАМБЕ
            {7},
            {7},
            {7},
            // ДАМБА К МОСТУ
            {8},
            {8},
            {8},
            // ДОМ ОФИЦЕРОВ ОТ ДАМБЫ
            {10},
            {10},
            {10},
            // НАРОДНАЯ ОТ ДАМБЫ
            {12},
            {12},
            {12},
            // 38 ЦЕМЕНТНЫЙ СКЛАД
            {0,600,644,728,813,853,1026,1110,1150,1253,1337,1417,1515,1600,1710,1800,1850,1936,2109,2153,2233},
            {0,600,644,728,813,853,1026,1110,1150,1253,1337,1417,1515,1600,1710,1800,1850,1936,2109,2153,2233},
            {0,600,644,728,813,853,1026,1110,1150,1253,1337,1417,1515,1600,1710,1800,1850,1936,2109,2153,2233},
            //  НАРОДНАЯ К ДАМБЕ
            {8},
            {8},
            {8},
            // ДОМ ОФИЦЕРОВ К ДАМБЕ
            {10},
            {10},
            {10},
            // 28 ПЛ ПОБЕДЫ ГПТУ
            {13},
            {13},
            {13},
            // гРАЖДАНСКАЯ УЛ
            {15},
            {15},
            {15},

    };
    int[][] getStopTimeTable(){
        return stopsTimetable;
    }
}