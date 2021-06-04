# 02-rest-api-simple

## Requirements
- Mysql
- Java Sping Boot
    + Mysql Connector
    + Lombook
    + Web Starter
    + Java Spring JPA + Hibernate
    
## Explore API

```text
GET api/ping

GET api/notes

POST api/notes

PUT api/notes/{noteId}

UPDATE api/notes/{noteId}

DELETE api/notes/{noteId}
```

## Step By Step

- [x] Dựng base project
- [x] Tạo database notes_app
- [x] Kết nối database
- [x] Tạo model
- [x] Tạo repository
- [x] Tạo controller
- [x] Thêm trường createdAt và updatedAt, tự động xử lý