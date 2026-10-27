# Prompt para Mejorar el Codigo Base

Copia y pega el contenido del bloque de abajo en un asistente de IA (Claude, ChatGPT)
para obtener un ZIP con el proyecto completo y arrancable.

Si preferis trabajar en tu editor con un agente local (Claude Code, Cursor, Copilot), usa `AGENTS.md` en vez de este archivo: dice lo mismo pero para que escriba los archivos en disco.

## Las dos reglas que no se negocian

1. **Completa el boilerplate.** Todo lo que el proyecto necesita para compilar y arrancar: manifiesto de dependencias, punto de entrada, configuracion, capa de interfaz, y las capas del patron arquitectonico declarado. Eso es andamiaje y es tu trabajo.
2. **NO resuelvas el reto.** Los entregables de las fases son el trabajo de la persona. El hueco pedagogico se deja como esta: el proyecto arranca, pero lo que el reto pide implementar NO esta implementado.

Dicho de otra forma: si algo impide compilar, arreglalo. Si algo es logica de negocio incompleta, validaciones ausentes, un secreto hardcodeado o un patron mejorable, dejalo exactamente como esta — es lo que la persona tiene que encontrar.

## Lo que le falta a este proyecto

Esto NO lo tenes que adivinar: salio de comparar el proyecto contra la arquitectura declarada del reto y de un analisis estatico del codigo. Completalo TODO.

### Referencias colgando en el codigo que si esta

Cada una rompe la compilacion:

- `src/main/java/com/bankapp/Application.java` — `Account.getId`: Se invoca `getId` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/Application.java` — `TransactionService.getTransactionByReference`: Se invoca `getTransactionByReference` sobre `TransactionService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/repository/JpaAccountRepository.java` — `Account.getId`: Se invoca `getId` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/dto/AccountDto.java` — `Account.getId`: Se invoca `getId` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/dto/AccountDto.java` — `Account.getAccountNumber`: Se invoca `getAccountNumber` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/dto/AccountDto.java` — `Account.getCustomerName`: Se invoca `getCustomerName` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/dto/AccountDto.java` — `Account.getBalance`: Se invoca `getBalance` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/dto/AccountDto.java` — `Account.getStatus`: Se invoca `getStatus` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/dto/AccountDto.java` — `Account.getTransactions`: Se invoca `getTransactions` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/dto/AccountDto.java` — `Account.setId`: Se invoca `setId` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/dto/AccountDto.java` — `Account.setAccountNumber`: Se invoca `setAccountNumber` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/dto/AccountDto.java` — `Account.setCustomerName`: Se invoca `setCustomerName` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/dto/AccountDto.java` — `Account.setBalance`: Se invoca `setBalance` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/dto/AccountDto.java` — `Account.setStatus`: Se invoca `setStatus` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/dto/TransactionDto.java` — `Transaction.getAccount`: Se invoca `getAccount` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/dto/TransactionDto.java` — `Transaction.getId`: Se invoca `getId` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/dto/TransactionDto.java` — `Transaction.getType`: Se invoca `getType` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/dto/TransactionDto.java` — `Transaction.getAmount`: Se invoca `getAmount` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/dto/TransactionDto.java` — `Transaction.getTimestamp`: Se invoca `getTimestamp` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/dto/TransactionDto.java` — `Transaction.getDescription`: Se invoca `getDescription` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/dto/TransactionDto.java` — `Transaction.setId`: Se invoca `setId` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/dto/TransactionDto.java` — `Transaction.setType`: Se invoca `setType` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/dto/TransactionDto.java` — `Transaction.setAmount`: Se invoca `setAmount` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/dto/TransactionDto.java` — `Transaction.setTimestamp`: Se invoca `setTimestamp` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/dto/TransactionDto.java` — `Transaction.setDescription`: Se invoca `setDescription` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/AccountService.java` — `AccountDto.getAccountNumber`: Se invoca `getAccountNumber` sobre `AccountDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/AccountService.java` — `AccountDto.getCustomerName`: Se invoca `getCustomerName` sobre `AccountDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/AccountService.java` — `AccountDto.getBalance`: Se invoca `getBalance` sobre `AccountDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/AccountService.java` — `Account.setId`: Se invoca `setId` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/AccountService.java` — `Account.setAccountNumber`: Se invoca `setAccountNumber` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/AccountService.java` — `Account.setCustomerName`: Se invoca `setCustomerName` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/AccountService.java` — `Account.setBalance`: Se invoca `setBalance` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/AccountService.java` — `Account.setStatus`: Se invoca `setStatus` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/AccountService.java` — `AccountDto.getStatus`: Se invoca `getStatus` sobre `AccountDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/AccountService.java` — `Account.getBalance`: Se invoca `getBalance` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/AccountService.java` — `AccountRepository.delete`: Se invoca `delete` sobre `AccountRepository`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/AccountService.java` — `AccountDto.setId`: Se invoca `setId` sobre `AccountDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/AccountService.java` — `Account.getId`: Se invoca `getId` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/AccountService.java` — `AccountDto.setAccountNumber`: Se invoca `setAccountNumber` sobre `AccountDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/AccountService.java` — `Account.getAccountNumber`: Se invoca `getAccountNumber` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/AccountService.java` — `AccountDto.setCustomerName`: Se invoca `setCustomerName` sobre `AccountDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/AccountService.java` — `Account.getCustomerName`: Se invoca `getCustomerName` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/AccountService.java` — `AccountDto.setBalance`: Se invoca `setBalance` sobre `AccountDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/AccountService.java` — `AccountDto.setStatus`: Se invoca `setStatus` sobre `AccountDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/AccountService.java` — `Account.getStatus`: Se invoca `getStatus` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/TransactionService.java` — `TransactionDto.getAmount`: Se invoca `getAmount` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/TransactionService.java` — `TransactionDto.getType`: Se invoca `getType` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/TransactionService.java` — `TransactionDto.getAccountId`: Se invoca `getAccountId` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/TransactionService.java` — `Account.getStatus`: Se invoca `getStatus` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/TransactionService.java` — `Transaction.setId`: Se invoca `setId` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/TransactionService.java` — `Transaction.setType`: Se invoca `setType` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/TransactionService.java` — `Transaction.setAmount`: Se invoca `setAmount` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/TransactionService.java` — `Transaction.setDescription`: Se invoca `setDescription` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/TransactionService.java` — `TransactionDto.getDescription`: Se invoca `getDescription` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/TransactionService.java` — `Transaction.setTimestamp`: Se invoca `setTimestamp` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/TransactionService.java` — `Transaction.setAccount`: Se invoca `setAccount` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/TransactionService.java` — `Account.getBalance`: Se invoca `getBalance` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/TransactionService.java` — `TransactionRepository.findByAccount`: Se invoca `findByAccount` sobre `TransactionRepository`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/TransactionService.java` — `TransactionRepository.delete`: Se invoca `delete` sobre `TransactionRepository`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/TransactionService.java` — `TransactionRepository.findAllByOrderByTimestampDesc`: Se invoca `findAllByOrderByTimestampDesc` sobre `TransactionRepository`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/TransactionService.java` — `TransactionDto.setId`: Se invoca `setId` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/TransactionService.java` — `Transaction.getId`: Se invoca `getId` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/TransactionService.java` — `TransactionDto.setType`: Se invoca `setType` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/TransactionService.java` — `Transaction.getType`: Se invoca `getType` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/TransactionService.java` — `TransactionDto.setAmount`: Se invoca `setAmount` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/TransactionService.java` — `Transaction.getAmount`: Se invoca `getAmount` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/TransactionService.java` — `TransactionDto.setTimestamp`: Se invoca `setTimestamp` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/TransactionService.java` — `Transaction.getTimestamp`: Se invoca `getTimestamp` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/TransactionService.java` — `TransactionDto.setDescription`: Se invoca `setDescription` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/TransactionService.java` — `Transaction.getDescription`: Se invoca `getDescription` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/TransactionService.java` — `Transaction.getAccount`: Se invoca `getAccount` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/application/service/TransactionService.java` — `TransactionDto.setAccountId`: Se invoca `setAccountId` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `TransactionService.findAll`: Se invoca `findAll` sobre `TransactionService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `TransactionService.findById`: Se invoca `findById` sobre `TransactionService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `TransactionService.findByAccountId`: Se invoca `findByAccountId` sobre `TransactionService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `TransactionService.create`: Se invoca `create` sobre `TransactionService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `TransactionService.update`: Se invoca `update` sobre `TransactionService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `TransactionService.delete`: Se invoca `delete` sobre `TransactionService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `Transaction.getDescription`: Se invoca `getDescription` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `TransactionDto.setId`: Se invoca `setId` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `Transaction.getId`: Se invoca `getId` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `TransactionDto.setType`: Se invoca `setType` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `Transaction.getType`: Se invoca `getType` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `TransactionDto.setAmount`: Se invoca `setAmount` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `Transaction.getAmount`: Se invoca `getAmount` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `TransactionDto.setTimestamp`: Se invoca `setTimestamp` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `Transaction.getTimestamp`: Se invoca `getTimestamp` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `TransactionDto.setDescription`: Se invoca `setDescription` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `Transaction.getAccount`: Se invoca `getAccount` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `TransactionDto.setAccountId`: Se invoca `setAccountId` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `Transaction.setType`: Se invoca `setType` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `TransactionDto.getType`: Se invoca `getType` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `Transaction.setAmount`: Se invoca `setAmount` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `TransactionDto.getAmount`: Se invoca `getAmount` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `Transaction.setDescription`: Se invoca `setDescription` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/main/java/com/bankapp/infrastructure/controller/TransactionController.java` — `TransactionDto.getDescription`: Se invoca `getDescription` sobre `TransactionDto`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/test/java/com/bankapp/application/service/AccountServiceTest.java` — `Account.setId`: Se invoca `setId` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/test/java/com/bankapp/application/service/AccountServiceTest.java` — `Account.setAccountNumber`: Se invoca `setAccountNumber` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/test/java/com/bankapp/application/service/AccountServiceTest.java` — `Account.setCustomerName`: Se invoca `setCustomerName` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/test/java/com/bankapp/application/service/AccountServiceTest.java` — `Account.setBalance`: Se invoca `setBalance` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/test/java/com/bankapp/application/service/AccountServiceTest.java` — `Account.setStatus`: Se invoca `setStatus` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/test/java/com/bankapp/application/service/AccountServiceTest.java` — `Account.getBalance`: Se invoca `getBalance` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/test/java/com/bankapp/application/service/AccountServiceTest.java` — `AccountService.deposit`: Se invoca `deposit` sobre `AccountService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/test/java/com/bankapp/application/service/AccountServiceTest.java` — `Account.getId`: Se invoca `getId` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/test/java/com/bankapp/application/service/AccountServiceTest.java` — `AccountService.withdraw`: Se invoca `withdraw` sobre `AccountService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/test/java/com/bankapp/application/service/AccountServiceTest.java` — `AccountService.findById`: Se invoca `findById` sobre `AccountService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/test/java/com/bankapp/application/service/AccountServiceTest.java` — `Account.isEmpty`: Se invoca `isEmpty` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `Account.setId`: Se invoca `setId` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `Account.setAccountNumber`: Se invoca `setAccountNumber` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `Account.setCustomerName`: Se invoca `setCustomerName` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `Account.setBalance`: Se invoca `setBalance` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `Account.setStatus`: Se invoca `setStatus` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `Transaction.setId`: Se invoca `setId` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `Transaction.setType`: Se invoca `setType` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `Transaction.setAmount`: Se invoca `setAmount` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `Transaction.setTimestamp`: Se invoca `setTimestamp` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `Transaction.setDescription`: Se invoca `setDescription` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `Transaction.setAccount`: Se invoca `setAccount` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `Account.getId`: Se invoca `getId` sobre `Account`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `Transaction.getType`: Se invoca `getType` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `Transaction.getId`: Se invoca `getId` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `TransactionService.findById`: Se invoca `findById` sobre `TransactionService`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `Transaction.isPresent`: Se invoca `isPresent` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.
- `src/test/java/com/bankapp/application/service/TransactionServiceTest.java` — `Transaction.get`: Se invoca `get` sobre `Transaction`, pero esa clase no declara ese metodo. Agregalo con su implementacion real, o usa uno de los que si declara.

