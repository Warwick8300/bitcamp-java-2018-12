delete from lms_board;
delete from lms_lesson;
delete from lms_member;


insert into lms_lesson(lesson_id, titl, conts, sdt, edt, tot_hr, day_hr)
values(101, '자바프로그래밍','자바프로그래밍배우기','2019-04-08','2019-04-08',200, 6);

insert into lms_lesson(lesson_id,titl, conts, sdt, edt, tot_hr, day_hr)
values(102,'c/c++ 프로그래밍','프로그래밍배우기','2019-05-08','2019-09-08',200, 7);

insert into lms_lesson(lesson_id,titl, conts, sdt, edt, tot_hr, day_hr)
values(103,'파이선 프로그래밍','프로그래밍배우기','2019-06-08','2019-10-08',250, 8);

insert into lms_lesson(lesson_id,titl, conts, sdt, edt, tot_hr, day_hr)
values(104,'웹 프로그래밍','프로그래밍배우기','2019-07-08','2019-11-08',300, 9);

insert into lms_lesson(vtitl, conts, sdt, edt, tot_hr, day_hr)
values(105,'iot프로그래밍','프로그래밍배우기','2019-08-08','2019-12-08',400, 10);


select * from  lms_lesson;


insert into lms_member(member_id, name,email,pwd)
values(11,'user1','user1@test.com', password('1111'));

insert into lms_member(member_id name,email,pwd)
values(12,'user2','user2@test.com', password('1111'));

insert into lms_member(member_id, name,email,pwd)
values(13,'user3','user3@test.com', password('1111'));

select * from  lms_member;


insert into lms_board(board_id, conts)
values(1,'내용1');

insert into lms_board(board_id, conts)
values(2,'내용2');

insert into lms_board(board_id, conts)
values(3,'내용3');

insert into lms_board(board_id, conts)
values(4,'내용4');

insert into lms_board(board_id, conts)
values(5, '내용5');

select * from  lms_board;


insert into lms_photo(photo_id, lesson_id,titl) values(1, 101, '자바 컴파일러 구동원리');
insert into lms_photo(photo_id, lesson_id,titl) values(2, 101, '자바클래스 실행하는 방법');
insert into lms_photo(photo_id, lesson_id,titl) values(3, 101, '옵저버 클래스 다이어 그램 실행하는 방법');
insert into lms_photo(photo_id, lesson_id,titl) values(4,104,  'HTML/CSS/javaScript 관계');
insert into lms_photo(photo_id, lesson_id,titl) values(5,104, '자바 스크립트 구동원리');

select * from lms_photo;



insert into lms_photo_file(photo_file_id, photo_id, file_path) values(1,1, 'a1.gif');
insert into lms_photo_file(photo_file_id, photo_id, file_path) values(2,1, 'a2.gif');
insert into lms_photo_file(photo_file_id, photo_id, file_path) values(3,1, 'a2.gif');
insert into lms_photo_file(photo_file_id, photo_id, file_path) values(4,2, 'b1.gif');
insert into lms_photo_file(photo_file_id, photo_id, file_path) values(5,3, 'c1.gif');
insert into lms_photo_file(photo_file_id, photo_id, file_path) values(6,3, 'c2.gif');
insert into lms_photo_file(photo_file_id, photo_id, file_path) values(7,4, 'd1.gif');
insert into lms_photo_file(photo_file_id, photo_id, file_path) values(8,5, 'e1.gif');
insert into lms_photo_file(photo_file_id, photo_id, file_path) values(9,5, 'e2.gif');
insert into lms_photo_file(photo_file_id, photo_id, file_path) values(10,5, 'e3.gif');
insert into lms_photo_file(photo_file_id, photo_id, file_path) values(11,5, 'e4.gif');

select * from lms_photo_file;
