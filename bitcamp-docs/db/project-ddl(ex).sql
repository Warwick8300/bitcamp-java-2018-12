-- 수업 테이블 삭제
drop table if exists lms_lesson;

-- 회원테이블 삭제
drop table if exists lms_member;

-- 게시판 테이블 삭제
drop table if exists lms_board;

-- 사진게시판 테이블 삭제
drop table if exists lms_photo;
-- 수업 테이블 생성
create table lms_lesson(
  lesson_id int not null auto_increment primary key comment '수업데이터 식별번호',
  sdt datetime not null comment ' 수업 시작일',
  edt datetime not null comment '수업종료일',
  tot_hr int not null comment '총수업시간', 
  day_hr int not null comment '일수업시간',
  titl varchar(255) not null comment '수업명',
  conts text not null comment '수업 내용'
) comment '수업';


--describe lms_lesson;
--desc lms_lesson;

-- 회원 테이블 생성
create table lms_member(
  member_id int not null auto_increment primary key comment '회원데이터 식별번호',
  name varchar(30) not null comment '이름',
  email varchar(50) not null comment '이메일',
  pwd varchar(255) not null comment '암호',
  cdt datetime default now() comment '등록일',
  tel varchar(20) comment '전화',
  photo varchar(255) comment '사진'
) comment '회원';

--desc lms_member;

--게시물 테이블 생성
create table lms_board(
  board_id int not null auto_increment primary key comment '게시물 식별번호',
  conts text not null comment '내용',
  cdt datetime default now() comment '생성일',
  vw_cnt int default 0 comment '조회수'
) comment '게시물';

--desc lms_board;

--show tables;

--사진 게시물 테이블 생성
create table lms_photo (
  photo_id int not null auto_increment primary key comment '사진게시물 번호',
 lesson_id int not null comment '수업 번호',
  titl varchar(255) not null comment '제목',
  cdt datetime default now() comment '생성일',
  vw_cnt int default 0 comment '조회수',
   -- lesson_id저장되는 값은 lms_lesson 테이블 lesson_id값으로 제한하는 조건을 추가한다
   constraint fk_photo_to_lesson foreign key (lesson_id)
   references lms_lesson (lesson_id)
) comment '사진게시물';


-- 사진 게시물에 첨부하는 사진 파일 테이블 생성
create table lms_photo_file (
  photo_file_id int not null auto_increment primary key comment '사진파일 식별번호',
  photo_id int not null comment '사진 번호',
  file_path varchar(255) not null comment '사진 경로',
  constraint fk_photo_file_to_photo foreign key (photo_id)
  references lms_photo (photo_id)
  
) comment '사진파일 ';
