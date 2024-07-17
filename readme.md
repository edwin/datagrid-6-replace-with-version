# Replace With Version on Datagrid 6.5.1

## How to Run
```
$ java -Xmx4G -Xms4G -XX:+UseG1GC -jar target/datagrid-6-replace-with-version-1.0-SNAPSHOT.jar
```

## Logs
```
17-07-2024 16:26:53 [pool-1-thread-1] INFO  com.edw.helper.GenerateCacheHelper.lambda$generate$0 - success processing ca0f9871-e6e9-403e-93d3-86e319fc84ad for 0 ms
17-07-2024 16:26:53 [pool-1-thread-1] INFO  com.edw.helper.GenerateCacheHelper.lambda$generate$0 - success processing a4d36a9d-1d98-4a03-80ce-f34cb6d80ec7 for 1 ms
17-07-2024 16:26:53 [pool-1-thread-1] INFO  com.edw.helper.GenerateCacheHelper.lambda$generate$0 - success processing 751f3cd4-76bd-4a25-a79f-b80c6587255e for 0 ms
17-07-2024 16:26:53 [pool-1-thread-1] INFO  com.edw.helper.GenerateCacheHelper.lambda$generate$0 - success processing 0e3d54c5-7733-463b-b090-2dcebc5f74da for 1 ms
17-07-2024 16:26:53 [http-nio-8081-exec-1] INFO  com.edw.helper.GenerateCacheHelper.generate - done ==================== for 51151 ms
```

## How to Test
```
$ curl -kv http://localhost:8081/
*   Trying [::1]:8081...
* Connected to localhost (::1) port 8081
> GET / HTTP/1.1
> Host: localhost:8081
> User-Agent: curl/8.4.0
> Accept: */*
>
< HTTP/1.1 200
< Content-Type: text/plain;charset=UTF-8
< Content-Length: 4
< Date: Wed, 17 Jul 2024 09:30:27 GMT
<
* Connection #0 to host localhost left intact
good                                           
```

## Tests Results

| cycle | data    | ms        |
|-------|---------|-----------|
| 1     | 100.000 | 51151 |
| 2     | 100.000 | 48921 |
| 3     | 100.000 | 42552 |
