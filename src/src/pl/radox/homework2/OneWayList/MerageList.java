package pl.radox.homework2.OneWayList;

public class MerageList {


    public OneWayList merageLists(OneWayList list1, OneWayList list2) {

        OneWayList listToReturn = new OneWayList();

        if (list1.head == null && list2.head == null) {
            return listToReturn;
        }
        if (list1.head == null) {
            listToReturn.head = list2.head;
            return listToReturn;
        }
        if (list2.head == null) {
            listToReturn.head = list1.head;
            return listToReturn;
        }

        Node nodeList1 = list1.head;
        Node nodeList2 = list2.head;

        if (nodeList1.getValue() < nodeList2.getValue()) {
            listToReturn.head = nodeList1;

            nodeList1=nodeList1.getNext();
        } else {
            listToReturn.head = nodeList2;
            nodeList2= nodeList2.getNext();
        }
        Node nodeForListToReturn = listToReturn.head;

        while (list1.head != null && list2.head != null) {

            if(nodeList1.getValue() < nodeList2.getValue()){
                nodeForListToReturn.setNext(nodeList1);

            }
        }


        return listToReturn;
    }
}
