package es.esy.pskovbus.pskovbus;


/**
 * Created by root on 08.10.16.
 */
public class Route6  extends Route {
    int[][] stopsTimetable={
            //34 ЧЕРЕХА В ЦЕНТР
            {0,604,628,652,704,716,727,738,749,800,812,824,836,848,901,914,927,941,954,1007,1020,1032,1045,1058,1111,1125,1140,1155,1211,1227,1243,1301,1321,1339,1356,1413,1430,1447,1504,1521,1538,1550,1602,1613,1625,1638,1651,1704,1715,1722,1737,1748,1800,1812,1827,1842,1902,1922,1945,2006,2040,2115,2150,2222,2255,2321},
            {0,601,621,641,701,722,741,800,820,840,900,920,940,1000,1020,1040,1056,1112,1128,1144,1201,1218,1235,1252,1309,1327,1346,1405,1423,1444,1505,1525,1545,1604,1622,1637,1652,1709,1726,1744,1802,1822,1843,1907,1932,1957,2023,2051,2119,2154,2229,2304,2339},
            {0,601,626,651,716,743,807,832,857,921,946,1012,1037,1101,1124,1143,1202,1222,1242,1302,1322,1342,1402,1422,1442,1502,1522,1542,1602,1622,1642,1702,1712,1722,1742,1802,1824,1848,1914,1947,2020,2054,2127,2200,2234,2307,2340},

            // советской армии ул в город
            {20},
            {20},
            {20},
            // 6 ВОКЗАЛ
            {27},
            {27},
            {27},
            // ТОРГОВЫЙ ЦЕНТР ОТ ВОКЗАЛА
            {29},
            {29},
            {29},
            // 27 ПЛОЩАДЬ ПОБЕДЫ ВЕЧНЫЙ ОГОНО
            {32},
            {32},
            {32},
            // ДОМ ОФИЦЕРОВ ОТ ДАМБЫ
            {35},
            {35},
            {35},
            // НАРОДНАЯ ОТ ДАМБЫ
            {37},
            {37},
            {37},
            // 10 школа от дамбы
            {39},
            {39},
            {39},
            //РИЖСКИЙ ПР ОТ ДАМБЫ
            {41},
            {41},
            {41},
            /// ТОРГОВЫЙ ДОМ ИЗ ЦЕНТРА
            {44},
            {44},
            {44},
            // ПЕЧОРСКАЯ-ГУЛЛИВЕР
            {46},
            {46},
            {46},

            // РОКОССОВСКОГО ИЗ ЦЕНТРА
            {48},
            {48},
            {48},
            // 31
            {0,515,539,603,615,627,638,649,700,711,723,735,747,759,812,825,838,852,905,918,931,943,956,1009,1022,1036,1051,1106,1122,1138,1154,1212,1232,1250,1307,1324,1341,1358,1415,1432,1449,1501,1513,1524,1536,1549,1602,1615,1626,1633,1648,1659,1711,1723,1738,1753,1813,1833,1856,1921,1955,2030,2105,2137,2210,2237},
            {0,515,535,555,615,634,653,712,732,752,812,832,852,912,932,952,1008,1024,1040,1056,1113,1130,1147,1204,1221,1239,1258,1317,1335,1356,1417,1437,1457,1516,1534,1549,1604,1621,1638,1656,1714,1734,1755,1819,1844,1909,1935,2003,2031,2106,2141,2216,2251},
            {0,515,540,605,630,655,719,744,809,833,858,924,949,1013,1036,1055,1114,1134,1154,1214,1234,1254,1314,1334,1354,1414,1434,1454,1514,1534,1554,1614,1624,1634,1654,1714,1736,1800,1826,1859,1932,2006,2039,2112,2146,2219,2252},

            // 44
            {1},
            {1},
            {1},
            /// ТОРГОВЫЙ ДОМ К ЦЕНТРУ
            {3},
            {3},
            {3},
            // 11 КОММУНАЛЬНАЯ
            {7},
            {7},
            {7},
            //РИЖСКИЙ ПР К ДАМБЕ
            {9},
            {9},
            {9},
            // 10 школа
            {11},
            {11},
            {11},
            //  НАРОДНАЯ К ДАМБЕ
            {13},
            {13},
            {13},
            // ДОМ ОФИЦЕРОВ К ДАМБЕ
            {15},
            {15},
            {15},
            // 28 ПЛОЩАДЬ ПОБЕДЫ ПТУ1
            {18},
            {18},
            {18},
            // ТОРГОВЫЙ ЦЕНТР К ВОКЗАЛУ
            {20},
            {20},
            {20},
            // 7//
            {24},
            {24},
            {24},
            // СОВ АРМИИ УЛ ИЗ ГОРОДА
            {30},
            {30},
            {30},
    };
    int[][] getStopTimeTable(){
        return stopsTimetable;
    }
}