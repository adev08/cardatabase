

INSERT INTO cardatabase.users (
    id,
    craete_at,
    update_at,
    email,
    first_name,
    last_name,
    password,
    username
)
VALUES
    (1, CURRENT_TIMESTAMP, NULL, 'alex@example.com',    'Alex',    'Johnson',  'REPLACE_WITH_BCRYPT_HASH', 'alex'),
    (2, CURRENT_TIMESTAMP, NULL, 'sam@example.com',     'Sam',     'Williams', 'REPLACE_WITH_BCRYPT_HASH', 'sam'),
    (3, CURRENT_TIMESTAMP, NULL, 'jordan@example.com',  'Jordan',  'Smith',    'REPLACE_WITH_BCRYPT_HASH', 'jordan'),
    (4, CURRENT_TIMESTAMP, NULL, 'taylor@example.com',  'Taylor',  'Brown',    'REPLACE_WITH_BCRYPT_HASH', 'taylor'),
    (5, CURRENT_TIMESTAMP, NULL, 'morgan@example.com',  'Morgan',  'Davis',    'REPLACE_WITH_BCRYPT_HASH', 'morgan'),
    (6, CURRENT_TIMESTAMP, NULL, 'casey@example.com',   'Casey',   'Miller',   'REPLACE_WITH_BCRYPT_HASH', 'casey'),
    (7, CURRENT_TIMESTAMP, NULL, 'riley@example.com',   'Riley',   'Wilson',   'REPLACE_WITH_BCRYPT_HASH', 'riley'),
    (8, CURRENT_TIMESTAMP, NULL, 'jamie@example.com',   'Jamie',   'Moore',    'REPLACE_WITH_BCRYPT_HASH', 'jamie'),
    (9, CURRENT_TIMESTAMP, NULL, 'drew@example.com',    'Drew',    'Taylor',   'REPLACE_WITH_BCRYPT_HASH', 'drew'),
    (10, CURRENT_TIMESTAMP, NULL, 'cameron@example.com','Cameron', 'Anderson', 'REPLACE_WITH_BCRYPT_HASH', 'cameron');
    
  INSERT INTO cardatabase.roles (id,    craete_at,
    update_at, name) VALUES
(1, CURRENT_TIMESTAMP, NULL, 'ROLE_USER'),
(2, CURRENT_TIMESTAMP, NULL, 'ROLE_ADMIN'),
(3, CURRENT_TIMESTAMP, NULL, 'ROLE_DEV'),
(4, CURRENT_TIMESTAMP, NULL, 'ROLE_MANAGER'),
(5, CURRENT_TIMESTAMP, NULL, 'ROLE_SALES');


INSERT INTO cardatabase.user_roles (user_id, role_id) VALUES
(1, 1),
(1, 2),
(2, 1),
(3, 1),
(3, 3),
(4, 1),
(5, 1),
(5, 4),
(6, 1),
(6, 5),
(7, 1),
(8, 1),
(8, 3),
(9, 1),
(10, 1);

