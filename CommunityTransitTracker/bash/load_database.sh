#!/bin/bash

wget "http://www.rtd-denver.com/GoogleFeeder/google_transit_Aug12_Runboard.zip"
wget "http://bart.gov/dev/schedules/google_transit_31.zip"

load data local infile '/tmp/rtd/agency.txt'  replace into table agency  fields terminated by ',' optionally enclosed by '\"' escaped by '\\'  lines terminated by '\n'  ignore 1 lines  (agency_id,agency_name,agency_url,agency_timezone,agency_lang);

load data local infile '/tmp/rtd/calendar_dates.txt'  replace into table calendar_dates  fields terminated by ',' optionally enclosed by '\"' escaped by '\\'  lines terminated by '\n'  ignore 1 lines  (service_id,date,exception_type);

load data local infile '/tmp/rtd/calendar.txt'  replace into table calendar  fields terminated by ',' optionally enclosed by '\"' escaped by '\\'  lines terminated by '\n'  ignore 1 lines  (service_id,monday,tuesday,wednesday,thursday,friday,saturday,sunday,start_date,end_date);

load data local infile '/tmp/rtd/routes.txt'  replace into table routes fields terminated by ',' optionally enclosed by '\"' escaped by '\\'  lines terminated by '\n'  ignore 1 lines  (route_id,route_short_name,route_long_name,route_desc,route_type,route_url,route_color,route_text_color);

load data local infile '/tmp/rtd/shapes.txt'  replace into table shapes fields terminated by ',' optionally enclosed by '\"' escaped by '\\'  lines terminated by '\n'  ignore 1 lines  (shape_id,shape_pt_lat,shape_pt_lon,shape_pt_sequence,@shape_dist_traveled) SET shape_dist_traveled = nullif(@shape_dist_traveled,'');

load data local infile '/tmp/rtd/stops.txt'  replace into table stops fields terminated by ',' optionally enclosed by '\"' escaped by '\\'  lines terminated by '\n'  ignore 1 lines  (stop_id,stop_name,stop_desc,stop_lat,stop_lon,zone_id,stop_url,location_type);

load data local infile '/tmp/rtd/stop_times.txt'  replace into table stop_times fields terminated by ',' optionally enclosed by '\"' escaped by '\\'  lines terminated by '\n'  ignore 1 lines  (trip_id,arrival_time,departure_time,stop_id,stop_sequence,stop_headsign,pickup_type,drop_off_type,@shape_dist_traveled) set shape_dist_traveled = nullif(@shape_dist_traveled, '');

load data local infile '/tmp/rtd/trips.txt'  replace into table trips fields terminated by ',' optionally enclosed by '\"' escaped by '\\'  lines terminated by '\n'  ignore 1 lines  (route_id,service_id,trip_id,trip_headsign,direction_id,block_id,shape_id);