## Como saber que terminaste

```bash
mvn clean compile
```

Ese comando corriendo sin errores es la definicion de "listo".

---

```
## Briefing del reto (autoridad)
Este bloque manda sobre los archivos adjuntos. El stack y el rol salen de AQUÍ, no de un topic genérico ni de markdown placeholder.

### Perfil
Chapter Backend, Especialidad Desarrollador, Tecnología SQL, Trainee L2

### Brecha de conocimiento
Ejecuta consultas SQL basicas CRUD y de optimizacion como Joins, Group By y Order By., Ejecuta consultas SQL basicas CRUD y de optimizacion.

### Reto
- Tema: DML
- Seniority: trainee-l2
- Tipo: practical
- Título: Optimización de Consultas SQL en un Sistema Bancario
- Tiempo estimado: 4 horas

### Fases (trabajo del HUMANO — PROHIBIDO completarlas)
No implementes estos entregables. Dejalos como hueco pedagógico. El asistente solo materializa el proyecto arrancable para que el participante pueda trabajar.
- Fase 1: Consultas Básicas de CRUD — objetivo: Ejecutar consultas SQL básicas de CRUD en el sistema bancario. — entregable (NO resolver): Tres consultas SQL verificables que realizan operaciones de inserción, actualización y eliminación.
- Fase 2: Optimización de Consultas con Joins — objetivo: Optimizar consultas SQL utilizando Joins para obtener información combinada de múltiples tablas. — entregable (NO resolver): Una consulta SQL optimizada que combina datos de cuentas y transacciones.
- Fase 3: Agregación y Ordenamiento de Datos — objetivo: Utilizar Group By y Order By para agregar y ordenar datos en consultas SQL. — entregable (NO resolver): Una consulta SQL que agrupa y ordena las transacciones por tipo.
- Fase 4: Revisión y Optimización Final — objetivo: Revisar y optimizar todas las consultas creadas para asegurar eficiencia y precisión. — entregable (NO resolver): Todas las consultas SQL optimizadas y verificadas.

Eres un asistente experto en análisis, corrección y generación de archivos de cualquier tipo:
código fuente, documentación, hojas de cálculo, documentos Word, configuraciones, entre otros.
Voy a enviarte una cadena de texto que contiene uno o más archivos. Cada archivo está delimitado por un marcador con el siguiente formato:
// === ARCHIVO: ruta/del/archivo.extension ===
o también puede aparecer como:
## === ARCHIVO: ruta/del/archivo.extension ===
Lo que sigue al marcador puede ser:

El contenido real del archivo (código, texto, YAML, etc.)
Una descripción en lenguaje natural de lo que debe contener el archivo


TU TAREA
PASO 0 — ¿Esto es un proyecto o una carcasa?
Antes de extraer archivos, leé el Briefing (si está) y diagnosticá el adjunto.

Es CARCASA si ocurre CUALQUIERA de estas:
- No hay manifiesto de dependencias del stack del briefing (manifest.json de VTEX IO / package.json / pom.xml / build.gradle / requirements.txt / go.mod / *.tf / *.csproj, según corresponda)
- Hay un "binario" que en realidad es un comentario ("no puede ser mostrado como texto plano", placeholder .fig/.docx vacío)
- Los markdowns ya completan entregables de fases posteriores ("se implementó fade-in", lista de áreas ya resuelta)

Si es CARCASA:
- MATERIALIZÁ un proyecto que arranca en el stack del briefing (VTEX IO Store Framework, Angular, Terraform, pytest, Nest, etc.). Incluí manifiesto, punto de entrada y capa de interfaz reales.
- NO copies los markdowns de "solución" como si fueran el producto. Son ruido de generación.
- NO resuelvas las fases del briefing (están marcadas PROHIBIDO). Dejá el hueco pedagógico: el flujo existe, las microinteracciones/calidad/infra que el reto pide NO están hechas.
- Después seguí al PASO 5 (ZIP).

Si es un proyecto REAL (manifiesto + código que compila o arranca):
- Seguí PASO 1 en adelante. 🔴 compilación sí. 🟡 pedagógico no.

PASO 1 — Detección y extracción
Identifica todos los archivos presentes en la cadena. Para cada archivo extrae:

Su ruta completa (ej: src/main/java/com/pragma/Service.java)
Su contenido o descripción

PASO 2 — Clasificación por tipo
Clasifica cada archivo en una de estas categorías:
A) Código fuente (Java, Python, TypeScript, JavaScript, Kotlin, etc.)
B) Configuración / documentación (YAML, properties, Markdown, JSON, txt, etc.)
C) Excel (.xlsx, .xls, .csv)
D) Word (.docx, .doc)
E) Otro tipo de archivo binario o especial
PASO 3 — Clasificación de errores en código fuente

Objetivo prioritario: que el proyecto compile. No corrijas flujo de negocio ni lógica funcional.

Antes de modificar cualquier archivo de código fuente, clasifica cada problema encontrado en una de estas dos categorías:
🔴 ERROR DE COMPILACIÓN — corregir siempre
Son errores que impiden que el proyecto arranque, sin valor pedagógico:

Import faltante o incorrecto
Clase, método o variable referenciada que no existe en ningún archivo del proyecto
Error de sintaxis
Anotación con atributos inválidos
Dependencia ausente en pom.xml, package.json, etc.
Archivo referenciado que no existe y debe ser creado con implementación mínima

→ CORREGIR estos errores.
🟡 PROBLEMA FUNCIONAL O DE CALIDAD — preservar siempre
Son problemas que no impiden compilar. Pueden ser intencionales para el aprendizaje:

Clave secreta hardcodeada ("secret", "password123")
API deprecada que funciona pero tiene reemplazo moderno
Lógica de negocio incorrecta o incompleta
Código redundante o de baja legibilidad
Falta de validaciones en flujo de negocio
Patrones de diseño incorrectos pero funcionales
Concurrencia no segura
Configuración funcional pero no óptima

→ PRESERVAR tal cual. No corregir, no mejorar, no comentar.
PASO 4 — Procesamiento según tipo de archivo
Tipo A — Código fuente
Aplica únicamente las correcciones clasificadas como 🔴 ERROR DE COMPILACIÓN.
No alteres ningún elemento clasificado como 🟡 PROBLEMA FUNCIONAL O DE CALIDAD.
Si falta un archivo referenciado, créalo con la implementación mínima necesaria para compilar.
Tipo B — Configuración / documentación
Extrae el contenido tal cual, sin modificaciones salvo errores evidentes de sintaxis
(ej: YAML mal indentado).
Tipo C — Excel (.xlsx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un archivo Excel funcional con:

Fila de encabezados en negrita con color de fondo distintivo
Columnas con ancho ajustado al contenido
Tipos de dato correctos por columna
Validaciones si la descripción lo indica
Hojas nombradas descriptivamente si hay más de una
Filas de ejemplo si no hay datos reales

Tipo D — Word (.docx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un documento Word funcional con:

Estilos de título (Título 1, Título 2) para jerarquía de secciones
Fuente legible (Calibri o equivalente), tamaño 11-12pt para cuerpo
Márgenes estándar
Tabla de contenido si tiene múltiples secciones
Tablas con encabezados en negrita si aplica

Tipo E — Otro
Genera el archivo con el contenido o estructura más apropiada según la descripción.
PASO 5 — Exportación en ZIP
Empaqueta todos los archivos en un único archivo ZIP descargable respetando exactamente
la estructura de rutas indicada por los marcadores.
El ZIP debe incluir:

Archivos de código con únicamente los errores de compilación corregidos
Archivos de configuración y documentación sin cambios
Archivos nuevos creados para resolver dependencias de compilación faltantes
Archivos Excel y Word generados desde descripción

IMPORTANTE: El ZIP debe estar listo para descargar al finalizar. No preguntes si el usuario
quiere generarlo. Simplemente genera el archivo y proporciona el enlace de descarga; No debes desplegar en el chat el resumen de lo que arreglaste al Zip, solo entregalo.

REGLAS IMPORTANTES

No omitas ningún archivo aunque no tenga errores ni modificaciones
Respeta los nombres y rutas exactas indicadas por los marcadores
Si un archivo no tiene marcador claro, infiere el nombre desde su contenido
Si la cadena contiene solo documentación, placeholders o binarios fake, NO la reproduzcas:
aplicá PASO 0 (materializar el proyecto del briefing). Reproducir la carcasa es un fallo.
No agregues texto después del enlace de descarga del ZIP
No preguntes si el usuario quiere el ZIP: simplemente generalo siempre
Si detectas que falta un archivo de configuración necesario para compilar
(pom.xml, package.json, requirements.txt, build.gradle, etc.), créalo e inclúyelo
inferiendo su contenido desde los imports y frameworks detectados en el código
Nunca corrijas problemas 🟡 aunque parezcan obvios o fáciles de mejorar.
El participante que recibirá este proyecto los debe encontrar y resolver él mismo.


INPUT
Aquí está la cadena con los archivos:

// === ARCHIVO: pom.xml ===
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.5.6</version>
        <relativePath/>
    </parent>

    <groupId>com.bankapp</groupId>
    <artifactId>bankapp</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>bankapp</name>
    <description>Sistema bancario para optimización de consultas SQL</description>

    <properties>
        <java.version>21</java.version>
        <springdoc-openapi-ui.version>2.5.0</springdoc-openapi-ui.version>
        <lombok.version>1.18.30</lombok.version>
    </properties>

    <dependencies>
        <!-- Spring Boot Starters -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>

        <!-- Base de datos -->
        <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
            <scope>runtime</scope>
        </dependency>

        <!-- Lombok -->
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>${lombok.version}</version>
            <scope>provided</scope>
        </dependency>

        <!-- Documentación OpenAPI -->
        <dependency>
            <groupId>org.springdoc</groupId>
            <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
            <version>${springdoc-openapi-ui.version}</version>
        </dependency>

        <!-- Testing -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <excludes>
                        <exclude>
                            <groupId>org.projectlombok</groupId>
                            <artifactId>lombok</artifactId>
                        </exclude>
                    </excludes>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>

// === ARCHIVO: src/main/java/com/bankapp/Application.java ===
package com.bankapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import com.bankapp.application.service.AccountService;
import com.bankapp.application.service.TransactionService;
import com.bankapp.domain.model.Account;
import com.bankapp.infrastructure.dto.AccountDto;
import com.bankapp.infrastructure.dto.TransactionDto;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class Application {

    @Autowired
    private AccountService accountService;

    @Autowired
    private TransactionService transactionService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public CommandLineRunner initDatabase() {
        return args -> {
            // Verificar si ya existen datos iniciales
            if (accountService.getAllAccounts().isEmpty()) {
                // Crear cuentas de ejemplo
                AccountDto account1 = new AccountDto(null, "ACC001", "Juan Pérez", new BigDecimal("1000.00"), "ACTIVE");
                AccountDto account2 = new AccountDto(null, "ACC002", "María López", new BigDecimal("1500.00"), "ACTIVE");
                Account createdAccount1 = accountService.createAccount(account1);
                Account createdAccount2 = accountService.createAccount(account2);

                // Crear transacciones de ejemplo
                TransactionDto transaction1 = new TransactionDto(
                    null,
                    "TRANS001",
                    createdAccount1.getId(),
                    new BigDecimal("100.00"),
                    "DEPOSIT",
                    LocalDateTime.now()
                );
                TransactionDto transaction2 = new TransactionDto(
                    null,
                    "TRANS002",
                    createdAccount2.getId(),
                    new BigDecimal("50.00"),
                    "WITHDRAWAL",
                    LocalDateTime.now()
                );
                transactionService.createTransaction(transaction1);
                transactionService.createTransaction(transaction2);
            }

            // Verificar funcionalidad básica
            List<Account> accounts = accountService.getAllAccounts();
            System.out.println("Cuentas cargadas: " + accounts.size());
            accounts.forEach(account -> System.out.println("ID: " + account.getId() + ", Número: " + account.getAccountNumber()));

            // Validar manejo de errores
            try {
                transactionService.getTransactionByReference("NON_EXISTENT");
            } catch (Exception e) {
                System.out.println("Excepción esperada: " + e.getMessage());
            }
        };
    }
}

// === ARCHIVO: src/main/resources/application.yml ===
spring:
  application:
    name: bankapp

  datasource:
    url: jdbc:postgresql://localhost:5432/bankdb
    username: bankuser
    password: bankpass
    driver-class-name: org.postgresql.Driver

  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
    properties:
      hibernate:
        format_sql: true
        dialect: org.hibernate.dialect.PostgreSQLDialect

server:
  port: 8080

springdoc:
  api-docs:
    path: /api-docs
  swagger-ui:
    path: /swagger-ui.html
    operationsSorter: method

// === ARCHIVO: src/main/java/com/bankapp/domain/model/Account.java ===
package com.bankapp.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "accounts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotNull
    @Size(min = 5, max = 20)
    @Column(nullable = false, unique = true)
    private String accountNumber;

    @NotNull
    @Size(min = 3, max = 100)
    @Column(nullable = false)
    private String customerName;

    @NotNull
    @Positive
    @Column(nullable = false)
    private BigDecimal balance;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AccountStatus status;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Transaction> transactions = new ArrayList<>();

    public enum AccountStatus {
        ACTIVE, INACTIVE, FROZEN
    }

    public void deposit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        this.balance = this.balance.add(amount);
    }

    public void withdraw(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (this.balance.compareTo(amount) < 0) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        this.balance = this.balance.subtract(amount);
    }
}

// === ARCHIVO: src/main/java/com/bankapp/domain/model/Transaction.java ===
package com.bankapp.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "transactions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TransactionType type;

    @NotNull
    @Positive
    @Column(nullable = false)
    private BigDecimal amount;

    @NotNull
    @Column(nullable = false)
    private LocalDateTime timestamp;

    @NotNull
    @Size(min = 3, max = 255)
    @Column(nullable = false)
    private String description;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @PrePersist
    protected void onCreate() {
        if (timestamp == null) {
            timestamp = LocalDateTime.now();
        }
    }

    public boolean isValid() {
        return amount.compareTo(BigDecimal.ZERO) > 0 &&
               description != null && !description.trim().isEmpty() &&
               account != null;
    }
}

// === ARCHIVO: src/main/java/com/bankapp/domain/model/TransactionType.java ===
package com.bankapp.domain.model;

public enum TransactionType {
    DEPOSIT,
    WITHDRAWAL,
    TRANSFER,
    FEE,
    INTEREST
}

// === ARCHIVO: src/main/java/com/bankapp/domain/repository/AccountRepository.java ===
package com.bankapp.domain.repository;

import com.bankapp.domain.model.Account;
import com.bankapp.domain.model.Account.AccountStatus;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AccountRepository {
    
    Optional<Account> findById(UUID id);
    
    Optional<Account> findByAccountNumber(String accountNumber);
    
    List<Account> findAll();
    
    List<Account> findByStatus(AccountStatus status);
    
    List<Account> findByCustomerName(String customerName);
    
    List<Account> findByBalanceGreaterThan(BigDecimal balance);
    
    List<Account> findByBalanceBetween(BigDecimal minBalance, BigDecimal maxBalance);
    
    boolean existsByAccountNumber(String accountNumber);
    
    Account save(Account account);
    
    void deleteById(UUID id);
    
    long count();
    
    long countByStatus(AccountStatus status);
}

// === ARCHIVO: src/main/java/com/bankapp/domain/repository/TransactionRepository.java ===
package com.bankapp.domain.repository;

import com.bankapp.domain.model.Transaction;
import com.bankapp.domain.model.Transaction.TransactionType;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TransactionRepository {
    
    Optional<Transaction> findById(UUID id);
    
    List<Transaction> findAll();
    
    List<Transaction> findByAccountId(UUID accountId);
    
    List<Transaction> findByType(TransactionType type);
    
    List<Transaction> findByAmountBetween(BigDecimal minAmount, BigDecimal maxAmount);
    
    List<Transaction> findByTimestampBetween(LocalDateTime start, LocalDateTime end);
    
    List<Transaction> findByDescriptionContaining(String descriptionPattern);
    
    boolean existsById(UUID id);
    
    Transaction save(Transaction transaction);
    
    void deleteById(UUID id);
    
    long count();
    
    long countByType(TransactionType type);
    
    BigDecimal sumAmountByAccountId(UUID accountId);
    
    BigDecimal sumAmountByType(TransactionType type);
}

// === ARCHIVO: src/main/java/com/bankapp/infrastructure/repository/JpaAccountRepository.java ===
package com.bankapp.infrastructure.repository;

import com.bankapp.domain.model.Account;
import com.bankapp.domain.model.Account.AccountStatus;
import com.bankapp.domain.repository.AccountRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class JpaAccountRepository implements AccountRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Optional<Account> findById(UUID id) {
        Account account = entityManager.find(Account.class, id);
        return Optional.ofNullable(account);
    }

    @Override
    public Optional<Account> findByAccountNumber(String accountNumber) {
        TypedQuery<Account> query = entityManager.createQuery(
            "SELECT a FROM Account a WHERE a.accountNumber = :accountNumber", Account.class);
        query.setParameter("accountNumber", accountNumber);
        List<Account> results = query.getResultList();
        return results.isEmpty() ? Optional.empty() : Optional.of(results.get(0));
    }

    @Override
    public List<Account> findAll() {
        TypedQuery<Account> query = entityManager.createQuery(
            "SELECT a FROM Account a", Account.class);
        return query.getResultList();
    }

    @Override
    public List<Account> findByStatus(AccountStatus status) {
        TypedQuery<Account> query = entityManager.createQuery(
            "SELECT a FROM Account a WHERE a.status = :status", Account.class);
        query.setParameter("status", status);
        return query.getResultList();
    }

    @Override
    public List<Account> findByCustomerName(String customerName) {
        TypedQuery<Account> query = entityManager.createQuery(
            "SELECT a FROM Account a WHERE a.customerName = :customerName", Account.class);
        query.setParameter("customerName", customerName);
        return query.getResultList();
    }

    @Override
    public List<Account> findByBalanceGreaterThan(BigDecimal balance) {
        TypedQuery<Account> query = entityManager.createQuery(
            "SELECT a FROM Account a WHERE a.balance > :balance", Account.class);
        query.setParameter("balance", balance);
        return query.getResultList();
    }

    @Override
    public List<Account> findByBalanceBetween(BigDecimal minBalance, BigDecimal maxBalance) {
        TypedQuery<Account> query = entityManager.createQuery(
            "SELECT a FROM Account a WHERE a.balance BETWEEN :minBalance AND :maxBalance", Account.class);
        query.setParameter("minBalance", minBalance);
        query.setParameter("maxBalance", maxBalance);
        return query.getResultList();
    }

    @Override
    public boolean existsByAccountNumber(String accountNumber) {
        TypedQuery<Long> query = entityManager.createQuery(
            "SELECT COUNT(a) FROM Account a WHERE a.accountNumber = :accountNumber", Long.class);
        query.setParameter("accountNumber", accountNumber);
        return query.getSingleResult() > 0;
    }

    @Override
    public Account save(Account account) {
        if (account.getId() == null) {
            entityManager.persist(account);
            return account;
        } else {
            return entityManager.merge(account);
        }
    }

    @Override
    public void deleteById(UUID id) {
        Account account = entityManager.find(Account.class, id);
        if (account != null) {
            entityManager.remove(account);
        }
    }

    @Override
    public long count() {
        TypedQuery<Long> query = entityManager.createQuery(
            "SELECT COUNT(a) FROM Account a", Long.class);
        return query.getSingleResult();
    }

    @Override
    public long countByStatus(AccountStatus status) {
        TypedQuery<Long> query = entityManager.createQuery(
            "SELECT COUNT(a) FROM Account a WHERE a.status = :status", Long.class);
        query.setParameter("status", status);
        return query.getSingleResult();
    }

    @Query("SELECT a FROM Account a LEFT JOIN FETCH a.transactions WHERE a.id = :id")
    public Optional<Account> findByIdWithTransactions(@Param("id") UUID id) {
        TypedQuery<Account> query = entityManager.createQuery(
            "SELECT a FROM Account a LEFT JOIN FETCH a.transactions WHERE a.id = :id", Account.class);
        query.setParameter("id", id);
        List<Account> results = query.getResultList();
        return results.isEmpty() ? Optional.empty() : Optional.of(results.get(0));
    }

    @Query("SELECT a FROM Account a WHERE a.balance > :minBalance ORDER BY a.balance DESC")
    public List<Account> findAccountsWithHighBalance(@Param("minBalance") BigDecimal minBalance) {
        TypedQuery<Account> query = entityManager.createQuery(
            "SELECT a FROM Account a WHERE a.balance > :minBalance ORDER BY a.balance DESC", Account.class);
        query.setParameter("minBalance", minBalance);
        return query.getResultList();
    }

    @Query("SELECT DISTINCT a.customerName FROM Account a WHERE a.status = :status")
    public List<String> findDistinctCustomerNamesByStatus(@Param("status") AccountStatus status) {
        TypedQuery<String> query = entityManager.createQuery(
            "SELECT DISTINCT a.customerName FROM Account a WHERE a.status = :status", String.class);
        query.setParameter("status", status);
        return query.getResultList();
    }
}

// === ARCHIVO: src/main/java/com/bankapp/infrastructure/repository/JpaTransactionRepository.java ===
package com.bankapp.infrastructure.repository;

import com.bankapp.domain.model.Transaction;
import com.bankapp.domain.model.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface JpaTransactionRepository extends JpaRepository<Transaction, UUID> {

    List<Transaction> findByAccountId(UUID accountId);

    Optional<Transaction> findByIdAndAccountId(UUID id, UUID accountId);

    List<Transaction> findByType(TransactionType type);

    @Query("SELECT t FROM Transaction t WHERE t.account.id = :accountId ORDER BY t.timestamp DESC")
    List<Transaction> findRecentTransactionsByAccountId(@Param("accountId") UUID accountId);

    @Query("SELECT t FROM Transaction t JOIN t.account a WHERE a.accountNumber = :accountNumber ORDER BY t.timestamp DESC")
    List<Transaction> findByAccountNumber(@Param("accountNumber") String accountNumber);

    @Query("SELECT t FROM Transaction t WHERE t.timestamp BETWEEN :startDate AND :endDate ORDER BY t.timestamp ASC")
    List<Transaction> findByDateRange(@Param("startDate") LocalDateTime startDate, @Param("endDate") LocalDateTime endDate);

    @Query("SELECT t.type, COUNT(t) FROM Transaction t WHERE t.account.id = :accountId GROUP BY t.type")
    List<Object[]> countTransactionsByTypeForAccount(@Param("accountId") UUID accountId);

    @Query("SELECT t.type, SUM(t.amount) FROM Transaction t WHERE t.account.id = :accountId GROUP BY t.type")
    List<Object[]> sumAmountsByTypeForAccount(@Param("accountId") UUID accountId);

    @Query("SELECT a.accountNumber, SUM(t.amount) FROM Transaction t JOIN t.account a GROUP BY a.accountNumber ORDER BY SUM(t.amount) DESC")
    List<Object[]> findTotalAmountByAccount();

    @Query("SELECT t.type, AVG(t.amount) FROM Transaction t WHERE t.account.id = :accountId GROUP BY t.type")
    List<Object[]> findAverageAmountByTypeForAccount(@Param("accountId") UUID accountId);

    @Query("SELECT t FROM Transaction t WHERE t.account.id = :accountId AND t.amount > :amount ORDER BY t.amount DESC")
    List<Transaction> findTransactionsAboveAmount(@Param("accountId") UUID accountId, @Param("amount") BigDecimal amount);

    @Query("SELECT t FROM Transaction t WHERE t.description LIKE %:keyword% ORDER BY t.timestamp DESC")
    List<Transaction> findByDescriptionContaining(@Param("keyword") String keyword);

    @Query("SELECT t FROM Transaction t JOIN t.account a WHERE a.customerName = :customerName ORDER BY t.timestamp DESC")
    List<Transaction> findByCustomerName(@Param("customerName") String customerName);

    @Query(value = "SELECT t.id, t.amount, t.type, t.description, t.timestamp, t.account_id FROM transactions t INNER JOIN accounts a ON t.account_id = a.id WHERE a.status = 'ACTIVE' ORDER BY t.timestamp DESC", nativeQuery = true)
    List<Object[]> findActiveAccountTransactions();

    @Query("SELECT t FROM Transaction t WHERE t.account.id = :accountId ORDER BY t.amount DESC")
    List<Transaction> findLargestTransactionsByAccount(@Param("accountId") UUID accountId);

    @Query("SELECT COUNT(t) FROM Transaction t WHERE t.account.id = :accountId")
    Long countByAccountId(@Param("accountId") UUID accountId);

    @Query("SELECT MAX(t.amount) FROM Transaction t WHERE t.account.id = :accountId AND t.type = :type")
    BigDecimal findMaxAmountByAccountAndType(@Param("accountId") UUID accountId, @Param("type") TransactionType type);

    @Query("SELECT MIN(t.amount) FROM Transaction t WHERE t.account.id = :accountId AND t.type = :type")
    BigDecimal findMinAmountByAccountAndType(@Param("accountId") UUID accountId, @Param("type") TransactionType type);
}

// === ARCHIVO: src/main/java/com/bankapp/infrastructure/dto/AccountDto.java ===
package com.bankapp.infrastructure.dto;


import com.bankapp.domain.model.AccountStatus;
import com.bankapp.domain.model.Account;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.util.UUID;

public record AccountDto(
    @NotNull(message = "El ID no puede ser nulo")
    UUID id,

    @NotBlank(message = "El número de cuenta no puede estar vacío")
    @Size(min = 10, max = 20, message = "El número de cuenta debe tener entre 10 y 20 caracteres")
    String accountNumber,

    @NotBlank(message = "El nombre del cliente no puede estar vacío")
    @Size(min = 2, max = 100, message = "El nombre del cliente debe tener entre 2 y 100 caracteres")
    String customerName,

    @NotNull(message = "El saldo no puede ser nulo")
    @Positive(message = "El saldo debe ser positivo")
    BigDecimal balance,

    @NotBlank(message = "El estado de la cuenta no puede estar vacío")
    String status,

    Integer transactionCount
) {
    public static AccountDto fromDomain(Account account) {
        return new AccountDto(
            account.getId(),
            account.getAccountNumber(),
            account.getCustomerName(),
            account.getBalance(),
            account.getStatus().name(),
            account.getTransactions() != null ? account.getTransactions().size() : 0
        );
    }

    public static AccountDto fromDomainWithCount(Account account, Long transactionCount) {
        return new AccountDto(
            account.getId(),
            account.getAccountNumber(),
            account.getCustomerName(),
            account.getBalance(),
            account.getStatus().name(),
            transactionCount != null ? transactionCount.intValue() : 0
        );
    }

    public Account toDomain() {
        Account account = new Account();
        account.setId(this.id);
        account.setAccountNumber(this.accountNumber);
        account.setCustomerName(this.customerName);
        account.setBalance(this.balance);
        account.setStatus(Account.AccountStatus.valueOf(this.status));
        return account;
    }
}

// === ARCHIVO: src/main/java/com/bankapp/infrastructure/dto/TransactionDto.java ===
package com.bankapp.infrastructure.dto;

import com.bankapp.domain.model.Transaction;
import com.bankapp.domain.model.TransactionType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public record TransactionDto(
    @NotNull(message = "El ID no puede ser nulo")
    UUID id,

    @NotNull(message = "El tipo de transacción no puede ser nulo")
    String type,

    @NotNull(message = "El monto no puede ser nulo")
    @Positive(message = "El monto debe ser positivo")
    BigDecimal amount,

    @NotNull(message = "La fecha y hora no pueden ser nulas")
    LocalDateTime timestamp,

    @NotBlank(message = "La descripción no puede estar vacía")
    @Size(max = 255, message = "La descripción no puede exceder 255 caracteres")
    String description,

    @NotNull(message = "El ID de la cuenta no puede ser nulo")
    UUID accountId,

    String accountNumber,

    String customerName
) {
    public static TransactionDto fromDomain(Transaction transaction) {
        String accountNumber = null;
        String customerName = null;
        if (transaction.getAccount() != null) {
            accountNumber = transaction.getAccount().getAccountNumber();
            customerName = transaction.getAccount().getCustomerName();
        }
        return new TransactionDto(
            transaction.getId(),
            transaction.getType().name(),
            transaction.getAmount(),
            transaction.getTimestamp(),
            transaction.getDescription(),
            transaction.getAccount() != null ? transaction.getAccount().getId() : null,
            accountNumber,
            customerName
        );
    }

    public Transaction toDomain() {
        Transaction transaction = new Transaction();
        transaction.setId(this.id);
        transaction.setType(TransactionType.valueOf(this.type));
        transaction.setAmount(this.amount);
        transaction.setTimestamp(this.timestamp);
        transaction.setDescription(this.description);
        return transaction;
    }

    public static TransactionDto simple(UUID id, String type, BigDecimal amount, LocalDateTime timestamp, String description, UUID accountId) {
        return new TransactionDto(id, type, amount, timestamp, description, accountId, null, null);
    }
}

// === ARCHIVO: src/main/java/com/bankapp/application/service/AccountService.java ===
package com.bankapp.application.service;

import com.bankapp.domain.model.Account;
import com.bankapp.domain.model.Account.AccountStatus;
import com.bankapp.domain.repository.AccountRepository;
import com.bankapp.infrastructure.dto.AccountDto;
import com.bankapp.infrastructure.exception.TransactionNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Transactional
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public AccountDto createAccount(AccountDto accountDto) {
        if (accountDto.getAccountNumber() == null || accountDto.getAccountNumber().isBlank()) {
            throw new IllegalArgumentException("El número de cuenta no puede estar vacío");
        }
        if (accountDto.getCustomerName() == null || accountDto.getCustomerName().isBlank()) {
            throw new IllegalArgumentException("El nombre del cliente no puede estar vacío");
        }
        if (accountDto.getBalance() == null || accountDto.getBalance().compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("El saldo no puede ser negativo");
        }

        Account account = new Account();
        account.setId(UUID.randomUUID());
        account.setAccountNumber(accountDto.getAccountNumber());
        account.setCustomerName(accountDto.getCustomerName());
        account.setBalance(accountDto.getBalance());
        account.setStatus(AccountStatus.ACTIVE);

        Account savedAccount = accountRepository.save(account);
        return mapToDto(savedAccount);
    }

    @Transactional(readOnly = true)
    public AccountDto getAccountById(UUID id) {
        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new TransactionNotFoundException("Cuenta no encontrada con ID: " + id));
        return mapToDto(account);
    }

    @Transactional(readOnly = true)
    public AccountDto getAccountByNumber(String accountNumber) {
        Account account = accountRepository.findByAccountNumber(accountNumber)
                .orElseThrow(() -> new TransactionNotFoundException("Cuenta no encontrada: " + accountNumber));
        return mapToDto(account);
    }

    @Transactional(readOnly = true)
    public List<AccountDto> getAllAccounts() {
        return accountRepository.findAll().stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<AccountDto> getAccountsByStatus(AccountStatus status) {
        return accountRepository.findByStatus(status).stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    public AccountDto updateAccount(UUID id, AccountDto accountDto) {
        Account existingAccount = accountRepository.findById(id)
                .orElseThrow(() -> new TransactionNotFoundException("Cuenta no encontrada con ID: " + id));

        if (accountDto.getCustomerName() != null && !accountDto.getCustomerName().isBlank()) {
            existingAccount.setCustomerName(accountDto.getCustomerName());
        }
        if (accountDto.getStatus() != null) {
            existingAccount.setStatus(accountDto.getStatus());
        }

        Account updatedAccount = accountRepository.save(existingAccount);
        return mapToDto(updatedAccount);
    }

    public AccountDto updateBalance(UUID id, BigDecimal newBalance) {
        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new TransactionNotFoundException("Cuenta no encontrada con ID: " + id));

        if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("El saldo no puede ser negativo");
        }

        account.setBalance(newBalance);
        Account updatedAccount = accountRepository.save(account);
        return mapToDto(updatedAccount);
    }

    public void deleteAccount(UUID id) {
        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new TransactionNotFoundException("Cuenta no encontrada con ID: " + id));

        if (account.getBalance().compareTo(BigDecimal.ZERO) > 0) {
            throw new IllegalStateException("No se puede eliminar una cuenta con saldo positivo");
        }

        accountRepository.delete(account);
    }

    public AccountDto deactivateAccount(UUID id) {
        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new TransactionNotFoundException("Cuenta no encontrada con ID: " + id));

        account.setStatus(AccountStatus.INACTIVE);
        Account updatedAccount = accountRepository.save(account);
        return mapToDto(updatedAccount);
    }

    public AccountDto activateAccount(UUID id) {
        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new TransactionNotFoundException("Cuenta no encontrada con ID: " + id));

        account.setStatus(AccountStatus.ACTIVE);
        Account updatedAccount = accountRepository.save(account);
        return mapToDto(updatedAccount);
    }

    private AccountDto mapToDto(Account account) {
        AccountDto dto = new AccountDto();
        dto.setId(account.getId());
        dto.setAccountNumber(account.getAccountNumber());
        dto.setCustomerName(account.getCustomerName());
        dto.setBalance(account.getBalance());
        dto.setStatus(account.getStatus());
        return dto;
    }
}

// === ARCHIVO: src/main/java/com/bankapp/application/service/TransactionService.java ===
package com.bankapp.application.service;


import com.bankapp.domain.model.AccountStatus;
import com.bankapp.domain.model.Account;
import com.bankapp.domain.model.Transaction;
import com.bankapp.domain.model.TransactionType;
import com.bankapp.domain.repository.AccountRepository;
import com.bankapp.domain.repository.TransactionRepository;
import com.bankapp.infrastructure.dto.TransactionDto;
import com.bankapp.infrastructure.exception.TransactionAlreadyExistsException;
import com.bankapp.infrastructure.exception.TransactionNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Transactional
public class TransactionService {

    private final TransactionRepository transactionRepository;
    private final AccountRepository accountRepository;
    private final AccountService accountService;

    public TransactionService(TransactionRepository transactionRepository,
                              AccountRepository accountRepository,
                              AccountService accountService) {
        this.transactionRepository = transactionRepository;
        this.accountRepository = accountRepository;
        this.accountService = accountService;
    }

    public TransactionDto createTransaction(TransactionDto transactionDto) {
        if (transactionDto.getAmount() == null || transactionDto.getAmount().compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor que cero");
        }
        if (transactionDto.getType() == null) {
            throw new IllegalArgumentException("El tipo de transacción es obligatorio");
        }
        if (transactionDto.getAccountId() == null) {
            throw new IllegalArgumentException("El ID de cuenta es obligatorio");
        }

        Account account = accountRepository.findById(transactionDto.getAccountId())
                .orElseThrow(() -> new TransactionNotFoundException("Cuenta no encontrada"));

        if (account.getStatus() != Account.AccountStatus.ACTIVE) {
            throw new IllegalStateException("La cuenta no está activa para realizar transacciones");
        }

        Transaction transaction = new Transaction();
        transaction.setId(UUID.randomUUID());
        transaction.setType(transactionDto.getType());
        transaction.setAmount(transactionDto.getAmount());
        transaction.setDescription(transactionDto.getDescription());
        transaction.setTimestamp(LocalDateTime.now());
        transaction.setAccount(account);

        if (transactionDto.getType() == TransactionType.DEPOSIT) {
            account.deposit(transactionDto.getAmount());
        } else if (transactionDto.getType() == TransactionType.WITHDRAWAL) {
            if (account.getBalance().compareTo(transactionDto.getAmount()) < 0) {
                throw new IllegalStateException("Saldo insuficiente para realizar el retiro");
            }
            account.withdraw(transactionDto.getAmount());
        }

        accountRepository.save(account);
        Transaction savedTransaction = transactionRepository.save(transaction);
        return mapToDto(savedTransaction);
    }

    public TransactionDto createTransactionWithIdempotency(TransactionDto transactionDto, String idempotencyKey) {
        if (idempotencyKey != null && !idempotencyKey.isBlank()) {
            List<Transaction> existing = transactionRepository.findByDescriptionContaining(idempotencyKey);
            if (!existing.isEmpty()) {
                throw new TransactionAlreadyExistsException("Transacción duplicada detectada: " + idempotencyKey);
            }
        }
        return createTransaction(transactionDto);
    }

    @Transactional(readOnly = true)
    public TransactionDto getTransactionById(UUID id) {
        Transaction transaction = transactionRepository.findById(id)
                .orElseThrow(() -> new TransactionNotFoundException("Transacción no encontrada con ID: " + id));
        return mapToDto(transaction);
    }

    @Transactional(readOnly = true)
    public List<TransactionDto> getAllTransactions() {
        return transactionRepository.findAll().stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<TransactionDto> getTransactionsByAccountId(UUID accountId) {
        Account account = accountRepository.findById(accountId)
                .orElseThrow(() -> new TransactionNotFoundException("Cuenta no encontrada"));
        return transactionRepository.findByAccount(account).stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<TransactionDto> getTransactionsByType(TransactionType type) {
        return transactionRepository.findByType(type).stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<TransactionDto> getTransactionsByDateRange(LocalDateTime startDate, LocalDateTime endDate) {
        if (startDate == null || endDate == null) {
            throw new IllegalArgumentException("Las fechas de inicio y fin son obligatorias");
        }
        if (startDate.isAfter(endDate)) {
            throw new IllegalArgumentException("La fecha de inicio no puede ser posterior a la fecha fin");
        }
        return transactionRepository.findByTimestampBetween(startDate, endDate).stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    public TransactionDto updateTransaction(UUID id, TransactionDto transactionDto) {
        Transaction existingTransaction = transactionRepository.findById(id)
                .orElseThrow(() -> new TransactionNotFoundException("Transacción no encontrada con ID: " + id));

        if (transactionDto.getDescription() != null) {
            existingTransaction.setDescription(transactionDto.getDescription());
        }

        Transaction updatedTransaction = transactionRepository.save(existingTransaction);
        return mapToDto(updatedTransaction);
    }

    public void deleteTransaction(UUID id) {
        Transaction transaction = transactionRepository.findById(id)
                .orElseThrow(() -> new TransactionNotFoundException("Transacción no encontrada con ID: " + id));
        transactionRepository.delete(transaction);
    }

    @Transactional(readOnly = true)
    public BigDecimal getTotalAmountByType(TransactionType type) {
        List<Transaction> transactions = transactionRepository.findByType(type);
        return transactions.stream()
                .map(Transaction::getAmount)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @Transactional(readOnly = true)
    public List<TransactionDto> getTransactionsGroupedByType() {
        return transactionRepository.findAll().stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<TransactionDto> getTransactionsOrderedByDate() {
        return transactionRepository.findAllByOrderByTimestampDesc().stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    private TransactionDto mapToDto(Transaction transaction) {
        TransactionDto dto = new TransactionDto();
        dto.setId(transaction.getId());
        dto.setType(transaction.getType());
        dto.setAmount(transaction.getAmount());
        dto.setTimestamp(transaction.getTimestamp());
        dto.setDescription(transaction.getDescription());
        if (transaction.getAccount() != null) {
            dto.setAccountId(transaction.getAccount().getId());
        }
        return dto;
    }
}

// === ARCHIVO: src/main/java/com/bankapp/infrastructure/controller/AccountController.java ===
package com.bankapp.infrastructure.controller;

import com.bankapp.application.service.AccountService;
import com.bankapp.domain.model.Account.AccountStatus;
import com.bankapp.infrastructure.dto.AccountDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public ResponseEntity<AccountDto> createAccount(@Valid @RequestBody AccountDto accountDto) {
        AccountDto created = accountService.createAccount(accountDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AccountDto> getAccountById(@PathVariable UUID id) {
        AccountDto account = accountService.getAccountById(id);
        return ResponseEntity.ok(account);
    }

    @GetMapping("/number/{accountNumber}")
    public ResponseEntity<AccountDto> getAccountByNumber(@PathVariable String accountNumber) {
        AccountDto account = accountService.getAccountByNumber(accountNumber);
        return ResponseEntity.ok(account);
    }

    @GetMapping
    public ResponseEntity<List<AccountDto>> getAllAccounts() {
        List<AccountDto> accounts = accountService.getAllAccounts();
        return ResponseEntity.ok(accounts);
    }

    @GetMapping("/status/{status}")
    public ResponseEntity<List<AccountDto>> getAccountsByStatus(@PathVariable AccountStatus status) {
        List<AccountDto> accounts = accountService.getAccountsByStatus(status);
        return ResponseEntity.ok(accounts);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AccountDto> updateAccount(@PathVariable UUID id,
                                                     @Valid @RequestBody AccountDto accountDto) {
        AccountDto updated = accountService.updateAccount(id, accountDto);
        return ResponseEntity.ok(updated);
    }

    @PatchMapping("/{id}/balance")
    public ResponseEntity<AccountDto> updateBalance(@PathVariable UUID id,
                                                     @RequestParam BigDecimal balance) {
        AccountDto updated = accountService.updateBalance(id, balance);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAccount(@PathVariable UUID id) {
        accountService.deleteAccount(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}/deactivate")
    public ResponseEntity<AccountDto> deactivateAccount(@PathVariable UUID id) {
        AccountDto deactivated = accountService.deactivateAccount(id);
        return ResponseEntity.ok(deactivated);
    }

    @PatchMapping("/{id}/activate")
    public ResponseEntity<AccountDto> activateAccount(@PathVariable UUID id) {
        AccountDto activated = accountService.activateAccount(id);
        return ResponseEntity.ok(activated);
    }
}

// === ARCHIVO: src/main/java/com/bankapp/infrastructure/exception/TransactionAlreadyExistsException.java ===
package com.bankapp.infrastructure.exception;


import com.bankapp.domain.model.Transaction;
import java.util.UUID;

public class TransactionAlreadyExistsException extends RuntimeException {
    private final UUID transactionId;
    private final String transactionReference;
    private final int errorCode;

    public TransactionAlreadyExistsException(String message) {
        super(message);
        this.transactionId = null;
        this.transactionReference = null;
        this.errorCode = 409;
    }

    public TransactionAlreadyExistsException(String message, UUID transactionId) {
        super(message);
        this.transactionId = transactionId;
        this.transactionReference = null;
        this.errorCode = 409;
    }

    public TransactionAlreadyExistsException(String message, UUID transactionId, String transactionReference) {
        super(message);
        this.transactionId = transactionId;
        this.transactionReference = transactionReference;
        this.errorCode = 409;
    }

    public TransactionAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
        this.transactionId = null;
        this.transactionReference = null;
        this.errorCode = 409;
    }

    public TransactionAlreadyExistsException(String message, UUID transactionId, Throwable cause) {
        super(message, cause);
        this.transactionId = transactionId;
        this.transactionReference = null;
        this.errorCode = 409;
    }

    public UUID getTransactionId() {
        return transactionId;
    }

    public String getTransactionReference() {
        return transactionReference;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getDetailedMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransactionAlreadyExistsException: ").append(getMessage());
        if (transactionId != null) {
            sb.append(" | Transaction ID: ").append(transactionId);
        }
        if (transactionReference != null) {
            sb.append(" | Reference: ").append(transactionReference);
        }
        sb.append(" | Error Code: ").append(errorCode);
        return sb.toString();
    }

    @Override
    public String toString() {
        return getDetailedMessage();
    }
}

// === ARCHIVO: src/main/java/com/bankapp/infrastructure/controller/TransactionController.java ===
package com.bankapp.infrastructure.controller;


import com.bankapp.domain.model.TransactionType;
import com.bankapp.application.service.TransactionService;
import com.bankapp.domain.model.Transaction;
import com.bankapp.infrastructure.dto.TransactionDto;
import com.bankapp.infrastructure.exception.TransactionAlreadyExistsException;
import com.bankapp.infrastructure.exception.TransactionNotFoundException;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    public ResponseEntity<List<TransactionDto>> getAllTransactions() {
        List<Transaction> transactions = transactionService.findAll();
        List<TransactionDto> transactionDtos = transactions.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
        return ResponseEntity.ok(transactionDtos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TransactionDto> getTransactionById(@PathVariable UUID id) {
        Transaction transaction = transactionService.findById(id);
        return ResponseEntity.ok(toDto(transaction));
    }

    @GetMapping("/account/{accountId}")
    public ResponseEntity<List<TransactionDto>> getTransactionsByAccountId(@PathVariable UUID accountId) {
        List<Transaction> transactions = transactionService.findByAccountId(accountId);
        List<TransactionDto> transactionDtos = transactions.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
        return ResponseEntity.ok(transactionDtos);
    }

    @PostMapping
    public ResponseEntity<TransactionDto> createTransaction(@Valid @RequestBody TransactionDto transactionDto) {
        Transaction transaction = toEntity(transactionDto);
        Transaction createdTransaction = transactionService.create(transaction);
        return ResponseEntity.status(HttpStatus.CREATED).body(toDto(createdTransaction));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TransactionDto> updateTransaction(
            @PathVariable UUID id,
            @Valid @RequestBody TransactionDto transactionDto) {
        Transaction transaction = toEntity(transactionDto);
        Transaction updatedTransaction = transactionService.update(id, transaction);
        return ResponseEntity.ok(toDto(updatedTransaction));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTransaction(@PathVariable UUID id) {
        transactionService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{id}/duplicate-check")
    public ResponseEntity<TransactionDto> checkAndCreateTransaction(
            @PathVariable UUID id,
            @Valid @RequestBody TransactionDto transactionDto) {
        try {
            Transaction existingTransaction = transactionService.findById(id);
            throw new TransactionAlreadyExistsException(
                    "Transaction already exists with ID: " + id,
                    id,
                    existingTransaction.getDescription()
            );
        } catch (TransactionNotFoundException e) {
            Transaction transaction = toEntity(transactionDto);
            Transaction createdTransaction = transactionService.create(transaction);
            return ResponseEntity.status(HttpStatus.CREATED).body(toDto(createdTransaction));
        }
    }

    private TransactionDto toDto(Transaction transaction) {
        TransactionDto dto = new TransactionDto();
        dto.setId(transaction.getId());
        dto.setType(transaction.getType().name());
        dto.setAmount(transaction.getAmount());
        dto.setTimestamp(transaction.getTimestamp());
        dto.setDescription(transaction.getDescription());
        if (transaction.getAccount() != null) {
            dto.setAccountId(transaction.getAccount().getId());
        }
        return dto;
    }

    private Transaction toEntity(TransactionDto dto) {
        Transaction transaction = new Transaction();
        transaction.setType(com.bankapp.domain.model.TransactionType.valueOf(dto.getType()));
        transaction.setAmount(dto.getAmount());
        transaction.setDescription(dto.getDescription());
        return transaction;
    }
}

// === ARCHIVO: src/main/java/com/bankapp/infrastructure/exception/GlobalExceptionHandler.java ===
package com.bankapp.infrastructure.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(TransactionNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleTransactionNotFoundException(
            TransactionNotFoundException ex,
            WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(
                HttpStatus.NOT_FOUND.value(),
                "TRANSACTION_NOT_FOUND",
                ex.getMessage(),
                request.getDescription(false).replace("uri=", ""),
                LocalDateTime.now()
        );
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    }

    @ExceptionHandler(TransactionAlreadyExistsException.class)
    public ResponseEntity<ErrorResponse> handleTransactionAlreadyExistsException(
            TransactionAlreadyExistsException ex,
            WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(
                HttpStatus.CONFLICT.value(),
                "TRANSACTION_ALREADY_EXISTS",
                ex.getMessage(),
                request.getDescription(false).replace("uri=", ""),
                LocalDateTime.now()
        );
        return ResponseEntity.status(HttpStatus.CONFLICT).body(errorResponse);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ValidationErrorResponse> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });

        ValidationErrorResponse validationErrorResponse = new ValidationErrorResponse(
                HttpStatus.BAD_REQUEST.value(),
                "VALIDATION_ERROR",
                "Los datos ingresados no son válidos",
                errors,
                LocalDateTime.now()
        );
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(validationErrorResponse);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ErrorResponse> handleIllegalArgumentException(
            IllegalArgumentException ex,
            WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(
                HttpStatus.BAD_REQUEST.value(),
                "INVALID_ARGUMENT",
                ex.getMessage(),
                request.getDescription(false).replace("uri=", ""),
                LocalDateTime.now()
        );
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleGlobalException(
            Exception ex,
            WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                "INTERNAL_SERVER_ERROR",
                "Ha ocurrido un error inesperado: " + ex.getMessage(),
                request.getDescription(false).replace("uri=", ""),
                LocalDateTime.now()
        );
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
    }

    public static class ErrorResponse {
        private int status;
        private String code;
        private String message;
        private String path;
        private LocalDateTime timestamp;

        public ErrorResponse(int status, String code, String message, String path, LocalDateTime timestamp) {
            this.status = status;
            this.code = code;
            this.message = message;
            this.path = path;
            this.timestamp = timestamp;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public LocalDateTime getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(LocalDateTime timestamp) {
            this.timestamp = timestamp;
        }
    }

    public static class ValidationErrorResponse {
        private int status;
        private String code;
        private String message;
        private Map<String, String> fieldErrors;
        private LocalDateTime timestamp;

        public ValidationErrorResponse(int status, String code, String message,
                                       Map<String, String> fieldErrors, LocalDateTime timestamp) {
            this.status = status;
            this.code = code;
            this.message = message;
            this.fieldErrors = fieldErrors;
            this.timestamp = timestamp;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public Map<String, String> getFieldErrors() {
            return fieldErrors;
        }

        public void setFieldErrors(Map<String, String> fieldErrors) {
            this.fieldErrors = fieldErrors;
        }

        public LocalDateTime getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(LocalDateTime timestamp) {
            this.timestamp = timestamp;
        }
    }
}

// === ARCHIVO: src/main/java/com/bankapp/infrastructure/exception/TransactionNotFoundException.java ===
package com.bankapp.infrastructure.exception;

public class TransactionNotFoundException extends RuntimeException {

    private final String transactionId;

    public TransactionNotFoundException(String message) {
        super(message);
        this.transactionId = null;
    }

    public TransactionNotFoundException(String message, Throwable cause) {
        super(message, cause);
        this.transactionId = null;
    }

    public TransactionNotFoundException(String message, String transactionId) {
        super(message);
        this.transactionId = transactionId;
    }

    public TransactionNotFoundException(String message, String transactionId, Throwable cause) {
        super(message, cause);
        this.transactionId = transactionId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    @Override
    public String toString() {
        if (transactionId != null) {
            return "TransactionNotFoundException: " + getMessage() + " [ID: " + transactionId + "]";
        }
        return "TransactionNotFoundException: " + getMessage();
    }
}

// === ARCHIVO: src/main/resources/schema.sql ===
DROP TABLE IF EXISTS transactions CASCADE;
DROP TABLE IF EXISTS accounts CASCADE;

CREATE TABLE accounts (
    id UUID PRIMARY KEY,
    account_number VARCHAR(20) NOT NULL UNIQUE,
    customer_name VARCHAR(100) NOT NULL,
    balance DECIMAL(19, 4) NOT NULL DEFAULT 0.00,
    status VARCHAR(20) NOT NULL DEFAULT 'ACTIVE',
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE transactions (
    id UUID PRIMARY KEY,
    type VARCHAR(20) NOT NULL,
    amount DECIMAL(19, 4) NOT NULL,
    timestamp TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    description VARCHAR(255),
    account_id UUID NOT NULL REFERENCES accounts(id) ON DELETE CASCADE,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE INDEX idx_accounts_account_number ON accounts(account_number);
CREATE INDEX idx_accounts_status ON accounts(status);
CREATE INDEX idx_accounts_customer_name ON accounts(customer_name);

CREATE INDEX idx_transactions_account_id ON transactions(account_id);
CREATE INDEX idx_transactions_type ON transactions(type);
CREATE INDEX idx_transactions_timestamp ON transactions(timestamp DESC);

CREATE INDEX idx_transactions_account_timestamp ON transactions(account_id, timestamp DESC);
CREATE INDEX idx_transactions_type_timestamp ON transactions(type, timestamp DESC);

// === ARCHIVO: src/main/resources/data.sql ===
INSERT INTO accounts (id, account_number, customer_name, balance, status, created_at, updated_at) VALUES
('a0eebc99-9c0b-4ef8-bb6d-6bb9bd380a11', 'ACC-001', 'Juan Pérez García', 15000.00, 'ACTIVE', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('b0eebc99-9c0b-4ef8-bb6d-6bb9bd380a22', 'ACC-002', 'María López Martínez', 25000.50, 'ACTIVE', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('c0eebc99-9c0b-4ef8-bb6d-6bb9bd380a33', 'ACC-003', 'Carlos Rodríguez Sánchez', 5000.00, 'ACTIVE', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('d0eebc99-9c0b-4ef8-bb6d-6bb9bd380a44', 'ACC-004', 'Ana Martínez Torres', 7500.25, 'ACTIVE', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('e0eebc99-9c0b-4ef8-bb6d-6bb9bd380a55', 'ACC-005', 'Luis González Rivera', 0.00, 'INACTIVE', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO transactions (id, type, amount, timestamp, description, account_id, created_at) VALUES
('t0eebc99-9c0b-4ef8-bb6d-6bb9bd380a01', 'DEPOSIT', 5000.00, '2024-01-15 10:30:00', 'Depósito inicial cuenta ACC-001', 'a0eebc99-9c0b-4ef8-bb6d-6bb9bd380a11', CURRENT_TIMESTAMP),
('t0eebc99-9c0b-4ef8-bb6d-6bb9bd380a02', 'WITHDRAWAL', 1500.00, '2024-01-16 14:20:00', 'Retiro cajero automático', 'a0eebc99-9c0b-4ef8-bb6d-6bb9bd380a11', CURRENT_TIMESTAMP),
('t0eebc99-9c0b-4ef8-bb6d-6bb9bd380a03', 'TRANSFER', 2000.00, '2024-01-17 09:15:00', 'Transferencia a ACC-002', 'a0eebc99-9c0b-4ef8-bb6d-6bb9bd380a11', CURRENT_TIMESTAMP),
('t0eebc99-9c0b-4ef8-bb6d-6bb9bd380a04', 'DEPOSIT', 10000.00, '2024-01-10 08:00:00', 'Depósito inicial cuenta ACC-002', 'b0eebc99-9c0b-4ef8-bb6d-6bb9bd380a22', CURRENT_TIMESTAMP),
('t0eebc99-9c0b-4ef8-bb6d-6bb9bd380a05', 'DEPOSIT', 5000.00, '2024-01-12 11:30:00', 'Depósito nómina enero', 'b0eebc99-9c0b-4ef8-bb6d-6bb9bd380a22', CURRENT_TIMESTAMP),
('t0eebc99-9c0b-4ef8-bb6d-6bb9bd380a06', 'WITHDRAWAL', 3000.00, '2024-01-18 16:45:00', 'Pago servicios', 'b0eebc99-9c0b-4ef8-bb6d-6bb9bd380a22', CURRENT_TIMESTAMP),
('t0eebc99-9c0b-4ef8-bb6d-6bb9bd380a07', 'TRANSFER', 1000.00, '2024-01-19 10:00:00', 'Transferencia a ACC-003', 'b0eebc99-9c0b-4ef8-bb6d-6bb9bd380a22', CURRENT_TIMESTAMP),
('t0eebc99-9c0b-4ef8-bb6d-6bb9bd380a08', 'DEPOSIT', 5000.00, '2024-01-08 09:00:00', 'Depósito inicial cuenta ACC-003', 'c0eebc99-9c0b-4ef8-bb6d-6bb9bd380a33', CURRENT_TIMESTAMP),
('t0eebc99-9c0b-4ef8-bb6d-6bb9bd380a09', 'DEPOSIT', 7500.00, '2024-01-11 14:00:00', 'Depósito inicial cuenta ACC-004', 'd0eebc99-9c0b-4ef8-bb6d-6bb9bd380a44', CURRENT_TIMESTAMP),
('t0eebc99-9c0b-4ef8-bb6d-6bb9bd380a10', 'WITHDRAWAL', 250.00, '2024-01-20 12:00:00', 'Cargo por mantenimiento', 'd0eebc99-9c0b-4ef8-bb6d-6bb9bd380a44', CURRENT_TIMESTAMP);

// === ARCHIVO: src/test/java/com/bankapp/application/service/AccountServiceTest.java ===
package com.bankapp.application.service;

import com.bankapp.domain.model.Account;
import com.bankapp.domain.model.Account.AccountStatus;
import com.bankapp.domain.repository.AccountRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AccountServiceTest {

    @Mock
    private AccountRepository accountRepository;

    @InjectMocks
    private AccountService accountService;

    private Account testAccount;

    @BeforeEach
    void setUp() {
        testAccount = new Account();
        testAccount.setId(UUID.randomUUID());
        testAccount.setAccountNumber("ACC-12345");
        testAccount.setCustomerName("Juan Pérez");
        testAccount.setBalance(new BigDecimal("1000.00"));
        testAccount.setStatus(AccountStatus.ACTIVE);
    }

    @Test
    @Disabled("Completar los assertions para verificar el depósito")
    void testDeposit_shouldIncreaseBalance() {
        when(accountRepository.findById(any(UUID.class))).thenReturn(Optional.of(testAccount));
        when(accountRepository.save(any(Account.class))).thenAnswer(inv -> inv.getArgument(0));

        // Given: una cuenta con saldo inicial
        BigDecimal initialBalance = testAccount.getBalance();
        BigDecimal depositAmount = new BigDecimal("500.00");

        // When: se ejecuta el depósito
        Account result = accountService.deposit(testAccount.getId(), depositAmount);

        // Then: el saldo debe incrementarse
        // FALTA: assert que verifique el nuevo saldo
    }

    @Test
    @Disabled("Completar los assertions para verificar el retiro")
    void testWithdraw_shouldDecreaseBalance() {
        when(accountRepository.findById(any(UUID.class))).thenReturn(Optional.of(testAccount));
        when(accountRepository.save(any(Account.class))).thenAnswer(inv -> inv.getArgument(0));

        // Given: una cuenta con saldo inicial
        BigDecimal initialBalance = testAccount.getBalance();
        BigDecimal withdrawAmount = new BigDecimal("300.00");

        // When: se ejecuta el retiro
        Account result = accountService.withdraw(testAccount.getId(), withdrawAmount);

        // Then: el saldo debe decrementarse
        // FALTA: assert que verifique el nuevo saldo
    }

    @Test
    @Disabled("Completar el caso de prueba para cuenta no encontrada")
    void testWithdraw_shouldThrowExceptionWhenInsufficientFunds() {
        // Given: una cuenta con saldo insuficiente
        testAccount.setBalance(new BigDecimal("100.00"));
        when(accountRepository.findById(any(UUID.class))).thenReturn(Optional.of(testAccount));

        BigDecimal withdrawAmount = new BigDecimal("500.00");

        // When/Then: debe lanzar excepción
        // FALTA: assertThrows con la excepción apropiada
    }

    @Test
    @Disabled("Completar los assertions para verificar cuenta encontrada")
    void testFindById_shouldReturnAccount() {
        when(accountRepository.findById(any(UUID.class))).thenReturn(Optional.of(testAccount));

        // When
        Optional<Account> result = accountService.findById(testAccount.getId());

        // Then
        // FALTA: assertTrue y assertEquals para verificar
    }

    @Test
    @Disabled("Completar los assertions para cuenta inexistente")
    void testFindById_shouldReturnEmptyWhenNotFound() {
        UUID nonExistentId = UUID.randomUUID();
        when(accountRepository.findById(nonExistentId)).thenReturn(Optional.empty());

        // When
        Optional<Account> result = accountService.findById(nonExistentId);

        // Then
        // FALTA: assertTrue(result.isEmpty())
    }
}

// === ARCHIVO: src/test/java/com/bankapp/application/service/TransactionServiceTest.java ===
package com.bankapp.application.service;

import com.bankapp.domain.model.Account;
import com.bankapp.domain.model.Account.AccountStatus;
import com.bankapp.domain.model.Transaction;
import com.bankapp.domain.model.Transaction.TransactionType;
import com.bankapp.domain.repository.AccountRepository;
import com.bankapp.domain.repository.TransactionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class TransactionServiceTest {

    @Mock
    private TransactionRepository transactionRepository;

    @Mock
    private AccountRepository accountRepository;

    @InjectMocks
    private TransactionService transactionService;

    private Account testAccount;
    private Transaction testTransaction;

    @BeforeEach
    void setUp() {
        testAccount = new Account();
        testAccount.setId(UUID.randomUUID());
        testAccount.setAccountNumber("ACC-12345");
        testAccount.setCustomerName("María García");
        testAccount.setBalance(new BigDecimal("5000.00"));
        testAccount.setStatus(AccountStatus.ACTIVE);

        testTransaction = new Transaction();
        testTransaction.setId(UUID.randomUUID());
        testTransaction.setType(TransactionType.DEPOSIT);
        testTransaction.setAmount(new BigDecimal("1000.00"));
        testTransaction.setTimestamp(LocalDateTime.now());
        testTransaction.setDescription("Depósito inicial");
        testTransaction.setAccount(testAccount);
    }

    @Test
    @Disabled("Completar los assertions para verificar creación de transacción")
    void testCreateTransaction_shouldCreateSuccessfully() {
        when(accountRepository.findById(any(UUID.class))).thenReturn(Optional.of(testAccount));
        when(transactionRepository.existsById(any(UUID.class))).thenReturn(false);
        when(transactionRepository.save(any(Transaction.class))).thenAnswer(inv -> inv.getArgument(0));

        // Given: una cuenta válida y datos de transacción
        TransactionType type = TransactionType.DEPOSIT;
        BigDecimal amount = new BigDecimal("1500.00");
        String description = "Depósito de prueba";

        // When: se crea la transacción
        Transaction result = transactionService.createTransaction(
            testAccount.getId(), type, amount, description);

        // Then: verificar que se creó correctamente
        // FALTA: assertNotNull(result) y assertEquals(type, result.getType())
    }

    @Test
    @Disabled("Completar el manejo de cuenta no encontrada")
    void testCreateTransaction_shouldThrowWhenAccountNotFound() {
        UUID nonExistentAccountId = UUID.randomUUID();
        when(accountRepository.findById(nonExistentAccountId)).thenReturn(Optional.empty());

        // Given: ID de cuenta que no existe
        // When/Then: debe lanzar excepción
        // FALTA: assertThrows con AccountNotFoundException o similar
    }

    @Test
    @Disabled("Completar el manejo de transacción duplicada")
    void testCreateTransaction_shouldThrowWhenTransactionAlreadyExists() {
        when(accountRepository.findById(any(UUID.class))).thenReturn(Optional.of(testAccount));
        when(transactionRepository.existsById(testTransaction.getId())).thenReturn(true);

        // Given: una transacción que ya existe
        // When/Then: debe lanzar TransactionAlreadyExistsException
        // FALTA: assertThrows(TransactionAlreadyExistsException.class, ...)
    }

    @Test
    @Disabled("Completar los assertions para verificar transacción encontrada")
    void testFindById_shouldReturnTransaction() {
        when(transactionRepository.findById(any(UUID.class)))
            .thenReturn(Optional.of(testTransaction));

        // When
        Optional<Transaction> result = transactionService.findById(testTransaction.getId());

        // Then
        // FALTA: assertTrue(result.isPresent())
        // FALTA: assertEquals(testTransaction.getId(), result.get().getId())
    }

    @Test
    @Disabled("Completar el caso de transacción no encontrada")
    void testFindById_shouldThrowWhenNotFound() {
        UUID nonExistentId = UUID.randomUUID();
        when(transactionRepository.findById(nonExistentId)).thenReturn(Optional.empty());

        // When/Then
        // FALTA: assertThrows(TransactionNotFoundException.class, ...)
    }

    @Test
    @Disabled("Completar los assertions para verificar validación")
    void testValidateTransaction_shouldReturnTrueForValidTransaction() {
        // Given: una transacción válida
        testTransaction.setAmount(new BigDecimal("100.00"));
        testTransaction.setType(TransactionType.WITHDRAWAL);

        // When
        boolean isValid = testTransaction.isValid();

        // Then
        // FALTA: assertTrue(isValid)
    }

    @Test
    @Disabled("Completar el caso de transacción inválida")
    void testValidateTransaction_shouldReturnFalseForInvalidAmount() {
        // Given: transacción con monto negativo
        testTransaction.setAmount(new BigDecimal("-50.00"));

        // When
        boolean isValid = testTransaction.isValid();

        // Then
        // FALTA: assertFalse(isValid)
    }
}

// === ARCHIVO: README.md ===
# Sistema Bancario - Optimización de Consultas SQL

## Descripción

Sistema bancario desarrollado con Spring Boot 3.5 y Java 21 para práctica de consultas SQL y optimización de rendimiento.

## Requisitos Previos

- Java Development Kit (JDK) 21
- Maven 3.8+
- PostgreSQL 15+ (o usar H2 en memoria para desarrollo)

## Configuración del Entorno

### 1. Instalación de Java 21

```bash
# Verificar instalación
java -version

