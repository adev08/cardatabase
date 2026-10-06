SELECT
    c.id AS car_id,
    c.brand,
    c.model,
    c.car_owner_id,
    co.id AS car_owner_id,
    co."ownerId",
    o."firstName",
    o."lastName"
FROM cardatabase.car c
JOIN cardatabase.car_owner co
    ON c.car_owner_id = co.id
JOIN cardatabase.owner o
    ON co."ownerId" = o.id
ORDER BY c.id;