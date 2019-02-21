delete from lms_board;
delete from lms_lesson;
delete from lms_member;


insert into lms_lesson(titl, conts, sdt, edt, tot_hr, day_hr)
values('자바프로그래밍','자바프로그래밍배우기','2019-04-08','2019-04-08',200, 6);

insert into lms_lesson(titl, conts, sdt, edt, tot_hr, day_hr)
values('c/c++ 프로그래밍','프로그래밍배우기','2019-05-08','2019-09-08',200, 7);

insert into lms_lesson(titl, conts, sdt, edt, tot_hr, day_hr)
values('파이선 프로그래밍','프로그래밍배우기','2019-06-08','2019-10-08',250, 8);

insert into lms_lesson(titl, conts, sdt, edt, tot_hr, day_hr)
values('웹 프로그래밍','프로그래밍배우기','2019-07-08','2019-11-08',300, 9);

insert into lms_lesson(titl, conts, sdt, edt, tot_hr, day_hr)
values('iot프로그래밍','프로그래밍배우기','2019-08-08','2019-12-08',400, 10);
select * from  lms_lesson;


insert into lms_member( name,email,pwd)
values('user1','user1@test.com', password('1111'));

insert into lms_member( name,email,pwd)
values('user2','user2@test.com', password('1111'));

insert into lms_member( name,email,pwd)
values('user3','user3@test.com', password('1111'));

select * from  lms_member;


insert into lms_board(conts)
values('내용1');

insert into lms_board(conts)
values('내용2');

insert into lms_board(conts)
values('내용3');

insert into lms_board(conts)
values('내용4');

insert into lms_board(conts)
values('내용5');

select * from  lms_board;









