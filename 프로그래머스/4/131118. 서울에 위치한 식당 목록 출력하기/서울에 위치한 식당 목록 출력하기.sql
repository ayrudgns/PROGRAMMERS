-- 코드를 입력하세요
SELECT
    A.rest_id
    , A.rest_name
    , A.food_type
    , A.favorites
    , A.address
    , ROUND(AVG(B.review_score), 2) AS "average_review_score"
FROM
    rest_info A
INNER JOIN
    rest_review B
    ON A.rest_id = B.rest_id
WHERE
    A.address LIKE "서울%"
GROUP BY
    A.rest_id
ORDER BY
    AVG(B.review_score) DESC, A.favorites DESC;