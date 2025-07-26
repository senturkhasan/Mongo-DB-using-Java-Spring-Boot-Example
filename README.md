Get Method Example call :
curl --location 'http://localhost:8080/api/v1/users/688544e6a8d58c8e41523412'

POST new User Item  call:
curl --location 'http://localhost:8080/api/v1/users' \
--header 'Content-Type: application/json' \
--data-raw '{ 
  "firstName": "Mehmet",
  "lastName": "Aydın",
  "password": "sifre123",
  "email": "deneme@example.com"
}'



Run Command:
 docker compose up --build
