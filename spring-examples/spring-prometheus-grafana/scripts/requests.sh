#!/bin/bash

REQUEST_COUNT=100

methods=("GET" "POST" "PUT" "DELETE")

make_request() {
  method=${methods[ $RANDOM % ${#methods[@]} ]}

  echo "Making $method request"

  curl -X $method http://localhost:8080/api/v1/hello -s -o /dev/null -w "%{http_code}\n"
}

for ((i=0; i<$REQUEST_COUNT; i++))
do
  make_request
done