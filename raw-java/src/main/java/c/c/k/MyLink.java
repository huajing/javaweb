package c.c.k;

/**
 *
 */
public class MyLink {
    public static void main(String[] args) {
        MyNode<String, Object> first = null;
        MyNode<String, Object> last = null;
        for (int i = 0; i <10; i++) {
            MyNode<String, Object> stringObjectMyNode = new MyNode<>("" + i, new Object());
            if(first == null) {
                first = stringObjectMyNode;
                last = stringObjectMyNode;
            }else {
                last.next = stringObjectMyNode;
                last = stringObjectMyNode;
            }
        }
        MyNode<String, Object> temp = first;
        while (temp != null){
            System.out.println(temp+temp.key+temp.value);
            temp = temp.next;
        }
    }


    static final class MyNode<K,V>{
        K key;
        V value;
        MyNode<K,V> next;
        MyNode(K key, V value){
            this.key = key;
            this.value = value;
        }
    }
}
