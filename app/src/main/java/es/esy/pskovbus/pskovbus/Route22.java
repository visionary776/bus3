package es.esy.pskovbus.pskovbus;

/**
 * Created by root on 19.10.16.
 */

public class Route22  extends Route {
    int[][] stopsTimetable={
            //2 архив
            {0,646,704,730,803,832,850,921,937,955,1017,1051,1111,1150,1215,1246,1312,1327,1348,1413,1433,1445,1513,1554,1625,1645,1724,1744,1807,1846,1909,2111},
            {0,649,727,805,843,921,959,1037,1209,1321,1346,1443,1500,1618,1649,1806,2121},
            {0,649,727,805,843,921,959,1037,1209,1321,1346,1443,1500,1618,1649,1806,2121},
            //НОВОСЕЛОВ УЛ
            {1},
            {1},
            {1},
            // 10 звездная
            {3},
            {3},
            {3},
            // тестильная в центр
            {5},
            {5},
            {5},
            // 12 ШКОЛА В ЦЕНТР
            {9},
            {9},
            {9},
            // ТРУДА В ЦЕНТР
            {11},
            {11},
            {11},
            // 15 ленина октябрь
            {0,659,717,743,816,845,903,934,950,1008,1030,1104,1124,1203,1228,1259,1325,1340,1401,1426,1446,1458,1526,1607,1638,1658,1737,1757,1820,1859,1922,1953,2124},
            {0,701,739,817,855,933,1011,1049,1221,1333,1358,1455,1512,1630,1701,1818,1943,2133},
            {0,701,739,817,855,933,1011,1049,1221,1333,1358,1455,1512,1630,1701,1818,1943,2133},
            //Петровская из центра
            {2},
            {2},
            {2},
            // 20 маяк из центра
            {5},
            {5},
            {5},
            // ЮБИЛЕЙНАЯ 100067
            {7},
            {7},
            {7},
            // ЗАПАДНАЯ
            {9},
            {9},
            {9},
            // 33 телецентр
            {11},
            {11},
            {11},
            // 31 рокоссовского
            {0,714,732,738,758,824,834,903,921,952,1005,1023,1045,1119,1139,1218,1243,1314,1340,1355,1416,1441,1501,1513,1541,1622,1653,1713,1755,1815,1838,1917,1940,2011,2139},
            {0,715,753,831,909,947,1025,1103,1235,1347,1412,1509,1526,1644,1715,1832,1957,2147},
            {0,715,753,831,909,947,1025,1103,1235,1347,1412,1509,1526,1644,1715,1832,1957,2147},
            // 44 печорсккая
            {1},
            {1},
            {1},
            /// ТОРГОВЫЙ ДОМ К ЦЕНТРУ
            {3},
            {3},
            {3},
            // 45 коомунальная к чудской
            {6},
            {6},
            {6},
            // АЛМАЗНАЯ ОТ МОСТА
            {8},
            {8},
            {8},
// ижорского в центр
            {10},
            {10},
            {10},
            //40 чудская в центр
            {11},
            {11},
            {11},
            // 43 полит колледж
            {0,615,633,659,719,732,758,805,816,847,903,921,946,1020,1040,1119,1144,1215,1241,1256,1317,1342,1402,1414,1442,1523,1554,1614,1650,1710,1733,1812,1835,1906,2040},
            {0,618,656,734,812,850,928,1006,1138,1250,1315,1412,1429,1547,1618,1735,1900,2050},
            {0,618,656,734,812,850,928,1006,1138,1250,1315,1412,1429,1547,1618,1735,1900,2050},
            // 49 чудская из центра
            {2},
            {2},
            {2},
// ижорского бат из цетра
            {3},
            {3},
            {3},
            // АЛМАЗНАЯ К МОСТУ
            {5},
            {5},
            {5},
            //11 коммунальная
            {9},
            {9},
            {9},
            // 35 юбилейная
            {11},
            {11},
            {11},
            // 68 УНИВЕРМАГ
            {13},
            {13},
            {13},
            // 21 маяк в центр
            {15},
            {15},
            {15},
            // 25 петровская в центр
            {17},
            {17},
            {17},
            // ГОРЬКОГО УЛ
            {19},
            {19},
            {19},
            // 14 ленина дкп
            {22},
            {22},
            {22},
            // ТРУДА ИЗ ЦЕНТРА
            {24},
            {24},
            {24},
            // 12 ШКОЛА ИЗ ЦЕНТРА
            {26},
            {26},
            {26},
            // БЕЛИНСКОГО
            {28},
            {28},
            {28},
            // текстильная из центра
            {30},
            {30},
            {30},
    };
    int[][] getStopTimeTable(){
        return stopsTimetable;
    }
}
