package es.example.root.pskovbus;

import org.junit.Test;

import es.esy.pskovbus.pskovbus.DataArrays;
import es.esy.pskovbus.pskovbus.Stop;
import es.esy.pskovbus.pskovbus.StopData;

public class ExampleUnitTest {



    @Test
 public void myTest(){


        DataArrays data=new DataArrays();
        StopData stopdata=new StopData();

        for (int i=0; i<131; i++) {
            for (int k = 1; k < 131; k++) {
                String[][] timetable;
if (k==i){continue;}
                int id = stopdata.getId(i);
                int idFinal=stopdata.getId(k);
                String name = stopdata.getStopNameById(id);
                String nameFinal = stopdata.getStopNameById(idFinal);
                Stop beginStop = stopdata.getStopById(id);
                Stop finalStop = stopdata.getStopById(idFinal);
                timetable = data.getTransitWay(beginStop, finalStop);

                System.out.println(name+"  >>> "+nameFinal);
                for (int g = 0; g < timetable.length; g++) {
                    if (timetable[g] != null) {
                        int l = timetable[g].length;
                       /* for (int f = 0; f < l; f++) {*/
                          /*  System.out.print(timetable[g][f]);*/
                            System.out.print("OK");
                     /*   }*/

                    }

                }
                System.out.print("\n");

            }

        }

        }
    }
