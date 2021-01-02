package com.sounakmondal.covid19indiatracker;

public class creds {

    /**

     URL Format = baseURL+ Extension URL + FinalExtension

     **/


    String baseURL ="https://api.covid19india.org/";
    String finalExtension = ".json";
    String rawDataExtension = "raw_data";
    String nationalLevelExtension = "data";


}
    /*---Documentation of API from Owners Github Repo--

    ----Raw Data----
     💚	Patient Level : Raw Data Partition 1 (Till Apr 19)	            https://api.covid19india.org/raw_data1.json
     💚	Patient Level : Raw Data Partition 2 (From Apr 20 to Apr 26)	https://api.covid19india.org/raw_data2.json
     💚	Patient Level : Raw Data Partition 3 (From Apr 27 to May 09)	https://api.covid19india.org/raw_data3.json
     💚	Patient Level : Raw Data Partition 4 (From May 10 to May 23)	https://api.covid19india.org/raw_data4.json
     💚	Patient Level : Raw Data Partition 5 (From May 24 to Jun 04)	https://api.covid19india.org/raw_data5.json
     💚	Patient Level : Raw Data Partition 6 (From Jun 05 to Jun 19)	https://api.covid19india.org/raw_data6.json
     💚	Patient Level : Raw Data Partition 7 (From Jun 20 to Jun 30)	https://api.covid19india.org/raw_data7.json
     💚	Patient Level : Raw Data Partition 8 (From Jul 01 to Jul 07)	https://api.covid19india.org/raw_data8.json
     💚	Patient Level : Raw Data Partition 9 (From Jul 08 to Jul 13)	https://api.covid19india.org/raw_data9.json
     💚	Patient Level : Raw Data Partition 10 (From Jul 14 to Jul 17)	https://api.covid19india.org/raw_data10.json
     💚	Patient Level : Raw Data Partition 11 (From Jul 18 to Jul 22)	https://api.covid19india.org/raw_data11.json
     💚	Patient Level : Raw Data Partition 12 (From Jul 23 to Aug 06)	https://api.covid19india.org/raw_data12.json
     💚	Patient Level : Raw Data Partition 13 (From Aug 07 to Aug 21)	https://api.covid19india.org/raw_data13.json
     💚	Patient Level : Raw Data Partition 14 (From Aug 22 to Sep 05)	https://api.covid19india.org/raw_data14.json
     💚	Patient Level : Raw Data Partition 15 (From Sep 06 to Sep 21)	https://api.covid19india.org/raw_data15.json
     💚	Patient Level : Raw Data Partition 16 (From Sep 22 to Oct 08)	https://api.covid19india.org/raw_data16.json
     💚	Patient Level : Raw Data Partition 17 (From Oct 09 to Oct 26)	https://api.covid19india.org/raw_data17.json
     💚	Patient Level : Raw Data Partition 18 (From Oct 27 to Nov 12)	https://api.covid19india.org/raw_data18.json
     💚	Patient Level : Raw Data Partition 19 (From Nov 13 to Nov 30th)	https://api.covid19india.org/raw_data19.json
     💚	Patient Level : Raw Data Partition 20 (From Dec 01 to Dec 19th)	https://api.covid19india.org/raw_data20.json
     💚	Patient Level : Raw Data Partition 21 (From Dec 20th onwards)	https://api.covid19india.org/raw_data21.json
     ---------------

     -----Rest------
     💚	National Level :Time series, State-wise stats and Test counts	                https://api.covid19india.org/data.json
     💚	State Level : has district-wise info	                                        https://api.covid19india.org/state_district_wise.json
     💚	State Level : Daily changes	                                                    https://api.covid19india.org/states_daily.json
     💚	State Level : Testing data	                                                    https://api.covid19india.org/state_test_data.json
     💚	National/State/District Level : Latest cumulative/daily counts	                https://api.covid19india.org/v4/data.json
     💚 National/State/District Level : Specific date cummulative/daily counts	        https://api.covid19india.org/v4/data-YYYY-MM-DD.json
     💚	National/State/District Level : Historical date-wise cumulative/daily counts	https://api.covid19india.org/v4/data-all.json
     💚	National/State Level: Timeseries_(different structure)_	                        https://api.covid19india.org/v4/timeseries.json
     💚	State & District Level: Population	                                            https://api.covid19india.org/misc.json
     ---------------


     */