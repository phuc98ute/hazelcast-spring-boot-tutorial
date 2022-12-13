# hazelcast-spring-boot-tutorial

## Starting hazelcast with spring boot
1. Add the spring-boot-cache-starter and hazelcast dependency to the pom.xml
```
        ...
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-cache</artifactId>
        </dependency>
        ...
        <dependency>
            <groupId>com.hazelcast</groupId>
            <artifactId>hazelcast-all</artifactId>
            <version>4.0.2</version>
        </dependency>
        ...
```
2. Create `hazelcast.yaml` in resources folder with below content:
```
# hazelcast.yaml
hazelcast:
  network:
    join:
      multicast:
        enabled: true
```
3. Use annotation `@Cache("<cache name>")` on the function which should be cached.
```
Example:
@Cacheable("books")
public String getBookNameByIsbn(String isbn) {
    return findBookInSlowSource(isbn);
}
```
4. Use curl to test the function on current project:
```
~ curl http://localhost:8080/book/12345
Sample Book Name completed in: 3157ms%
~ curl http://localhost:8080/book/12345
Sample Book Name completed in: 4ms% 
```
