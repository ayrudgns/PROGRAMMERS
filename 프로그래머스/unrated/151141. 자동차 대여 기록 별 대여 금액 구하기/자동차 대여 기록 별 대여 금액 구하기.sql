-- 코드를 입력하세요


-- 여기서부터 할인율 적용되어 계산된 애들 (7일 이상 빌린 애들)
SELECT *
FROM 
(SELECT HISTORY_ID, (DAY_CNT * DAILY_FEE * ((100 - DISCOUNT_RATE) * 0.01)) FEE
FROM 
    (SELECT HISTORY_ID, CAR_ID, 
        (END_DATE - START_DATE + 1) DAY_CNT,
        CASE WHEN (END_DATE - START_DATE + 1) >= 90 THEN '90일 이상'
        WHEN (END_DATE - START_DATE + 1) >= 30 THEN '30일 이상'
        WHEN (END_DATE - START_DATE + 1) >= 7 THEN '7일 이상'
        ELSE '' END DAYS 
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY crh
    WHERE CAR_ID IN (SELECT CAR_ID FROM CAR_RENTAL_COMPANY_CAR cc WHERE CAR_TYPE = '트럭')) a,
    (SELECT cc.CAR_ID, DAILY_FEE, PLAN_ID, DURATION_TYPE, DISCOUNT_RATE
    FROM CAR_RENTAL_COMPANY_CAR cc, CAR_RENTAL_COMPANY_DISCOUNT_PLAN cdp
    WHERE cc.CAR_TYPE = cdp.CAR_TYPE
    AND cc.CAR_TYPE = '트럭') b
WHERE a.CAR_ID = b.CAR_ID AND a.DAYS = b.DURATION_TYPE

UNION ALL
-- 여기서부터 할인율 적용 안되는 애들 (7일 미만)
SELECT HISTORY_ID, (DAY_CNT * DAILY_FEE) FEE
FROM (SELECT HISTORY_ID, CAR_ID, 
        (END_DATE - START_DATE + 1) DAY_CNT,
        CASE WHEN (END_DATE - START_DATE + 1) < 7 THEN '할인율 미적용'
        ELSE '' END DAYS 
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY crh
    WHERE CAR_ID IN (SELECT CAR_ID FROM CAR_RENTAL_COMPANY_CAR cc WHERE CAR_TYPE = '트럭')
    AND (END_DATE - START_DATE + 1) < 7) a,
    (SELECT * FROM CAR_RENTAL_COMPANY_CAR) b
WHERE a.CAR_ID = b.CAR_ID)
WHERE FEE <> 0
ORDER BY FEE DESC, HISTORY_ID DESC;