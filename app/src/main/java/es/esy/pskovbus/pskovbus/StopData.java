package es.esy.pskovbus.pskovbus;

/**
 * Created by root on 31.10.16.
 */
//import android.util.Log;

public class StopData {



    public  Stop getStopById(int stopId){
        Stop stophere=null;
        for (int i=0; i<stopDataArray.length; i++) {
            if (stopDataArray[i].id==stopId){
                stophere=stopDataArray[i];
                break;

            }

        }
        return stophere;
    }




public  String[] getStopNameArray(){
    int l=stopDataArray.length;
      String []stopNameArray=new String[l];
            for (int i=0; i<l; i++) {
             stopNameArray[i]=stopDataArray[i].name;
                    }
            return stopNameArray;
            }

    public double []  getGeoCoord(int stopId){
        int pos=getPosById(stopId);

                return stopDataArray[pos].geo;
            }


    public String getStopNameById(int id){
        int pos=getPosById(id);
        return stopDataArray[pos].name;
    }


    public int getId(int pos){
        return stopDataArray[pos].id;
    }

   public int getPosById(int id){
        int result=0;
        for (int i=0; i<stopDataArray.length; i++) {
            if (stopDataArray[i].id==id){
                result=i;
                break;
            }
        }
        return result;
    }

     Stop  stop1=new Stop( "10 Школа от дамбы ",101 ,                            new double[]{57.810283, 28.302834}, new int[]{6,16});
     Stop  stop2=new Stop( "10 Школа к дамбе ",102 ,                             new double[]{57.810695, 28.300882}, new int[]{6,16});
     Stop  stop3=new Stop( "12 Школа в центр ",89 ,                              new double[]{57.828626, 28.339010}, new int[]{5,11,22,30});
     Stop  stop4=new Stop( "12 Школа из центра ",90 ,                            new double[]{57.827278, 28.338221}, new int[]{11,22,30});
     Stop  stop5=new Stop("Алехина ул. в центр", 50001,                          new double[]{57.835927, 28.286727}, new int[]{1, 16, 18});
     Stop  stop6=new Stop("Алехина ул. из центра", 50050,                        new double[]{57.836187, 28.286011}, new int[]{1, 16, 18});
     Stop  stop7=new Stop( "Алмазная ул. к мосту ",85 ,                          new double[]{57.828755, 28.292452}, new int[]{16,22});
     Stop  stop8=new Stop( "Алмазная ул. от моста ",86 ,                         new double[]{57.829110, 28.292999}, new int[]{16,22});
     Stop  stop9=new Stop( "Архив"                         ,40002 ,              new double[]{57.832734, 28.353279}, new int[]{5, 11, 22, 23, 25, 30});
     Stop stop10=new Stop( "Балтийская"                     ,3 ,                 new double[]{57.810565, 28.264685}, new int[]{17,20,25});
     Stop stop11=new Stop( "Балтийская ул. (школа 27) ",128 ,                    new double[]{57.810012, 28.264671}, new int[]{2,25});
     Stop stop12=new Stop( "Белинского ул.",91 ,                                 new double[]{57.830991, 28.341303}, new int[]{11,22,30});
     Stop stop13=new Stop( "Белый мох в город"              ,4,                  new double[]{57.827936, 28.446735}, new int[]{9});
     Stop stop14=new Stop( "Ваулино в город"                ,5 ,                 new double[]{57.873175, 28.318782}, new int[]{7});
     Stop stop15=new Stop( "Венская в город ",126 ,                              new double[]{57.807414, 28.253457}, new int[]{20});
     Stop stop16=new Stop( "Виадук к вокзалу ",118 ,                             new double[]{57.807572, 28.364888}, new int[]{14,23});
     Stop stop17=new Stop( "Виадук от вокзала ",119 ,                            new double[]{57.807511, 28.365263}, new int[]{14,23});
     Stop stop18=new Stop( "Вокзал"                        ,10006 ,              new double[]{57.805280, 28.361365}, new int[]{1, 2, 5, 6, 8, 9, 11, 12, 14, 15, 16, 17, 23});
     Stop stop19=new Stop( "Вокзал в Череху"               ,10007 ,              new double[]{57.804043, 28.359638}, new int[]{6});
     Stop stop20=new Stop( "Гагарина ул. в центр ", 150064,                      new double[]{57.810486, 28.358281}, new int[]{1,4,14,15,17});
     Stop stop21=new Stop( "Гагарина ул. к вокзалу ",150065 ,                    new double[]{57.809429, 28.361623}, new int[]{1,4,9,12,14,15,17});
     Stop stop22=new Stop( "Гагарина ул. (Фабрициуса) ", 114,                    new double[]{57.805678, 28.353606}, new int[]{2,5,6,11,16});
     Stop stop23=new Stop( "Городская больница к центру ", 75,                   new double[]{57.820072, 28.302477}, new int[]{14});
     Stop stop24=new Stop( "Городская больница от центра ",76 ,                  new double[]{57.820078, 28.300857}, new int[]{14});
     Stop stop25=new Stop( "Горького ул. ",103 ,                                 new double[]{57.818392, 28.322221}, new int[]{3,4,7,14,15,17,18,22,25,30});
     Stop stop26=new Stop( "Гражданская ул. от вокзала ",123 ,                   new double[]{57.807877, 28.345943}, new int[]{8,11,19});
     Stop stop27=new Stop( "Гражданская ул.  ",124 ,                             new double[]{57.808427, 28.346259}, new int[]{11});
     Stop stop28=new Stop( "Дамба от моста ",106 ,                               new double[]{57.804756, 28.324535}, new int[]{2,5});
     Stop stop29=new Stop( "Дамба к мосту ",107 ,                                new double[]{57.804719, 28.324285}, new int[]{2,5,8,19});
     Stop stop30=new Stop( "Детская обл. больница к центру",47 ,                 new double[]{57.819682, 28.297273}, new int[]{14});
     Stop stop31=new Stop( "Детская обл. больница от центра ",74 ,               new double[]{57.819720, 28.296061}, new int[]{14});
     Stop stop32=new Stop( "Детский парк к пл.Ленина",20008 ,                    new double[]{57.815305, 28.33928 }, new int[]{1, 3, 4, 8, 11, 14, 15, 17});
     Stop stop33=new Stop( "Детский парк к вокзалу", 20009,                      new double[]{57.815660, 28.337269}, new int[]{1, 3, 4, 5, 8, 11, 14, 15, 17});
     Stop stop34=new Stop( "Дом офицеров от дамбы ",79 ,                         new double[]{57.805466, 28.319627}, new int[]{6,16,19});
     Stop stop35=new Stop( "Дом офицеров к дамбе ",80 ,                          new double[]{57.805847, 28.317808}, new int[]{6,16,19});
     Stop stop36=new Stop( "Западная ",69 ,                                      new double[]{57.813336, 28.290657}, new int[]{7,15,17,22,30});
     Stop stop37=new Stop( "Звездная" ,10 ,                                      new double[]{57.836884, 28.347902}, new int[]{5, 11, 22, 23, 25, 30});
     Stop stop38=new Stop( "Ижорского бат-на в центр" ,52 ,                      new double[]{57.835864, 28.299417}, new int[]{1,18,22});
     Stop stop39=new Stop( "Ижорского бат-на из центра" ,53 ,                    new double[]{57.835873, 28.298349}, new int[]{1,18,22});
     Stop stop40=new Stop( "Инженерная в город"        , 36,                     new double[]{57.82383,  28.362041}, new int[]{3});
     Stop stop41=new Stop( "Ипподромная в центр (25маршрут) ",97 ,               new double[]{57.833196, 28.332446}, new int[]{25});
     Stop stop42=new Stop( "Ипподромная из центра (25маршрут) ",98 ,             new double[]{57.832924, 28.331979}, new int[]{25});
     Stop stop43=new Stop( "Ипподромная в центр ( Индустриальная ) ",116 ,       new double[]{57.821966, 28.356794}, new int[]{3});
     Stop stop44=new Stop( "Ипподромная из центра ( Индустриальная ) ",117 ,     new double[]{57.820729, 28.355485}, new int[]{3,5});
     Stop stop45=new Stop( "Колокольная в центр",41 ,                            new double[]{57.836805, 28.271887}, new int[]{1, 16});
     Stop stop46=new Stop( "Колокольная из центра", 42,                          new double[]{57.836805, 28.271887}, new int[]{1, 16});
     Stop stop47=new Stop( "Коммунальная в центр", 90011,                        new double[]{57.818869, 28.292523}, new int[]{2, 3, 4, 6, 16, 17,18,20, 22, 25, 30});
     Stop stop48=new Stop( "Коммунальная к Чудской", 90045 ,                     new double[]{57.820269, 28.293090}, new int[]{16, 22});
     Stop stop49=new Stop( "Корытово в центр",  12,                              new double[]{57.784224, 28.342333}, new int[]{8});
     Stop stop50=new Stop( "Кошевого ул. в центр ",60 ,                          new double[]{57.825135, 28.331292}, new int[]{1, 7, 18,20, 25});
     Stop stop51=new Stop( "Кошевого ул. из центра ",61 ,                        new double[]{57.825379, 28.330901}, new int[]{1, 7, 18, 20,25});
     Stop stop52=new Stop( "Кресты в центр",  990013 ,                           new double[]{57.795124, 28.415793}, new int[]{4, 9, 12});
     Stop stop53=new Stop( "Кресты из центра",990048 ,                           new double[]{57.795124, 28.415793}, new int[]{4, 9, 12});
     Stop stop54=new Stop( "Ледовый дворец", 70,                                 new double[]{57.812767, 28.269174}, new int[]{17,20,25});
     Stop stop55=new Stop( "Ледовый дворец из центра ", 131,                     new double[]{57.812353, 28.267004}, new int[]{2,25});
     Stop stop56=new Stop( "Ленина пл. ДКП",  30014,                             new double[]{57.820033, 28.331829}, new int[]{1, 7, 11, 18, 20,22, 25, 30});
     Stop stop57=new Stop( "Ленина пл. кт.Октябрь",   30015 ,                    new double[]{57.819239, 28.331239}, new int[]{3, 4, 5, 7, 8, 14, 15, 17, 18,20, 19, 22, 25, 30});
     Stop stop58=new Stop( "Ленина пл. Кремль",  30016 ,                         new double[]{57.820517, 28.331293}, new int[]{1, 11});
     Stop stop59=new Stop( "Ленина пл. Сбербанк",30017 ,                         new double[]{57.818599, 28.332312}, new int[]{3, 4, 5, 14, 15, 17});
     Stop stop60=new Stop( "Лента",   46 ,                                       new double[]{57.805684, 28.269138}, new int[]{25});
     Stop stop61=new Stop( "Летний Сад от вокзала", 140018 ,                     new double[]{57.813817, 28.345617}, new int[]{1, 3, 4, 8, 11, 14, 15, 17});
     Stop stop62=new Stop( "Летний Сад к вокзалу", 140019 ,                      new double[]{57.813717, 28.345392}, new int[]{1, 4, 11, 14, 15, 17});
     Stop stop63=new Stop( "Летний сад (Кузнецкая ул.) ",115 ,                   new double[]{57.814757, 28.347748}, new int[]{3,5});
     Stop stop64=new Stop( "Льнокомбинат в центр", 54 ,                          new double[]{57.834625, 28.311733}, new int[]{1, 18,20});
     Stop stop65=new Stop( "Льнокомбинат из центра", 55 ,                        new double[]{57.834381, 28.312254}, new int[]{1, 18,20});
     Stop stop66=new Stop( "Люксембург Р. ул. ",110 ,                            new double[]{57.815138, 28.321016}, new int[]{2});
     Stop stop67=new Stop( "Маяк от центра", 70020 ,                             new double[]{57.816853, 28.304212}, new int[]{2, 3, 4, 7, 15, 17, 18, 20,22, 25, 30});
     Stop stop68=new Stop( "Маяк в центр",70021 ,                                new double[]{57.817214, 28.307420}, new int[]{2, 3, 4, 7, 15, 17, 18, 20,22, 25, 30});
     Stop stop69=new Stop( "Мебельный магазин ",111 ,                            new double[]{57.814259, 28.310253}, new int[]{2});
     Stop stop70=new Stop( "Металлистов ул. в центр ",62,                        new double[]{57.812012, 28.352448}, new int[]{1,4,14,15,17});
     Stop stop71=new Stop( "Металлистов ул. к вокзалу",63,                       new double[]{57.81162,  28.353327}, new int[]{1,4,14,15,17});
     Stop stop72=new Stop( "Мясокомбинат в центр"  , 57,                         new double[]{57.832137, 28.315389}, new int[]{1,7,18,20});
     Stop stop73=new Stop( "Мясокомбинат из центра ", 58,                        new double[]{57.832455, 28.31503 }, new int[]{1,7,18,20});
     Stop stop74=new Stop( "Народная от дамбы ",81 ,                             new double[]{57.808513, 28.309488}, new int[]{6,16,19});
     Stop stop75=new Stop( "Народная к дамбе ",82 ,                              new double[]{57.809031, 28.306929}, new int[]{6,16,19});
     Stop stop76=new Stop( "Невского в центр",60022 ,                            new double[]{57.828292, 28.322583}, new int[]{1, 7, 18,20, 25});
     Stop stop77=new Stop( "Невского из центра ", 60059,                         new double[]{57.829055, 28.321582}, new int[]{1, 7, 18,20, 25});
     Stop stop78=new Stop( "Новоселов ул. ",94 ,                                 new double[]{57.835138, 28.354344}, new int[]{5, 11, 22, 23, 25, 30});
     Stop stop79=new Stop( "Обл.Больница от Дамбы", 23 ,                         new double[]{57.813201, 28.322610}, new int[]{2, 5});
     Stop stop80=new Stop( "Обл.Больница к Дамбе", 24 ,                          new double[]{57.812846, 28.322331}, new int[]{2, 5, 8, 19});
     Stop stop81=new Stop( "Овсище в центр",120039 ,                             new double[]{57.835254, 28.2919 }, new int[]{1, 16,18});
     Stop stop82=new Stop( "Овсище из центра",120051 ,                           new double[]{57.835378, 28.292545}, new int[]{1, 16,18});
     Stop stop83=new Stop( "Петровская в центр",25 ,                             new double[]{57.817870, 28.315703}, new int[]{2, 3, 4, 7, 15, 17, 18, 22, 25, 30});
     Stop stop84=new Stop( "Петровская ул. из центра ",66 ,                      new double[]{57.818229, 28.318507}, new int[]{3, 4, 7, 15, 17, 18, 22, 25, 30});
     Stop stop85=new Stop( "Петровская в центр (на Коммунальной) ",77 ,          new double[]{57.820999, 28.315191}, new int[]{14});
     Stop stop86=new Stop( "Петровская из центра (на Коммунальной) ",78 ,        new double[]{57.821222, 28.316602}, new int[]{14});
     Stop stop87=new Stop( "Печорская", 44 ,                                     new double[]{57.815932, 28.280924}, new int[]{2,3, 4, 6, 14, 17, 18, 20,22, 25, 30});
     Stop stop88=new Stop( "Печорская тк.Гулливер ", 71,                         new double[]{57.815539, 28.279221}, new int[]{2,3,4,6,14,18,20,25});
     Stop stop89=new Stop( "Писковичи в город",26 ,                              new double[]{57.862994, 28.209880}, new int[]{18});
     Stop stop90=new Stop( "Пл.Победы вечный огонь", 110027 ,                    new double[]{57.807767, 28.339227}, new int[]{2, 6, 16});
     Stop stop91=new Stop( "Пл.Победы ГПТУ1", 110028 ,                           new double[]{57.806753, 28.338562}, new int[]{2, 6, 8, 16, 19});
     Stop stop92=new Stop( "Политехнический колледж", 43 ,                       new double[]{57.841663, 28.30196}, new int[]{20,22});
     Stop stop93=new Stop( "Псковкирпич", 29 ,                                   new double[]{57.756918, 28.411393}, new int[]{12});
     Stop stop94=new Stop( "Псковпищепром в центр ",95 ,                         new double[]{57.831653, 28.324451}, new int[]{25});
     Stop stop95=new Stop( "Псковпищепром из центра ",96 ,                       new double[]{57.831467, 28.324199}, new int[]{25});
     Stop stop96=new Stop( "Пчеловод", 37 ,                                      new double[]{57.827654, 28.406357}, new int[]{14});
     Stop stop97=new Stop( "Рижский пр. от дамбы ", 100083,                      new double[]{57.813310, 28.294857}, new int[]{6,16});
     Stop stop98=new Stop( "Рижский пр. к дамбе ", 100084,                       new double[]{57.813196, 28.294240}, new int[]{6,16});
     Stop stop99=new Stop( "Рижское шоссе ",112 ,                                new double[]{57.808003, 28.270249}, new int[]{7,15,17,20});
    Stop stop100=new Stop( "Рижское шоссе в город ",129 ,                        new double[]{57.807680, 28.269669}, new int[]{2,7,15,20});
    Stop stop101=new Stop( "Родина", 30 ,                                        new double[]{57.831747, 28.255382}, new int[]{20});
    Stop stop102=new Stop( "Рокоссовского ул.", 80031 ,                          new double[]{57.814091, 28.274265}, new int[]{2,3, 4, 6, 14, 17, 18,20, 22, 25, 30});
    Stop stop103=new Stop( "Рокоссовского ул. из центра ",80127 ,                new double[]{57.814355, 28.274694}, new int[]{2,3,4,6,14,25});
    Stop stop104=new Stop( "Северная", 56,                                       new double[]{57.837745, 28.307675}, new int[]{1,18,20});
    Stop stop105=new Stop( "Снятная Гора", 32 ,                                  new double[]{57.836713, 28.271679}, new int[]{1, 16});
    Stop stop106=new Stop( "Советской армии ул. в центр ",121 ,                  new double[]{57.794856, 28.346387}, new int[]{6});
    Stop stop107=new Stop( "Советской армии ул. из центра ",122 ,                new double[]{57.794094, 28.346334}, new int[]{6});
    Stop stop108=new Stop( "Текстильная ул. в центр ",92 ,                       new double[]{57.833858, 28.344441}, new int[]{5,11,22,30});
    Stop stop109=new Stop( "Текстильная ул. из центра ",93 ,                     new double[]{57.832842, 28.345471}, new int[]{11,22,23,25,30});
    Stop stop110=new Stop( "Телецентр", 33 ,                                     new double[]{57.810524, 28.279955}, new int[]{ 7, 15, 17, 22, 30});
    Stop stop111=new Stop( "Телецентр в город ", 130 ,                           new double[]{57.810443, 28.280193}, new int[]{7,15});
    Stop stop112=new Stop( "Торговый дом в центр ",72 ,                          new double[]{57.817642, 28.284506}, new int[]{2, 3, 4, 6, 14, 17, 18,20, 22, 25, 30});
    Stop stop113=new Stop( "Торговый дом из центра ",73 ,                        new double[]{57.819164, 28.286996}, new int[]{2,3, 4, 6, 14, 18, 20, 25,});
    Stop stop114=new Stop( "Торговый центр от вокзала",160104 ,                  new double[]{57.806477, 28.349439}, new int[]{2,5,6,11,16});
    Stop stop115=new Stop( "Торговый центр к вокзалу",160105 ,                   new double[]{57.806793, 28.346642}, new int[]{2,5,6,11,16});
    Stop stop116=new Stop( "Труда ул. в центр ",87 ,                             new double[]{57.824943, 28.335590}, new int[]{5,11,22,30});
    Stop stop117=new Stop( "Труда ул. из центра ",88 ,                           new double[]{57.824564, 28.335391}, new int[]{11,22,30});
    Stop stop118=new Stop( "Тямша в город ",120 ,                                new double[]{57.745398, 28.153643}, new int[]{15});
    Stop stop119=new Stop( "Универмаг ",68,                                      new double[]{57.815924, 28.301209}, new int[]{2, 3, 4, 7, 15, 17, 18, 22, 25, 30});
    Stop stop120=new Stop( "Учхоз в город ",125 ,                                new double[]{57.790509, 28.413025}, new int[]{4,12});
    Stop stop121=new Stop( "Храм Невского от дамбы ",108 ,                       new double[]{57.808730, 28.322812}, new int[]{2,5});
    Stop stop122=new Stop( "Храм Невского к дамбе ",109 ,                        new double[]{57.808666, 28.322622}, new int[]{2,5,8,19});
    Stop stop123=new Stop( "Цементный склад", 38 ,                               new double[]{57.79003,  28.286598}, new int[]{19});
    Stop stop124=new Stop( "Центральная Гор.Библиотека ",113 ,                   new double[]{57.817259, 28.321240}, new int[]{2,5,8,19});
    Stop stop125=new Stop( "Череха в центр", 34 ,                                new double[]{57.745008, 28.370854}, new int[]{6});
    Stop stop126=new Stop( "Чудская в центр", 130040 ,                           new double[]{57.837909, 28.304449}, new int[]{1, 18, 22});
    Stop stop127=new Stop( "Чудская из центра",130049 ,                          new double[]{57.838381, 28.304666}, new int[]{1, 18, 22});
    Stop stop128=new Stop( "Энтузиастов пр. в центр ",99 ,                       new double[]{57.835692, 28.343322}, new int[]{25});
    Stop stop129=new Stop( "Энтузиастов пр. из центра",100 ,                     new double[]{57.835582, 28.343996}, new int[]{25});
    Stop stop130=new Stop( "Юбилейная в центр", 100035 ,                         new double[]{57.814272, 28.295574}, new int[]{2, 3, 4, 7, 15, 17, 18,20, 22, 25, 30});
    Stop stop131=new Stop( "Юбилейная из центра ",100067 ,                       new double[]{57.814750, 28.296054}, new int[]{2, 3, 4, 7, 15, 17, 18,20, 22, 25, 30});

//            Stop stop =new Stop( " ", ,                    new double[]{}, new int[]{});






