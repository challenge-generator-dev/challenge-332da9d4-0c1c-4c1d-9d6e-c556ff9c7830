# Optimización de Consultas SQL en un Sistema Bancario

En un sistema bancario, se requiere ejecutar consultas SQL básicas de CRUD y optimización como Joins, Group By y Order By. El sistema debe manejar transacciones financieras con precisión y eficiencia. Los datos incluyen cuentas de clientes, transacciones y tipos de transacciones. Las consultas deben ser idempotentes y manejar errores comunes como transacciones duplicadas o inexistentes.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | DML |
| **Nivel** | trainee-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 4 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Consultas Básicas de CRUD

**Objetivo:** Ejecutar consultas SQL básicas de CRUD en el sistema bancario.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Crear una consulta para insertar una nueva transacción en la tabla de transacciones.
- Escribir una consulta para actualizar el saldo de una cuenta después de una transacción.
- Desarrollar una consulta para eliminar una transacción antigua de la base de datos.

**Entregable:** Tres consultas SQL verificables que realizan operaciones de inserción, actualización y eliminación.

<details>
<summary>Pistas de conocimiento</summary>

- Considera la estructura de las tablas y las relaciones entre ellas.
- Piensa en cómo manejar errores como claves duplicadas o registros inexistentes.

</details>

### Fase 2: Optimización de Consultas con Joins

**Objetivo:** Optimizar consultas SQL utilizando Joins para obtener información combinada de múltiples tablas.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Escribir una consulta que combine datos de cuentas y transacciones para mostrar el historial de transacciones de una cuenta específica.
- Optimizar la consulta para minimizar el tiempo de ejecución.

**Entregable:** Una consulta SQL optimizada que combina datos de cuentas y transacciones.

<details>
<summary>Pistas de conocimiento</summary>

- Usa Joins adecuados para combinar las tablas.
- Considera el uso de índices para mejorar el rendimiento.

</details>

### Fase 3: Agregación y Ordenamiento de Datos

**Objetivo:** Utilizar Group By y Order By para agregar y ordenar datos en consultas SQL.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Escribir una consulta que agrupe las transacciones por tipo y muestre la suma total para cada tipo.
- Ordenar los resultados por la suma total descendente.

**Entregable:** Una consulta SQL que agrupa y ordena las transacciones por tipo.

<details>
<summary>Pistas de conocimiento</summary>

- Usa Group By para agrupar los datos por tipo de transacción.
- Aplica Order By para ordenar los resultados.

</details>

### Fase 4: Revisión y Optimización Final

**Objetivo:** Revisar y optimizar todas las consultas creadas para asegurar eficiencia y precisión.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Revisar todas las consultas creadas en las fases anteriores.
- Identificar y corregir cualquier ineficiencia o error.
- Optimizar las consultas para mejorar el rendimiento.

**Entregable:** Todas las consultas SQL optimizadas y verificadas.

<details>
<summary>Pistas de conocimiento</summary>

- Usa herramientas de perfilado para identificar ineficiencias.
- Considera el uso de índices y otras técnicas de optimización.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es una consulta SQL y para qué se usa en un sistema bancario?
- **paraQueSirve**: ¿Para qué sirve utilizar Joins en consultas SQL?
- **comoSeUsa**: ¿Cómo se usa Group By para agregar datos en una consulta SQL?
- **erroresComunes**: ¿Cuáles son los errores comunes al escribir consultas SQL y cómo se manejan?
- **queDecisionesImplica**: ¿Qué decisiones implica optimizar una consulta SQL para mejorar el rendimiento?

## Criterios de Evaluacion

- Escribir consultas SQL básicas de CRUD.
- Optimizar consultas SQL utilizando Joins.
- Agregar y ordenar datos utilizando Group By y Order By.
- Revisar y optimizar consultas SQL para asegurar eficiencia y precisión.

## Como trabajar con un asistente de IA

Hay dos caminos, elegi uno:

- **AGENTS.md** (recomendado) — instrucciones nativas del repo. Abri esta carpeta con tu agente local (Claude Code, Cursor, Codex, Copilot, Gemini) y las carga solo. Sabe que archivos faltan y con que comando se verifica, y completa el scaffold escribiendo en disco.
- **PROMPT_MEJORA.md** — para copiar y pegar en un chat (claude.ai, ChatGPT). Devuelve un ZIP con el proyecto. Sirve si no tenes un agente en el IDE.

Ninguno de los dos resuelve las fases del reto: eso es tu trabajo.

## Verificacion

El proyecto esta listo para trabajar cuando este comando corre sin errores:

```bash
mvn clean compile
```

---

*Reto generado automaticamente por Challenge Generator - Pragma*
