-- Last updated: 8/6/2026, 12:17:09 PM
select class from Courses Group by class Having count(student)>=5;