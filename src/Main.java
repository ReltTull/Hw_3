public class Main {
    public static void main(String[] args)
    {
        SingleLinkList singleLinkList = new SingleLinkList();
        singleLinkList.addItem("Uno");
        singleLinkList.addItem("Boba");
        singleLinkList.addItem("Biba");
        singleLinkList.addItem("Hipa");
        singleLinkList.reverveList();
        singleLinkList.printList(singleLinkList.head);

    }
}