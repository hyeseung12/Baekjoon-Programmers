-- 코드를 작성해주세요
select count(*) fish_count, n.fish_name from fish_info i inner join fish_name_info n on n.fish_type = i.fish_type group by n.fish_name order by count(*) desc