-- 코드를 입력하세요
SELECT
    a.USER_ID
    , a.NICKNAME
    , (a.CITY || ' ' || a.STREET_ADDRESS1 || ' ' || a.STREET_ADDRESS2) AS "full_address"
    , SUBSTR(a.TLNO, 0, 3) || '-' || SUBSTR(a.TLNO, 4, 4) || '-' || SUBSTR(a.TLNO, 8, 4) AS "phone_number"
FROM 
    USED_GOODS_USER a
INNER JOIN 
    (SELECT 
        WRITER_ID
    FROM 
        USED_GOODS_BOARD
    GROUP BY WRITER_ID
    HAVING COUNT(WRITER_ID) >= 3) b
ON a.USER_ID = b.WRITER_ID
ORDER BY a.USER_ID DESC;