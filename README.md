## «Коллекции Queue»

### Задание 
Вы начинающий мастер по маникюру. Вы знаете, что делаете свою работу достаточно хорошо, так что каждый новый клиент с вероятностью 50% приведёт своего друга.

У вас есть список первых клиентов. Каждого клиента можно описать просто строкой:

1. Создайте Queue-коллекцию из этих клиентов. Каждого клиента вы принимаете в порядке очереди. В конце 
   обработки каждого клиента с вероятностью 50% записывается его друг. В Java сэмулировать эту вероятность 
   можно так

2. Имя другу можно сгенерировать из имени того, чьим другом он является через фразу a friend of. Например, 
   если порекомендовала Sveta, то друга будут звать a friend of Sveta. Если и её друг порекомендует, то такого 
   друга будут звать a friend of a friend of Sveta. Новый записывающийся всегда встаёт в конец очереди.

Напишите программу, которая будет разбирать очередь из клиентов, с вероятностью 50% добавляя нового клиента 
после обработки текущего клиента.

В качестве обработки клиента достаточно выводить на экран фразу виду: <имя> сделал новый маникюр. Например, 
Alexandra сделала новый маникюр