// Operations: put, remove, containsKey, get, keySet, isEmpty

import java.util.*;
import java.util.ArrayList;

public class HashMap_Implementaion {

    // Creating our own generic HashMap
    // K = Key type, V = Value type
    static class HashMap<K, V> {

        // Node stores one key-value pair
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // Total number of key-value pairs
        private int N; // Total number of buckets

        // Array of linked lists (separate chaining)
        // Each bucket can store multiple nodes
        private LinkedList<Node> buckets[];

        // Constructor: initializes the HashMap
        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4; // Initially, create 4 buckets

            this.buckets = new LinkedList[4];

            // Initialize every bucket with an empty linked list
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        // Converts a key into a bucket index
        private int hashFunction(K key) {
            int bi = key.hashCode();

            // Ensure the index falls between 0 and N - 1
            return Math.abs(bi) % N;
        }

        // Searches for a key inside a particular bucket
        // bi = bucket index
        // Returns the index of the node, or -1 if not found
        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];

            // Check every node in the linked list
            for (int i = 0; i < ll.size(); i++) {

                // Compare the stored key with the given key
                if (ll.get(i).key == key) {
                    return i; // di = index inside the linked list
                }
            }

            return -1; // Key does not exist
        }

        // Doubles the number of buckets when the map becomes crowded
        @SuppressWarnings("unchecked")
        private void rehash() {

            // Keep a reference to the old buckets
            LinkedList<Node> oldBucket[] = buckets;

            // Create a larger bucket array
            buckets = new LinkedList[N * 2];

            // Reinsert old key-value pairs into the new buckets
            for (int i = 0; i < oldBucket.length; i++) {

                LinkedList<Node> ll = oldBucket[i];

                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);

                    // Calculate the new bucket index and insert the pair
                    put(node.key, node.value);
                }
            }
        }

        // Inserts a new key-value pair or updates an existing key
        public void put(K key, V value) {

            // Find the bucket for the given key
            int bi = hashFunction(key);

            // Search for the key inside that bucket
            int di = searchInLL(key, bi);

            if (di == -1) {
                // Key does not exist, so insert a new node
                buckets[bi].add(new Node(key, value));
                n++; // Increase the number of key-value pairs

            } else {
                // Key already exists, so update its value
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            // Load factor = number of nodes / number of buckets
            double lambda = (double) n / N;

            // If the load factor exceeds 2, increase the capacity
            if (lambda > 2.0) {
                rehash();
            }
        }

        // Checks whether a key exists in the HashMap
        public boolean containsKey(K key) {

            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) {
                return false; // Key not found
            } else {
                return true; // Key found
            }
        }

        // Removes a key-value pair and returns its value
        public V remove(K key) {

            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) {
                return null; // Key not found
            } else {
                // Remove the node from the linked list
                Node node = buckets[bi].remove(di);

                n--; // Decrease the number of key-value pairs

                return node.value; // Return the removed value
            }
        }

        // Returns the value associated with a key
        public V get(K key) {

            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) {
                return null; // Key not found
            } else {
                Node node = buckets[bi].get(di);
                return node.value; // Return the value
            }
        }

        // Returns a list containing all keys in the HashMap
        public ArrayList<K> keySet() {

            ArrayList<K> keys = new ArrayList<>();

            // Visit every bucket
            for (int i = 0; i < buckets.length; i++) {

                LinkedList<Node> ll = buckets[i];

                // Visit every node in the current bucket
                for (int j = 0; j < ll.size(); j++) {

                    Node node = ll.get(j);

                    // Add the key to the result list
                    keys.add(node.key);
                }
            }

            return keys;
        }

        // Checks whether the HashMap contains zero key-value pairs
        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String[] args) {

        // Create a HashMap with String keys and Integer values
        HashMap<String, Integer> map = new HashMap<>();

        // Insert key-value pairs
        map.put("India", 190);
        map.put("Nepal", 50);
        map.put("China", 200);

        // Get all keys
        ArrayList<String> keys = map.keySet();

        // Print each key and its associated value
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(
                    keys.get(i) + " " + map.get(keys.get(i)));
        }

        // Remove India and print its value afterward
        map.remove("India");
        System.out.println(map.get("India")); // null
    }
}