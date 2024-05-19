# NAV-IT-SIF-bachelor backend
| java version:   | _21_    |  
|-----------------|---------|
| **build system:**   | _maven_ |
| **spring version:** | _3.2.2_ |




#### NOTE: REMEMBER TO ADD A OWN OAUTH SERVER


**We have some test methods, this need to be changed to the enviorment methods in a dev/real database method**
### How to prepare the project for the dockerfile:
**The compose is depended on a frontend image, please remeber to create a frontend image!**

The dockerfile looks after jar file in the target folder. **This is created in the dockerfile**, so to compile your own jar file should not be nessitary

if you need to create a manual jar file you can use these two commands. 

```bash
./mvnw compile
```
and then:  
```bash 
./mvnw package -Dmaven.test.skip
```


After this, the dockerfile is ready to use