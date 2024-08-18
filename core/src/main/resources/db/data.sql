-- Campus 데이터 삽입
INSERT INTO campus (is_deleted, created_at, updated_at, name)
SELECT false, NOW(6), NOW(6), '서울대학교'
    WHERE NOT EXISTS (SELECT 1 FROM campus WHERE name = '서울대학교');

INSERT INTO campus (is_deleted, created_at, updated_at, name)
SELECT false, NOW(6), NOW(6), '부산대학교'
    WHERE NOT EXISTS (SELECT 1 FROM campus WHERE name = '부산대학교');

INSERT INTO campus (is_deleted, created_at, updated_at, name)
SELECT false, NOW(6), NOW(6), '명지대학교 자연캠퍼스'
    WHERE NOT EXISTS (SELECT 1 FROM campus WHERE name = '명지대학교 자연캠퍼스');

INSERT INTO campus (is_deleted, created_at, updated_at, name)
SELECT false, NOW(6), NOW(6), '명지대학교 인문캠퍼스'
    WHERE NOT EXISTS (SELECT 1 FROM campus WHERE name = '명지대학교 인문캠퍼스');

-- Restaurant 데이터 삽입
INSERT INTO restaurant (campus_id, is_deleted, created_at, updated_at, address, name)
SELECT c.idx, false, NOW(6), NOW(6), '123 Seoul Street', '교직원식당'
FROM campus c
WHERE c.name = '명지대학교 자연캠퍼스' AND NOT EXISTS (SELECT 1 FROM restaurant WHERE name = '교직원식당');

INSERT INTO restaurant (campus_id, is_deleted, created_at, updated_at, address, name)
SELECT c.idx, false, NOW(6), NOW(6), '456 Busan Street', 'MCC식당'
FROM campus c
WHERE c.name = '명지대학교 인문캠퍼스' AND NOT EXISTS (SELECT 1 FROM restaurant WHERE name = 'MCC식당');

INSERT INTO restaurant (campus_id, is_deleted, created_at, updated_at, address, name)
SELECT c.idx, false, NOW(6), NOW(6), '456 Busan Street', '생활관식당'
FROM campus c
WHERE c.name = '명지대학교 자연캠퍼스' AND NOT EXISTS (SELECT 1 FROM restaurant WHERE name = '생활관식당');

-- Meals 데이터 삽입
INSERT INTO meals (price, is_deleted, created_at, offered_at, restaurant_id, updated_at, meals, status, type)
SELECT 4500, false, NOW(6), NOW(6), r.idx, NOW(6), '밥, 콩나물국, 계란말이, 김치', 'OPEN', 'BREAKFAST'
FROM restaurant r
WHERE r.name = 'MCC식당' AND NOT EXISTS (SELECT 1 FROM meals WHERE meals = '밥, 콩나물국, 계란말이, 김치' AND type = 'BREAKFAST' AND restaurant_id = r.idx);

INSERT INTO meals (price, is_deleted, created_at, offered_at, restaurant_id, updated_at, meals, status, type)
SELECT 7500, false, NOW(6), NOW(6), r.idx, NOW(6), '밥, 된장찌개, 제육볶음, 깍두기', 'OPEN', 'LUNCH'
FROM restaurant r
WHERE r.name = 'MCC식당' AND NOT EXISTS (SELECT 1 FROM meals WHERE meals = '밥, 된장찌개, 제육볶음, 깍두기' AND type = 'LUNCH' AND restaurant_id = r.idx);

INSERT INTO meals (price, is_deleted, created_at, offered_at, restaurant_id, updated_at, meals, status, type)
SELECT 9500, false, NOW(6), NOW(6), r.idx, NOW(6), '밥, 북어국, 생선구이, 배추김치', 'OPEN', 'DINNER'
FROM restaurant r
WHERE r.name = 'MCC식당' AND NOT EXISTS (SELECT 1 FROM meals WHERE meals = '밥, 북어국, 생선구이, 배추김치' AND type = 'DINNER' AND restaurant_id = r.idx);

INSERT INTO meals (price, is_deleted, created_at, offered_at, restaurant_id, updated_at, meals, status, type)
SELECT 4000, false, NOW(6), NOW(6), r.idx, NOW(6), '밥, 미소된장국, 햄구이, 김치', 'OPEN', 'BREAKFAST'
FROM restaurant r
WHERE r.name = '생활관식당' AND NOT EXISTS (SELECT 1 FROM meals WHERE meals = '밥, 미소된장국, 햄구이, 김치' AND type = 'BREAKFAST' AND restaurant_id = r.idx);

INSERT INTO meals (price, is_deleted, created_at, offered_at, restaurant_id, updated_at, meals, status, type)
SELECT 7000, false, NOW(6), NOW(6), r.idx, NOW(6), '밥, 감자탕, 오징어볶음, 깍두기', 'OPEN', 'LUNCH'
FROM restaurant r
WHERE r.name = '생활관식당' AND NOT EXISTS (SELECT 1 FROM meals WHERE meals = '밥, 감자탕, 오징어볶음, 깍두기' AND type = 'LUNCH' AND restaurant_id = r.idx);

INSERT INTO meals (price, is_deleted, created_at, offered_at, restaurant_id, updated_at, meals, status, type)
SELECT 9000, false, NOW(6), NOW(6), r.idx, NOW(6), '밥, 김치수제비, 불고기, 나물', 'OPEN', 'DINNER'
FROM restaurant r
WHERE r.name = '생활관식당' AND NOT EXISTS (SELECT 1 FROM meals WHERE meals = '밥, 김치수제비, 불고기, 나물' AND type = 'DINNER' AND restaurant_id = r.idx);

INSERT INTO meals (price, is_deleted, created_at, offered_at, restaurant_id, updated_at, meals, status, type)
SELECT 5000, false, NOW(6), NOW(6), r.idx, NOW(6), '밥, 된장국, 불고기, 배추김치', 'OPEN', 'BREAKFAST'
FROM restaurant r
WHERE r.name = '교직원식당' AND NOT EXISTS (SELECT 1 FROM meals WHERE meals = '밥, 된장국, 불고기, 배추김치' AND type = 'BREAKFAST' AND restaurant_id = r.idx);

INSERT INTO meals (price, is_deleted, created_at, offered_at, restaurant_id, updated_at, meals, status, type)
SELECT 8000, false, NOW(6), NOW(6), r.idx, NOW(6), '밥, 김치찌개, 돈까스, 나물', 'OPEN', 'LUNCH'
FROM restaurant r
WHERE r.name = '교직원식당' AND NOT EXISTS (SELECT 1 FROM meals WHERE meals = '밥, 김치찌개, 돈까스, 나물' AND type = 'LUNCH' AND restaurant_id = r.idx);

INSERT INTO meals (price, is_deleted, created_at, offered_at, restaurant_id, updated_at, meals, status, type)
SELECT 10000, false, NOW(6), NOW(6), r.idx, NOW(6), '밥, 소고기미역국, 닭갈비, 깍두기', 'OPEN', 'DINNER'
FROM restaurant r
WHERE r.name = '교직원식당' AND NOT EXISTS (SELECT 1 FROM meals WHERE meals = '밥, 소고기미역국, 닭갈비, 깍두기' AND type = 'DINNER' AND restaurant_id = r.idx);
