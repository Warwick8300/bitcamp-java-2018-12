
use bitcampdb;


---게시판 테이블 삭제
drop table x_board;

show tables;

create table x_board(
  board_id int not null primary key auto_increment,
  title varchar(255) not null,
  contents text null,
  created_date datetime null default now(),
  view_count int null default 0
);

----데이터 입력

insert into x_board( title, contents)
values('제목1','내용1');
insert into x_board( title, contents)
values('제목2','내용1');
insert into x_board( title, contents)
values('제목3','내용1');
insert into x_board( title, contents)
values('제목4','내용1');
insert into x_board( title, contents)
values('제목5','내용1');

select 
*
from x_board;


select 
board_id,
title,
created_date
from x_board
where board_id < 100;

select 
board_id,
title,
contents,
created_date,
view_count
from x_board
where
board_id = 3;

select 
board_id,
title,
created_date,
view_count
from x_board
order by board_id desc;

update x_board set
view_count = view_count +1,
created_date = now()
where
board_id =3;

delete from x_board

create table t_board(
  board_id int not null primary key,
  contents text null,
  created_date datetime null,
  view_count int null default 0
);


 select * from t_board;

insert into t_board( board_id, contents,created_date,view_count)
values('1','test1','2019-04-04','0');


