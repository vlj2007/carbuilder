# Пример паттерна проектирования Builder (Строитель)

Паттерн "Строитель" используется для создания сложных объектов поэтапно. Он позволяет разделить процесс создания объекта от его представления, что дает возможность создавать различные представления одного и того же объекта.


## Объяснение
* Класс Car: Это продукт, который мы собираем. Он имеет несколько свойств (двигатель, колеса, цвет) и методы для их установки.
* Интерфейс CarBuilder: Определяет методы для создания различных частей автомобиля.
* Класс SportsCarBuilder: Конкретная реализация строителя, которая создает спортивный автомобиль. Он реализует методы интерфейса CarBuilder и собирает объект Car.
* Класс CarDirector: Управляет процессом строительства. Он использует строителя для создания объекта, вызывая методы в нужном порядке.
* Класс Main: Пример использования паттерна. Создается строитель, директор и затем строится объект Car.

### Где использовать паттерн Builder

* Сложные объекты: Когда объект имеет много параметров, и не все из них обязательны. Паттерн позволяет создавать объект поэтапно и избегать большого количества конструкторов.
* Неизменяемые объекты: Если объект должен быть неизменяемым после создания, паттерн "Строитель" позволяет создать его с необходимыми параметрами.
* Разные представления одного объекта: Когда нужно создать разные варианты одного и того же объекта, например, разные конфигурации автомобиля (спортивный, семейный и т.д.).
* Использование паттерна "Строитель" делает код более читаемым и поддерживаемым, особенно когда дело касается создания сложных объектов.

