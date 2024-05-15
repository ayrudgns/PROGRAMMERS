-- 코드를 작성해주세요

select
    a.id, b.FISH_NAME, b.LENGTH
from
    fish_info a
inner join 
    (select 
    a.fish_type, b.fish_name as "FISH_NAME", max(a.length) as "LENGTH" 
    from fish_info a
    inner join fish_name_info b
    on a.fish_type = b.fish_type
    group by a.fish_type, b.fish_name) b
on (a.fish_type = b.fish_type and a.length = b.LENGTH);


