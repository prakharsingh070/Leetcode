-- Last updated: 8/6/2026, 12:13:30 PM
select teacher_id , count(Distinct(subject_id)) as cnt from Teacher Group by teacher_id;
