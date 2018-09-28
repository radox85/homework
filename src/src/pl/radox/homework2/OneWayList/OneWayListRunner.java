package pl.radox.homework2.OneWayList;


public class OneWayListRunner {

    public static void main(String[] args) {

        OneWayList oneWayList1 = new OneWayList();
        oneWayList1.append(new Node(1));
        oneWayList1.append(new Node(3));
        oneWayList1.append(new Node(5));
        oneWayList1.append(new Node(7));
        oneWayList1.append(new Node(9));
        System.out.println(oneWayList1);


        OneWayList oneWayList2 = new OneWayList();
        oneWayList2.append(new Node(2));
        oneWayList2.append(new Node(4));
        oneWayList2.append(new Node(6));
        oneWayList2.append(new Node(8));
        oneWayList2.append(new Node(11));
        oneWayList2.append(new Node(11));
        oneWayList2.append(new Node(13));
        System.out.println(oneWayList1);

    }


}
