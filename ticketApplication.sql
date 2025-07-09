create database ticketApplication;

use ticketApplication;

INSERT INTO `roles` VALUES (1,'ROLE_ADMIN'),(2,'ROLE_GUEST'); 
 
INSERT INTO `users` VALUES (1,'admin@neu.com','admin','$2a$10$k9644mshajjDvMhU8p76.u4sgOFuINZDkZ/csNgzFY99W1diZjBuC'); 
 
INSERT INTO `users_roles` VALUES (2,2);

INSERT INTO `users` VALUES (2,'dsr@neu.edu','dushyant','$2a$10$k9644mshajjDvMhU8p76.u4sgOFuINZDkZ/csNgzFY99W1diZjBuC'); 

INSERT INTO `tickets` VALUES 
(1,' T 1 content ','2024-12-12 12:12:06.617432','T 1 Description by guest','T1 title','2024-12-12 12:13:45.617432','Ticket 1 url', '2' ),
(2,' T 2 content ','2024-12-12 10:45:18.630278','Ticket 2 Description by guest','T2 title','2024-12-12 10:46:10.630278','Ticket 2 url', '2');

DELETE FROM users_roles
WHERE user_id = 2;

DELETE FROM users
WHERE id = 2;