# Si no está instalado, descargar desde:
# https://adoptium.net/
```

### 2. Instalación de Maven

```bash
# Verificar instalación
mvn -version

# Si no está instalado, descargar desde:
# https://maven.apache.org/download.cgi
```

### 3. Configuración de Base de Datos

El proyecto está configurado para usar PostgreSQL por defecto. Para desarrollo local, puedes usar la base de datos H2 en memoria modificando el perfil en `application.yml`.

## Estructura del Proyecto

```
bankapp/
├── src/
│   ├── main/
│   │   ├── java/com/bankapp/
│   │   │   ├── Application.java              # Punto de entrada
│   │   │   ├── domain/
│   │   │   │   ├── model/                    # Entidades del dominio
│   │   │   │   └── repository/               # Interfaces de repositorio
│   │   │   ├── application/
│   │   │   │   └── service/                  # Servicios de aplicación
│   │   │   └── infrastructure/
│   │   │       ├── controller/               # Controladores REST
│   │   │       ├── dto/                      # Objetos de transferencia
│   │   │       └── exception/                # Manejo de excepciones
│   │   └── resources/
│   │       ├── application.yml               # Configuración
│   │       ├── schema.sql                    # Esquema de BD
│   │       └── data.sql                      # Datos iniciales
│   └── test/
│       └── java/com/bankapp/
│           └── application/service/          # Pruebas unitarias
├── pom.xml
└── README.md
```

## Compilación y Ejecución

### Compilar el Proyecto

```bash
mvn clean compile
```

### Ejecutar la Aplicación

```bash
mvn spring-boot:run
```

La aplicación estará disponible en: `http://localhost:8080`

