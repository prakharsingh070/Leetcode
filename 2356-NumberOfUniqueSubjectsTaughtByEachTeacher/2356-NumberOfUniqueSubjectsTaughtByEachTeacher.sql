-- Last updated: 9/4/2026, 4:50:26 PM
select teacher_id , count(Distinct(subject_id)) as cnt from Teacher Group by teacher_id;
