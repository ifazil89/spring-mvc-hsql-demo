
insert into USER_DETAIL (USER_ID,FIRST_NAME,LAST_NAME,MOBILE_NUMBER,EMAIL_ID,
					ADDRESS_ID,STATUS,CREATED_BY,CREATED_DATE)
					values('T1001','Admin','Admin',111111,'admin@test.com',
					1,1,'admin',sysdate);
insert into USER_DETAIL (USER_ID,FIRST_NAME,LAST_NAME,MOBILE_NUMBER,EMAIL_ID,
					ADDRESS_ID,STATUS,CREATED_BY,CREATED_DATE)
					values('T1002','User','User',00000,'user@test.com',
					1,1,'admin',sysdate);					
					
insert into USER_LOGIN_DETAIL (ID,USER_ID,USER_NAME,PASSWORD,
					STATUS,CREATED_BY,CREATED_DATE,					
					FAILURE_COUNT,IS_ACCOUNT_LOCKED)
					values(1,'T1001','testadmin','admin',
					1,'Admin',sysdate,0,0);				
insert into USER_LOGIN_DETAIL (ID,USER_ID,USER_NAME,PASSWORD,
					STATUS,CREATED_BY,CREATED_DATE,					
					FAILURE_COUNT,IS_ACCOUNT_LOCKED)
					values(2,'T1002','testuser','user',
					1,'Admin',sysdate,0,0);					
					
insert into USER_ROLE_CONFIG (ID,USER_ID,USER_ROLE,STATUS,
					CREATED_BY,CREATED_DATE)
					values(1,'T1001','ROLE_ADMIN',1,'admin',sysdate);
insert into USER_ROLE_CONFIG (ID,USER_ID,USER_ROLE,STATUS,
					CREATED_BY,CREATED_DATE)
					values(2,'T1002','ROLE_USER',1,'admin',sysdate);						

insert into ADDRESS (ID,ADDRESS_LINE1,ADDRESS_LINE2,CITY,STATE,PINCODE,
					STATUS,CREATED_BY,CREATED_DATE)
					values(1,'E city','Blore','Banglore','KA',500068,
					1,'admin',sysdate);						
					