### Documentación API (Swagger)

Una vez iniciada la aplicación, acceder a:
- Swagger UI: `http://localhost:8080/swagger-ui.html`
- OpenAPI JSON: `http://localhost:8080/v3/api-docs`

## Ejecutar Pruebas

```bash
# Todas las pruebas
mvn test

# Solo pruebas unitarias de servicios
mvn test -Dtest=*ServiceTest
```

## Endpoints Principales

### Cuentas

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| GET | /api/accounts | Listar todas las cuentas |
| GET | /api/accounts/{id} | Obtener cuenta por ID |
| POST | /api/accounts | Crear nueva cuenta |
| PUT | /api/accounts/{id}/deposit | Realizar depósito |
| PUT | /api/accounts/{id}/withdraw | Realizar retiro |

### Transacciones

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| GET | /api/transactions | Listar todas las transacciones |
| GET | /api/transactions/{id} | Obtener transacción por ID |
| POST | /api/transactions | Crear nueva transacción |

## Configuración

Los parámetros de configuración se encuentran en `src/main/resources/application.yml`:

```yaml
spring:
  application:
    name: bankapp
  datasource:
    url: jdbc:postgresql://localhost:5432/bankapp
    username: postgres
    password: postgres
  jpa:
    hibernate:
      ddl-auto: none
```

## Construcción de Producción

```bash
mvn clean package -DskipTests
java -jar target/bankapp-0.0.1-SNAPSHOT.jar
```
```
