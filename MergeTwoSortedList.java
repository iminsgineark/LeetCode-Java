package Arrays;


class ListNodeML {
    int val;
    ListNodeML next;
    ListNodeML() {}
    ListNodeML(int val) { this.val = val; }
    ListNodeML(int val, ListNodeML next) { this.val = val; this.next = next; }
}
public class MergeTwoSortedList {
    public ListNodeML mergeTwoLists(ListNodeML list1, ListNodeML list2) {
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        if (list1.val < list2.val){
            list1.next = mergeTwoLists(list1.next,list2);
            return list1;
        }
        else {
            list2.next = mergeTwoLists(list1,list2.next);
            return list2;
        }
    }
}

