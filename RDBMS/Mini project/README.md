# TM809 -> RDBMS / SQL / JDBC — PBL Solution

This project implements all 11 scenarios from the PBL task.

## Files

| File | Purpose |
|---|---|
| `schema.sql` | Creates the `users` table and inserts the 3 seed records |
| `src/DBConnection.java` | `getConnection()` — establishes the JDBC connection |
| `src/UserBean.java` | Bean with private fields `id, password, name, incorrectAttempts, lockStatus, userType` + getters/setters |
| `src/UserOperations.java` | All 11 scenario methods |
| `src/MainApp.java` | `main()` method that calls every scenario method and prints the results |

## Scenario -> Method map

1. `getUserType(String userID)`
2. `getIncorrectAttempts(String userID)`
3. `changeUserType(String userID)`
4. `getLockStatus()`
5. `changeName(String id, String name)`
6. `changePassword(String password)`
7. `addUser_1(UserBean bean)`
8. `addUser_2(UserBean bean)` — only inserts if `bean.getLockStatus() == 0`
9. `getUsers(String userType)` -> `ArrayList<UserBean>`
10. `storeAllRecords()` -> `ArrayList<UserBean>` (all rows)
11. `getNames()` -> `String[]`

## Setup

1. **Create the table & data** — run `schema.sql` in SQL*Plus / SQL Command Line
   (written for Oracle; adjust `VARCHAR2`/`NUMBER` to `VARCHAR`/`INT` if using MySQL).

2. **Configure the connection** — open `src/DBConnection.java` and set:
   ```java
   private static final String URL      = "jdbc:oracle:thin:@localhost:1521:xe";
   private static final String USER     = "system";
   private static final String PASSWORD = "password";
   private static final String DRIVER   = "oracle.jdbc.driver.OracleDriver";
   ```
   For MySQL, use e.g.:
   ```java
   private static final String URL    = "jdbc:mysql://localhost:3306/yourdb";
   private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
   ```
   Make sure the corresponding JDBC driver `.jar` (ojdbc / mysql-connector-j) is on your classpath.

3. **Compile & run**
   ```bash
   javac -cp .;path\to\ojdbc-driver.jar src\*.java
   java  -cp .;path\to\ojdbc-driver.jar MainApp
   ```
   (On Linux/Mac use `:` instead of `;` in the classpath.)

## Notes

- Every DB-facing method obtains its own `Connection` via `DBConnection.getConnection()`, as required by each scenario ("Obtain the Connection Object by calling the `getConnection()` method").
- `PreparedStatement` is used throughout to avoid SQL injection.
- Scenario 3 & 5 & 7 & 8 return the exact success/failure strings specified in the task (`"Update Success"/"Update Failed"`, `"Success"/"Failed"`, `"Success"/"Fail"`).
- Scenario 6 returns `"Changed"` on success and `"0"` on failure, per the task wording.
