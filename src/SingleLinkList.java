public class SingleLinkList {
    ListItem head;
    ListItem tail;

    public boolean isEmpty()
    {
        return head == null;
    }

    public void addItem (String value)
    {
        ListItem newItem = new ListItem();
        newItem.value = value;
        if (isEmpty())
        {
            head = newItem;
            tail = newItem;
        } else
        {
            tail.next = newItem;
            tail = newItem;
        }
    }

    public void reverveList ()
    {
        if (!isEmpty() && head.next != null)
        {
            tail = head;
            ListItem currentItem = head.next;
            head.next = null;
            while (currentItem != null)
            {
                ListItem next = currentItem.next;
                currentItem.next = head;
                head = currentItem;
                currentItem = next;
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