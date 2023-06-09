# <nps-service> REST API приложение в архитектурном стиле MVC на основе фрэймворка Spring Boot

Предметная область — атомной электростанции (АЭС). 
Для функционировании АЭС предусматриваются технологические системы (ТС).
Композиция предметной области (АЭС — ТС) состоит из двух объектов, отношения между которыми "один ко многим":

	1) АЭС (npp). Характеризуется следующими свойствами:	
		- уникальный номер (id);
		- наименование АЭС (name);
		- тип реактора (reactor);
		- заказчик (customer);
		- место строительства (location);
		- стадия проектирования (stage).

	2) ТС (systems). Характеризуется следующими свойствами:
		- уникальный номер (id);
		- наименование системы (name);
		- функция системы (function);
		- ответственная специальность (speciality);
		- класс безопасности по НТД (safety_class).

API (Application Programming Interface) выполнен на основе архитектурного стиля REST для проведения CRUD (Create, Read, Update, Delete) операций над объектами (npp и systems). Взаимодействие с API реализовано в формате JSON. Проект включает файл инициализации БД postgres "digitalChief.sql" и файл коллекции Postman для тестирования запросов для каждой эндпоинта.
	
### Используемые технологии
  
  - Java 11
  - Spring Boot 5, Spring Web, Spring Data Jpa, Spring Data JDBC
  - PostgreSQL 12
  - Google Guava
  - Maven 3.6.0

### Сборка проекта
1) Выполнить инициализацию БД postgres:
> psql -U postgres -d digitalChief < digitalChief.sql
2) Выполнить сборку приложения:
> mvn clean install
3) Запустить приложение:
> java -jar nps-service-0.0.1-SNAPSHOT.jar
