# AGENTS.md

Instrucciones para el agente de IA que abra este repositorio (Claude Code, Cursor, Codex, Copilot, Gemini). Se cargan solas: no hay que pegar nada en ningun chat.

## Que es este repositorio

Es el codigo base de un reto de aprendizaje de Pragma: **Optimización de Consultas SQL en un Sistema Bancario**.

| | |
|---|---|
| Tema | DML |
| Nivel | trainee-l2 |
| Chapter | Backend |
| Especialidad | Java |
| Stack | Java / Spring Boot 3.5 |
| Patron arquitectonico | capas estándar |
| Tiempo estimado | 4 horas |

## Receta del stack

Esqueleto obligatorio:

- `pom.xml en la raiz`
- `clase con @SpringBootApplication`
- `application.yml en src/main/resources`
- `capa de dominio con entidades y puertos`
- `capa de aplicacion con casos de uso`
- `capa de infraestructura con adaptadores y @RestController`

Trampas conocidas:

- TODA `<version>` del pom va con tres segmentos: la del parent (ej. `3.5.6`) y la de cada dependencia que la lleve (ej. Resilience4j `2.2.0`). `3.4` y `2.0` no existen como artefacto y el build muere resolviendo dependencias.
- Las dependencias que el parent POM gestiona van SIN `<version>`: `spring-boot-starter-web`, `-data-jpa`, `-validation`, `-test`, etc.
- Resilience4j publica un artefacto por linea de Spring Boot. Con Spring Boot 3 va `resilience4j-spring-boot3` con version de tres segmentos (ej. `2.2.0`, no `2.0`). `resilience4j-spring-boot2` es de Spring Boot 2 y rompe el arranque.
- Si usas anotaciones de validacion (`@NotNull`, `@Size`, `@Positive`) declara `spring-boot-starter-validation`: el starter web no las trae.
- El `spring-boot-maven-plugin` tiene que estar en `<build><plugins>` o no se empaqueta ejecutable.
- Spring Boot 3 usa `jakarta.*`, nunca `javax.*`.
- Cada archivo empieza con su `package` y con un `import` por cada clase del proyecto que viva en otro paquete. Usar `PaymentService` desde `infrastructure` sin `import com.x.application.PaymentService` no compila.

Dependencias:

- org.springframework.boot:spring-boot-starter-web n/a
- org.springframework.boot:spring-boot-starter-data-jpa n/a
- org.springframework.boot:spring-boot-starter-validation n/a
- org.postgresql:postgresql n/a
- org.springframework.boot:spring-boot-starter-test n/a
- org.projectlombok:lombok 1.18.30
- org.springdoc:springdoc-openapi-starter-webmvc-ui 2.5.0

## Tu tarea

Dejar este proyecto en estado **verificable**: que el comando de verificacion corra sin errores. Escribi los archivos en disco, en este repositorio. No generes ZIPs ni archivos adjuntos.

En orden:

1. Corre `mvn clean compile` y mira que falla.
2. Completa lo que falte de la lista de abajo: manifiesto de dependencias, punto de entrada, capa de interfaz y las capas del patron declarado.
3. Arregla SOLO los errores que impiden compilar o arrancar.
4. Volve a correr `mvn clean compile` hasta que pase.
5. Pará ahí.

## Regla dura: las fases son trabajo del humano

**PROHIBIDO implementar los entregables de las fases.** El valor del reto esta en que la persona los resuelva. Tu trabajo es que tenga un proyecto que arranca; el hueco pedagogico se queda como esta.

No resuelvas nada de esto:

- **Fase 1 — Consultas Básicas de CRUD**: Tres consultas SQL verificables que realizan operaciones de inserción, actualización y eliminación.
- **Fase 2 — Optimización de Consultas con Joins**: Una consulta SQL optimizada que combina datos de cuentas y transacciones.
- **Fase 3 — Agregación y Ordenamiento de Datos**: Una consulta SQL que agrupa y ordena las transacciones por tipo.
- **Fase 4 — Revisión y Optimización Final**: Todas las consultas SQL optimizadas y verificadas.

Distincion operativa:

- **Arreglar** (si): import faltante, tipo que no existe, dependencia sin declarar, error de sintaxis, archivo referenciado que no existe.
- **No tocar** (no): logica de negocio incompleta, validaciones ausentes, secretos hardcodeados, APIs deprecadas que funcionan, concurrencia insegura, patrones mejorables. Eso es lo que la persona tiene que encontrar.

## Lo que falta y tenes que completar

### 1. Referencias colgando (124)

Salieron de un analisis estatico del codigo que SI esta en el repo. Cada una rompe la compilacion:

