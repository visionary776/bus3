package es.esy.pskovbus.pskovbus;



/**
 * Created by root on 08.10.16.
 */
public class Route5  extends Route {


    int[][] stopsTimetable={
            // 6 //ВОКЗАЛ
            {0,1726,1815},
            {0},
            {0},
            // ТОРГОВЫЙ ЦЕНТР ОТ ВОКЗАЛА
            {2},
            {2},
            {2},
            // 27 ПЛОЩАДЬ ПОБЕДЫ ВЕЧНЫЙ ОГОНЬ
            {724,1732,1821},
            {0},
            {0},
            //ДАМБА ОТ МОСТА
            {3},
            {3},
            {3},
            // ХРАМ НЕВСКОГО ОТ ДАМБЫ
            {5},
            {5},
            {5},
            // 23 ОБЛ БОЛЬНИЦА ОТ ДАМБЫ
            {6},
            {6},
            {6},
            // 17 ЛЕНИНА СБЕРБАНК
            {12},
            {12},
            {12},
            // 9 ДЕТПАРК ОТ ЛЕНИНА
            {13},
            {13},
            {13},
            //ЛЕТНИЙ САД КУЗНЕЦКАЯ
            {15},
            {15},
            {15},
            // ИППОДРОМНАЯ ИЗ Ц
            {19},
            {19},
            {19},

            // 2 АРХИВ
            {0,728,752},
            {0},
            {0},
            //НОВОСЕЛОВ УЛ
            {1},
            {1},
            {1},
            // ЗВЕЗДНАЯ
            {3},
            {3},
            {3},
            // тескстильная в центр
            {5},
            {5},
            {5},
            // 12 школа в центр
            {7},
            {7},
            {7},
            // ТРУДА В ЦЕНТР
            {10},
            {10},
            {10},
            // 15 ЛЕНИНА ОКТЯБРЬ
            {12},
            {12},
            {12},
            //  ЦЕНТРАЛЬНАЯ ГОРОДСКАЯ БИБЛИОТЕКА
            {15},
            {15},
            {15},
            // 24 ОБЛ БОЛЬНИЦА К ДАМБЕ
            {17},
            {17},
            {17},
            // ХРАМ НЕВСКОГО К ДАМБЕ
            {18},
            {18},
            {18},
            // ДАМБА К МОСТУ
            {20},
            {20},
            {20},
            // 28 ПЛ ПОБЕДЫ ГПТУ
            {24},
            {24},
            {24},
            // ТОРГОВЫЙ ЦЕНТР К ВОКЗАЛУ
            {26},
            {26},
            {26},
            //  ГАГАРИНА ФАБРИЦ
            {28},
            {28},
            {28},
    };
    int[][] getStopTimeTable(){
        return stopsTimetable;
    }
}
