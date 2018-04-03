## Задание 4.

#### Применение фреймворка Junit
- [x] 4.1. Создайте приложение как Maven проект, в который:
- добавьте Junit зависимость в файл pom.xml;
- добавьте класс, использующийся для конвертации значения температуры в
различные единицы измерения (Цельсий, Кельвин, Фаренгейт):
```java
public class TemperatureConverter {
  public double convertFtoC(double degreesFahrenheit) {
    return (degreesFahrenheit - 32.0) / 9.0 * 5.0;
  }

  public double convertCtoF(double degreesCelsius) {
    return degreesCelsius / 5.0 * 9.0 + 32.0;
  }

  public double convertCtoK(double degreesCelsius) {
    return degreesCelsius + 273.2;
  }

  public double convertKtoC(double kelvin) {
    return kelvin - 273.2;
  }

  public double convertFtoK(double degreesFahrenheit) {
    return (degreesFahrenheit + 459.7) / 9.0 * 5.0;
  }

  public double convertKtoF(double kelvin) {
    return kelvin / 5.0 * 9.0 - 459.7;
  }
}
```
- добавьте класс с junit-тестами для проверки всех методов описанного
класса и запустите их для проверки;
- добавьте возможность параметризированного запуска тестов.

- [x] 4.2. Напишите для приложения из задания 2.1 модульные тесты.

#### Требования
1. Приложение должно быть написано на языке Java.
2. При кодировании должны быть использованы соглашения об
оформлении кода для языка Java.
3. Для реализации модульного тестирования используйте фреймворк
JUnit 4.
