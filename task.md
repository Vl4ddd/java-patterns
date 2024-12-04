Task1. Класс Logger (SIngleton) 

Task2. Класс InterfaceSettings (Prototype) 

Task3. Класс UserDTO (Static fabric method)

Task4. Класс PublicationDTO, внутренний класс Builder (Builder)

Task Паттерн Bridge. Пакет Report. Классы Report, PdfFormatter, интерфейс ReportFormatter.

Task Паттерн Composite. ПакетComposite, Классы Item, Tree, интерфейс Component

Task Flyweight. Пакет Flyweight, Классы ConcreteFlyweight, Flyweight, FlyweightFactory

Task Command. Пакет Mail. Конкретная команда: SendEmailCommand, Пакет Service, Класс EmailService - получатель команды, Пакет RestController, класс EmailController - вызывающий команду(invoke в паттерне)

Task Iterator. Пакет Iterator и все файлы/пакеты в нем. PublicationIterator - итератор. PublicationCollectionIterator(внутренний класс PublicationCollection) - конкретный итератор. PublicationCollection - класс в котором созадется итератор и коллекция. PublicationCOntroller через PublicationService использует итератор.

Task Observer. Пакет observer - два интерфейса Observer и Subject. Пакет Service Классы EmailService - конкретный субьект. UserService - конкретный наблюдатель. После отправки сообщения обьект уведомляет наблюдателей об этом и наблюдатели реагируют на него через метод update.

Task Memento. Пакет Status. класс Status - originator, класс StatusMemento - memento, StatusCareTaker - caretaker(упарвляющий). Использование - пакет RestController, класс StatusController.

Task Strategy. Пакет Payment, PaymentStrategy - интерфйес для стратегий, YmoneyPayment, CreditCardPayment - конкретные стратегии, PaymentContext - контекст. Пакет RestController Класс PaymentController - использование.