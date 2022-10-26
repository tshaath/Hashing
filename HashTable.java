public class HashTable {
    public static void main(String[] args) {
        int keyValue[] = new int[]{27, 53, 13, 10, 138, 109, 49, 174, 26, 24}; //key values
        int NLQ = 13;//hash table SIZE, stays constant
        int NB = 10;

        Hashing hash = new Hashing();

        hash.bucHashing(keyValue, NB);// returns an array of objects that contain integer values

hash.lqHashing(keyValue,NLQ);//returns an array of integers
}
}
