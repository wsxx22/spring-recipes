insert into category values (null, 'meat');
insert into category values (null, 'vegetables');
insert into category values (null, 'dairy');
insert into category values (null, 'bakery');
insert into category values (null, 'oils');
insert into category values (null, 'nuts');

insert into product (id, name, category_id) values (1, 'Wine - Magnotta, Merlot Sr Vqa', 4);
insert into product (id, name, category_id) values (2, 'Lamb - Racks, Frenched', 1);
insert into product (id, name, category_id) values (3, 'Cookies - Englishbay Wht', 1);
insert into product (id, name, category_id) values (4, 'Lettuce - Green Leaf', 5);
insert into product (id, name, category_id) values (5, 'Huck White Towels', 1);
insert into product (id, name, category_id) values (6, 'Wine - Montecillo Rioja Crianza', 5);
insert into product (id, name, category_id) values (7, 'Beef - Roasted, Cooked', 1);
insert into product (id, name, category_id) values (8, 'Wine - Beringer Founders Estate', 3);
insert into product (id, name, category_id) values (9, 'Lid Tray - 12in Dome', 5);
insert into product (id, name, category_id) values (10, 'Chilli Paste, Sambal Oelek', 1);
insert into product (id, name, category_id) values (11, 'Broom - Push', 5);
insert into product (id, name, category_id) values (12, 'Veal - Brisket, Provimi, Bone - In', 1);
insert into product (id, name, category_id) values (13, 'Broom - Angled', 3);
insert into product (id, name, category_id) values (14, 'Tarragon - Primerba, Paste', 2);
insert into product (id, name, category_id) values (15, 'Scallops - Live In Shell', 6);
insert into product (id, name, category_id) values (16, 'Iced Tea - Lemon, 340ml', 2);
insert into product (id, name, category_id) values (17, 'Beef - Short Loin', 6);
insert into product (id, name, category_id) values (18, 'Curry Powder Madras', 3);
insert into product (id, name, category_id) values (19, 'Sausage - Breakfast', 3);
insert into product (id, name, category_id) values (20, 'Sausage - Breakfast', 6);

insert into recipe values (null, 'pierogi');
insert into recipe values (null, 'zupa pomidorowa');
insert into recipe values (null, 'mielony z ziemniakami');
insert into recipe values (null, 'schabowy ');
insert into recipe values (null, 'platki');
insert into recipe values (null, 'lody');
insert into recipe values (null, 'ryz z kurczakiem');


insert into recipe_products (recipe_id, products_id) values (6, 5);
insert into recipe_products (recipe_id, products_id) values (3, 4);
insert into recipe_products (recipe_id, products_id) values (2, 13);
insert into recipe_products (recipe_id, products_id) values (3, 6);
insert into recipe_products (recipe_id, products_id) values (5, 18);
insert into recipe_products (recipe_id, products_id) values (3, 19);
insert into recipe_products (recipe_id, products_id) values (5, 6);
insert into recipe_products (recipe_id, products_id) values (7, 18);
insert into recipe_products (recipe_id, products_id) values (2, 11);
insert into recipe_products (recipe_id, products_id) values (6, 16);
insert into recipe_products (recipe_id, products_id) values (7, 12);
insert into recipe_products (recipe_id, products_id) values (6, 13);
insert into recipe_products (recipe_id, products_id) values (5, 4);
insert into recipe_products (recipe_id, products_id) values (3, 8);
insert into recipe_products (recipe_id, products_id) values (1, 10);
insert into recipe_products (recipe_id, products_id) values (5, 8);
insert into recipe_products (recipe_id, products_id) values (3, 7);
insert into recipe_products (recipe_id, products_id) values (7, 1);
insert into recipe_products (recipe_id, products_id) values (2, 20);
insert into recipe_products (recipe_id, products_id) values (7, 12);


