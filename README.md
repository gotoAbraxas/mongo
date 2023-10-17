# mongo

1. docker run -d --name testmongo -p 20000:27017 -e MONGO_INITDB_ROOT_USERNAME=test -e MONGO_INITDB_ROOT_PASSWORD=1234 mongo


    몽고 생성 어드민을 test/1234로 생성한다.

2. docker exec -it testmongo /bin/bash

   
    배시 접속

3. mongosh -u test -p 1234

   
    몽고 sh 접속

4. use admin

   
    어드민 들어가기

5. db.getUser("test")


    롤 확인하기

       {
       _id: 'admin.test',
       userId: new UUID("3de79b94-2bf9-41f2-b24d-82e5a7c402bb"),
       user: 'test',
       db: 'admin',
       roles: [ { role: 'root', db: 'admin' } ],
       mechanisms: [ 'SCRAM-SHA-1', 'SCRAM-SHA-256' ]}

       db : 소속 데이터 베이스
       roles : 상속받고 있는 역할

/////////////////////////////////////////////////////

6. db.createRole({role:"tests",privileges:[{resource: {db:"test",collection:""},actions:["find","insert"]}],roles:[]},{w:"majority",wtimeout: 5000})

    
    역할 만들기

7. db.getRoles({rolesInfo: 1})

   
    역할 한번 확인해보기

8. use test

    
    테스트 db 사용하기

9. db.createUser({user:"test2",pwd:"12345",roles:["readWrite"]})

    
    유저 만들기