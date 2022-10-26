public class Hashing {

    //bucketing hashing
    public Node[] bucHashing(int[] keyValue, int NB) {
        Node tableB[] = new Node[NB];// creating a hash table
        for (int i = 0; i < NB; i++) {
            tableB[i] = null;
        }

        for (int i = 0; i < keyValue.length; i++) {//for loop that goes through each key value in the array
            int position = keyValue[i] % NB;//position of a given key value
            Node newNode = new Node(keyValue[i]);
            newNode.next = tableB[position];
            tableB[position] = newNode;
        }
        return tableB;
    }

    public int[] lqHashing(int[] keyValue, int NLQ) {
        int tableLQ[] = new int[NLQ];// creating a hash table
        for (int i = 0; i < keyValue.length; i++) //iterate each key value from key array
        {
            int ip = keyValue[i] % NLQ;//Initial position of a given key value
            int q = keyValue[i] / NLQ;// division of a key value over the size of the hash table
            int offset;// Offset that will be used

            if (q % NLQ != 0)
                offset = q;
            else
                offset = (4 * keyValue[i]) + 3;

            while (tableLQ[ip] != 0)     //If a collision occurs,
            {
                ip = (ip + offset) % NLQ;
            }
            tableLQ[ip] = keyValue[i];    // store key value to hash table
        }
        return tableLQ;
    }

    class Node {
        int data;
        Node next;

        private Node(int dataEntry) {
            this(dataEntry, null);
        }

        /**
         * Constructor
         */
        private Node(int dataEntry, Node nextNode) {
            data = dataEntry;
            next = nextNode;


        }

        private int getData() {
            return data;
        }
    }
}
