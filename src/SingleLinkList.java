public class SingleLinkList {
    ListItem head;
    ListItem tail;

    public boolean isEmpty()
    {
        return head == null;
    }

    public void addItem (String value)
    { // создает ListItem с входным аргументом
        ListItem newItem = new ListItem();
        newItem.value = value;
        if (isEmpty())
        { // если список пуст, новый элемент становится и head, и tail
            head = newItem;
            tail = newItem;
        } else
        { // если в списке есть элементы, то новый элемент указывается в ссылке предыдущего tail, и сам становится им
            tail.next = newItem;
            tail = newItem;
        }
    }

    public void reverveList ()
    {
        if (!isEmpty() && head.next != null)
        { // проверка, есть ли в списке хотя бы два элемента, присваиваем последнему элементу первый
            tail = head;
            ListItem currentItem = head.next; // текущий элемент, проход которого по списку будет реверсировать список,
            // в него "сохраняем" второй элемент
            head.next = null; // т.к. head теперь - последний элмент списка.

            while (currentItem != null)
            {
                ListItem next = currentItem.next; // сохраняем ссылку на следующий элемент...
                currentItem.next = head; // ...и меняем ссылку
                head = currentItem;
                currentItem = next; // шаг на один элемент
            }
        }
    }


    public void printList(ListItem listItem)
    {
        if (listItem != null)
        {
            System.out.println(listItem.getValue());
            printList(listItem.next);
        }
    }
}