- [ ] `src/main/java/com/bankapp/Application.java` — `Account.getId`
      Se invoca `getId` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/Application.java` — `TransactionService.getTransactionByReference`
      Se invoca `getTransactionByReference` sobre `TransactionService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/repository/JpaAccountRepository.java` — `Account.getId`
      Se invoca `getId` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/dto/AccountDto.java` — `Account.getId`
      Se invoca `getId` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/dto/AccountDto.java` — `Account.getAccountNumber`
      Se invoca `getAccountNumber` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/dto/AccountDto.java` — `Account.getCustomerName`
      Se invoca `getCustomerName` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/dto/AccountDto.java` — `Account.getBalance`
      Se invoca `getBalance` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/dto/AccountDto.java` — `Account.getStatus`
      Se invoca `getStatus` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/dto/AccountDto.java` — `Account.getTransactions`
      Se invoca `getTransactions` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/dto/AccountDto.java` — `Account.setId`
      Se invoca `setId` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/dto/AccountDto.java` — `Account.setAccountNumber`
      Se invoca `setAccountNumber` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/dto/AccountDto.java` — `Account.setCustomerName`
      Se invoca `setCustomerName` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/dto/AccountDto.java` — `Account.setBalance`
      Se invoca `setBalance` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/dto/AccountDto.java` — `Account.setStatus`
      Se invoca `setStatus` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/dto/TransactionDto.java` — `Transaction.getAccount`
      Se invoca `getAccount` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/dto/TransactionDto.java` — `Transaction.getId`
      Se invoca `getId` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/dto/TransactionDto.java` — `Transaction.getType`
      Se invoca `getType` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/dto/TransactionDto.java` — `Transaction.getAmount`
      Se invoca `getAmount` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/dto/TransactionDto.java` — `Transaction.getTimestamp`
      Se invoca `getTimestamp` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/dto/TransactionDto.java` — `Transaction.getDescription`
      Se invoca `getDescription` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/dto/TransactionDto.java` — `Transaction.setId`
      Se invoca `setId` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/dto/TransactionDto.java` — `Transaction.setType`
      Se invoca `setType` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/dto/TransactionDto.java` — `Transaction.setAmount`
      Se invoca `setAmount` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/dto/TransactionDto.java` — `Transaction.setTimestamp`
      Se invoca `setTimestamp` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/dto/TransactionDto.java` — `Transaction.setDescription`
      Se invoca `setDescription` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/AccountService.java` — `AccountDto.getAccountNumber`
      Se invoca `getAccountNumber` sobre `AccountDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/AccountService.java` — `AccountDto.getCustomerName`
      Se invoca `getCustomerName` sobre `AccountDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/AccountService.java` — `AccountDto.getBalance`
      Se invoca `getBalance` sobre `AccountDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/AccountService.java` — `Account.setId`
      Se invoca `setId` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/AccountService.java` — `Account.setAccountNumber`
      Se invoca `setAccountNumber` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/AccountService.java` — `Account.setCustomerName`
      Se invoca `setCustomerName` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/AccountService.java` — `Account.setBalance`
      Se invoca `setBalance` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/AccountService.java` — `Account.setStatus`
      Se invoca `setStatus` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/AccountService.java` — `AccountDto.getStatus`
      Se invoca `getStatus` sobre `AccountDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/AccountService.java` — `Account.getBalance`
      Se invoca `getBalance` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/AccountService.java` — `AccountRepository.delete`
      Se invoca `delete` sobre `AccountRepository`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/AccountService.java` — `AccountDto.setId`
      Se invoca `setId` sobre `AccountDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/AccountService.java` — `Account.getId`
      Se invoca `getId` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/AccountService.java` — `AccountDto.setAccountNumber`
      Se invoca `setAccountNumber` sobre `AccountDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/AccountService.java` — `Account.getAccountNumber`
      Se invoca `getAccountNumber` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/AccountService.java` — `AccountDto.setCustomerName`
      Se invoca `setCustomerName` sobre `AccountDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/AccountService.java` — `Account.getCustomerName`
      Se invoca `getCustomerName` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/AccountService.java` — `AccountDto.setBalance`
      Se invoca `setBalance` sobre `AccountDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/AccountService.java` — `AccountDto.setStatus`
      Se invoca `setStatus` sobre `AccountDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/AccountService.java` — `Account.getStatus`
      Se invoca `getStatus` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/TransactionService.java` — `TransactionDto.getAmount`
      Se invoca `getAmount` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/TransactionService.java` — `TransactionDto.getType`
      Se invoca `getType` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/TransactionService.java` — `TransactionDto.getAccountId`
      Se invoca `getAccountId` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/TransactionService.java` — `Account.getStatus`
      Se invoca `getStatus` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/TransactionService.java` — `Transaction.setId`
      Se invoca `setId` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/TransactionService.java` — `Transaction.setType`
      Se invoca `setType` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/TransactionService.java` — `Transaction.setAmount`
      Se invoca `setAmount` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/TransactionService.java` — `Transaction.setDescription`
      Se invoca `setDescription` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/TransactionService.java` — `TransactionDto.getDescription`
      Se invoca `getDescription` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/TransactionService.java` — `Transaction.setTimestamp`
      Se invoca `setTimestamp` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/TransactionService.java` — `Transaction.setAccount`
      Se invoca `setAccount` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/TransactionService.java` — `Account.getBalance`
      Se invoca `getBalance` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/TransactionService.java` — `TransactionRepository.findByAccount`
      Se invoca `findByAccount` sobre `TransactionRepository`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/TransactionService.java` — `TransactionRepository.delete`
      Se invoca `delete` sobre `TransactionRepository`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/TransactionService.java` — `TransactionRepository.findAllByOrderByTimestampDesc`
      Se invoca `findAllByOrderByTimestampDesc` sobre `TransactionRepository`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/TransactionService.java` — `TransactionDto.setId`
      Se invoca `setId` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/TransactionService.java` — `Transaction.getId`
      Se invoca `getId` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/TransactionService.java` — `TransactionDto.setType`
      Se invoca `setType` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/TransactionService.java` — `Transaction.getType`
      Se invoca `getType` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/TransactionService.java` — `TransactionDto.setAmount`
      Se invoca `setAmount` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/TransactionService.java` — `Transaction.getAmount`
      Se invoca `getAmount` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/TransactionService.java` — `TransactionDto.setTimestamp`
      Se invoca `setTimestamp` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/TransactionService.java` — `Transaction.getTimestamp`
      Se invoca `getTimestamp` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/TransactionService.java` — `TransactionDto.setDescription`
      Se invoca `setDescription` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/TransactionService.java` — `Transaction.getDescription`
      Se invoca `getDescription` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/TransactionService.java` — `Transaction.getAccount`
      Se invoca `getAccount` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/application/service/TransactionService.java` — `TransactionDto.setAccountId`
      Se invoca `setAccountId` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `TransactionService.findAll`
      Se invoca `findAll` sobre `TransactionService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `TransactionService.findById`
      Se invoca `findById` sobre `TransactionService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `TransactionService.findByAccountId`
      Se invoca `findByAccountId` sobre `TransactionService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `TransactionService.create`
      Se invoca `create` sobre `TransactionService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `TransactionService.update`
      Se invoca `update` sobre `TransactionService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `TransactionService.delete`
      Se invoca `delete` sobre `TransactionService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `Transaction.getDescription`
      Se invoca `getDescription` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `TransactionDto.setId`
      Se invoca `setId` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `Transaction.getId`
      Se invoca `getId` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `TransactionDto.setType`
      Se invoca `setType` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `Transaction.getType`
      Se invoca `getType` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `TransactionDto.setAmount`
      Se invoca `setAmount` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `Transaction.getAmount`
      Se invoca `getAmount` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `TransactionDto.setTimestamp`
      Se invoca `setTimestamp` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `Transaction.getTimestamp`
      Se invoca `getTimestamp` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `TransactionDto.setDescription`
      Se invoca `setDescription` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `Transaction.getAccount`
      Se invoca `getAccount` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `TransactionDto.setAccountId`
      Se invoca `setAccountId` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `Transaction.setType`
      Se invoca `setType` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `TransactionDto.getType`
      Se invoca `getType` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `Transaction.setAmount`
      Se invoca `setAmount` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `TransactionDto.getAmount`
      Se invoca `getAmount` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `Transaction.setDescription`
      Se invoca `setDescription` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `TransactionDto.getDescription`
      Se invoca `getDescription` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/test/java/com/bankapp/application/service/AccountServiceTest.java` — `Account.setId`
      Se invoca `setId` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/test/java/com/bankapp/application/service/AccountServiceTest.java` — `Account.setAccountNumber`
      Se invoca `setAccountNumber` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/test/java/com/bankapp/application/service/AccountServiceTest.java` — `Account.setCustomerName`
      Se invoca `setCustomerName` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/test/java/com/bankapp/application/service/AccountServiceTest.java` — `Account.setBalance`
      Se invoca `setBalance` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/test/java/com/bankapp/application/service/AccountServiceTest.java` — `Account.setStatus`
      Se invoca `setStatus` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/test/java/com/bankapp/application/service/AccountServiceTest.java` — `Account.getBalance`
      Se invoca `getBalance` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/test/java/com/bankapp/application/service/AccountServiceTest.java` — `AccountService.deposit`
      Se invoca `deposit` sobre `AccountService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/test/java/com/bankapp/application/service/AccountServiceTest.java` — `Account.getId`
      Se invoca `getId` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/test/java/com/bankapp/application/service/AccountServiceTest.java` — `AccountService.withdraw`
      Se invoca `withdraw` sobre `AccountService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/test/java/com/bankapp/application/service/AccountServiceTest.java` — `AccountService.findById`
      Se invoca `findById` sobre `AccountService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/test/java/com/bankapp/application/service/AccountServiceTest.java` — `Account.isEmpty`
      Se invoca `isEmpty` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `Account.setId`
      Se invoca `setId` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `Account.setAccountNumber`
      Se invoca `setAccountNumber` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `Account.setCustomerName`
      Se invoca `setCustomerName` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `Account.setBalance`
      Se invoca `setBalance` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `Account.setStatus`
      Se invoca `setStatus` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `Transaction.setId`
      Se invoca `setId` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `Transaction.setType`
      Se invoca `setType` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `Transaction.setAmount`
      Se invoca `setAmount` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `Transaction.setTimestamp`
      Se invoca `setTimestamp` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `Transaction.setDescription`
      Se invoca `setDescription` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `Transaction.setAccount`
      Se invoca `setAccount` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `Account.getId`
      Se invoca `getId` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `Transaction.getType`
      Se invoca `getType` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `Transaction.getId`
      Se invoca `getId` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `TransactionService.findById`
      Se invoca `findById` sobre `TransactionService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `Transaction.isPresent`
      Se invoca `isPresent` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- [ ] `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `Transaction.get`
      Se invoca `get` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.

### Presentes (24)

- `pom.xml`
- `src/main/java/com/bankapp/Application.java`
- `src/main/resources/application.yml`
- `src/main/java/com/bankapp/domain/model/Account.java`
- `src/main/java/com/bankapp/domain/model/Transaction.java`
- `src/main/java/com/bankapp/domain/model/TransactionType.java`
- `src/main/java/com/bankapp/domain/repository/AccountRepository.java`
- `src/main/java/com/bankapp/domain/repository/TransactionRepository.java`
- `src/main/java/com/bankapp/infrastructure/repository/JpaAccountRepository.java`
- `src/main/java/com/bankapp/infrastructure/repository/JpaTransactionRepository.java`
- `src/main/java/com/bankapp/infrastructure/dto/AccountDto.java`
- `src/main/java/com/bankapp/infrastructure/dto/TransactionDto.java`
- `src/main/java/com/bankapp/application/service/AccountService.java`
- `src/main/java/com/bankapp/application/service/TransactionService.java`
- `src/main/java/com/bankapp/infrastructure/controller/AccountController.java`
- `src/main/java/com/bankapp/infrastructure/exception/TransactionAlreadyExistsException.java`
- `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java`
- `src/main/java/com/bankapp/infrastructure/exception/GlobalExceptionHandler.java`
- `src/main/java/com/bankapp/infrastructure/exception/TransactionNotFoundException.java`
- `src/main/resources/schema.sql`
- `src/main/resources/data.sql`
- `src/test/java/com/bankapp/application/service/AccountServiceTest.java`
- `src/test/java/com/bankapp/application/service/TransactionServiceTest.java`
- `README.md`

### Capas del patron declarado

Cada una tiene que existir como directorio real con al menos un archivo. Codigo plano en la raiz no satisface el patron.

- `src/main/java/com/bankapp`
- `src/main/java/com/bankapp/domain`
- `src/main/java/com/bankapp/application`
- `src/main/java/com/bankapp/infrastructure`
- `src/main/java/com/bankapp/infrastructure/repository`
- `src/main/resources`
- `src/test/java/com/bankapp`

## Verificacion

```bash
mvn clean compile
```

Ese comando pasando es la definicion de "terminado" para vos.

## Convenciones que tenes que respetar

- Un solo ecosistema: no declares librerias de otro lenguaje ni mezcles gestores de paquetes.
- Toda libreria que uses tiene que estar declarada en el manifiesto de dependencias.
- Todo import declarado tiene que usarse; todo tipo usado tiene que existir o venir de una dependencia declarada.
- El patron es **capas estándar**: los contratos (interfaces, puertos) los define la capa interna y los implementa la externa, nunca al revés.
- Los archivos que crees llevan implementacion real, no stubs: sin `TODO`, sin cuerpos vacios, sin `// getters y setters`.

## Contexto del candidato

Sirve para calibrar el nivel del codigo, no para resolver las fases.

- Perfil: Chapter Backend, Especialidad Desarrollador, Tecnología SQL, Trainee L2
- Brecha que el reto ataca: Ejecuta consultas SQL basicas CRUD y de optimizacion como Joins, Group By y Order By., Ejecuta consultas SQL basicas CRUD y de optimizacion.

---

*Generado por Challenge Generator — Pragma. `README.md` tiene el enunciado completo del reto para la persona. `PROMPT_MEJORA.md` es la variante para pegar en un chat, si se prefiere ese flujo.*