    private Stop [] stopDataArray= {
            stop1,stop2,stop3,stop4,stop5,stop6,stop7,stop8,stop9,stop10,stop11,stop12,stop13,
            stop14,stop15,stop16,stop17,stop18,stop19,stop20,stop21,stop22,stop23,stop24,stop25,stop26,stop27,stop28,
            stop29,stop30,stop31,stop32,stop33,stop34,stop35,stop36,stop37,stop38,stop39,stop40,stop41,
            stop42,stop43,stop44,stop45,stop46,stop47,stop48,stop49,stop50,stop51,stop52,stop53, stop54,
            stop55,stop56,stop57,stop58,stop59,stop60,stop61,stop62,stop63,stop64,stop65,stop66,stop67,stop68,stop69,
            stop70,stop71,stop72,stop73,stop74,stop75,stop76,stop77,stop78,stop79,stop80,stop81,stop82,
            stop83,stop84,stop85,stop86,stop87,stop88,stop89,stop90,stop91,stop92,stop93,stop94,stop95,stop96,
            stop97,stop98,stop99,stop100,stop101,stop102,stop103,stop104,stop105,stop106,stop107,stop108,stop109,
            stop110,stop111,stop112,stop113,stop114,stop115,stop116,stop117,stop118,stop119,stop120,stop121,stop122,
            stop123,stop124,stop125,stop126,stop127,stop128,stop129,stop130,stop131
    };
}
