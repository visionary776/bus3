package es.esy.pskovbus.pskovbus;



/**
 * Created by root on 08.10.16.
 */
public class Route1 extends Route {
    int[][] stopsTimetable={
            // 6 вокзал
            {0,603,619,635,650,659,708,717,726,735,744,754,804,813,823,833,843,853,903,914,926,938,949,1001,1012,1024,1035,1046,1056,1107,1119,1131,1144,1155,1206,1216,1227,1238,1249,1257,1305,1314,1323,1333,1344,1355,1406,1418,1429,1439,1450,1501,1512,1523,1535,1545,1556,1607,1618,1629,1640,1651,1701,1709,1718,1728,1738,1749,1801,1813,1824,1834,1842,1851,1905,1916,1928,1949,2011,2033,2055,2117,2139,2201,2223,2245,2307,2329,2351},
            {0,603,619,636,652,709,724,738,750,802,816,830,844,857,910,924,936,950,1003,1016,1030,1043,1056,1109,1122,1136,1149,1202,1215,1228,1242,1254,1307,1321,1333,1348,1403,1416,1427,1442,1454,1508,1522,1536,1546,1600,1613,1626,1639,1652,1706,1719,1732,1745,1758,1812,1825,1838,1851,1904,1918,1931,1944,1957,2014,2024,2032,2050,2110,2120,2135,2156,2218,2240,2302,2324,2348},
            {0,603,619,636,652,709,724,738,750,802,816,830,844,857,910,924,936,950,1003,1016,1030,1043,1056,1109,1122,1136,1149,1202,1215,1228,1242,1254,1307,1321,1333,1348,1403,1416,1427,1442,1454,1508,1522,1536,1546,1600,1613,1626,1639,1652,1706,1719,1732,1745,1758,1812,1825,1838,1851,1904,1918,1931,1944,1957,2014,2024,2032,2050,2110,2120,2135,2156,2218,2240,2302,2324,2348},
            // Гагарина в центр
            {3},
            {3},
            {3},
            // металлистов в центр
            {5},
            {5},
            {5},
            // 18 Летний сад от вокзала
            {8},
            {8},
            {8},
            //8//ДЕТСКИЙ ПАРК К ЛЕНИНУ
            {10},
            {10},
            {10},

            // 14ЛЕНИНА ДКП
            {0,615,631,647,702,711,720,729,738,747,756,806,816,825,835,845,855,905,915,926,938,950,1001,1013,1024,1036,1047,1058,1108,1119,1131,1143,1156,1207,1218,1228,1239,1250,1301,1309,1317,1326,1335,1345,1356,1407,1418,1430,1441,1451,1502,1513,1524,1535,1547,1557,1608,1619,1630,1641,1652,1703,1713,1721,1730,1740,1750,1801,1813,1825,1836,1846,1854,1903,1917,1928,1940,2001,2023,2045,2107,2129,2151,2213,2235,2257,2319,2341,2403},
            {0,615,631,648,704,721,736,750,802,814,828,842,856,909,922,936,948,1002,1015,1028,1042,1055,1108,1121,1134,1148,1201,1214,1227,1240,1254,1306,1319,1333,1345,1400,1415,1428,1439,1454,1506,1520,1534,1548,1558,1612,1625,1638,1651,1704,1718,1731,1744,1757,1810,1824,1837,1850,1903,1916,1930,1943,1956,2009,2026,2036,2044,2102,2122,2132,2147,2208,2230,2252,2314,2336,2400},
            {0,615,631,648,704,721,736,750,802,814,828,842,856,909,922,936,948,1002,1015,1028,1042,1055,1108,1121,1134,1148,1201,1214,1227,1240,1254,1306,1319,1333,1345,1400,1415,1428,1439,1454,1506,1520,1534,1548,1558,1612,1625,1638,1651,1704,1718,1731,1744,1757,1810,1824,1837,1850,1903,1916,1930,1943,1956,2009,2026,2036,2044,2102,2122,2132,2147,2208,2230,2252,2314,2336,2400},
// Кошевого из центра
            {2},
            {2},
            {2},
// невского из центра
            {5},
            {5},
            {5},
            // мясокомбинат из центра
            {7},
            {7},
            {7},
// льнокомбинат из центра
            {8},
            {8},
            {8},
            // северная
            {9},
            {9},
            {9},
            // Чудская из цетра
            {10},
            {10},
            {10},
            // ижорского из центра
            {11},
            {11},
            {11},
            // овсище из центра
            {12},
            {12},
            {12},

            //Алехина из центра
            {14},
            {14},
            {14},
            // 42/ /Колокольня из центра
            {16},
            {16},
            {16},
            // 32 снятная гора
            {0,600,634,650,700,710,721,730,739,748,757,806,815,825,835,844,854,904,914,924,934,945,957,1009,1020,1032,1043,1055,1106,1117,1127,1138,1150,1202,1215,1226,1237,1247,1258,1309,1320,1328,1336,1345,1354,1404,1415,1426,1437,1449,1500,1510,1521,1532,1543,1554,1606,1616,1627,1638,1649,1700,1711,1722,1732,1740,1749,1759,1809,1820,1832,1844,1855,1904,1913,1921,1936,1946,1959,2020,2042,2104,2126,2148,2210,2232,2254,2316,2337,2359,2421},
            {0,601,617,634,650,707,723,740,755,809,821,833,847,901,915,928,941,955,1007,1021,1034,1047,1101,1114,1127,1140,1153,1207,1220,1233,1246,1259,1313,1324,1337,1352,1403,1419,1433,1446,1458,1512,1525,1539,1553,1606,1617,1631,1644,1657,1710,1723,1737,1750,1803,1816,1829,1843,1856,1909,1922,1935,1949,2001,2015,2028,2045,2103,2121,2141,2150,2206,2227,2249,2311,2332,2354,2418},
            {0,601,617,634,650,707,723,740,755,809,821,833,847,901,915,928,941,955,1007,1021,1034,1047,1101,1114,1127,1140,1153,1207,1220,1233,1246,1259,1313,1324,1337,1352,1403,1419,1433,1446,1458,1512,1525,1539,1553,1606,1617,1631,1644,1657,1710,1723,1737,1750,1803,1816,1829,1843,1856,1909,1922,1935,1949,2001,2015,2028,2045,2103,2121,2141,2150,2206,2227,2249,2311,2332,2354,2418},

            // 41 /Колокольня в центр
            {1},
            {1},
            {1},

            // 1 АЛЕХИНА УЛ В ЦЕНТР
            {0, 531,547,603,618,627,637,645,653,703,713,724,733,742,751,800,809,818,828,838,847,857,907,917,927,937,948,1000,1012,1023,1035,1046,1058,1109,1120,1130,1141,1153,1205,1218,1229,1240,1250,1301,1312,1323,1331,1339,1348,1357,1407,1418,1429,1440,1452,1503,1513,1524,1535,1546,1557,1609,1619,1630,1641,1652,1703,1714,1725,1735,1743,1752,1802,1812,1823,1835,1847,1858,1907,1916,1924,1939,1949,2002,2023,2045,2107,2129,2151,2213,2235,2257,2319,2340,2402,2424},
            {0,531,547,604,620,637,653,710,718,726,743,758,812,824,836,850,856,904,918,931,944,958,1010,1024,1037,1050,1104,1117,1130,1143,1156,1210,1223,1236,1249,1302,1316,1327,1340,1355,1406,1422,1436,1449,1501,1515,1528,1542,1556,1609,1620,1634,1647,1700,1713,1726,1740,1753,1806,1819,1832,1846,1859,1912,1925,1938,1952,2004,2018,2031,2048,2106,2124,2144,2153,2209,2230,2252,2314,2335,2357,2421},
            {0,531,547,604,620,637,653,710,718,726,743,758,812,824,836,850,856,904,918,931,944,958,1010,1024,1037,1050,1104,1117,1130,1143,1156,1210,1223,1236,1249,1302,1316,1327,1340,1355,1406,1422,1436,1449,1501,1515,1528,1542,1556,1609,1620,1634,1647,1700,1713,1726,1740,1753,1806,1819,1832,1846,1859,1912,1925,1938,1952,2004,2018,2031,2048,2106,2124,2144,2153,2209,2230,2252,2335,2335,2357,2421},

            // 39 // ОВСИЩЕ
            {2},
            {2},
            {2},
// ижорского в центр
            {3},
            {3},
            {3},
            // 40 ЧУДСКАЯ
            {4},
            {4},
            {4},
            // льнокомбинат в центр
            {6},
            {6},
            {6},
            // мясокомбинат в центр 57
            {7},
            {7},
            {7},
            // 22 НЕВСКОГО В ЦЕНТР
            {11},
            {11},
            {11},

            // Кошевого в центр 60
            {13},
            {13},
            {13},
            // 16 //ЛЕНИНА КРЕМЛЬ
            {15},
            {15},
            {15},
            // 9 //ДЕТСКИЙ ПАРК К ВОКЗАЛУ
            {17},
            {17},
            {17},

            // 19  //ЛЕТНИЙ САД К ВОКЗАЛУ
            {19},
            {19},
            {19},
            // металлистов к вокзалу
            {21},
            {21},
            {21},
            // Гагарина к вокзалу
            {23},
            {23},
            {23},
            // 6
    };

    int[][] getStopTimeTable(){
        return stopsTimetable;
    }
}
