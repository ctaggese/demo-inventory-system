insert into T_ORDER_STATUS (ID, STATUS) values (1, 'offen');
insert into T_ORDER_STATUS (ID, STATUS) values (2, 'In Bearbeitung');
insert into T_ORDER_STATUS (ID, STATUS) values (3, 'Fertig zur Abholung');
insert into T_ORDER_STATUS (ID, STATUS) values (4, 'Abgeholt');
insert into T_ORDER_STATUS (ID, STATUS) values (5, 'Geschlossen');

insert into T_ORDERS (ID, PRODUCT_ID, AMOUNT, ORDER_STATUS_ID) values (1,'1', 20, 1);
insert into T_ORDERS (ID, PRODUCT_ID, AMOUNT, ORDER_STATUS_ID) values (2,'2', 10, 1);
insert into T_ORDERS (ID, PRODUCT_ID, AMOUNT, ORDER_STATUS_ID) values (3,'3', 5, 2);
