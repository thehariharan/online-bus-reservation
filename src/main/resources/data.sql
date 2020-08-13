-- TABLE CONSISTING OF ENTRIES FOR BUS
-- SAMPLE DATA FOR BUS TABLE
INSERT INTO bus( bus_no, operator_name)
VALUES ('ABC001', 'A1 Travels');

INSERT INTO bus( bus_no, operator_name)
VALUES ('CEF789', 'B2 Travels');

INSERT INTO bus( bus_no, operator_name)
VALUES ('HAI001', 'C3 Travels');


-- TABLE CONSISTING OF ENTRIES FOR TRAVEL POINTS
-- TRAVEL POINTS ARE INDEPENDENT OF BUSES
-- SAMPLE DATA
INSERT INTO travel_point(source, destination)
VALUES ('A', 'B');

INSERT INTO travel_point(source, destination)
VALUES ('A', 'C');

INSERT INTO travel_point(source, destination)
VALUES ('B', 'A');

INSERT INTO travel_point(source, destination)
VALUES ('B', 'C');

INSERT INTO travel_point(source, destination)
VALUES ('C', 'A');

INSERT INTO travel_point(source, destination)
VALUES ('C', 'B');

-- TABLE CONSISTING OF ENTRIES FOR BUSES AND THEIR TRAVEL POINTS
-- A BUS CAN BE LINKED WITH A TRAVEL POINT
-- SAMPLE DATA IS RANDOM
INSERT INTO journey_details(travel_point_id, bus_id, travel_Date, dep_Time, arr_Time, duration, price)
VALUES (1, 1, CURRENT_DATE, '01:00', '13:00', 12, 1000);

INSERT INTO journey_details(travel_point_id, bus_id, travel_Date, dep_Time, arr_Time, duration, price)
VALUES (1, 2, CURRENT_DATE, '08:00', '16:00', 8, 1200);

INSERT INTO journey_details(travel_point_id, bus_id, travel_Date, dep_Time, arr_Time, duration, price)
VALUES (1, 3, CURRENT_DATE, '17:00', '22:00', 5.0, 1600);



INSERT INTO journey_details(travel_point_id, bus_id, travel_Date, dep_Time, arr_Time, duration, price)
VALUES (2, 1, CURRENT_DATE, '01:00', '13:00', 4.0, 1000);

INSERT INTO journey_details(travel_point_id, bus_id, travel_Date, dep_Time, arr_Time, duration, price)
VALUES (2, 2, CURRENT_DATE, '08:00', '16:00', 10, 1200);

INSERT INTO journey_details(travel_point_id, bus_id, travel_Date, dep_Time, arr_Time, duration, price)
VALUES (2, 3, CURRENT_DATE, '17:00', '22:00', 8, 1600);



INSERT INTO journey_details(travel_point_id, bus_id, travel_Date, dep_Time, arr_Time, duration, price)
VALUES (3, 1, CURRENT_DATE, '01:00', '13:00', 4.0, 1000);

INSERT INTO journey_details(travel_point_id, bus_id, travel_Date, dep_Time, arr_Time, duration, price)
VALUES (3, 2, CURRENT_DATE, '08:00', '16:00', 10, 1200);

INSERT INTO journey_details(travel_point_id, bus_id, travel_Date, dep_Time, arr_Time, duration, price)
VALUES (3, 3, CURRENT_DATE, '17:00', '22:00', 8, 1600);
